package day2.week4;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev68594.service-now.com/");
		Thread.sleep(15000);
		driver.switchTo().frame("Main Content");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		System.out.println(wait.until(ExpectedConditions.visibilityOf(driver.findElementById("user_name"))));
		//driver.findElementByXPath("//input[@id ='user_name']").sendKeys("admin");
		//Thread.sleep(2000);
		//driver.findElementByXPath("//input[@id = 'user_password']").sendKeys("India@123");
		//Thread.sleep(3000);
		//driver.findElementByXPath("//button[@type = 'submit']").click();
		

	}

}
