package day23_Explicit_Implicit_Navigational_Sleep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit command
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();   //to maximise the window
			
				//3. Provide username - Admin
				
				WebElement strUserName=driver.findElement(By.name("username"));
				strUserName.sendKeys("Admin");
	
				
				//4. Provide password - admin123
				driver.findElement(By.name("password")).sendKeys("admin123");
				
				//5. Click on Login button
				//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}


}
