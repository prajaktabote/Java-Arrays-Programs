package ArrayConcepts;

public class selectionDemo {
	public static void main(String[] args) {
		
		int a[]= {1,2,4,9,6};
		
		for(int i=0;i<a.length;i++) {
			
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
				
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	for(int num:a) {
		System.out.print(num+" ");
	}
	}
}
