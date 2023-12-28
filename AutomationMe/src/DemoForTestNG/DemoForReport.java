package DemoForTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoForReport {
	@Test
	public void test1()
	{
		System.out.println("hi");//console
	}
	@Test
	public void test2()
	{
		Reporter.log("hello",false);//report
	}
	@Test
	public void test3()
	{
		Reporter.log("bye",true);//both report nd console
	}

}
