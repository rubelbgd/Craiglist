package testCases;



import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;




public class Test_City_IsDisplayed extends BaseClass {

	@Test // Chose Furniture
	public static void verifyTest_City_IsDisplayed() {;
		elementClick(By.xpath("//a[@href='/d/furniture/search/fua']"));
		System.out.println("Click CL logo to open Landing page");
		log.debug("Click CL logo to open Landing page");
		Reporter.log("Verified Test - City Is Displayed");
		
		Reporter.log("<a target=\"_blank\" href=\"c:\\pic.jpg\">Login Screen link</a>");
		//target=\"_blank\"  --to open up a new page link
		Reporter.log("<br>");  //line break
		Reporter.log("<a target=\"_blank\" href=\"c:\\pic.jpg\"><img src=\"c:\\pic.jpg\"></img></a>");
		// select Austin
		boolean City = driver.findElement(By.xpath(or.getProperty("CITY"))).isDisplayed();
		Assert.assertEquals(City, true);
	}

	@Test // Chose Furniture
	static void verify_test_city_isEnabled_in_the_search_filter_page() {
		log.debug("verifyTest_City_IsEnabled Test Started");
		boolean CityDropDown = driver.findElement(By.xpath(or.getProperty("CITY"))).isEnabled();
		// elementClick(By.xpath(or.getProperty("CITY"))) ;
		// Assert.assertEquels(elementEnabled(By.xpath(or.getProperty("CITY"))) ==
		// true);
		
		Assert.assertTrue(CityDropDown == true);
		log.debug("verifyTest_City_IsEnabled verified");
	}
	
	// Select Housing
	/*
	 * boolean dropdown2 =
	 * driver.findElement(By.xpath(or.getProperty("DROPDOWN2"))).isDisplayed(); if
	 * (dropdown2) System.out.println("IsDisplayed dropdown"); else
	 * System.out.println("is not displayed");
	 * 
	 * boolean Housing =
	 * driver.findElement(By.xpath(or.getProperty("DROPDOWN2"))).isEnabled(); if
	 * (Housing) System.out.println("Housing is Enabled and clickable "); else
	 * System.out.println("Housing is not Enabled");
	 * 
	 * // elementClick(By.xpath(or.getProperty("HOUSING")));
	 * 
	 * //select Vacation_Rentals boolean dropdown3 =
	 * driver.findElement(By.xpath(or.getProperty("DROPDOWN3"))).isDisplayed(); if
	 * (dropdown3) System.out.println("IsDisplayed dropdown"); else
	 * System.out.println("is not displayed");
	 * 
	 * boolean Vacation_Rentals =
	 * driver.findElement(By.xpath(or.getProperty("DROPDOWN3"))).isEnabled();
	 * 
	 * driver.findElement(By.xpath("//option[@value='vac']")).click();
	 * 
	 * if (Vacation_Rentals )
	 * System.out.println("Vacation Rentals is Enabled and clickable "); else
	 * System.out.println("Vacation Rentals  is not Enabled");
	 * 
	 * elementClick(By.xpath(or.getProperty("VACATION_RENTALS")));
	 */

}
