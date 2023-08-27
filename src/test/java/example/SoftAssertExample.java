package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertExample {
	@Test
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualUrl=driver.getCurrentUrl();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualUrl, "https://www.facebook.co","Title Mismatching");
		System.out.println("Example of Soft Assertion1");
		s.assertAll();
	}
	@Test
	private void tc2(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://www.amazon.in/","Title matched");
		System.out.println("Example of Soft Assertion2");
	}

}
