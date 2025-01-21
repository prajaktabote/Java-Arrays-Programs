package ArrayConcepts;

public class BubbleSort {
	public static void main(String[] args) {
		
		
		int arr[]= {44,11,33,22};
		//BUBBLE SORT PROPERTIES :
	
		//No of Rounds -> length-1
		//after each round -> 1 elements gets placed at its correct order
		//i=rounds
		//j=elements
	
		for(int i=0;i<arr.length -1;i++) { //rounds
			
		for(int j=0;j<arr.length-1-i;j++) { // -i is written because at the end of every round,
//				one element is getting placed at its correct order so 
//				no need to take it again in the consideration.
//		     	It increases the speed and also the performance.
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];//swapping logic
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
}
