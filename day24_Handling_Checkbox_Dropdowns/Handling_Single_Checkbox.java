package day24_Handling_Checkbox_Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Single_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select or check checkbox   
		//NOTE: for button, link, checkbox and radiobutton we use click method
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='monday']"));
		System.out.println("Before selection: "+checkbox.isSelected());
		checkbox.click();
		System.out.println("After selection: "+checkbox.isSelected());
		
		
	
	
	}

}
