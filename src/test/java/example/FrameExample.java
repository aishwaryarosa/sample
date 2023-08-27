package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		List<WebElement> countFrame=driver.findElements(By.tagName("iframe"));
		int c=countFrame.size();
		System.out.println("Total frame count is "+c);
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("frm2");
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("Besant Technology");
		
		driver.switchTo().parentFrame();
		WebElement txt=driver.findElement(By.xpath("//*[@id='name']"));
		txt.sendKeys("Bye Bye");
		
	}

}

