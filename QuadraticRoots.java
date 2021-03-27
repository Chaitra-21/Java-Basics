package com.example.ifelse;

import java.util.Scanner;

public class QuadraticRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,c of the equation: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		System.out.println("The equation is: "+a+"x^2"+"+"+b+"x"+"+"+c+" =0");
		System.out.println("The roots are:");
		double result=b*b-(4*a*c);
		if(result>0.0) {
			double root1=-b+(Math.pow(result, 0.5))/(2*a); //power function in math gives the raised value of second to first
			double root2=+b+(Math.pow(result, 0.5))/(2*a);
			System.out.println("Roots are: "+root1+" and "+root2);
		}else
		if(result==0) {
			double root=-b/ (2*a);
			System.out.println("Roots are: "+root);
		}else {
			System.exit(0);
		}
		
	}

}
