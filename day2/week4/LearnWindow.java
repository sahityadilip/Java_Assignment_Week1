package day2.week4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","//Users//mac//Downloads//chromedriver4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		//driver.findElementById("home").click();
		String firstWindowhandle = driver.getWindowHandle(); //returns string
		System.out.println(firstWindowhandle);
		driver.findElementByXPath("//button[@id='home']").click();
		Set<String> test = new LinkedHashSet();
		test.addAll(driver.getWindowHandles());
		for(String t1:test)
		{
			System.out.println(t1);
			
		}
		
	     List<String> listHandles = new ArrayList<String>(test);
		
         String secondHandle = listHandles.get(1);
         driver.switchTo().window(secondHandle);
         System.out.println(driver.getTitle());
         driver.findElementByXPath("//img[@alt = 'Buttons']").click();
         driver.switchTo().window(firstWindowhandle);
         File source = driver.getScreenshotAs(OutputType.FILE);
         File target = new File("./data/LeafGround.png");
         FileUtils.copyFile(source,target);
         //driver.quit(); //close all the windows opened by selenium
         
         
	}

}
