package day17_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest1 {

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
				Thread.sleep(5000);
				//6. Verify the title of the dashboard
				String act_title=driver.getTitle();
				String exp_title="OrangeHRM";
							
				//label validation after successful login
				String act_label="";
				try 
				{
					
					act_label=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
					
					
				}catch (NoSuchElementException e) {
					//act_label="";
					
				}
				
				
				String exp_label="Dashboard";
				
				if (act_label.equals(exp_label))
				{
					System.out.println("Test Passed");
				}
				else
				{
					System.out.println("Test Failed");
				}
					
				
				//7. close browser
				//driver.close();   //throwing socket exception error
				//driver.quit();
				
			
			}

	}
