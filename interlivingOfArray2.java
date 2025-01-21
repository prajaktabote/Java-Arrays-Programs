package TwoDArray;

public class interlivingOfArray2 {
	public static void main(String[]  args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		
		int c[]=new int[a.length+b.length];
		int index=0;
		
		for(int i=0;i<a.length || i<b.length;i++) {
			if(i<a.length) {
				c[index++]=a[i];
				//index++;
			}
			if(i<b.length) {
				c[index++]=b[i];
				//index++;
			}
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		}
}
