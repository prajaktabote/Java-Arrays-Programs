package ArrayConcepts;

public class EvenOddInDiffArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int cnt=0;
		int count=0;
	
		for(int i=0;i<a.length;i++) {
				if(a[i]%2==0) {
					count++;	
				}
				else {
					cnt++;
				}
		}
		
		int b[]=new int[count]; //even array
		int c[]=new int[cnt];  //Odd array
		
		int index1=0;
		int index2=0;
		for(int i=0;i<a.length;i++) {
				if(a[i]%2==0) {
					b[index1]=a[i];
					index1++;
				}
				else {
					c[index2]=a[i];
					index2++;
				}
		}
		
		System.out.println("even array :");
		for(int num:b) {
			System.out.println(num);
		}
		
		System.out.println("odd array :");
		for(int num:c) {
			System.out.println(num);
		}
	
	}
}
