package ArrayConcepts;

public class arrayDemo {
	public static void main(String[] args) {
		
		int corejava=98;
		int sql=78;
		int dsa=74;
		int react=87;
		
		//Array
		
		int [] subjects= {98,78,74,87,56,65}; //array syntax
		
		
		//System.out.println(dsa);
		
//		System.out.println(subjects[0]);
//		System.out.println(subjects[1]);
//		System.out.println(subjects[2]);
//		System.out.println(subjects[3]);
//		System.out.println(subjects[4]);
//		System.out.println(subjects[5]);
		
//		for(int i=0;i<=subjects.length;i++) {  //it will create ArrayIndexOutOfBound exception
//			System.out.println(subjects[i]);
//		}
		
		//IMP://we are using length method to define how many times we have to run the loop.
		
		for(int i=0;i<subjects.length;i++) {
			System.out.println(subjects[i]);  // 1st way to print array
		}
		
		System.out.println();
		
		for(int i=0;i<=subjects.length-1;i++) {
			System.out.println(subjects[i]);  // 2nd way to print array.
		}
		
		
		System.out.println("Length : "+subjects.length);
	}
}
