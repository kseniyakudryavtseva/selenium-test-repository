package finishTask;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Page{
	
	
    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
	@FindBy (css = "div#cart span.quantity")
	public WebElement numberProductsInCart;
    
	@FindBy (css = "h1.title")
	public WebElement productTitle;
	
	@FindBy (css = "button[name=add_cart_product]")
	public WebElement addProductButton;
	
	@FindBy (css = "select[name='options[Size]'")
	public WebElement productSizeSelect;
	
	@FindBy (css = "div#cart a:last-child")
	public WebElement shoppingCartLink;
	
	public void goBack() {
		driver.navigate().back();
	}
}
