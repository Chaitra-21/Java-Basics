package com.example.ifelse;

import java.util.Scanner;

public class Excersice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Number sign"); number();
		 *//*
			 * System.out.println("Greatest number:"); greatest();
			 */
		System.out.println("Order");
		order();
}
public  static void number() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	sc.close();
	if(num>0) {
		System.out.println("Positive number");
	}else {
		System.out.println("Negative number");
	}
}

public static void greatest() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three number: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	sc.close();
	if(a>b && a>c) {
		System.out.println("a is greatest");
	}else if(b>a && b>c) {
		System.out.println("b is greatest");
	}else if(c>a && c>b){
		System.out.println("c is greatest");
	}
	
}
	public static void order() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		sc.close();
		if(n1<n2 && n2<n3 && n1<n3) {
			System.out.println("Increasing order");
		}else if(n1>n2 && n2>n3 && n1>n3) {
			System.out.println("Decreasing order");
		}else {
			System.out.println("Unordered list");
		}
	}
}