package ArrayConcepts;

public class SimpleSorting {
	public static void main(String[] args) {
		
		int arr[]= {44,22,33,11};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			
				if(arr[i]>arr[j]) {
				   	int temp=arr[i];  
					arr[i]=arr[j];  // swapping logic
					arr[j]=temp;
					
				}
			}
		}
		for(int num : arr) {
			System.out.print(num +" ");
		}
	}
}

//44 22 33 11
//22 44 33 11
//22 33 44 11
//22 33 11 44
//22 11 33 44
//11 22 33 44