package Week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		
		List<WebElement> trowsn = driver.findElementsByXPath("//table//tr");
		int rowsize = trowsn.size();
		System.out.println(rowsize);
		List<WebElement> tcolumnsn = driver.findElementsByXPath("(//table//tr)[2]/td");
		int columnsize = tcolumnsn.size();
		System.out.println(columnsize);
		int[] a = new int[rowsize-1];
		int k = 0;
		
		
		for(int i = 2;i<=rowsize;i++)
			
		{
			
			//System.out.println(i);
			for(int j = 1;j<=columnsize;j++)
			{
				//System.out.println("check first data");
				//System.out.println(driver.findElementByXPath("(//table//tr)[" + i + "]/td[" + j + "]").getText());
				
				//String text = driver.findElementByXPath("//table//tr[" + i + "]/td[" + j + "]").getText();
				
				//System.out.println(j);
				
				//System.out.println(driver.findElementByXPath("(//table//tr)[" + i + "]/td[1]").getText());
				
				
				//Third question
				
				if(driver.findElementByXPath("(//table//tr)[" + i + "]/td[1]").getText().contains("Learn to interact with Elements") == true )
				{
					if(j == 2 )
					System.out.println(driver.findElementByXPath("(//table//tr)[" + i + "]/td[2]").getText());
				}
				
				
				if(j==2)
				{
				String s = driver.findElementByXPath("(//table//tr)[" + i + "]/td[2]").getText().replace("%","");
				
				
			     
				a[k] = Integer.valueOf(s);
				k++;
				}
				
				
			}
			
		}
		
		Arrays.sort(a);
		String char1 = Integer.toString(a[0]).concat("%");
		
		System.out.println(char1);
		
       for(int l = 2;l<=rowsize;l++)
			
		{
			
			//System.out.println(i);
			for(int m = 1;m<=columnsize;m++)
			{
				
				//System.out.println(driver.findElementByXPath("(//table//tr)[" + l + "]/td[2]").getText());
				
				if(driver.findElementByXPath("(//table//tr)[" + l + "]/td[2]").getText().contains(char1) == true)
					
				{
					System.out.println("It matches");
					driver.findElementByXPath("(//table//tr)[" + l + "]/td[3]/input").click();
					break;
					
				}
		
			}
		}
		

	}

}
