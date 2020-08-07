package day2.week4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		driver.findElementByTagName("button").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Sahi");
		alert.accept();
		String text = "Sahi";
		if(driver.findElementByXPath("//p").getText().contains(text))
		{
			
			System.out.println("matches");
		}
		


	}

}
