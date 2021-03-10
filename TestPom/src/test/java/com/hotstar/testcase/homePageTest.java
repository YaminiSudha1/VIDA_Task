package com.hotstar.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hotstar.base.TestBase;
import com.hotstar.pages.*;


public class homePageTest  extends TestBase 
{
	HomePage home;
	Task1_Hello2Page hello;
	
	
// setup --> next --> creating object of Homepage class 
	@BeforeMethod 
	public void setup()
	{
		Initialization();
		
		 home= new HomePage();
		 hello =new Task1_Hello2Page();
	}
	
	@Test(priority=1)
	
	
	public void homepage() throws InterruptedException {
		
		
// waiting for the page to be loaded till logo displays
		boolean logo= home.pageLogoValidation();
		Assert.assertTrue(logo);
		
//entering hello value in searchbox 
	home.searchValue("Hello");
	
//waiting till Moreresults link to display (to click on 2nd result)
	home.Moreresults.isDisplayed();	

	
	home.allMovieresults.get(1).click(); //accessing the list from HomePage class and clicking on 2nd result.
	hello.Watchmovie.isDisplayed(); // waiting for the element to display
		
	if(hello.WatchMv().contains("WatchMovie"))
	{
		String y = hello.WatchMv();
		System.out.println(y + "Available on the page" );
		
	}
	}
	
	
@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
