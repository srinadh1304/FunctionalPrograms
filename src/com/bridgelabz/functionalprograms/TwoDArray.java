package com.bridgelabz.functionalprograms;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray
{

	public static void main(String[] args) 
	{

		int numberOfRows, numberOfColumns;
		Scanner sc = new Scanner(System.in);
		PrintWriter printWriterObject = new PrintWriter(System.out);
		System.out.print("Enter the number of Rows: ");
		numberOfRows = sc.nextInt();
		System.out.print("Enter the number of Columns: ");
		numberOfColumns = sc.nextInt();
		int[][] twoDArray = new int[numberOfRows][numberOfColumns];
		System.out.println("Enter the "+numberOfColumns*numberOfRows+" elements: ");
		for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) 
		{
			for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) 
			{

				twoDArray[rowIndex][columnIndex] = sc.nextInt();

			}
		}
		sc.close();
		System.out.println("The array elements are: ");
		for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) 
		{
			for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) 
			{
				printWriterObject.print(twoDArray[rowIndex][columnIndex] + "\t");
			}
			printWriterObject.println();
		}
		printWriterObject.close();
	}

}
