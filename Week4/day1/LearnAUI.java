package Week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in");
		
		//WebElement we = driver.findElementByXPath("//span[text()='Account & Lists']");
		
		
		//Actions builder = new Actions(driver);
		//builder.moveToElement(we).perform();
		
		
		
		driver.get("http://leafground.com/pages/selectable.html");
		
		WebElement we = driver.findElementByXPath("//span[text()='Account & Lists']");
		Actions builder = new Actions(driver);
		builder.moveToElement(we).perform();
		
		

	}

}
