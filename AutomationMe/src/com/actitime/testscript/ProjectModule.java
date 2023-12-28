package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass {
	@Test(groups = "smokeTest")
	public void creatproject()
	{
		Reporter.log("Create project", true);
	}
		@Test(groups = "regressionTest")
	public void modifyproject()
	{
		Reporter.log("Modify project", true);
	}
		@Test(groups = "smokeTest")
	public void deleteproject()
	{
		Reporter.log("Delete project", true);
	}
	}

