package TwoDArray;

import java.util.Arrays;

public class tywins_Statergy {
	public static void main(String[] args) {
		 
		int a[]= {5,6,3,2,1};
		int k=2;
		
		int wincount= (a.length+1)/2; //required troops for wining the war.
		
		int count=0;//we have that count of lucky troops.
		for(int i=0;i<a.length;i++) {
			if(a[i] % k==0) { 
				count++;//2
			}
		}

		int reqCount=wincount-count;
		
		int b[]=new int [a.length];//in each troop how many soldiers required to add in 
									//it so it become the lucky troop.
		
		for(int i=0;i<a.length;i++) {
			int rem=a[i]%k;
			int num =k-rem; //soldiers
			b[i]=num;
		}
		
	Arrays.sort(b); //sort the array for picking the troop.
	
	int sum=0; 
	for(int i=0;i<reqCount;i++) {
		sum=sum+b[i]; 
	}
		
	System.out.println(sum);
		
	}
}
