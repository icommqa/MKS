package com.aiite.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title=\"Close\"]")
	public WebElement popUp2;
	
	@FindBy(xpath="//span[@class=\"txtSign\"]")
	public WebElement logIn2;
	
	@FindBy(xpath="//span[text()='Offers']")
	public WebElement Offers2;
}
