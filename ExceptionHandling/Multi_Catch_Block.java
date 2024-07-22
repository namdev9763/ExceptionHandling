package com.FlynautSaaS.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Multi_Catch_Block {

	public static void main(String[] args)
	{
		try {
			processFile("example.txt");
		} catch (IOException | IllegalArgumentException e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
	public static void processFile(String fileName) throws IOException, IllegalArgumentException {
		if (fileName == null || fileName.isEmpty()) {
			throw new IllegalArgumentException("File name cannot be null or empty.");
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

}
