package practice1.TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClassP2 {
	public ChromeDriver driver;
	public String excelname;
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void BaseClassPractice1(String uname,String pwd)
	{
		System.out.println("In Base class inside method");
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
}
	@DataProvider(name = "fetchdata")
	public String[][] senddata() throws IOException
	{
	//String [][] data = new String[2][3];
	//data[0][0] = "Testleaf";
	//data[0][1] = "Dev";
	//data[0][2] = "Arun";
	//data[1][0] = "T";
	//data[1][1] = "Prem";
	//data[1][2] = "Testleaf";
		return ReadExcel1.excelread(excelname);
		
	}
}