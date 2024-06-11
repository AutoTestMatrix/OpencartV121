package day30_Handling_Alert_PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1. click on button to trigger alert
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		//use explicitly wait as sometimes it may take longer time for the alert to appear
		WebDriverWait alertwindow=new WebDriverWait(driver,Duration.ofSeconds(10));
		alertwindow.until(ExpectedConditions.alertIsPresent());
		
		
		Alert myalert=driver.switchTo().alert();
		myalert.accept();
		//or
		//driver.switchTo().alert().accept();
		
		
		//2. click on JS confirm button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		
		driver.switchTo().alert().accept(); //	close alert using ok button
		//driver.switchTo().alert().dismiss();// close alert using cancel button
		
		Thread.sleep(7000);
		//3. Prompt alert - input box- (here we can do the validation)
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		System.out.println("Text message on alert "+myalert.getText());  //I am a JS prompt
		
		myalert.sendKeys("John");
		myalert.accept();
		String result=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(result);
	}

}
