package javaproj1;

import java.util.Scanner;

public class lecture3whileloop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		
		int i = sc.nextInt();
		
		while(i != 0) {
			System.out.println("Enter a number again: ");
			i = sc.nextInt();
			i++;
		}
	}

}
