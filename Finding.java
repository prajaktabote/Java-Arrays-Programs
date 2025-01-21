package ArrayConcepts;

public class Finding {
	public static void main(String[] args) {
		
		int a[] = {1,2,55,67,87,5};
		int ele=5;
		int count=0;
	
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				System.out.println(i);
				count++;
			}
		}
		if(count==0) {
			System.out.println("element not found");
		}
	}
}
