package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo_automation\\Driver\\chromedriver.exe");
		WebDriver ig = new ChromeDriver();
		ig.get("https://www.instagram.com/");
		ig.manage().window().maximize();
		WebElement user = ig.findElement(By.name("username"));
		user.sendKeys("arun");
		WebElement pass = ig.findElement(By.name("password"));
		pass.sendKeys("vina");
	}

}
