package week3.classroom2;

public class Assignment5 {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray1 = test.toCharArray();
		int size = charArray1.length;
		for(int i =0;i<size;i++)
		{
			
			if(i%2 != 0)
			{
				charArray1[i] = Character.toUpperCase(charArray1[i]);
				//System.out.println(charArray1[i]);
				
			}
			
		}

		for(int j =0;j<size;j++)
		{
			
			System.out.println(charArray1[j]);
			
		}
		
		
	}

}
