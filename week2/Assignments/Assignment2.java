package week2.Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	
	
	
	

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
		System.out.println(driver.findElementByXPath("(//div[@id = 'findLeads']//form/div/div[2]/div/div/div/div//input)[1]").getAttribute("class"));
		driver.findElementByXPath("(//div[@id = 'findLeads']//form/div/div[2]/div/div/div/div//input)[2]").sendKeys("Karnan");
		
		
		driver.findElementByXPath("(//div[@id = 'findLeads']/div/div/div/div/div[2]//div[@class = 'x-panel-bwrap'])[1]/div[2]//table//table//tr/td[2]/em/button").click();
		Thread.sleep(500);
		driver.findElementByXPath("//div[@id = 'findLeads']/div/div/div/div[3]//div[@class = 'x-panel-bwrap']//div[@class='x-grid3-scroller']//table[1]//a").click();
		Thread.sleep(500);
		//String A = driver.findElementByXPath("//div[@id = 'findLeads']/div/div/div/div[3]//div[@class = 'x-panel-bwrap']//div[@class='x-grid3-scroller']//table[1]//a").getAttribute("href");
		driver.findElementByXPath("//div[@class = \"subSectionBlock\"]/form[@name = 'deleteLeadForm']/following-sibling ::div[1]//a[3]").click();
		Thread.sleep(600);
		driver.findElementByXPath("//div[@class = 'centerarea']//form[@id='updateLeadForm']//div[@class = 'fieldgroup-body']//td[2]/input").clear(); 
		driver.findElementByXPath("//div[@class = 'centerarea']//form[@id='updateLeadForm']//div[@class = 'fieldgroup-body']//td[2]/input").sendKeys("Hari");
		Thread.sleep(500);
		//driver.findElementByXPath("//div[@class = 'centerarea']//form[@id='updateLeadForm']//div[@class = 'fieldgroup-body']//tr[1]/../..").sendKeys("test001");
		driver.findElementByXPath("//div[@class = 'centerarea']//form[@id='updateLeadForm']//div[@class = 'fieldgroup-body']//tr[12]//input").click();
		Thread.sleep(500);
		System.out.println( driver.findElementByXPath("//div[@class = 'centerarea']/div[@class='contentarea']/div[2]/div[2]/div/div/form/div//div[2]//td[2]/span").getText());
	    driver.close();
	
	
	}

}