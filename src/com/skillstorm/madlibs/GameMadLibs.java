package com.skillstorm.madlibs;

import java.util.Scanner;

public class GameMadLibs {
	public static void main(String [] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		
		System.out.println("welcome to SkillStorm's Madlibs! ");
		System.out.print("Please enter a person");
		String person = myScanner.nextLine();
		System.out.println("Thanks!");
		
		System.out.print("Please enter a number");
		int number = myScanner.nextInt();
		System.out.println("Thanks!");
		myScanner.nextLine();
		
		System.out.print("Please enter a color");
		String color = myScanner.nextLine();
		System.out.println("Thanks!");
		
		System.out.print("Please enter a meal");
		String meal = myScanner.nextLine();
		System.out.println("Thanks!");
		
		System.out.print("Please enter a adjective");
		String adjective = myScanner.nextLine();
		System.out.println("Thanks!");
		
		System.out.print("Please enter a thing");
		String thing = myScanner.nextLine();
		System.out.println("Thanks!");
		
		System.out.print("Please enter a place");
		String place = myScanner.nextLine();
		System.out.println("Thanks!");
		
		System.out.print("Please enter a verb");
		String verb = myScanner.nextLine();
		System.out.println("Thanks!");
		
		System.out.print("Please enter a adverb");
		String adverb = myScanner.nextLine();
		System.out.println("Thanks!");
		
		System.out.print("Please enter a food");
		String food = myScanner.nextLine();
		System.out.println("Thanks!");
		
		myScanner.close(); 
		
		 System.out.println("Today we picked apples from " + person + "'s" + " orchard." + 
		       " I had no idea there were so many different types of apples."
		 		 + " I ate " + number + " " + color + " apples straight off the tree. They tasted like " + meal + "." + 
				 " Then there was a " + adjective + " apple that looked like a " + thing + "." + 
		 		 " When our bags were full, we went on a free hay ride to the "
		 		+ place + " and back." + " It ended at a hay pile where we got to " + verb + " " + adverb + 
		 		"." + " I can hardly wait to get home and cook with the apples. we are going to make apple "
		 	    + food + " and apple pies!");
		 
		
		
}
}


