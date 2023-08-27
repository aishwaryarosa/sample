package pojo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClassTask;

public class AdactinSearchHotelPage extends BaseClassTask {

	public AdactinSearchHotelPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement txt;
	
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hot;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="adult_room")
	private WebElement adroom;
	
	@FindBy(id="child_room")
	private WebElement chroom;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement sub;

	public WebElement getTxt() {
		return txt;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getAdroom() {
		return adroom;
	}

	public WebElement getChroom() {
		return chroom;
	}

	public WebElement getSub() {
		return sub;
	}
	
	

	
	
	
	

}
