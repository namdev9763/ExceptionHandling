
package com.FlynautSaaS.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_with_resources {
	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// err use for print error 
			System.err.println("An IOException occurred: " + e.getMessage());
		}
	}

}
