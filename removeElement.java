package ArrayConcepts;

public class removeElement {
	public static void main(String[] args) { 
		// we can also use continue to skip the condition where 
												//a[i]=element i.e. 2
		
		int [] a= {1,2,3,4,5,6};
		
		int ele=2;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!= ele) {
				System.out.println(a[i]);
			}
		}
	}
}
