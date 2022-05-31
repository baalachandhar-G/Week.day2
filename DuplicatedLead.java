package week2.day1;

import java.time.Duration;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicatedLead {

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
			
			Driver.findElement(By.linkText("CRM/SFA")).click();
			
			Driver.findElement(By.linkText("Leads")).click();
			
			Driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			
			Driver.findElement(By.xpath("//span[text()='Email']")).click();
			
			Driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']")).sendKeys("Beliabaala219@gmail.com");
			
			Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			String FirstLeadid = Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			
	        System.out.println("Lead id:"+FirstLeadid);
	
	        Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	        
	        Driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
			
	        String title= Driver.getTitle();
	        
	        System.out.println("Title of the Page:"+title);
	        
	        if(Driver.getTitle().contains(("Duplicate Lead")){
	        	System.out.println("The Title of the page is verified");
	        }else {
	        	System.out.println("Title is Null");
	        }
	        
	        Driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	        
	        Driver.close();
	        
	        
	}

}

