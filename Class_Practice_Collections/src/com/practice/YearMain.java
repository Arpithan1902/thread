package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class YearMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Inputs,year,admission:");
		int n=scanner.nextInt();
		
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		for(int i=0;i<n*2;i++) 
			array.add(scanner.nextInt());
			
		System.out.println("output:" +Year.getYear(array));		
		
	}
}
