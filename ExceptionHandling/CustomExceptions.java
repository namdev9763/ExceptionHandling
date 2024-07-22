package com.FlynautSaaS.ExceptionHandling;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=scanner.nextInt();
		try {
			if(age<18)
			{
				throw new InvalidAgeException("Error: Your Age is less than 18");
			}
			else {
				System.out.println("your age is valid");
			}
			
		} catch (InvalidAgeException e) {
			System.out.println("In Catch  block "+e.getMessage());
		}
		finally {
			scanner.close();
			System.out.println("In finally block Scanner is Close");
		}
	}

}
@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message) {
		super(message);
	}
}
