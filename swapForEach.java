package ArrayConcepts;

public class swapForEach {
	public static void main(String[] args) {
		
		int a[]= {11,22,33,44};
		
		int start=0;
		int end=a.length-1;
		
		while(start<=end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		
		for(int k : a) {	//for each loop for printing array without giving sn
			System.out.print(k +" ");
		}
	}
}
