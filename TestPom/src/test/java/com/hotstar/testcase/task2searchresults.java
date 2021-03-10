package com.hotstar.testcase;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hotstar.base.TestBase;
import com.hotstar.pages.HomePage;
import com.hotstar.pages.Task2_MandalorainPage;


public class task2searchresults extends TestBase {
	
	HomePage home;
	Task2_MandalorainPage respage;
	
// setup --> next --> creating object of Homepage class 
	@BeforeMethod 
	public void setup()
	{
		Initialization();
		
		 home= new HomePage();
		 respage =new Task2_MandalorainPage();
	}
	@Test
	public void task2page() throws InterruptedException {
		
// waiting for the page to be loaded till logo displays
		boolean logo= home.pageLogoValidation();
		Assert.assertTrue(logo);
		

	home.searchValue("Mandalorain"); //entering Mandalorain value in searchbox 
	home.Search.sendKeys(Keys.ENTER); //entering value and pressing enter key
	respage.Allresultsvisb.isDisplayed(); //waiting for element to display
	
	//Taking count of  results from the above stored list
	int count =respage.AllResultList.size();
	System.out.println("the number of results found for the given input is " + count); //Printing the count of search input
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


	}
