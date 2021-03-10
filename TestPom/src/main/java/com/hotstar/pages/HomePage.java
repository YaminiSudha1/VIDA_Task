package com.hotstar.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hotstar.base.TestBase;

public class HomePage extends TestBase

{
//PageFactory  - Object Repository
	
	
	@FindBy(id="searchField")
	public WebElement Search;
	
	@FindBy(xpath=("//a/img[@class='brand-logo']"))
	public WebElement pageLogo;
	
	@FindBy(xpath="//a[@class='more-result']")
	public WebElement Moreresults;
	
	
	@FindBy(xpath=("//article[@class='ripple movie-card normal search-card']"))
	public List<WebElement> allMovieresults;
	
	
	
	
	//Intializing webelements with help of pagefactory - creating constructor
	
	public HomePage() {
		PageFactory.initElements(driver, this); //this - current class object
		
	}

	//Actions
	
	public boolean pageLogoValidation()
	{
		return pageLogo.isDisplayed();	
}
	public void searchValue(String value) {
		Search.sendKeys(value);
	}
	
	
}
