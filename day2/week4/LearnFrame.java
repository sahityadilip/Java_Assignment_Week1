package day2.week4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[@id = 'Click']").click();
	    driver.switchTo().defaultContent();
	    driver.findElementByTagName("h1");
	   System.out.println(driver.findElementByTagName("h1").getText()); 
	   
	   //Nested frame
	   
	   driver.switchTo().frame(1);
	   driver.switchTo().frame(0); //Nested frame
	   driver.findElementByXPath("//button[@id = 'Click1']").click();
	   

	}

}
