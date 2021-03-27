package com.example;

import java.util.Scanner;

public class StringFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		sc.close();
		
		System.out.println("String Concatenation: "+s1.concat(s2));
		
		System.out.println("String Uppercase: "+s1.toUpperCase());
		
		System.out.println("String Lowercase: "+s2.toLowerCase());
		
		System.out.println("String isempty: "+s1.isEmpty());
		
		System.out.println("String Length: "+s2.length());
		
		System.out.println("String substring: "+s1.substring(2));
		
		System.out.println(s1.startsWith("a"));
		
		System.out.println(s1.toCharArray());
		
	}

}
