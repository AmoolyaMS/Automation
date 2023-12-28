package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass{
	@Test(groups = "regressionTest")
	public void creatTask()
	{
		Reporter.log("Create Task", true);
	}
		@Test(groups = "smokeTest")
	public void modifyTask()
	{
		Reporter.log("Modify Task", true);
	}
		@Test
	public void deleteTask()
	{
		Reporter.log("Delete Task", true);
	}
	}

