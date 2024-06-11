package day35_TestNG_Annotations_Assertions;

import org.testng.annotations.*;

public class Annotations {
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before Suite....");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is After Suite....");
	}
	
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is before Test ....");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is After Test ....");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is before  Class....");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is After  Class....");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("This is Before  Method....");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is After  Method....");
	}
	
	@Test(priority=1)
	void tm1()
	{
		System.out.println("This is Test Method1");
	}
	
	@Test(priority=2)
	void tm2()
	{
		System.out.println("This is Test Method2");
	}
	
	
}
