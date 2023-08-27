package pojo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClassTask;

public class AdactinConfirmationPage extends BaseClassTask{
	
	public AdactinConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement Conmsg;
	
	@FindBy(xpath="//input[@id='logout']")
	private WebElement logout;

	public WebElement getConmsg() {
		return Conmsg;
	}

	public WebElement getLogout() {
		return logout;
	}
	

}
