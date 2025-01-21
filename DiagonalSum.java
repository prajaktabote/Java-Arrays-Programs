package ArrayConcepts;

public class DiagonalSum {
	public static void main(String[] args) {
	
		int a[][]= { 
				{1,2,4,},
				{1,3,4,},
				{1,6,2,}
				};
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				if(i==j) {
					if(i==j) {
					System.out.println(a[i][j]+" ");
					sum=sum+a[i][j]; 
				}
			}
			System.out.println();
		}
		System.out.println("sum of diagonal ele:"+sum);

}
	}
}
