package javaproj1;

import java.util.Scanner;

public class lecture2IfStatements {

	public static void main(String[] args) {
		//single line comment
		/*
		 This is a
		 multi-line comment
		 */
		/*
		 Integer
		 Num
		 Float
		 Double
		 String
		 Long int
		 Short int
		 Boolean
		 */
		
		// declaration
		// 0 represents female and 1 represents male
		Scanner sc = new Scanner(System.in);
		
int gender;
        
        System.out.println("Enter 0 if you are a female, 1 if you are a male");
        gender = sc.nextInt();
        /*
        gender = 1 - asignemt statement
        gender == 1 - equality statement
        gender === 1 - same value and data type
        */
        if (gender == 1) {
        System.out.println("You will not get sweets");
    }
        else {
        //else statement executed when it's false
        System.out.println("you can have sweets");
    }
    }
   // =======================================================================
  

}