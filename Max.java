package ArrayConcepts;

public class Max {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,77,5};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
	}
}
