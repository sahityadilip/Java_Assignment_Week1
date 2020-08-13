package practice1.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLeadP2 extends BaseClassP2{
	
	@BeforeTest
	public void filesend()
	{
		System.out.println("excel name send");
		excelname = "TC002";
		
		
	}
    @Test(dataProvider = "fetchdata")
	public void EditLead(String lname,String cmpname) throws InterruptedException {
    	System.out.println("Inside edit method");
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Name and ID']").click();
		//driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("(//input[@name = 'lastName'])[3]").sendKeys(lname);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys(cmpname);
		driver.findElementByName("submitButton").click();

	}

}
