package ArrayConcepts;

public class replace0to1 {
	public static void main(String[] args) {
		
		
		int a[]= {1,0,1,0,1,0};
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==0) {
				a[i]=1;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}

