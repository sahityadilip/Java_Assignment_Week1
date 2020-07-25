package week2.Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByXPath("(//div[@class='allSubSectionBlocks']//div[@id = 'findLeads']//div[@class = 'x-panel-bwrap']//div[@class='x-panel x-panel-noborder'])[1]/div[@class = 'x-panel-bwrap']//li[2]//span[@class='x-tab-strip-text ']").click();
        //Enter Phone Number
		driver.findElementByXPath("(//div[@id = 'findLeads']/div//div[@class='x-panel x-panel-noborder'])[1]/div[2]/div[1]//form//div[@class='x-tab-panel-bwrap']/div/div[2]//td[2]//input").sendKeys("678");
        driver.findElementByXPath("(//div[@id = 'findLeads']/div//div[@class='x-panel x-panel-noborder'])[1]/div[2]/div[1]//form//div[@class='x-tab-panel-bwrap']/div/div[2]//td[3]//input").sendKeys("4574341");
        //Find Lead
        driver.findElementByXPath("(//div[@id = 'findLeads']/div//div[@class='x-panel x-panel-noborder'])[1]//div[@class = 'x-panel-bwrap']/div[1]//div[2]//table//table//tr/td[2]/em/button").click();
        Thread.sleep(500);
        String S = driver.findElementByXPath("(//div[@id = 'findLeads']/div//div[@class='x-panel x-panel-noborder'])[3]/div[@class='x-panel-bwrap']//div[@class='x-panel-bwrap ']//div[@class='x-grid3-body']/div[1]/table//td[1]//a").getText();
        driver.findElementByXPath("(//div[@id = 'findLeads']/div//div[@class='x-panel x-panel-noborder'])[3]/div[@class='x-panel-bwrap']//div[@class='x-panel-bwrap ']//div[@class='x-grid3-body']/div[1]/table//td[1]//a").click();
        //Delete option
        driver.findElementByXPath("//div[@class = \"subSectionBlock\"]/form[@name = 'deleteLeadForm']/following-sibling ::div[1]//a[4]").click();
        driver.findElementByXPath("//ul[@class = 'shortcuts']/li[3]/a").click();
        driver.findElementByXPath("(//div[@id = 'findLeads']//form/div/div[2]/div/div/div/div//input)[1]").sendKeys(S);
        Thread.sleep(500);
        driver.findElementByXPath("(//div[@id = 'findLeads']/div/div/div/div/div[2]//div[@class = 'x-panel-bwrap'])[1]/div[2]//table//table//tr/td[2]/em/button").click();
        Thread.sleep(300);
        String K = driver.findElementByXPath("(//div[@id = 'findLeads']/div//div[@class='x-panel x-panel-noborder'])[3]/div[@class='x-panel-bwrap']//div[@class='x-panel-bwrap ']//div[@class='x-panel-mc']/div[2]//div[@class='x-paging-info']").getText();
	    System.out.println(K);
        	
	}

}
