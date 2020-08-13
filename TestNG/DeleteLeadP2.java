package practice1.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteLeadP2 extends BaseClassP2{
	
	@BeforeTest
	public void filesend()
	{
		System.out.println("excel name send");
		excelname = "TC003";
		
		
	}
	
	
	@Test(dataProvider = "fetchdata")
	public void DeleteLead(String lname) throws InterruptedException {
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();
			Thread.sleep(5000);
			//driver.findElementByXPath("//span[text()='Phone']").click();
			driver.findElementByXPath("//span[text()='Name and ID']").click();
			driver.findElementByXPath("(//input[@name = 'lastName'])[3]").sendKeys(lname);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			String leadID = driver.findElementByXPath("(//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div)[1]/a").getText();
			System.out.println(leadID);
			
			driver.findElementByXPath("(//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div)[1]/a").click();
			
			Thread.sleep(2000);
			driver.findElementByClassName("subMenuButtonDangerous").click();
			
			driver.findElementByLinkText("Find Leads").click();
			
			driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			String text = driver.findElementByXPath("//div[text() = 'No records to display']").getText();
			System.out.println(text);
			if (text.equals("No records to display")) {
				System.out.println("Text matched in Delete Lead");
			} else {
				System.out.println("Text not matched in Delete Lead");
			}
			
	}
		

	}


