package com.johnlewis.codingchallenge;

import java.util.Scanner;

import com.johnlewis.codingchallenge.utility.FormatTimeUtility;

/**
 * Main class. 
 *  
 * @author David John
 *
 */
public class Main {

	public static void main(String[] args) {
		//Accepting the user input for the number of seconds
		Scanner reader = new Scanner(System.in); 
		System.out.print("Enter the total number of seconds : ");
		int totalSeconds = reader.nextInt(); 
		reader.close();
		
		//Invoking the method to calculate the time in required format.
		String formattedTime = FormatTimeUtility.formatTime(totalSeconds);
		System.out.println();
		
		//Display the result to the user.
		System.out.println(formattedTime);
		
	}

}
