package assignment.com;

import java.util.Scanner;

public class Exception {

	
	void ExampleMethod1(int age) throws ArithmeticException{
		
		
		 if(age<12 && age<40) {
	         throw new ArithmeticException("Student is not eligible for registration"); 
	      }
		 
	}
	public static void main(String[] args) {
		
//		try {
//			int c= 10/0;
//
//		}
//		catch (ArithmeticException e) {
//			System.out.println(e);
//			}
//		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter age of person");
		int age=in.nextInt();
		Exception e = new Exception();
		e.ExampleMethod1(age);
//		finally {
//			System.out.println("In final");
//		}
	}
}
