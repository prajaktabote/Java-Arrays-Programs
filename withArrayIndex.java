package ArrayConcepts;

import java.util.Scanner;

public class withArrayIndex {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter size :");
		n=sc.nextInt();
	    int a[] =new int[n];
	    
	    
	   System.out.println("enter elements :");
	    for(int i=0;i<a.length;i++) {
	    	a[i]=sc.nextInt();
	    }
	    
	    System.out.println("Displaying elements:");
	    for(int i=0;i<a.length;i++) {
	    	System.out.println(a[i]);
	    }
	}
}