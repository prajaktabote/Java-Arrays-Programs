package TwoDArray;

import java.util.Arrays;

public class convert2Din1D {
	public static void main(String[] args) {
		
		int [][]a= {{1,2,4},
				{4,5,7,7},
				{2,6,7,9}
				};
			
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				count++;
			}
		}
		
		int[] b=new int[count];
		
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				b[index]=a[i][j];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(b)); //In-build method for direct printing of array
		}
	}
