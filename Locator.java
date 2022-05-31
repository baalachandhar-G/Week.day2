 package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("http://leaftaps.com/opentaps/control/main");
		
		Driver.manage().window().maximize();
	
		Driver.findElement(By.xpath("//input [@id='username']")).sendKeys("DemoSalesManager");
		
	    Driver.findElement(By.xpath("//input [@id='password']")).sendKeys("crmsfa");
	    
	    Driver.findElement(By.xpath("//input [contains(@class,'decorativeSubmit')]")).click();
		
		Driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
		
		Driver.findElement(By.xpath("//a[contains (text(), 'Leads')]")).click();
		
		Driver.findElement(By.xpath("//a[constains text(),'Create Lead']")).click();
		
		Driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
       
		Driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Baalachandhar");
		
		Driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("G");
		
		Driver.findElement(By.name("submitButton")).click();
		
	}

}
