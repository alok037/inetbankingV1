package com.inetbank.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbank.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass 
{
	@Test
	public void loginTest() throws IOException 
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(username);
		logger.info("Enter Username");
		
		lp.setPassword(password);
		logger.info("Enter Password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}

}
