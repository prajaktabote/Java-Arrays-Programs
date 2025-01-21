package TwoDArray;

public class RemoveDuplicate {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5,1,1};
		
	for(int i=0;i<a.length;i++) {
		int count=0;
		
		for(int j=0;j<i;j++) {
			
			if(a[i]==a[j]) {
				count++;
			}
		}
		
		
		if(count==0) {
			System.out.print(a[i]+" ");
		}
	}
	
	
		}
}
