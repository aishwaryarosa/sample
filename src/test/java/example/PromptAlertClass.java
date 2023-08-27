package example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlertClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='promtButton']")).click();
		Alert a= driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		
		a.sendKeys("Aishwarya");
		Thread.sleep(2000);
		
		a.accept();
		
		driver.quit();
		
		
		

	}

}
