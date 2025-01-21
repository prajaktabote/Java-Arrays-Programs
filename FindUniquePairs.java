package ArrayConcepts;

public class FindUniquePairs {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,2,3};

//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				System.out.println(a[i]+" "+a[j]);
//			}
//		}
//		System.out.println(); //for seperating repeated and unique pairs.
//		
		int cnt=0;//for original elements.
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==0) {
				cnt++;
			}
		}
		
		int b[]=new int[cnt];
		int index=0;

		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==0) {
				b[index]=a[i];
				index++;
			}
		}
		System.out.println("unique pairs:");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.println(b[i]+" "+b[j]);
			}
		}
	}
}
