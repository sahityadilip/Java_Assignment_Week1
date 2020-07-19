package week2.day1;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		
		//Create Leads 
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter Company Name , First name,Last Name
		driver.findElementById("createLeadForm_companyName").sendKeys("HTS Test");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ani");
		driver.findElementById("createLeadForm_lastName").sendKeys("James");
		
		//Selection of Employee
		WebElement empselection = driver.findElementById("createLeadForm_dataSourceId");
		Select parentelementemp = new Select(empselection);
		parentelementemp.selectByVisibleText("Employee");
		
		
		//Selection for MarketingCampaign
		
		WebElement mcselection = driver.findElementById("createLeadForm_marketingCampaignId");
		Select parentelementmc = new Select(mcselection);
		parentelementmc.selectByValue("9001");
		
		//Selection for Industry
		
		WebElement industryselection = driver.findElementById("createLeadForm_industryEnumId");
		Select parentelementind = new Select(industryselection);
	    java.util.List<WebElement> options =  parentelementind.getOptions();
	    int sizemc = options.size();
	    options.get(sizemc-2).click();
	    
	 // Selection for Ownership
	    
	    WebElement ownershipselection = driver.findElementById("createLeadForm_ownershipEnumId");
		Select parentelementown = new Select(ownershipselection);
	    
	    parentelementown.selectByIndex(5);
	    
	//Selection of Country
	    
	    WebElement countryselect = driver.findElementById("createLeadForm_generalCountryGeoId");
	    Select countryselectoptions = new Select(countryselect);
	    countryselectoptions.selectByVisibleText("India");
	    
	    
	    //Click on submit
	    
	    driver.findElementByName("submitButton").click();
	    String S = driver.getTitle();
	    System.out.println(S);
	    
	    
    
		
		
	}

}
