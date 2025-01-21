package ArrayConcepts;

public class leastSubArrayAVG {
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7};
		
		int k=3;
		int index=0;
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				
				sum=sum+a[j];
				System.out.print(a[j]+" ");
			}
			
			System.out.println("= "+sum);
			System.out.println();
			
			if(sum<min) {
				min=sum;
				index=i;
			}
		}
		System.out.println("avg: "+min/k +"  at index :"+ index);
	}
}
