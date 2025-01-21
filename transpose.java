package TwoDArray;

public class transpose {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[][]= { 
					 {1,2,3},
				     {4,5,6},
				     {7,8,9}
				   };
		System.out.println("Before");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("After");
		System.out.println();
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					System.out.print(a[j][i]+" ");
				}
			System.out.println();
		}

	}


}
