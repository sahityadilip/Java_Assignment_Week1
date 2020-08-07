package day2.week4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		//to get simple alert
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		Alert alert = driver.switchTo().alert();
	
		System.out.println(alert.getText());
		alert.accept();
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		driver.switchTo().alert().dismiss();
		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("yaay"); //It will not type in UI ,backend it will be populated
		Thread.sleep(5000);
		alert2.accept();


	}

}
