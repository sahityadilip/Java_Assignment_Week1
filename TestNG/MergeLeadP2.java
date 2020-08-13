package practice1.TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MergeLeadP2  extends BaseClassP2{
	
	
	@BeforeTest
	public void filesend()
	{
		System.out.println("excel name send");
		excelname = "TC004";
		
		
	}


    @Test(dataProvider = "fetchdata")
	public void mergeLead(String name1,String name2) throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(name1);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(allhandles.get(0));
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(name2);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(allhandles2.get(0));
		driver.findElementByXPath("//a[text()='Merge']").click();
		driver.switchTo().alert().accept();
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		String text = driver.findElementByClassName("x-paging-info").getText();
		System.out.println(text);
		if (text.equals("No records to display")) {
			System.out.println("Text matched in Merge Lead");
		} else {
			System.out.println("Text not matched in Merge Lead");
		}
		

}
}
