package TwoDArray;

public class oddevenposneg {
	public static void main(String[] args) {
		// TODO Auto-generated method  
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int pos=0;
		int neg=0;
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				pos++;
			}
			else
			{
				neg++;
			}
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
			System.out.println("pos="+pos);
			System.out.println("neg="+neg);
			System.out.println("even="+even);
			System.out.println("odd="+odd);
		
		
		
		
	}
}
