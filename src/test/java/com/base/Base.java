package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static WebDriver driver;
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void title() {
		System.out.println(driver.getTitle());
	}
	public static void url() {
		System.out.println(driver.getCurrentUrl());
	}


}
