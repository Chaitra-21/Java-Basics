package com.example;

import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Strings: ");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		sc.close();
		System.out.println("By == ");
			System.out.println(s1==s2);
		
		boolean R=byequal(s1,s2);
		System.out.println(R);
		int n=bycompare(s1,s2);
		System.out.println(n);
	}
	public static boolean byequal(String s1, String s2) {

		System.out.println("By equals method: ");
		boolean res=s1.equals(s2);
		return (res);
	
	}
	public static int bycompare(String s1, String s2) {
		System.out.println("By compareTo method: ");
		int res=s1.compareTo(s2);
		return (res);
	}

}
