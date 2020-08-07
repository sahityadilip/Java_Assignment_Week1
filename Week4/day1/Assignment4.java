package Week4.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/disapper.html");
		
		if(driver.findElementByTagName("button").isDisplayed() == true)
		{
			System.out.println("Button available");
		}
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		Boolean x = wait.until(ExpectedConditions.invisibilityOf(driver.findElementByTagName("button")));
		
		
		if(x == true)
			
		System.out.println("Got it");
		
		driver.get("http://leafground.com/pages/appear.html");
		
		
		
		Boolean T = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[3]/b"), "Voila! I'm here Guys"));
		if (T == true)
		{
			System.out.println("True");
		}
				
		driver.get("http://leafground.com/pages/TextChange.html");
		
		Boolean R = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button"), "Click ME!"));
		if (R == true)
		{
			System.out.println("True");
		}
		
	}

}
