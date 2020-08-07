package day2.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button").click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		driver.findElementById("Click1").click();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		List<WebElement> test = driver.findElementsByXPath("//iframe[contains(@src,'count')]");
		System.out.println(test.size());
		
		driver.get("http://www.leafground.com/pages/Window.html");
		String firstWindow = driver.getWindowHandle();
		System.out.println(firstWindow);
		driver.findElementByXPath("//button[text() = 'Open Home Page']").click();
		
		String secondWindow = driver.getWindowHandle();
		System.out.println(secondWindow);
		driver.switchTo().window(secondWindow);
		//driver.close();
		//Second button for window handle
		driver.switchTo().window(firstWindow);
		driver.findElementByXPath("//button[text() = 'Open Multiple Windows']");
		Set<String> numberOfHandles = driver.getWindowHandles();
		List<String> numberofHandleslist = new ArrayList<String>(numberOfHandles);
		System.out.println(numberofHandleslist.size());
		
		//Third Button for window handle
		
		driver.switchTo().window(firstWindow);
		driver.findElementByXPath("//button[text() = 'Open Multiple Windows']");
		Set<String> numberOfHandles3 = driver.getWindowHandles();
		List<String> numberofHandleslist3 = new ArrayList<String>(numberOfHandles3);
		System.out.println(numberofHandleslist3.size());
		Thread.sleep(5000);
		for(String numberofHandleslist3a:numberofHandleslist3)
		{
			System.out.println(numberofHandleslist3a);
		}
		
		System.out.println(numberofHandleslist3.get(0));
		System.out.println(numberofHandleslist3.get(1));
		driver.switchTo().window(numberofHandleslist3.get(1)).close();
		//driver.switchTo().window(numberofHandleslist.get(2)).close();
		Thread.sleep(5000);
		//Fourth Window
		driver.switchTo().window(firstWindow);
		driver.findElementByXPath("//button[text() = 'Wait for 5 seconds']").click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		Boolean x = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println(x);
		if(x == true)
		System.out.println("Number of windows 2");
		
		
		//Calendar check
		
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.findElementByXPath("//input[@id = 'datepicker']").click();
		
		
		driver.findElementByXPath("//a[text() = '7']").click();
		
	}

}
