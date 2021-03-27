package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String sum=sum();
	//	index_pos();
	//	remove();
	//	insert();
		reverse();
	}
		public static String sum() {
			int[] arr= {12,34,56,78,90};
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
			return ("Sum of array is: "+sum);

		}
		public static void index_pos() {
			int [] arr= {45,87,42,90,876};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number from given array:");
			int val=sc.nextInt();
			sc.close();
			int pos=0;
			for(int i=0;i<arr.length;i++) {
				if(val==arr[i]) {
					pos=i;
					System.out.println("Position= "+pos);}
			}
			if(pos==0)
				System.out.println("Number not found");
			
		}
		public static void remove() {

			int [] arr= {23,76,90,54,21,34,908,6764,89};
			System.out.println("Original array: "+Arrays.toString(arr));
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter element position to be removed ");
			int remove=sc.nextInt();
			sc.close();
			for(int i=remove;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			System.out.println("New array: "+ Arrays.toString(arr));
		}
		public static void insert() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter element and pos to be inserted: ");
			int e=sc.nextInt();
			int p=sc.nextInt();
			sc.close();
			int[] arr= {90,80,70,50,40,30,20};
			System.out.println("Original array: "+Arrays.toString(arr));
			for(int i=arr.length-1;i>p;i--) {
				arr[i]=arr[i-1];
			}
			arr[p]=e;
			System.out.println("New array: "+Arrays.toString(arr));
		}
		public static void reverse() {
			int [] arr= {23,76,90,54,36};
			for(int i=arr.length-1;i>0;i--) {
				System.out.println(arr[i]);
			}
		}
}
