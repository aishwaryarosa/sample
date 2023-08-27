package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement mob=driver.findElement(By.xpath("//*[text()='Mobiles']"));
		Actions a=new Actions(driver);
		a.moveToElement(mob).perform();
		
		a.contextClick().perform();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
