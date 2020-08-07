package day2.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestForFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev68594.service-now.com/");
		//Thread.sleep(15000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//input[@id ='user_name']").sendKeys("admin");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id = 'user_password']").sendKeys("India@123");
		Thread.sleep(3000);
		driver.findElementByXPath("//button[@type = 'submit']").click();
		Thread.sleep(7000);
		driver.findElementByXPath("//input[@id = 'filter']").sendKeys("incident");
		driver.findElementByXPath("(//div[text() = 'All'])[2]").click();
		Thread.sleep(3000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//button[text() = 'New']").click();
		driver.findElementById("lookup.incident.caller_id").click();
		Set<String> windowAll = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(windowAll);
		String first = list1.get(0);
		String Second = list1.get(1);
		System.out.println(first);
		System.out.println(Second);
		Thread.sleep(5000);
        driver.switchTo().window(Second);
        String s = "Abel Tuter";
        WebElement t = driver.findElementByXPath("//input[@type = 'search']");
        Thread.sleep(2000);
        t.sendKeys(s);
        t.sendKeys(Keys.ENTER);
        
        driver.findElementByXPath("//a[text() = 'Abel Tuter']").click();
        driver.switchTo().window(first);
        System.out.println(driver.getWindowHandle());
        Thread.sleep(10000);
        driver.switchTo().frame("gsft_main");
        
        String incnum = driver.findElementByXPath("//input[@id = 'incident.number']").getAttribute("value");
        System.out.println(incnum);
        driver.findElementByXPath("//input[@id = 'incident.short_description']").sendKeys("Test");
        driver.findElementByXPath("//button[text() = 'Submit']").click();
        Thread.sleep(10000);
        WebElement incSearch = driver.findElementByXPath("//span[text() = 'Press Enter from within the input to submit the search.']/following-sibling::input");
	    
        incSearch.sendKeys(incnum);
        incSearch.sendKeys(Keys.ENTER);
        String incnum2 = driver.findElementByXPath("//td[@class = 'vt']//a").getText();
	    System.out.println(incnum2);
	    System.out.println(incnum);
	    if(incnum.contains(incnum2) == true)
	    {
	    	
	    	System.out.println("Matching");
	    }
	
	
	}

}
