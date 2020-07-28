package testCases;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Language_Change_E2E extends BaseClass {

	@Test
	static void  Language_Change() throws InterruptedException {
		//click on english
		Thread.sleep(5000);
		elementClick(By.xpath(or.getProperty("LANGUAGE_BUTTON")));
		System.out.println("English");
		
		//click on italiano
		Thread.sleep(5000);
		elementClick(By.xpath(or.getProperty("ITALIANO")));
		System.out.println("italiano");
		

		Thread.sleep(5000);
		Assert.assertTrue( elementDisplayed(By.xpath(or.getProperty("ITALIANO")))==true );
														//== is comparison operator, < > >= <= !=  ==    ( logical operator AND OR NOT)
			//click on english
		Thread.sleep(5000);
		elementClick(By.xpath(or.getProperty("ENGLISH")));
		System.out.println("English");
		
		Thread.sleep(5000);
	}//
		
}//class
		
	
		
		
		
	
		
		
		
		
		
		
	
	