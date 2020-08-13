package practice1.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadP2 extends BaseClassP2{

	@BeforeTest
	public void filesend()
	{
		excelname = "TC001";
		
		
	}
	@Test(dataProvider = "fetchdata")
	public void createLead(String comp,String fname,String lname) throws InterruptedException {
		    	
	System.out.println("Create lead fn");
	
	System.out.println("Test method create second method");
	Thread.sleep(2000);
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys(comp);
	driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	driver.findElementByName("submitButton").click();

			}
	
	


	}


