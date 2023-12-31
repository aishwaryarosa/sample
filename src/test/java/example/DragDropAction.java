package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement desti=driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		
		Actions a=new Actions(driver);
		a.dragAndDrop(source, desti).perform();
		Thread.sleep(2000);
	}

}
