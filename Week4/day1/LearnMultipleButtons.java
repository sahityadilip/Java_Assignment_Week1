package Week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultipleButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://leafground.com/pages/Link.html");
		
		//List<WebElement> webele = driver.findElementsByTagName("a");
		//System.out.println(webele.size());
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		List<WebElement> textfields = driver.findElementsByClassName("inputLogin");
		for (WebElement textfield:textfields)
		{
			String name = textfield.getAttribute("name");
			System.out.println(name);
		}
		

	}

}
