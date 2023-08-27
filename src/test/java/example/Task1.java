package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/Register.php");
		driver.manage().window().maximize();
		WebElement usernm=driver.findElement(By.className("reg_input"));   //use of classname locator
		usernm.sendKeys("BesantTechnology");     //use of sendKeys method 
		String txtValue=usernm.getAttribute("value");    //use of getAttribute method
		System.out.println(txtValue);
		WebElement ps=driver.findElement(By.name("password"));   //use of name locator
		ps.sendKeys("@besant123"); 
		WebElement conps=driver.findElement(By.id("re_password"));   //use of id locator
		conps.sendKeys("@besant123");
		WebElement user=driver.findElement(By.xpath("(//input[@type='text'])[2]"));  //use of xpath using attribute and index
		user.sendKeys("Aishwarya Ray");  
		WebElement email=driver.findElement(By.xpath("//input[@id='email_add']"));  //use of xpath using attribute
		email.sendKeys("aishwarya@gmail.com");
		WebElement checkbox=driver.findElement(By.id("tnc_box"));
		checkbox.click();
		WebElement txt=driver.findElement(By.xpath("//h4[text()='Adactin Hotel Mobile App']")); //xpath using text
		String ttxt=txt.getText();
		System.out.println(ttxt);
		WebElement tt=driver.findElement(By.xpath("//h4[contains(text(),'HotelApp')]"));  //xpath using contains text
		String ft=tt.getText();
		System.out.println(ft);
		List<WebElement> alllinks = driver.findElements(By.tagName("a")); //  use of tagname
		int size=alllinks.size();
		System.out.println(size);
		WebElement click=driver.findElement(By.xpath("//*[text()='Click']")); 
		Actions a=new Actions(driver);  
		a.moveToElement(click).perform();  //moveToElement action class
		Thread.sleep(2000);
		a.contextClick().perform();       //contextclick action class
		Thread.sleep(2000);
		driver.navigate().to("http://facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("www.adactin.com")).click(); //use of link text
		Thread.sleep(2000);
		driver.navigate().back();   //Navigation back method
		Thread.sleep(2000);
		String title = driver.getTitle();     //use of getTitle
		System.out.println(title);    
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		String url = driver.getCurrentUrl();     //use of getCurrentUrl
		System.out.println(url);
		driver.findElement(By.partialLinkText("Terms &")).click(); //use of link text
		Thread.sleep(2000);
		driver.quit();	
	}

}
