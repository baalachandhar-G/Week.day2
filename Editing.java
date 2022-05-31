package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("http://leafground.com/pages/Edit.html");
		
		Driver.manage().window().maximize();

		Driver.findElement(By.id("email")).sendKeys("Bala");
		
		Thread.sleep(2000);
		
		Driver.findElement(By.id("email")).clear();
		
		Thread.sleep(5000);
		
		Driver.findElement(By.id("email")).sendKeys("Chandhar");
		
		String textvalue =Driver.findElement(By.id("email")).getAttribute("value");
		
		System.out.println(textvalue);
		
		boolean enabled = Driver.findElement(By.id("email")).isEnabled();
		
		System.out.println(enabled);
		
		
		
		
		
		
		
		
		
	}

}
