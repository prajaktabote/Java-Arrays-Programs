package TwoDArray;

public class Finding {
	public static void main(String[] args) {
		
		int a[]= {1,6,3,7,5,6,7,4};
		
		int ele=6;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				System.out.println(i);
				count++;
			}
		}
		
		if(count==0) {
			System.out.println("not found");
		}
	}
}
