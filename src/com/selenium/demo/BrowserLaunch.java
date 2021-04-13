package com.selenium.demo;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo_automation\\Driver\\chromedriver.exe");
		WebDriver amazon = new ChromeDriver();
		amazon.get("https://www.amazon.in/");
		amazon.manage().window().maximize();
		amazon.navigate().to("https://www.youtube.com/");
		amazon.navigate().back();
		String currentUrl = amazon.getCurrentUrl();
		System.out.println(currentUrl);
		TakesScreenshot ts = (TakesScreenshot) amazon;
	}

}
