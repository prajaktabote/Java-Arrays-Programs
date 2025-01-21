package ArrayConcepts;

public class PartialRotateRight {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,5,6,7,76,9,10};
			//    1 2 76 3 5 6 7 9 10 
		int start=2;
		int end=6;
		
		int temp=a[end];
		for(int i=end;i>start;i--) {
			
			a[i]=a[i-1];
		}
		
		a[start]=temp;
		
		for(int num : a) {
			System.out.print(num+" ");
		}
	}
}
