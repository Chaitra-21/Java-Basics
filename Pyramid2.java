package com.example;
import java.util.*;
public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sol;
		for(int i=0;i<=n;i++) {
			int spaces=1;
			 sol=n-i;
			while(spaces<=sol) {
				System.out.print(" ");
			spaces++;
			}
			for(int count=1;count<=(2*i)-1;count++) {
				System.out.print(count);
			}
			System.out.println();
		}
		sc.close();
	}

}
