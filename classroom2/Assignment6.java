package week3.classroom2;

public class Assignment6 {
	/*
	 * Method 1
	 * Pseudo Code
	 
	 * Declare a String text with the following value
				String text = "Tes12Le79af65";
	   Declare a int variable sum
				int sum = 0;
	 * a) using replaceAll(), replace all the non-digits into ""
	 * b) Now, convert the String into array
	 * c) Iterate over the array and get each character
	 * d) Using Character.getNumericValue(), Change the char into int
	 * e) Add the values to sum & print
	 * 
	 */
	
	
	public static void main(String[] args) {
	
		
		String text = "Tes12Le79af65";
		int sum = 0;
		
		String text1 = text.replaceAll("\\D", "");
		System.out.println(text1);
		
		char[] intArray1 = text1.toCharArray();
		int size = intArray1.length;
		int s =0;
		
		for(int i = 0;i<size;i++)
		{
			
			
			
			s = s + Character.getNumericValue(intArray1[i]);
			System.out.println(s);
		}
		
		System.out.println(s);

	}

}
