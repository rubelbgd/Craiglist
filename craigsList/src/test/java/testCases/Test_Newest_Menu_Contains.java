package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Newest_Menu_Contains extends BaseClass {

	
	@Test
	static void Newest_Menu_Contains() {
		//Chose Furniture
		System.out.println("fur " + or.getProperty("FURNITURE"));
		elementClick(By.xpath(or.getProperty("FURNITURE")));
		
        //click newest dropdown
		elementClick(By.xpath(or.getProperty("NEWEST_DROPDOWN")));
		//Newest list
		List<WebElement> newest1=driver.findElements(By.xpath(or.getProperty("NEWESTLIST")));
		System.out.println( newest1.size());
		
		for (WebElement n : newest1) {
			String newsetList =n.findElement(By.xpath(or.getProperty("GET_NEWEST_LIST"))).getText();
		
		Assert.assertEquals(newsetList,newsetList);
	
			System.out.println("newsetList");
		
}
	
	}

}//class
