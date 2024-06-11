package day24_Handling_Checkbox_Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.comp.Check;

public class Handling_Multiple_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//capturing all the checkboxes
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

		System.out.println("The number of checkboxes are: "+checkboxes.size());
		
		//Selecting all the checkboxes (using normal for loop)
	/*
	 		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		
	 */
		//using enhanced for loop - simple to use
		
		for (WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}
		
		Thread.sleep(7000);
		// to uncheck the checkboxes
		
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}

	}

}
