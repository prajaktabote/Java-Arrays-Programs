package TwoDArray;

public class PrintEvenThenOdd {
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7,8};
		
		int b[] =new int [a.length];
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			
				if(a[i]%2==0) {
					b[index]=a[i];
					index++;
				}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				b[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
	}
}
