package testCases;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test_Verify_Event_Calender extends BaseClass {

	@Test(priority = 1)
	static void Verify_event_calendar_link_is_displayed() throws InterruptedException {
		boolean event_calendar_link_is_displayed = driver.findElement(By.linkText("event calendar")).isDisplayed();
		Assert.assertEquals(event_calendar_link_is_displayed, true);

		// Verify event calendar link is Enabled
		boolean event_calendar_link_is_displayed1 = driver.findElement(By.linkText("event calendar")).isEnabled();
		Assert.assertTrue(event_calendar_link_is_displayed1 == true, "Asserting is Enabled");
	}

	@Test(priority = 2)
	void event_calendar_is_Clickable() throws InterruptedException {
		boolean  result= isClickable(By.linkText("event calendar"));
		Assert.assertEquals(result, true);
		/*
		try {
			elementClick(By.linkText("event calendar"));
			Assert.assertTrue(false);
			// driver.navigate().back();
		} catch (NoSuchElementException ec) {
			System.out.println(ec.getMessage());
			Assert.assertTrue(true);
			Thread.sleep(2000);
		}

		System.out.println("No Exception");
		// login();
		// logout();
		*/ 
	}// event_calender
		// Ctrl+A //Ctrl+Shift+F
}// class
