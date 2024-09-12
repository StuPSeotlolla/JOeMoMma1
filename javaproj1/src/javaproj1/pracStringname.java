package javaproj1;

import java.util.Scanner;
public class pracStringname {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("Enter your name: ");
		name = sc.next();
		
		if (name.equals("Joe")) {
			System.out.println("The name matches");
		}
		else {
			System.out.println("The name does not match");
		}

	}

}
