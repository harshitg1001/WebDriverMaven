package com.w2a.testcases;

import java.io.IOException;

//import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
//import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
//import com.w2a.utilties.TestUtil;

public class BankManagerLoginTest extends TestBase{
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException{
		
		verifyEquals("abc", "XYZ");
		Thread.sleep(3000);
			log.debug("Inside login test !!!");
			
		click("bmlBtn_CSS");
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");
		
		log.debug("Login successfully executed!!!");
		
		
		//Assert.fail("Login not successful");
		
		
	}

}
