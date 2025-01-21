package TwoDArray;

public class interlivingOfArray {
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int index=0;
		int c[]=new int[a.length+b.length];
		
		
		for(int i=0;i<a.length;i++) {
				c[index]=a[i];
				index++;
				c[index]=b[i];
				index++;

			}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		}
	
	}
