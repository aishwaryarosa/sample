package example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAddtoCart {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String parentWindowId=driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone");
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

		driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
		
		Thread.sleep(2000);
		
		Set<String> allWindowId=driver.getWindowHandles();
		System.out.println(allWindowId);
		
		for(String allWindows: allWindowId)
		{
			if(!allWindowId.equals(parentWindowId))
			{
				driver.switchTo().window(allWindows);
				WebElement add=driver.findElement(By.xpath("//*[@id='submit.add-to-cart-announce']"));
				add.click();
				Thread.sleep(5000);
			}
		}
		//driver.quit();

	}

}
