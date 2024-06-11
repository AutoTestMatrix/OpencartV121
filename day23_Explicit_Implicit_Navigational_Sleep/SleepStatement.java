package day23_Explicit_Implicit_Navigational_Sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepStatement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

				driver.manage().window().maximize();   //to maximise the window
			
				//3. Provide username - Admin
				
				WebElement strUserName=driver.findElement(By.name("username"));
				strUserName.sendKeys("admin");
				Thread.sleep(5000);
				
				//4. Provide password - admin123
				//driver.findElement(By.name("password")).sendKeys("admin1234");
				
				//5. Click on Login button
				//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}

}
