package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Demo_automation\\Driver\\chromedriver.exe" );
		WebDriver swiggy = new ChromeDriver();
		swiggy.get("https://www.swiggy.com/");
		WebElement loc = swiggy.findElement(By.name("location"));
		loc.sendKeys("chennai");
		
	}

}
