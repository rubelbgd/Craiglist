package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Count_All_The_Search_List_Item extends BaseClass{

	@Test
	static void Count_All_The_Search_List_Item() {
		
		//Select Furciture
		elementClick(By.xpath(or.getProperty("FURNITURE")));
		System.out.println(" Search Furniture");
		
		//"All the search list item 
	    String totalFurniture =driver.findElement(By.xpath(or.getProperty("ALL_LIST_ITEM"))).getText();
		//System.out.println("All the search list item " + totalFurniture);
		log.debug("All the search list item " + totalFurniture);
		Assert.assertEquals(totalFurniture ,"3000");
	
		
		
	}

}
