package ArrayConcepts;

public class segregateArray {
	public static void main(String[] args) {
		
		int a[]= {0,0,1,1,0};
		int temp;
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				
				if(a[i]==1 && a[j]==0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
