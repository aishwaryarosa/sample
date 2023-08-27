package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("che");
		Thread.sleep(2000);
		List<WebElement> autoSuggestion=driver.findElements(By.xpath("//*[@class='G43f7e']//li"));
		int size=autoSuggestion.size();
		System.out.println(size);
		Thread.sleep(3000);
		autoSuggestion.get(size-3).click();
		


	}

}
