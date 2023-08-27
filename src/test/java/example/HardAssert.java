package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert {

	@Test
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://www.facebook/");
		System.out.println("Example of Assertion1");
	}
	@Test
	private void tc2(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://www.amazon.in/","Title matched");
		System.out.println("Example of Assertion2");
	}

}
