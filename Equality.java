package ArrayConcepts;
//2.program to test the equality of two arrays.

public class Equality {
	public static void main(String[] args) {
		
		int [] arr1= {11,23,55,56,98};
		int [] arr2 = {11,23,55,56,98};
		
		
		if(arr1.length==arr2.length) {
				int count=0;
			
				for(int i=0;i<arr1.length;i++) 
				{
					if(arr1[i]==arr2[i])
					{
						count++;
					}	
				}
			
			//System.out.println(count);
			 
					if(count==arr1.length) 
					{
						System.out.println("EQUAL ELEMENTS");
					}  
					
					else 
					{
						System.out.println("NOT EQUAL ELEMENTS");
					}
					
					
		}
		else 
		{
			System.out.println("NOT EQUAL LENGTH");
		}
		
	}
}
