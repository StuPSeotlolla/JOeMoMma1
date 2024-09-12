package javaproj1;

import java.util.Scanner;

public class lecture2Gradesymbol {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int grade;
		
		System.out.print("Enter Your Mark: ");
		grade = sc.nextInt();
		
		if(grade >=80 && grade <=100) {
			System.out.println("Your grade symbol is A");
		}
		else if(grade >=70 && grade <80) {
			System.out.println("Your grade symbol is B");
		}
		else if(grade >=60 && grade <70) {
			System.out.println("Your grade symbol is C"); 
		}
		else if(grade >=50 && grade <60) {
			System.out.println("Your grade symbol is D");
		}
		else {
			System.out.println("Your entered incorrect mark");
		}

	}

}
