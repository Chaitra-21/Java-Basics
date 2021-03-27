package com.example;
import java.util.*;
public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			int space=1;
			while(space<=n-row) {
				System.out.print(" ");
				space++;
			}
			int count=1;
			while(count<=2*row-1) {
				System.out.print(count);
				count++;
			}
			System.out.println();
			row++;
		}
		sc.close();
	}

}
