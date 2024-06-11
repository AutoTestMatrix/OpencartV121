package day24_Handling_Checkbox_Dropdowns;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Select_DropDowns {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry=new Select(drpCountryEle);
		
		//select option from the dropdown. 3 methods
		drpCountry.selectByVisibleText("France");
		drpCountry.selectByValue("japan");
		drpCountry.selectByIndex(3);
		
		
		//capture all the values of the dropdown in a variable
		List<WebElement> options=drpCountry.getOptions();
		System.out.println("Total no. of options "+options.size());
		
		
		//Printing the options
		/*for (int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}*/
			
		
		//using enhanced for loop
		for (WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		

	}

}
