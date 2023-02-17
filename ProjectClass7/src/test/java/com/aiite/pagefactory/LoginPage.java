package com.aiite.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	public WebElement userName;
	
	@FindBy(id="pass")
	public WebElement passWord;		

	@FindBy(xpath="//button[@name=\"login\"]")
	public WebElement loginBtn;	

	@FindBy(xpath="//a[text()='Sign Up']")
	public WebElement singUpLink;
	
	@FindBy(tagName="a")
	public List<WebElement> webLinks;

}
