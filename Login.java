package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("http://leaftaps.com/opentaps/control/main");
		
		Driver.manage().window().maximize();
	
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
	    Driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Driver.findElement(By.className("decorativeSubmit")).click();
		
		Driver.findElement(By.linkText("CRM/SFA")).click();
		
		Driver.findElement(By.linkText("Leads")).click();
		
		Driver.findElement(By.linkText("Create Lead")).click();
		
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
       
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Baalachandhar");
		
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		
		Driver.findElement(By.name("submitButton")).click();
		
		String text = Driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(text);
		
	}
	
	

}
