package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void browserLaunch(String url){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
	}
    public static void maximize() {
    	driver.manage().window().maximize();
    }
    public static void url() {
    	driver.getCurrentUrl();
    }
    public static void title() {
    	driver.getTitle();
    }
    public static void value(WebElement we,String txt) {
    	we.sendKeys(txt);
    }
    public static void value2(WebElement we2,String txt2) {
    	we2.sendKeys(txt2);
    }
    public static void quitWindow() {
    	driver.quit();
    }

    

}
