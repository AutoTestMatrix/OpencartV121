package day22_Conditional_Comm_Get_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	//WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
	//System.out.println("display status of logo :"+logo.isDisplayed());
	
	//boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	//System.out.println(status);
	
	WebElement userName=driver.findElement(By.name("username"));
	System.out.println("Display status "+userName.isDisplayed());
	System.out.println("Enable staus "+userName.isEnabled());
	
	
	WebElement strUserName=driver.findElement(By.name("username"));
	strUserName.sendKeys("Admin");
	//OR
	//driver.findElement(By.name("username")).sendKeys("admin");
	
	//4. Provide password - admin123
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	//5. Click on Login button
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	Thread.sleep(5000);
	
	
	
	driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
	Thread.sleep(5000);
	WebElement male_rd=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
	WebElement female_rd=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
	
	System.out.println(male_rd.isSelected());
	System.out.println(female_rd.isSelected());
	
	
	}

}
