package com.example.basic1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r=sc.nextInt();
		double area_circle=Circle(r);
		System.out.println("Circle area: "+area_circle);
//		
		System.out.println("Enter length and breadth: ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int area_rect=Rectangle(l,b);
		System.out.println("Rectangle area: "+area_rect);
		
		System.out.println("Enter base and height: ");
		int base=sc.nextInt();
		int height=sc.nextInt();
		double area_tri=Triangle(base,height);
		System.out.println("Triangle area: "+area_tri);
		
		System.out.println("Enter side: ");
		int s=sc.nextInt();
		int area_sq=Square(s);
		System.out.println("Square area: "+area_sq);
		
		sc.close();
	}
	public static double Circle(int r) {
		double pi=3.14;
		return (pi*r*r);
	}
	public  static int Rectangle(int l, int b) {
		return (l*b);
	}
	public  static double Triangle(int base, int height) {
		return(0.5*base*height);
	}
	public static int Square(int s) {
		return( s*s);
	}
	
}
