package com.aiite.pageexecution;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.HomePage;

public class HomePageExecution {
	
//	public static void main(String[] args) throws IOException {
//		BaseClass.browserLaunch();
//		BaseClass.loadUrl(BaseClass.fileRead("bankUrl"));
//		HomePage hp = new HomePage();
//		hp.popUp2.click();
//		hp.Offers2.click();
//		BaseClass.closeBrowser();		
//	}
	
//	@BeforeClass
//	public static void beforeClass() {		
//		System.out.println("Before Class");
//	}
	
	@Before
	public void beforeMethod() throws IOException{	
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.fileRead("bankUrl"));
		System.out.println("Before Method");
	}
	
	@Test
	public void offerLinkValidation() {		
		HomePage hp = new HomePage();
		hp.popUp2.click();
		hp.Offers2.click();
		System.out.println("Method 1");
	}
	
	@After
	public void afterMethod() {
		BaseClass.closeBrowser();
		System.out.println("After Method");
	}

}
