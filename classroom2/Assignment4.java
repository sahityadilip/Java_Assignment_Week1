package week3.classroom2;

//Build a logic to find the given string is palinDrome or not

	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

public class Assignment4 {

	public static void main(String[] args) {
		

		String testValue = "madamw";
		
		char[] originalString = testValue.toCharArray();
		
		int size = originalString.length,j=0;
		char[] reversedString = new char[size];
		for(int i = size-1;i>=0;i--)
		{
			System.out.println(originalString[i]);
			reversedString[j] = originalString[i];
			j++;
		}
		
		
		String reversedString1 = String.valueOf(reversedString);
		
		if (testValue.equals(reversedString1))
		{
			
			
			System.out.println("Palindrome");
		}
		
		else
		{
			
			System.out.println("Not a Palindrome");
			
		}
		
		
	}

}
