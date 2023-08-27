package exampleBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClassTask;

public class AdactinHotelApp extends BaseClassTask {

	public static void main(String[] args) throws InterruptedException {
		browserLaunch("https://adactinhotelapp.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		passUser(username,"abinesh12345");
		
		WebElement passwrd=driver.findElement(By.xpath("//input[@id='password']"));
		passUser(passwrd,"12345");
		
		Thread.sleep(2000);
		
		WebElement log=driver.findElement(By.xpath("//input[@id='login']"));
		login(log);
		
		WebElement tt=driver.findElement(By.xpath("//td[text()='Search Hotel ']"));
		printPage1(tt);
		
		WebElement drop1=driver.findElement(By.id("location"));
		dropDown1(drop1);
		
		WebElement drop2=driver.findElement(By.id("hotels"));
		dropDown2(drop2);
		
		WebElement drop3=driver.findElement(By.id("room_type"));
		dropDown3(drop3);
		
		WebElement drop4=driver.findElement(By.id("room_nos"));
		dropDown4(drop4);
		
		WebElement drop5=driver.findElement(By.id("adult_room"));
		dropDown5(drop5);
		
		WebElement drop6=driver.findElement(By.id("child_room"));
		dropDown6(drop6);
		
		Thread.sleep(2000);
		
		WebElement srch=driver.findElement(By.xpath("//input[@id='Submit']"));
		search(srch);
		
		WebElement tt1=driver.findElement(By.xpath("//td[text()='Select Hotel ']"));
		printPage2(tt1);
		
		WebElement radio=driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		rad(radio);
		
		Thread.sleep(2000);
		
		WebElement con=driver.findElement(By.xpath("//input[@id='continue']"));
		contin(con);
		
		WebElement tt2=driver.findElement(By.xpath("//td[text()='Book A Hotel ']"));
		printPage3(tt2);
		
		WebElement nam=driver.findElement(By.xpath("//input[@id='first_name']"));
		name(nam,"Aishwarya");
		
		WebElement nam2=driver.findElement(By.xpath("//input[@id='last_name']"));
		lName(nam2,"Ray");
		
		WebElement add=driver.findElement(By.xpath("//textarea[@id='address']"));
		address(add,"hfjfglgkuhyk");
		
		WebElement tt3=driver.findElement(By.xpath("//label[text()='Use 16 digit Dummy Data']"));
		printPage4(tt3);
		
		WebElement no=driver.findElement(By.xpath("//input[@id='cc_num']"));
		cardNo(no,"2341564789654367");
		
		WebElement drop9=driver.findElement(By.id("cc_type"));
		dropDown9(drop9);
		
		WebElement drop7=driver.findElement(By.id("cc_exp_month"));
		dropDown7(drop7);
		
		WebElement drop8=driver.findElement(By.id("cc_exp_year"));
		dropDown8(drop8);
		
		WebElement cv=driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		passCvv(cv,"435");
		
		WebElement bn=driver.findElement(By.xpath("//input[@id='book_now']"));
		bookNow(bn);
		WebElement tt4=driver.findElement(By.xpath("//label[text()='Please wait! We are processing your Hotel Booking...']"));
		printPage5(tt4);
		Thread.sleep(5000);
				
		WebElement tt5=driver.findElement(By.xpath("//*[@id='order_no']"));
		printPage6(tt5);

		WebElement tx=driver.findElement(By.xpath("//td[text()='Booking Confirmation ']"));
		printPageName(tx);
		
		WebElement lo=driver.findElement(By.xpath("//input[@id='logout']"));
		logOut(lo);
	}
	

}
