package ArrayConcepts;

public class Binarysearch {
	 public static void main (String[] args) {
		 
		 int arr[]= {23,45,67,88,90}; 
		 int num=90;
		 int start=0;
		 int end=(arr.length-1);
		 
		 int mid=(start+end)/2;   
		 
		 while(start<=end) {
			 
			if(num>arr[mid]) {
				 start=mid+1;
				
			 }

			 else if(num==arr[mid]) 
			 {
				 System.out.println(" FOUND AT INDEX : "+mid);
				 break;
			 }
			
			 else
			 {
				 end=mid-1;
			 }
			 mid=(start+end)/2; //3
		 }
		 if(start>end) {
			 System.out.println("INDEX NOT FOUND ");
		 }
	}
}
