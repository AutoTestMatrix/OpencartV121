package day17_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) throws InterruptedException  {
		/*launch browser
		open url - opensource-demo.orangehrmlive.com/
		3. Provide username - Admin
		4. Provide password - admin123
		5. Click on Login button
		6. Verify the title of the dashboard
		Expected title: OrangeHRM
		7. close browser
		*/

		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		//or if we don't want to specify the path, then in pom.xml add a dependency and use the below line
		//WebDriverManager.chromedriver().setup();
		// Note from selenium 4.6.0 onwards no need to use webdrivermanager also and well as system.setproperty method 
		
		// 1. launch browser
		ChromeDriver driver=new ChromeDriver();  
		
		// 2. open url
		driver.get("http://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();   //to maximise the window
		Thread.sleep(5000);
		//3. Provide username - Admin
		
		WebElement strUserName=driver.findElement(By.name("username"));
		strUserName.sendKeys("admin");
		//OR
		//driver.findElement(By.name("username")).sendKeys("admin");
		
		//4. Provide password - admin123
		driver.findElement(By.name("password")).sendKeys("admin1234");
		
		//5. Click on Login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//6. Verify the title of the dashboard
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		
		if (act_title.equals(exp_title)) 
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		//7. close browser
		//driver.close();   //throwing socket exception error
		driver.quit();
		
		
		
		
	}

}
