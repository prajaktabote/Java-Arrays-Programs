package TwoDArray;

public class CharacterInterleaving {
	public static void main(String[] args) {
		
		
		char ch1[] = {'a','b','c','d'};
		
		char ch2[]= {'p','q','r','s'};
		int index=0;
		
		char a[]=new char[ch1.length+ch2.length]; 
		
		for(int i=0;i<ch1.length || i<ch2.length;i++) {
			
			if(i<ch1.length)
			{
				a[index++]=ch1[i];
			}
			if(i<ch2.length)
			{
				a[index++]=ch2[i];
			}
			
		}
		
		for(int num:a) {
			System.out.print((char)num+" ");
		}
		
		
	}
}
