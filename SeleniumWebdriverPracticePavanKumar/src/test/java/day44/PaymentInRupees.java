package day44;

import org.testng.annotations.Test;

public class PaymentInRupees {

	@Test(priority=1,groups={"sanity","regression","functional"})
	void PaymentinRupees()
	{
		System.out.println("Payment in rupees");
	}
	
	
	@Test(priority=2,groups={"sanity","regression"})
	void PaymentinDollers()
	{
		System.out.println("Payment in dollers");
	}
	
	
	
	
	
	
	
}
