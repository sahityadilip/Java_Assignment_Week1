package Week4.day1;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTableCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://leafground.com/pages/Link.html");
		
		//List<WebElement> webele = driver.findElementsByTagName("a");
		//System.out.println(webele.size());
		
		driver.get("http://erail.in");
		driver.findElementById("chkSelectDateOnly").click();
		driver.findElementByXPath("//table[@id='tableTopMenu']//tr[2]//input").clear();
		driver.findElementByXPath("//table[@id='tableTopMenu']//tr[2]//input").sendKeys("ms");
		
		driver.findElementByXPath("//table[@id='tableTopMenu']//tr[2]//input").sendKeys(Keys.TAB);
		
		driver.findElementByXPath("(//table[@id='tableTopMenu']//tr[2]//input)[2]").clear();
		driver.findElementByXPath("(//table[@id='tableTopMenu']//tr[2]//input)[2]").sendKeys("mdu");
		driver.findElementByXPath("(//table[@id='tableTopMenu']//tr[2]//input)[2]").sendKeys(Keys.ENTER);
		Thread.sleep(200);
		
		List<WebElement> s1 = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr//td[2]");
		
		int count = s1.size();
		System.out.println(count);
		
		Set<String> e3 = new LinkedHashSet();
		
		for(int i = 1 ; i<=count;i++)
		{
			String t = driver.findElementByXPath("(//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]//td[2])/a").getText();
			System.out.println(t);
			e3.add(t);
			
		}
		
		for(String e4:e3)
		{
			
			System.out.println(e4);
		}
		
		
		System.out.println(e3.size());
		
		
		
		
		

	}

}
