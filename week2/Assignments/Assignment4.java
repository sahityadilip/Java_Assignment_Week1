package week2.Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Attribute xpath for username and collection xpath for password
		driver.findElementByXPath("//input[@id = 'username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
		
		//Attribute xpath
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		//text based xpath
		//driver.findElementByXPath("//a[text() = '                CRM/SFA              ']").click();
		driver.findElementByXPath("//a[@style = 'color: black;']").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//ul[@class = 'shortcuts']/li[3]/a").click();
		driver.findElementByXPath("(//div[@class='allSubSectionBlocks']//div[@id = 'findLeads']//div[@class = 'x-panel-bwrap']//div[@class='x-panel x-panel-noborder'])[1]/div[@class = 'x-panel-bwrap']//li[3	]//span[@class='x-tab-strip-text ']").click();
        //Enter email address
		driver.findElementByXPath("(//div[@id = 'findLeads']/div//div[@class='x-panel x-panel-noborder'])[1]/div[2]/div[1]//form//div[@class='x-tab-panel-bwrap']/div/div[2]//input").sendKeys("ngayathri.1@gmail.com");
        //Click Find leads button
		driver.findElementByXPath("(//div[@id = 'findLeads']/div/div/div/div/div[2]//div[@class = 'x-panel-bwrap'])[1]/div[2]//table//table//tr/td[2]/em/button").click();
		Thread.sleep(500);
		String leadDetails = driver.findElementByXPath("//div[@id = 'findLeads']/div/div/div/div[3]//div[@class = 'x-panel-bwrap']//div[@class='x-grid3-scroller']//table[1]//a").getText();
		Thread.sleep(500);
		driver.findElementByXPath("//div[@id = 'findLeads']/div/div/div/div[3]//div[@class = 'x-panel-bwrap']//div[@class='x-grid3-scroller']//table[1]//a").click();
		System.out.println(leadDetails);
		String LeadIDBeforeDup = driver.findElementByXPath("//div[@class = 'centerarea']/div[@class='contentarea']/div[2]/div[2]/div/div/form/div//div[2]//tr[2]/td[2]/span").getText();
		System.out.println(LeadIDBeforeDup);
		//Thread.sleep(500);
		//driver.findElementByXPath("//div[@id = 'findLeads']/div/div/div/div[3]//div[@class = 'x-panel-bwrap']//div[@class='x-grid3-scroller']//table[1]//a").click();
		
		Thread.sleep(500);
		String S = driver.findElementByXPath("//div[@class = \"subSectionBlock\"]/form[@name = 'deleteLeadForm']/following-sibling ::div[1]//a[1]").getText();
		System.out.println(S);
		driver.findElementByXPath("//div[@class = \"subSectionBlock\"]/form[@name = 'deleteLeadForm']/following-sibling ::div[1]//a[1]").click();
		
		String duplicatecheck = driver.getTitle();
		System.out.println(duplicatecheck);
		if(duplicatecheck.contains(S) == true)
		{
			System.out.println("match");
			driver.findElementByXPath("//div[@class = 'allSubSectionBlocks']//form/div[@class='fieldgroup']/div[2]//tbody/tr[24]//input").click();
			
		}
		String LeadIDAfterDup = driver.findElementByXPath("//div[@class = 'centerarea']/div[@class='contentarea']/div[2]/div[2]/div/div/form/div//div[2]//tr[2]/td[2]/span").getText();
		System.out.println(LeadIDAfterDup);
		if(LeadIDAfterDup.matches(LeadIDBeforeDup))
		{
			System.out.println("Lead ID is matched");
			driver.close();
		}
		
	}

}
