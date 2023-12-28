package DemoForTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModifyWithAnnotations {
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("openbrowser",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("closebrowser",true);
	}
	@Test(priority = 1,invocationCount = 2)
	public void creatCustomer()
	{
		Reporter.log("Create Customer", true);
	}
		@Test
	public void modifyCustomer()
	{
		Reporter.log("Modify Customer", true);
	}
		@Test(dependsOnMethods = "modifyCustomer")
	public void deleteCustomer()
	{
		Reporter.log("Delete Customer", true);
	}
}
