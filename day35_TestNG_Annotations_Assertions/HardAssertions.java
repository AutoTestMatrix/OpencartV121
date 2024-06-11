package day35_TestNG_Annotations_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	@Test
	void test()
	{
		int x=10;
		int y=15;
		
		/*if(x==y)
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}*/
		
		//Assert.assertEquals(x,y);
		
		//Assert.assertTrue(true);  
		//Assert.assertTrue(false);
		int a=10;
		int b=15;
		
		//Assert.assertEquals(actual, expected, description);
		//Assert.assertEquals(a>b, true,"a is not greater than b");  //false
		
		String s1="abc";
		String s2="abc1";
		
		//Assert.assertEquals(s1, s2,"Strings are not equal");
		//Assert.assertNotEquals(s1, s2);   //we are expecting not equal, if not equal then pass
		
		
		//we can also use assertions along with if .. else condition
		if(false)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			//Assert.fail();
		}
		
		
		
	}
}
