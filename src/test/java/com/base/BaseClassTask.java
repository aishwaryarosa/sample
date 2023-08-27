package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTask {
	public static Select s;
	public static String s2;
	public static WebDriver driver;
	public static void browserLaunch(String url){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void passUser(WebElement w,String user) {
		w.sendKeys(user);
	}
	public static void password(WebElement p,String pas) {
		p.sendKeys(pas);
	}
	public static void login(WebElement l) {
		l.click();
	}
	public static void printPage1(WebElement pp) {
		String s1=pp.getText();
		System.out.println(s1);
	}
	public static void dropDown1(WebElement d1) {
		s=new Select(d1);
		s.selectByVisibleText("London");
	}
	public static void dropDown2(WebElement d2) {
		s=new Select(d2);
		s.selectByVisibleText("Hotel Sunshine");
	}
	public static void dropDown3(WebElement d3) {
		s=new Select(d3);
		s.selectByVisibleText("Double");
	}
	public static void dropDown4(WebElement d4) {
		s=new Select(d4);
		s.selectByVisibleText("3 - Three");
	}
	public static void dropDown5(WebElement d5) {
		s=new Select(d5);
		s.selectByVisibleText("2 - Two");
	}
	public static void dropDown6(WebElement d6) {
		s=new Select(d6);
		s.selectByVisibleText("2 - Two");
	}
	public static void search(WebElement sr) {
		sr.click();
	}
	public static void printPage2(WebElement pp2) {
		String s1=pp2.getText();
		System.out.println(s1);
	}
	public static void rad(WebElement r) {
		r.click();
	}
	public static void contin(WebElement c) {
		c.click();
	}
	public static void printPage3(WebElement pp3) {
		String s1=pp3.getText();
		System.out.println(s1);
	}
	public static void name(WebElement na,String n) {
		na.sendKeys(n);
	}
	public static void lName(WebElement ln,String n) {
		ln.sendKeys(n);
	}
	public static void address(WebElement ad,String n) {
		ad.sendKeys(n);
	}
	public static void printPage4(WebElement pp4) {
		String s1=pp4.getText();
		System.out.println(s1);
	}
	public static void cardNo(WebElement cn,String n) {
		cn.sendKeys(n);
	}
	public static void dropDown9(WebElement d9) {
		s=new Select(d9);
		s.selectByVisibleText("Master Card");
	}
	public static void dropDown7(WebElement d7) {
		s=new Select(d7);
		s.selectByVisibleText("February");
	}
	public static void dropDown8(WebElement d8) {
		s=new Select(d8);
		s.selectByVisibleText("2025");
	}
	public static void passCvv(WebElement c,String n) {
		c.sendKeys(n);
	}
	public static void bookNow(WebElement b) {
		b.click();
	}
	public static void printPage5(WebElement pp) {
		String s1=pp.getText();
		System.out.println(s1);
	}
	public static void printPage6(WebElement pp) {
			String s=pp.getAttribute("value");
			System.out.println(s);
		}

	public static void printPageName(WebElement pn) {
		String s1=pn.getText();
		System.out.println(s1);
	}
	public static void logOut(WebElement l) {
		l.click();
	}
	public static void printLogoutPage(WebElement lout) {
		String s1=lout.getText();
		System.out.println(s1);
	}

	

}
