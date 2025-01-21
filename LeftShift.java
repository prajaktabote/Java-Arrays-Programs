package ArrayConcepts;

public class LeftShift {
	public static void main(String[] args) {
		
		int a[]= {13,5,4,7,8,0,2};
		int temp=a[0];
		
		for(int i=0;i<a.length-1;i++) {
				
			a[i]=a[i+1];
		}
		
		a[a.length-1]=temp;
		
		for(int num:a) {
			System.out.print(num+" ");
		}
		
		
	}
}
