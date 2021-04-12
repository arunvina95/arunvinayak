package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo_automation\\Driver\\chromedriver.exe");
	
WebDriver gg = new ChromeDriver();
gg.get("https://www.google.com/");
gg.manage().window().maximize();
WebElement sh = gg.findElement(By.name("q"));
sh.sendKeys("greens technology");
WebElement findElement = gg.findElement(By.xpath(("//input[@class = 'gNO89b'])[1])")));
findElement.click();
}
}
