package day23_Explicit_Implicit_Navigational_Sleep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.javatpoint.com/java-tutorial");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();

	}

}
