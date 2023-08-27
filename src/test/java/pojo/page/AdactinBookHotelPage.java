package pojo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClassTask;

public class AdactinBookHotelPage extends BaseClassTask {
	
	public AdactinBookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement tx;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement fn;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement ln;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="//label[text()='Use 16 digit Dummy Data']")
	private WebElement ttx;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cno;
	
	@FindBy(id="cc_type")
	private WebElement ctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement cmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement cyear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement book;
	
	@FindBy(xpath="//label[text()='Please wait! We are processing your Hotel Booking...']")
	private WebElement bookmsg;
	
	@FindBy(xpath="//*[@id='order_no']")
	private WebElement orderno;

	public WebElement getTx() {
		return tx;
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getTtx() {
		return ttx;
	}

	public WebElement getCno() {
		return cno;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getCmonth() {
		return cmonth;
	}

	public WebElement getCyear() {
		return cyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getBookmsg() {
		return bookmsg;
	}

	public WebElement getOrderno() {
		return orderno;
	}
	
	
}
