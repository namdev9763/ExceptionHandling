package com.FlynautSaaS.ExceptionHandling;

import java.util.Scanner;

public class UncheckedExceptions {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Number1");
		int num=scanner.nextInt();
		System.out.println("Enter Your Number2");
		int num2=scanner.nextInt();
		try 
		{
			int div=num/num2;
			System.out.println("In try Block :"+div);
			
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Error : ArithmeticException is occuer "+e.getMessage());
		}
		finally {
			scanner.close();
		}

	}

}
