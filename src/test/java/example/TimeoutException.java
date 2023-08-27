package example;

import org.testng.annotations.Test;

public class TimeoutException {
	@Test()
	private void tc1()
	{
		System.out.println("tc1");
	}
	
	@Test()
	private void tc2()
	{
		System.out.println("tc2");
	}
	
	@Test(timeOut =1000)
	private void tc3() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("tc3");
	}
	@Test(dependsOnMethods="tc3")
	private void tc4()
	{
		System.out.println("tc4");
	}


}
