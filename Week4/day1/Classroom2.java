package Week4.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Classroom2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement we = driver.findElementByXPath("(//a[@class = 'menuLinks leftCategoriesProduct '])[6]/span");
		Actions builder = new Actions(driver);
		builder.moveToElement(we).build().perform();
		
		driver.findElementByXPath("//span[text() = 'Shirts']").click();
		
		//WebElement we1 = driver.findElementByXPath("(//section[@class = 'js-section clearfix dp-widget  dp-fired']/div)[1]//div[2]");
		//builder.moveToElement(we1).build().perform();
		Thread.sleep(2000);
		
		WebElement we2 = driver.findElementByXPath("(//div[@class = ' categoryShortlist js-animated-icon sort-list-products'])[1]/following-sibling::div/a/picture/img");
		builder.moveToElement(we2).build().perform();
		
		driver.findElementByXPath("//div[@class = ' categoryShortlist js-animated-icon sort-list-products']/following-sibling::div/div/div").click();
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		List<WebElement> e1 = driver.findElementsByXPath("//li[@class = 'ui-widget-content ui-selectee']");
		for(WebElement evalues:e1)
		{
			evalues.click();
			
			
		}
		
		WebElement item1 = driver.findElementByXPath("//li[text() = 'Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text() = 'Item 3']");
		WebElement item5 = driver.findElementByXPath("//li[text() = 'Item 5']");
		WebElement item7 = driver.findElementByXPath("//li[text() = 'Item 7']");
		Actions a1 = new Actions(driver);
		a1.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).keyUp(Keys.CONTROL).perform();
		
 
	}

}
