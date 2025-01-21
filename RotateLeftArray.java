package ArrayConcepts;

public class RotateLeftArray {
	public static void main(String[] args) {
		
		
		int [] arr= {11,22,33,44};
		
		//int temp =11 {22,33,44,11} 
		
		int temp=arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=temp; //last index value replace with first index value.
		
		//num represent each element in a array arr.
		
		for(int num : arr) { //for each loop for printing array.
			System.out.print(num + " ");
		}
	}
}
