package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo_automation\\Driver\\chromedriver.exe");
		WebDriver red = new ChromeDriver();
		red.get("https://www.redbus.in/");
		red.manage().window().maximize();
		WebElement from = red.findElement(By.id("src"));
		from.sendKeys("sankarankoil");
		WebElement to = red.findElement(By.id("dest"));
		to.sendKeys("chennai");
		WebElement search = red.findElement(By.className("fl button"));
		search.click();
	}

}
