package finishTask;

import org.junit.Test;
import finishTask.TestBase;

public class ShoppingCart_PO extends TestBase {
	
	@Test
	public void test01() throws InterruptedException {
		
		app.goToMainPage();
		app.addProductsToCart();
		app.openShoppingCart();
		app.deleteProducts();
		
	}
}