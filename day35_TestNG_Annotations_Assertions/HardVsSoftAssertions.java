package day35_TestNG_Annotations_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	//@Test
	void test_hardAssertions()
	{
		System.out.println("Testing......");
		System.out.println("Testing......");
		System.out.println("Testing......");
		System.out.println("Testing......");
		System.out.println("Testing......");
		
		Assert.assertEquals(1, 2);  //if it fails then the below steps will not be executed
		
		System.out.println("Hard Assertion completed......");
	}
	
	@Test
	void test_softAssertions()
	{
		System.out.println("Testing......");
		System.out.println("Testing......");
		System.out.println("Testing......");
		System.out.println("Testing......");
		System.out.println("Testing......");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);
		
		System.out.println("Soft Assertion completed......");
		sa.assertEquals(1, 1);
		
		sa.assertAll();   //mandatory
	}
}

