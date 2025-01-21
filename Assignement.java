package TwoDArray;

public class Assignement {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		int ele=1;
		int count=0;
		for(int i=0;i<a.length;i++) {
			
				if(a[i]==ele) {
					count++;
				}
		}
		int newLength=(a.length-count);
		
		int b[]=new int[newLength];
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=ele) {
				b[index++]=a[i];
			}
	}
		for(int num:b) {
			System.out.print(num+" ");
		}
	}
}
