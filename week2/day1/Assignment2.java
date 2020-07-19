package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		//driver.findElementById("home").click();
		
		//Get position
		System.out.println(driver.findElementById("position").getLocation()); 
		//Get Size
		System.out.println (driver.findElementsById("size").size());
		//Get Background color
		String S = driver.findElementById("color").getCssValue("background-color");
		System.out.println(S);
		
		//Go to home page
		driver.findElementById("home").click();

	}

}
