package practice;

public class specificnumber {
	public static void main(String[] args) {
		
		int a[]= {33,7,90,20,5,50,40};
		int ele=9;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==ele) {
				
				System.out.println("found");
				count++;
			}
		}
		if(count==0) {
			System.out.println("Not found");
		}
		
	}
}
