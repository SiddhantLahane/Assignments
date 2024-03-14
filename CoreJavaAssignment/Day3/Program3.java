package in.acts.cdac;

import java.util.Scanner;

public class Program3 {
	 public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter the first number (int): ");
       int num1 = sc.nextInt();
       
       System.out.print("Enter the second number (double): ");
       double num2 = sc.nextDouble();
       
       System.out.print("Enter the third number (float): ");
       float num3 = sc.nextFloat();

      
       double sum1 = num1 + num2; 
       float sum2 = num1 + num3;  

      
       double subtraction = num2 - num1; 
       float subtraction2 = num3 - num1;  

       
       double multiplication = num1 * num2; 
       float multiplication2 = num1 * num3;  

     
       double division = num2 / num1; 
       float division2 = num3 / num1;  

    
       System.out.println("Addition (int + double): " + sum1);
       System.out.println("Addition (int + float): " + sum2);
       System.out.println("Subtraction (double - int): " + subtraction);
       System.out.println("Subtraction (float - int): " + subtraction2);
       System.out.println("Multiplication (int * double): " + multiplication);
       System.out.println("Multiplication (int * float): " + multiplication2);
       System.out.println("Division (double / int): " + division);
       System.out.println("Division (float / int): " + division2);
       
       sc.close();
}
}
