package com.hotstar.pages;

import org.openqa.selenium.support.PageFactory;

import com.hotstar.base.TestBase;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task2_MandalorainPage  extends TestBase{
	
	@FindBy(css="h2")
	public WebElement Allresultsvisb;
	
	@FindBy(xpath= "//div[@class='resClass']//div[contains(@class,'normal')]")
	public List<WebElement> AllResultList;
	
	//Intializing webelements with help of pagefactory - creating constructor
	public Task2_MandalorainPage() {
			PageFactory.initElements(driver, this); //this - current class object
			
		}

	
}
