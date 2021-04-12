package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Demo_automation\\Driver\\chromedriver.exe" );
	WebDriver path = new ChromeDriver();
	path.get("https://www.byjus.com/");
	String title = path.getTitle();
	System.out.println(title);
	
	
	
}
}
