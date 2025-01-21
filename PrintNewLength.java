package TwoDArray ;

public class PrintNewLength {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,2,4,1,5,1};
		
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				
				if(a[i]==a[j]) {
					count++;   //duplicate numbers.
				}
			} 
			if(count==0)
		    {
				//System.out.println(a[i]);
				cnt++;
			}
		 }
		int b[]=new int[cnt];

		for(int k=0;k<b.length;k++) {
			b[k]=a[k];
			System.out.println(b[k]);
		}
	}
}

//Task: print all of the original elements in a new array.
