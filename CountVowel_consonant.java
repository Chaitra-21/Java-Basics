package com.example;

import java.util.Scanner;

public class CountVowel_consonant {
	static int v=0,c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		count(s);
	}
	public static void count(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u') {
				v++;
			}
			else
				c++;
		}
		System.out.println("Vowel: "+v+" Consonant: "+c);
	}
}
