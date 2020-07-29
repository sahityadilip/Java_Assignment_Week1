package week3.classroom2;

public class Assignment2 {

	public static void main(String[] args) {
		String test = "feeling good";
		
		char[] stringToReverse = test.toCharArray();
		
		int size = stringToReverse.length;
		System.out.println(size);
		char[] stringreversed = new char[size];
		int j = 0;
		for(int i = size-1;i>=0;i--)
		{
			
			
			//System.out.println(j);
			
			//System.out.println(stringToReverse[i]);
			stringreversed[j] = stringToReverse[i];
			
			System.out.println("After addition" + "...................." + stringreversed[j]);
			
			j = j + 1;
			
			//System.out.println(j);
			
			//System.out.println("Before addition" + stringreversed[j-1]);
			
			
		}
		
		
		for(int k =0;k<size;k++)
		{
			
			System.out.println(stringreversed[k]);
			
		}
		
		

	}

}
