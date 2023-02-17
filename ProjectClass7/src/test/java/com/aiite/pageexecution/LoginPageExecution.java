package com.aiite.pageexecution;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.LoginPage;

public class LoginPageExecution {
	
//	@BeforeClass
//	public static void beforeClass() {
//		System.out.println("Before Class");
//	}
	
//	@AfterClass
//	public static void afterClass() {
//		System.out.println("After Class");
//	}
	
	@Before
	public void beforeMethod() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.fileRead("facebookUrl"));
		System.out.println("BeforeMethod");
	}
	
	@After
	public void afterMethod() {
		BaseClass.closeBrowser();
		System.out.println("AfterMethod");
	}
	
	@Test
	public void loginWithValidCredential() {
		try {
//			BaseClass.browserLaunch();
//			BaseClass.loadUrl(BaseClass.fileRead("facebookUrl"));
			LoginPage lp = new LoginPage();
			lp.userName.sendKeys(BaseClass.fileRead("userName"));
			lp.passWord.sendKeys(BaseClass.fileRead("passWord"));
			lp.loginBtn.click();
			//Validation
//			BaseClass.closeBrowser();
			System.out.println("Method 1");
			Assert.assertTrue(false);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Ignore
	@Test
	public void loginWithInvalidCredential() {
		try {
//			BaseClass.browserLaunch();
//			BaseClass.loadUrl(BaseClass.fileRead("facebookUrl"));
			LoginPage lp = new LoginPage();
			lp.userName.sendKeys(BaseClass.fileRead("invalidUserName"));
			lp.passWord.sendKeys(BaseClass.fileRead("invalidPassWord"));
			lp.loginBtn.click();
			//Validation
//			BaseClass.closeBrowser();
			Assert.assertTrue(true);
			System.out.println("Method 2");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void testSignUpLink() throws IOException {
		
		String expected = "https://www.facebook.com/reg/";
//		BaseClass.browserLaunch();
//		BaseClass.loadUrl(BaseClass.fileRead("facebookUrl"));
		LoginPage lp = new LoginPage();
		lp.singUpLink.click();
		String actual = BaseClass.getUrl();
		String value = "azhar";
		Assert.assertEquals(expected, actual);
		System.out.println("Method 3");
	}

}
