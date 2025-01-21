package ArrayConcepts;

public class ReverseOfArray {
	public static void main(String[] args) {
		
		//GIVEN
		int [] arr= {11,22,33,44,55};
		int start=0;
		int end=4;
		
		//swapping of values
		while(start<=end) { 
			int temp=arr[start];
			arr[start]=arr[end]; //logic for swapping just like swapping of variables.
			arr[end]=temp;
			start++;
			end--;
			
		}
		
		//printing of array.
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
}
