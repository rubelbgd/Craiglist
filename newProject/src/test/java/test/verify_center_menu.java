package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseClass;

public class verify_center_menu extends baseClass {
	
	@Test
	public static void verify_all_links_on_page () throws IOException, InterruptedException {
		String url;
		HttpURLConnection huc;
		int respCode;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			url = link.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			
			huc = (HttpURLConnection) (new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			respCode = huc.getResponseCode();
			
			if (respCode >= 400) {
				System.out.println(url + " is a broken link");
			} else {
				System.out.println(url + " is a valid link");
			}
		} // forloop
	}

}
