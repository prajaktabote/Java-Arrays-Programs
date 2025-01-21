package ArrayConcepts;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter size : ");
		n=sc.nextInt();

		int a[] =new int[n];
		
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		int avg;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum :"+sum);
		
		avg=sum/a.length;
		System.out.println("Average :"+avg);		
		
	}
}
