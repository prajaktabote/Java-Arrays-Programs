package ArrayConcepts;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements :");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
//		a[0]=1;
//		a[1]=3;
//		a[2]=4;
		
		System.out.println("Displaying elements:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}
