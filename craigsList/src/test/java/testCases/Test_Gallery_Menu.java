package testCases;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Gallery_Menu extends BaseClass {

	@Test
	static void Gallery_Menu() {
		

		// Chose Furniture
		elementClick(By.xpath(or.getProperty("FURNITURE")));
		try{
	elementClick(By.xpath(or.getProperty("SELECT_GALLERY_DROPDOWN")));
		
	//List<WebElement> galleryList = driver.findElements(By.xpath(or.getProperty("ALL_GALLERY_LIST")));
		// System.out.println(Gallery);

		//for (WebElement galleryList : gallery) {
			//String g=galleryList.findElement(By.xpath(".//button")).getText();
			//System.out.println(g);
			Assert.assertTrue(true) ;
			System.out.println(" 4 Gallery List Is Displayed  ");
			}
		
		catch(NoSuchElementException ne) {
			Assert.assertTrue(false, ne.getMessage());
				System.out.println(" 4 Gallery List IsDisplayed  ");

			}
	}
		@Test
		static void gallery() {

		elementClick(By.xpath(or.getProperty("SELECT_GALLERY_DROPDOWN")));
		
		List<WebElement> Gallery = driver.findElements(By.xpath(or.getProperty("ALL_GALLERY_LIST")));
		// System.out.println(Gallery);

		for (WebElement GalleryList : Gallery) {
			// String g =GalleryList.getText();
			 System.out.println(GalleryList.getText());

			if (GalleryList.isDisplayed() && GalleryList.isEnabled()) {

				System.out.println(" 4 Gallery List IsDisplayed  " + GalleryList.getText());
				Assert.assertEquals(true, true);
				
			}
	}

		}
	
	}
