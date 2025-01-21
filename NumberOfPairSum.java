package TwoDArray;

public class NumberOfPairSum {
	public static void main(String[] args) {
		
		int a[]= {1,5,7,1};
		int k=6;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]+a[j]==k) {
					System.out.println(a[i] +" "+a[j]);
					count++;
				}
			}
		
		}
		System.out.println("The number of pairs :"+count);
		}
}
