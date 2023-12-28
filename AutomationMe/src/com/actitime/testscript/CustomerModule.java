package com.actitime.testscript;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends BaseClass{
	@Test(groups = "regressionTest")
	//@Test(priority = 0,invocationCount = 3)
public void creatCustomer()
{
		Reporter.log("Create Customer", true);
}
	@Test(groups = "smokeTest")
	//@Test(priority = 2,invocationCount = 1,enabled=true)
public void modifyCustomer()
{
	Reporter.log("Modify Customer", true);
}
	//@Test(priority = 1,dependsOnMethods = "modifyCustomer")
	@Test(groups = "regressionTest", dependsOnMethods = "modifyCustomer")
public void deleteCustomer()
{
	Reporter.log("Delete Customer", true);
}
}
