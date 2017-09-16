package finishTask;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends Page {

	public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
	
	@FindBy (css = "table.dataTable tr")
	public List<WebElement> productsList;
	
	@FindBy (css = "button[name='remove_cart_item'")
	public WebElement removeButton;
	
	@FindBy (css = "div#checkout-cart-wrapper em")
	public WebElement checkoutCartWrapper;
	
	@FindBy (css = "table.dataTable tr:nth-child(2)")
	public WebElement firstProduct;
	
}
