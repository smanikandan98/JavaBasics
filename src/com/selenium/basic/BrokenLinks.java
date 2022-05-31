package com.selenium.basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.naming.MalformedLinkException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException, MalformedURLException,
			MalformedLinkException, MalformedURLException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANIKANDAN\\eclipse-workspace\\Java_Collection\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/2020/07/automation-testing-demo-websites.html");
		Thread.sleep(5000);

		List<WebElement> link = driver.findElements(By.tagName("a"));
		link.size();

		System.out.println("Total Links Present in the page is: " + link.size());
		for (int i = 0; i < link.size(); i++) {

			WebElement ele = link.get(i);
			String url = ele.getAttribute("href");

			URL Links = new URL(url);

			HttpURLConnection https = (HttpURLConnection) Links.openConnection();
			Thread.sleep(2000);
			https.connect();
			int res = https.getResponseCode();

			if (res >= 400) {
				System.out.println(url + " - " + "is a broken link");

			} else {
				System.out.println(url + " - " + "is a valid Link");
			}
		}
		driver.quit();

	}

}
