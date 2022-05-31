package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("http://leaftaps.com/opentaps/control/login");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Driver.findElement(By.className("decorativeSubmit")).click();
		
		Driver.findElement(By.linkText("CRM/SFA")).click();
		
		Driver.findElement(By.linkText("Leads")).click();
		
		Driver.findElement(By.linkText("Find Leads")).click();
		
		Driver.findElement(By.className("Phone")).click();
		
		Driver.findElement(By.name("phoneNumber")).sendKeys(" ");
		
		Driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		
		
		String FirstLead = Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		
		System.out.println("Lead Id:"+FirstLead);
		
		Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//a[text()='Delete']
		
		Driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		Driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		Driver.findElement(By.xpath("//input[@name='id']")).sendKeys(" ");
		
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//No record to display in lead list
		
		if(Driver.getTitle().contains("Test Leaf")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("No record to display");
		}
		
		Driver.close();
		
		
	}

}
