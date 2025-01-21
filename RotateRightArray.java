package ArrayConcepts;

public class RotateRightArray {
	
	public static void main(String[] args) {
		
		int arr[]= {11,22,33,44}; //given array 
								  //required output :{44,11,22,33} 
	
		int temp=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--) 
		{
			arr[i]=arr[i-1]; 
		}
		arr[0]=temp; //replaced first value of array with temp i.e.last value of array.
		
		for(int num : arr) {
			System.out.print(num +" ");
		}
	}
}

