package com.example.basic1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int sum=add(a,b);
			int sub=sub(a,b);
			int mul=mul(a,b);
			int div=div(a,b);
			System.out.println(sum+" "+sub+" "+mul+" "+div+" ");
			sc.close();
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public  static int sub(int a,int b) {
		return a-b;
	}
	public  static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
}
