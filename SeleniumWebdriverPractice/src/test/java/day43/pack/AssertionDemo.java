package day43.pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
@Test
void TestTitle()
{
	String exp_title="OpenCart";
	String act_title="OpenCart";
	/*
	if(exp_title.equals("act_title"))
	{
		System.out.println("Test passed");
	}
	else
	{
		System.out.println("Test failed");
	}
	*/
	Assert.assertEquals(exp_title, act_title);

}
	

	
}
