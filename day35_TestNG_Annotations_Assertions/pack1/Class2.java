package day35_TestNG_Annotations_Assertions.pack1;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Class2 
{
	@Test
	void xyz()
	{
		System.out.println("This is xyz from Class 2");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("This is After Test Method...");
	}
}
