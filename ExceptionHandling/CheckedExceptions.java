package com.FlynautSaaS.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// Checked Exceptions At the time of Completions 
public class CheckedExceptions {

	public static void main(String[] args)
	{
		BufferedReader bufferedReader = null;
		try 
		{
//			String file="C:\\Users\\Admin\\Desktop\\example.txt";
//			bufferedReader=new BufferedReader(new FileReader(file));
			bufferedReader=new BufferedReader(new FileReader("example.txt"));			
			String line;
            // Read and print each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
		} 
		catch (IOException e) 
		{
			 System.err.println("Error: An IOException occurred Due to File not Found : " + e.getMessage());
		}
		finally
		{
			if(bufferedReader!=null)
			{
				try
				{
					bufferedReader.close();
				} 
				catch (Exception e2) 
				{
					System.err.println("Error: Not Close the Reader "+e2.getMessage());
				}
			}
			
		}
	}
}
