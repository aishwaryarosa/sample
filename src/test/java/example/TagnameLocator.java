package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagnameLocator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int size=alllinks.size();
		System.out.println(size);

	}

}
