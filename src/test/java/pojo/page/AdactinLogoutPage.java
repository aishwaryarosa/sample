package pojo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClassTask;

public class AdactinLogoutPage extends BaseClassTask{
	
	public AdactinLogoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='You have successfully logged out. ']")
	private WebElement logoutmsg;
	
	public WebElement getLogoutmsg() {
		return logoutmsg;
	}

}
