package javaproj1;

import java.util.Scanner;

public class pracbasics {

	public static void main(String[] args) {
	
	System.out.println("That's a bar"); // normal display
	System.out.println("\tThat is a bar"); // tab display
	System.out.println("That is a bar\n"); // add an empty line underneath or above if /n is at the beginning
	System.out.println("\"That is a bar\"\n"); // add quotations
	// \ is a escape sequence
	
	
	int x = 123; // 4 bytes, - 2 bil to 2 bil, primitive
	double y = 3.14; // 8 bytes, fractional number up to 15 digits, has more precision, primitive
	boolean z = true; // 1 bit, true or false, primitive
	char symbol = '@'; // 2 bytes, single character, letter, or ASCII value, primitive
	String name = "Joe"; // varies in memory storage, a sequence of characters, reference
	long c = 12354595569643L; // long is always followed by L and used for larger numbers
	/*
	 byte = 1 byte, -128 to 127, primitive
	 short = 2 bytes, -32,768 to 32,767, primitive
	 long = 8 bytes, -9 quintillion to 9 quintillion; primitive
	 float = 4 bytes, fractional number up to 6-7 digits, value followed by f e.g. 3.14592f, primitive
	 */
	/*
	 Primitive data types have 8 types, store data, can only hold 1 value, use less memory, fast
	 Reference unlimited because they are user defines, store an address, use more memory, slower
	 */
	
	System.out.println("Sup " + name);

	}

}
