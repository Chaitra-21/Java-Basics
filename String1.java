package com.example;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		System.out.println("Enter position: ");
		int pos=sc.nextInt();
		sc.close();
		System.out.println(s.charAt(pos));
	}

}
