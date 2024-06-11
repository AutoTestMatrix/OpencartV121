package day35_TestNG_Annotations_Assertions.pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	void abc()
	{
		System.out.println("This is abc from Class 1");
	}
	
	@BeforeTest
	void m()
	{
		System.out.println("This is before Test Method...");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is Before Suite method....");
	}

	@AfterSuite
	void as()
	{
		System.out.println("This is After Suite method....");
	}
}
