package javaproj1;

import java.util.Scanner;

public class lecture2Decisionscontinued {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, results = 0;
		
		System.out.println("Enter your first number: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter your second number: ");
		num2 = sc.nextInt();
		
		System.out.println("======Menu=====");
		System.out.println("Enter your corresponding number of a menu item");
		
		System.out.println("(1) Addition");
		System.out.println("(2) Subtraction");
		System.out.println("(3) Multiplication");
		System.out.println("(4) Division");
		
		System.out.println("Enter the number of your options");
		int option = sc.nextInt();
		/*
		if(option == 1) {
			results = num1 + num2;
		}
		else if(option == 2) {
			results = num1 - num2;
		}
		else if(option == 3) {
			results = num1 * num2;
		}
		else if(option == 1) {
			results = num1 / num2;
		}
		else {
			System.out.println("Invalid option");
		}
		
		System.out.println("Answer: " + results);
		*/
		
		//switch cases example
		 switch(option){
		 	case 1: 
		 		results = num1 + num2;
		 		break;
		 	case 2:
		 		results = num1 - num2;
		 		break;
		 	case 3:
		 		results = num1 * num2;
		 		break;
		 	case 4:
		 		results = num1 / num2;
		 		break;
		 	default:
		 		System.out.println("Invalid option");
		 }
		 System.out.println("Answer: " + results);
		 		
		

	}
	
	

}
