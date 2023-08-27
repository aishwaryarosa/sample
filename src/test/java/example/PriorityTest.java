package example;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=1)
	private void tc1()
	{
		System.out.println("tc1");
	}
	
	@Test(priority=-1)
	private void tc2()
	{
		System.out.println("tc2");
	}
	
	@Test(enabled =false)
	private void tc3()
	{
		System.out.println("tc3");
	}
	@Test(invocationCount=5)
	private void tc4()
	{
		System.out.println("tc4");
	}

	

}
