package ArrayConcepts;

public class PositiveNegative {
	public static void main(String[] args) {
		
		int a[]	= {1,2,3,-2,-6,7,-9};
		
		int pos=0;
		int neg=0;
		
		for(int i=0;i<a.length;i++) { 
			if(a[i]>0){
				pos++;
			}
			else{
				neg++;
			}
		}
		
		int b[]=new int[pos];
		int c[]=new int[neg];
		
		int index1=0;
		int index2=0;
		 
		for(int i=0;i<a.length;i++) {
			
			if(a[i]> 0) {
				b[index1]=a[i];
				index1++;
			}
			else {
				c[index2]=a[i];
				index2++;
			}
		}
		
		System.out.println("Positive number array :");
		for(int num : b) {
			System.out.println(num);
		}
		
		System.out.println("Negative number array :");
		for(int num : c) {
			System.out.println(num);
		}
		
		
	}
	
}
