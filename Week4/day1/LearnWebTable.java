package Week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://leafground.com/pages/Link.html");
		
		//List<WebElement> webele = driver.findElementsByTagName("a");
		//System.out.println(webele.size());
		
		driver.get("http://leafground.com/pages/table.html");
		
		List<WebElement> allRows = driver.findElementsByXPath("//table//tr");
		int length = allRows.size();
		
		System.out.println(length);
		
		
		for(int i = 2;i<=length;i++)
			
			
		{
			//To get data count in a row
			
			List<WebElement> alldata = driver.findElementsByXPath("//table//tr[" + i + "]/td");
			int allDataCount = alldata.size();
			System.out.println(allDataCount);
			
			for(int j = 1;j<=allDataCount;j++)
			{
			//Dynamic xpath
		     String text = driver.findElementByXPath("//table//tr[" + i + "]/td[" + j + "]").getText();
		    
		System.out.print(text + " " );
		}
			System.out.println();
		}
		

	}

}
