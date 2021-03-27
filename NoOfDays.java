package com.example.ifelse;

import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month number and year");
		int  month=sc.nextInt();
		int year=sc.nextInt();
		sc.close();
		if(month==2 && year%4==0 ) {
			System.out.println(year+" is a leap year. No of Days is 29");
		}
		else if(month==2) {
			System.out.println(year+" is not a leap year. No of days is 28");
		}
		else if(month<8 && month%2!=0) {
			System.out.println("No of days is 31");
		}
		else if(month<8 && month%2==0) {
			System.out.println("No of days is 30");
		}
		else if(month>8 && month%2!=0) {
			System.out.println("No of days is 31");
		}
		else if(month>8 && month%2==0) {
			System.out.println("No of days is 30");
		}
		else if(month==8) {
			System.out.println("No of days is 31");
		}
	}

}
