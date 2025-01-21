package ArrayConcepts;

public class InnerElements {
	public static void main(String[] args) {
		
		int a[][]= {
				{1,2,4,5},
				{1,3,4,5},
				{1,6,7,5},
				{1,2,4,5}
				
				};
		
		int sum=0;
		int count=0;
	
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Inner elements");
		for(int i=1;i<a.length-1;i++) {
			
			for(int j=1;j<a.length-1;j++) {
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
				count++;
			}
			System.out.println();
		}
		
		System.out.println("sum:"+sum);
		
		int avg=sum/count;
		System.out.println("Avarage : "+avg);
		
		
	}
}
