package day37_TestNG_Test_Parameterization;
import org.testng.annotations.Test;

public class InvocationCountDemo {

		@Test(invocationCount=10)
		void test()
		{
		System.out.println("testing...");	
		}
		
	}


