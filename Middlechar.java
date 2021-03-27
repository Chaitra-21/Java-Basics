package com.example;

import java.util.Scanner;

public class Middlechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		sc.close();
		char S=middle(s);
		System.out.println(S);
	}
	public static char middle(String s) {

		int l=s.length();
		System.out.println("Middle char: ");
		return (s.charAt(l/2));
	}
}
