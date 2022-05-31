package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();   
		
	    ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("https://acme-test.uipath.com/login");
		
		
		Driver.findElement(By.xpath("//input[@class='myradio' and @id='yes']")).click();
		
		Driver.findElement(By.xpath("//input[@value='1' and @type='radio']")).click();
		
		Driver.findElement(By.xpath("//input[@name='age' and @value='1']")).click();
		
		Driver.close();
		
	}

}
