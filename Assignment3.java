package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();   
		
	    ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("https://acme-test.uipath.com/login");
		
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		
		Driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		String title = Driver.getTitle();
		
		System.out.println("Title of the Page: "+ title);
		
		Driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		Driver.close();
		
		
		
	}

}
