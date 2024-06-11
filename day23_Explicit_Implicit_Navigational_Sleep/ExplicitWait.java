package day23_Explicit_Implicit_Navigational_Sleep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();   //to maximise the window

	//3. Provide username - Admin
	
	WebElement strUserName= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	strUserName.sendKeys("Admin");

	
	//4. Provide password - admin123
	WebElement strPassword= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	strPassword.sendKeys("admin123");
	
	//5. Click on Login button
	//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();


}

}
