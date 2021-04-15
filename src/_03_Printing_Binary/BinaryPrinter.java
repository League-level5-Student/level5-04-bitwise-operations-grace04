package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		// Shift b seven bits to the right
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		// Print the result using System.out.print (NOT System.out.println)
		//Use this method to print the remaining 7 bits of b
		
		byte last = (byte) (b&1);
		byte sec = (byte) (b&2);
		sec = (byte) (sec>>1);
		byte thi = (byte) (b&4);
		thi = (byte) (thi>>2);
		byte fou = (byte) (b&8);
		fou = (byte) (fou>>3);
		byte fif = (byte) (b&16);
		fif = (byte) (fif>>4);
		byte six = (byte) (b&32);
		six = (byte) (six>>5);
		byte sev = (byte) (b&64);
		sev = (byte) (sev>>6);
		byte eig = (byte) (b&128);
		eig = (byte) (eig>>7);
		
		System.out.print(eig+""+sev+""+six+""+fif+""+fou+""+thi+""+sec+""+last);
	}
	
	public void printShortBinary(short s) {
		// Create 2 byte variables
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		
		byte b1 = (byte) (s>>8);
		byte b2 = (byte) (s&255);
		
		printByteBinary(b1);
		printByteBinary(b2);
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		
		short s1 = (short) (i>>16);
		short s2 = (short) (i&65535);
		
		printShortBinary(s1);
		printShortBinary(s2);
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		
		int i1 = (int) (l>>32);
		int i2 = (int) (l&2147483647);
		
		printIntBinary(i1);
		printIntBinary(i2);
	}
	
	public static void main(String[] args) {
		// Test your methods here
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary((byte) 10);
		System.out.println("");
		bp.printShortBinary((short) 45);
		System.out.println("");
		bp.printIntBinary((int) 30303);
		System.out.println("");
		bp.printLongBinary((long)442636159566432178l);
	}
}
