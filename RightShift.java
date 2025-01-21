package ArrayConcepts;

public class RightShift {
	public static void main(String[] args) {
		
		int a[]= {1,2,5,4,8};
		
		int temp=a[a.length-1];
		
		for(int i=a.length-1;i>=1;i--) {
			
			a[i]=a[i-1];
		}
		
		a[0]=temp;
		
		for(int num :a) {
			System.out.print(num+" ");
		}
	}
}
