package javaproj1;

import java.util.Scanner;

public class lecture3whileloops2 {
	
	public static void main(String[] args) {
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		
		name = sc.nextLine();
		
		while(!name.equals("quit")) {
			System.out.println("Added name: "+ name);
			
			System.out.println("Enter name or quit to exit ");
			name = sc.nextLine();
		}
	}

}
