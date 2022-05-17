package com.strings;

import java.util.Scanner;

public class CapitalLetterString {

	public static String capitalWord(String str) {

		String string[] = str.split("\\s"); //splits this string against given regular expression and returns a char array.
		String capWord = "";

		for (String string1 : string) {
			String s1 = string1.substring(0, 1); //To get the first character, we can use substring() 
			String s2 = string1.substring(1);
			capWord = capWord + s1.toUpperCase() + s2 +" ";
		}
		return capWord;

	}



public static void main(String args[]) {
	CapitalLetterString cp=new CapitalLetterString();
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter your string");
	String s3=scanner.nextLine();
	
	System.out.println(CapitalLetterString.capitalWord(s3));
	
}
}
