package Week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement location4 = driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[4]");
		int x = location4.getLocation().getX();
		int y = location4.getLocation().getY();
		
		WebElement location1 = driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[1]");
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(location1, x, y).build().perform();
		
	}

}
