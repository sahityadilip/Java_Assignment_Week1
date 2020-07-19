package week2.day1;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//mac//Downloads//chromedriver4");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementusername = driver.findElementById("username");
		elementusername.sendKeys("demosalesmanager");
		
		WebElement elementpassword = driver.findElementById("password");
		elementpassword.sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("HTS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Anu");
		driver.findElementById("createLeadForm_lastName").sendKeys("Karan");
		driver.findElementByName("submitButton").click();
		
		
		
		//driver.close();
		

	}

}
