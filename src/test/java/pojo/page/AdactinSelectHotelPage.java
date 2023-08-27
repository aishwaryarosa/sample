package pojo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClassTask;

public class AdactinSelectHotelPage extends BaseClassTask {
	
	public AdactinSelectHotelPage() {
		PageFactory.initElements(driver,this );
	}
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement tt;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radbut;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement conti;

	public WebElement getTt() {
		return tt;
	}

	public WebElement getRadbut() {
		return radbut;
	}

	public WebElement getConti() {
		return conti;
	}
	

}
