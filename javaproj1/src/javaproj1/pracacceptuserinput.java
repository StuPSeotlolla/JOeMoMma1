package javaproj1;

import java.util.Scanner;

public class pracacceptuserinput {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is your name? ");
	String name = sc.nextLine();
	
	System.out.println("How old are you? ");
	int age =  sc.nextInt();
	sc.nextLine();
	
	System.out.println("What is your favorite food?");
	String food = sc.nextLine();
	
	
	System.out.println("Hello "+name);
	System.out.println("You are "+age+" years old");
	System.out.println("You liek to eat "+food);
		
	}
}