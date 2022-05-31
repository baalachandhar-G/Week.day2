package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("http://leafground.com/pages/Dropdown.html");
		
		Driver.manage().window().maximize();
		
		//identify drop down Element
		
		WebElement textelement = Driver.findElement(By.id("dropdown1"));
		
		//Create an object for class
		
		Select DD = new Select(textelement);
		
		
		List<WebElement> options = DD.getOptions();
		
		for(int i=0;i<options.size();i++) {
			
			WebElement eleoption = options.get(i);
			
			String text = eleoption.getText();
			
			System.out.println(text);
		}
		
		//Choose the Option
		
		//option based on value
		
	//	DD.selectByValue("3");
		
		//based on visible text
		
//		DD.selectByVisibleText("Selenium");
		
		
		//based on index text

	//	DD.selectByIndex(1);
	}

}
