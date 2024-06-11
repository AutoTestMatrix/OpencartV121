package day22_Conditional_Comm_Get_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		System.out.println("The title of the browser is : "+driver.getTitle());
		System.out.println("current URL : "+driver.getCurrentUrl());
		System.out.println("Page Source .......");
		System.out.println(driver.getPageSource());
		
		//String ps=driver.getPageSource();
		//System.out.println(ps.contains("html"));
		
		
		
	}

}
