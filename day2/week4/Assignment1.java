package day2.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[text() = 'Merge Leads']").click();
		String first = driver.getWindowHandle();
		System.out.println(first);
		driver.findElementByXPath("//table[@name = 'ComboBox_partyIdFrom']/following-sibling::a").click();
		Set s = driver.getWindowHandles();
		List<String> windowall = new ArrayList<String>(s);
		driver.switchTo().window(windowall.get(1));
		
		driver.findElementByXPath("(//div[@class = 'x-form-element'])[1]/input").sendKeys("10009");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//table[@class = 'x-grid3-row-table']//a").click();
		driver.switchTo().window(windowall.get(0));
		
		//Second 2
		
		driver.findElementByXPath("//table[@name = 'ComboBox_partyIdTo']/following-sibling::a").click();
		Set s1 = driver.getWindowHandles();
		List<String> windowall1 = new ArrayList<String>(s1);
		driver.switchTo().window(windowall1.get(1));
		driver.findElementByXPath("(//div[@class = 'x-form-element'])[1]/input").sendKeys("10010");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//table[@class = 'x-grid3-row-table']//a").click();
		driver.switchTo().window(windowall1.get(0));
		driver.findElementByXPath("//a[text() = 'Merge']").click();
		
		driver.switchTo().alert().accept();
		
		driver.findElementByXPath("//a[text() = 'Find Leads']").click();
        driver.findElementByXPath("//label[text() = 'Lead ID:']/following::input").sendKeys("10009");
        driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		
		
		if(driver.findElementByXPath("//div[@class = 'x-paging-info']").getText().contains("No records to display") == true) 
		{
			
			System.out.println("No records");
		}
		
		
		driver.close();
		
	}

}
