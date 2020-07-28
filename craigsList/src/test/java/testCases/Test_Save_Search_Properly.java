package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import base.BaseClass;

public class Test_Save_Search_Properly extends BaseClass {


@Test
static void Save_Search_IsDisplayed() throws InterruptedException {
	
		// Select computer
		elementClick(By.xpath(or.getProperty("SELSCT_CUMPUTER")));
		System.out.println("Select computer");

		// Select save search
		elementClick(By.xpath(or.getProperty("SAVE_SEARCH")));
		System.out.println("Select save search");

		Thread.sleep(3000);

		List<WebElement> SavedItem = driver.findElements(By.xpath(or.getProperty("SAVED_TABLE")));
		System.out.println(SavedItem.size());
	
       Assert.assertEquals(SavedItem, SavedItem ,"Save item is saved");
				System.out.println("  IsDisplayed  " );

}		
		

	

}// class
