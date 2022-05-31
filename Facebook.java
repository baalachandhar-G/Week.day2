package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("https://en-gb.facebook.com/");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Driver.findElement(By.xpath("//a[(text()='Create New Account')]")).click();
		
		Driver.findElement(By.xpath("//input[contains (@name,'firstname')]")).sendKeys("Baalachandhar");
		
		Driver.findElement(By.xpath("//input[contains (@name,'lastname')]")).sendKeys("Gnanasekar");
		
		Driver.findElement(By.xpath("//input[contains (@name, 'reg_email__')]")).sendKeys("9500557003");
		
		Driver.findElement(By.xpath("//input[contains (@name,'reg_passwd__')]")).sendKeys("Baala@123");
		
		
		WebElement Selbirthday = Driver.findElement(By.xpath("//select[contains (@name,'birthday_day')]"));
		
		Select dddate= new Select(Selbirthday);
		
		dddate.selectByValue("21");
		
		WebElement Selmonth = Driver.findElement(By.xpath("//select[contains (@name,'birthday_month')]"));
		
		Select month= new Select(Selmonth);
		
		month.selectByValue("9");
		
		
		WebElement Year = Driver.findElement(By.xpath("//select[contains (@name,'birthday_year')]"));
		
		Select yy= new Select(Year);
		
		yy.selectByValue("1995");
		
		Driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
	}

}
