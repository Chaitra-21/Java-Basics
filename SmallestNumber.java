package com.example;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		sc.close();
		int res=smallest(n1,n2,n3);
		System.out.println("Smallest number is:"+res);
	}
	public static int smallest(int n1, int n2, int n3) {
		if(n1<n2 && n1<n3)
			return n1;
		else if(n2<n1 && n2<n3)
			return n2;
		else if(n3<n1 && n3<n2)
			return n3;
		else
			return 0;
	}

}
