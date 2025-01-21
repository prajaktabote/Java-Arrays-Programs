package TwoDArray;

public class OptimalSelection {
	public static void main(String[] args) {
		
		int a[]= {3,9,1,5};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//array will be:1,3,5,9
		}
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i]*i;
			System.out.println(sum);

		}
			}
	
}
