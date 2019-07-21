package Sample;

import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sample1.BasePage1;
import sample1.Dressobj;

public class Testobj extends BasePage1 {
	Dressobj dresses;
	BasePage1 bp;
	Actions ac = new Actions(driver);

	public Testobj() {
		dresses = new Dressobj();
		bp = new BasePage1();
		
}
	@Test
	public void verifyDressesobj() {
		dresses.clickDress();
		Assert.assertTrue(bp.getTitlte1().equals("Dresses - My Store"));
	}
	@Test
	public void verifycasualdress() {
		dresses.clickDress();
		dresses.clickDress1();
		Assert.assertTrue(bp.getTitlte1().equals("Casual Dresses - My Store"));
	}
	@Test
	public void verifysize() {
		Assert.assertTrue(bp.elementFound(dresses.getSmall()));
		Assert.assertTrue(bp.elementFound(dresses.getMedium()));
		Assert.assertTrue(bp.elementFound(dresses.getLarge()));
	}
	@Test
	public void verifycount() {
		int totalnum = dresses.getheadcount();
		int prodcount1 = dresses.getprodcount();
		Assert.assertTrue(totalnum == prodcount1);
	}
	
	@Test
	public void verifysubscription1() {
		dresses.getsubscription();
		Assert.assertTrue(dresses.getsubscriptionMessage().contains("successfully"));
	}
	
	
	
}








