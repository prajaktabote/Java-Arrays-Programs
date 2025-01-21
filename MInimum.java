package ArrayConcepts;

public class MInimum {
	public static void main(String[] args) {
		
		int a[]= {1,2,34,77,88,6};
		int min=Integer.MAX_VALUE;
		
		//System.out.println(Integer.MAX_VALUE);
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min) { // if the array element is less that max value in java..assign it to the min
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
