package TwoDArray;

import java.util.Scanner;

public class basicDemo {
	public static void main(String[] args) {
		
		int a[][]=new int [2][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter array elements:");
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		
		
		//display elements:
		
		System.out.println("Displaying Matrix");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
