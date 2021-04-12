package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo_automation\\Driver\\chromedriver.exe");
	WebDriver fox = new ChromeDriver();
	fox.get("https://www.facebook.com/");
	fox.manage().window().maximize();
	WebElement id = fox.findElement(By.id("email"));
	id.sendKeys("88078691");
	WebElement password = fox.findElement(By.name("pass"));
	password.sendKeys("gsdyyg");
	WebElement button = fox.findElement(By.xpath("//button[@value = '1']"));
	button.click();
	}
}