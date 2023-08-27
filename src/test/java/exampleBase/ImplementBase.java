package exampleBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class ImplementBase extends BaseClass {

	public static void main(String[] args) {
        browserLaunch("http://facebook.com");
 
        maximize();
        
        url();
        
        title();
        
        WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
        value(user,"aishwarya@gmail.com");
        
        WebElement paswrd=driver.findElement(By.xpath("//input[@id='pass']"));
        value2(paswrd,"@457690ray");
        
        quitWindow();
	}

}
