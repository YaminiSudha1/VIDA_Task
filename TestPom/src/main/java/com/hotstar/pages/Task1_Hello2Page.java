package com.hotstar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotstar.base.TestBase;

public class Task1_Hello2Page  extends TestBase {


@FindBy(xpath="//*[contains(text(),'Watch Movie')]")
public WebElement Watchmovie;

//Intializing webelements with help of pagefactory - creating constructor

	public Task1_Hello2Page() {
		PageFactory.initElements(driver, this); //this - current class object
		
	}

public String WatchMv() {
	
	String wm1= Watchmovie.getText() ;
	return wm1;
	
}}