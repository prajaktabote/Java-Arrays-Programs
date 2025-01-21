package ArrayConcepts;

public class diagonalReverse {
	public static void main(String[] args) {
		
		int a[][]= {
				{1,2,3,5},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}
		};
		
		//5+3+2+1=11
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				if(i+j==3) {
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println(sum);
		
		
		
	}
}
