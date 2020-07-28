package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseClass;

public class verify_country_list extends baseClass {

	@Test
	public static void verify_country_dropdown_isEnabled() throws InterruptedException {
		elementClick(By.xpath(or.getProperty("FLAG_BUTTON")));
		List<WebElement> countries = driver.findElements(By.xpath(or.getProperty("COUNTRY_LIST")));
		for (WebElement country : countries) {
			Assert.assertTrue(country.isEnabled());

			System.out.println(country.getText() + "  < is Enabled");
		}

	}// verify_country_dropdown

	@Test
	public static void verify_country_dropdown_isdisplayed() throws InterruptedException {
		elementClick(By.xpath(or.getProperty("FLAG_BUTTON")));
		List<WebElement> countries = driver.findElements(By.xpath(or.getProperty("COUNTRY_LIST")));
		for (WebElement country : countries) {
			Assert.assertTrue(country.isDisplayed());
			System.out.println(country.getText() + "  < is Displayed");
		}
		driver.findElement(By.xpath(or.getProperty("LOCANTO_LOGO"))).click();

	}// verify_country_dropdown_isdisplayed

}
