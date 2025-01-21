package ArrayConcepts;

public class InsertionSort {
	public static void main(String[] args) {
		
		
	//first we choose one element and shift it until it gets its original or the correct position 
	//we do not perform the swapping we perform shifting in this insertion sort.		//firstly we start the execution of that program from 1st index that means at first we choose the element of 1st index.
		 
	//in this array we choose 4 element for shifting,compared with other elements and 
	//finally it will get its correct order.
		
	//similarly for the element 2 then shifted same as the shifting of 4 and also same for 1.
	//finally we get the sorted array at last.
		
				//   0 1 2 3
				//	   j--
				//	   i++
		
			int [] arr= {8,4,2,1};

		for(int i=1;i<arr.length;i++) { 
			
			int j=i; //j=1   
			int temp=arr[i]; //temp=4
			
			    //1>0 && arr[0]/8>4==true
			while(j>0 && arr[j-1]>temp) 
			{
				arr[j]=arr[j-1]; 	//4 got replaced with 8
				j=j-1; //j--=0
			}
			
			arr[j]=temp; //arr[0]= 4 then  8 got replaced with 4
		}
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
}
