package exampleBase;

import com.base.BaseClassTask;

import pojo.page.AdactinBookHotelPage;
import pojo.page.AdactinConfirmationPage;
import pojo.page.AdactinLoginPage;
import pojo.page.AdactinLogoutPage;
import pojo.page.AdactinSearchHotelPage;
import pojo.page.AdactinSelectHotelPage;

public class AdactinPage_POJO extends BaseClassTask {

	public static void main(String[] args) throws InterruptedException {
		browserLaunch("https://adactinhotelapp.com/");
		
		AdactinLoginPage a= new AdactinLoginPage();
		
		passUser(a.getUser(),"abinesh12345");
		passUser(a.getPass(),"12345");
		Thread.sleep(2000);
		login(a.getLog());
		
		AdactinSearchHotelPage s=new AdactinSearchHotelPage();
		
		printPage1(s.getTxt());
		dropDown1(s.getLoc());
		dropDown2(s.getHot());
		dropDown3(s.getRoom());
		dropDown4(s.getRoomno());
		dropDown5(s.getAdroom());
		dropDown6(s.getChroom());
		Thread.sleep(2000);
		search(s.getSub());
		
		AdactinSelectHotelPage sh=new AdactinSelectHotelPage();
		
		printPage2(sh.getTt());
		rad(sh.getRadbut());
		Thread.sleep(2000);
		contin(sh.getConti());
		
		AdactinBookHotelPage b=new AdactinBookHotelPage();

		printPage3(b.getTx());
		name(b.getFn(),"Aishwarya");
		lName(b.getLn(),"Ray");
		address(b.getAddress(),"hfjfglgkuhyk");
		printPage4(b.getTtx());
		cardNo(b.getCno(),"2341564789654367");
		dropDown9(b.getCtype());
		dropDown7(b.getCmonth());
		dropDown8(b.getCyear());
		passCvv(b.getCvv(),"435");
		bookNow(b.getBook());
		printPage5(b.getBookmsg());
		Thread.sleep(5000);
		printPage6(b.getOrderno());
		
		AdactinConfirmationPage c=new AdactinConfirmationPage();
		
		printPageName(c.getConmsg());
		logOut(c.getLogout());	
		
		AdactinLogoutPage l=new AdactinLogoutPage();
		
		printLogoutPage(l.getLogoutmsg());
	}
}
