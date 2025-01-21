package ArrayConcepts;

public class SelectionSort {
	public static void main(String[] args) {
		
		//first in the selection sort,we have to assume the imaginary sorted and the unsorted array.
		//then we have to set minimum number as to comparision with the unsorted array,that is min varible.
		// 8 4 2 1
		
		//in the above example we set min=8 i.e. assumed minimum number is 8  --> compared it with other 3 numbers that are 4,2,1
		//and if in comparison ,min value is updated with the index of minimum value of compared element.
		//that means the arr[min] is if greater than its arr[j],assign index value j to the min.
		//then the sorted element(assumed) is swapped with the smallest element which we found by comparing min.
		//as like that we have compared it with the other 3 and finally it is placed at last. in the first iteration.
		//and as like that many iterations we have the sorted array.
		int [] arr= {9,8,3,2,4,1}; //unSorted array
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				 
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];//swapping
			arr[min]=temp ; 
		}
		
		for(int num:arr) {
			System.out.print(num+" "); //Sorted array
		}
		
		 
		}
}
