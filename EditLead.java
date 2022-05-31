package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("http://leaftaps.com/opentaps/control/login");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Driver.findElement(By.className("decorativeSubmit")).click();
		
		Driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
		
		Driver.findElement(By.linkText("Leads")).click();
		
		Driver.findElement(By.linkText("Find Leads")).click();
		
		Driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='firstName']")).sendKeys("Bala");
		
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		String Title= Driver.getTitle();
		
		System.out.println("The title of the page :"+Title);
  
		if(Driver.getTitle().contains("View Lead")) {
			
			System.out.println("The Title of the page is verified");
		}else {
			System.out.println("The Title is Null");
		}
		
		Driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		Driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		Driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test Leaf Technologies -Edit changes");
		
		Driver.findElement(By.xpath("//input[@class='smallsubmit' and @value='Update']")).click();
		
		Driver.close();
	
	}

}
