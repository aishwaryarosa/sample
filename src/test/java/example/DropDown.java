package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		 
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("4");
		
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(7);
		
		WebElement yr=driver.findElement(By.id("year"));
		Select s2=new Select(yr);
		s2.selectByVisibleText("2013");	
		
		Thread.sleep(2000);
		driver.quit();
		

		
	}

}
