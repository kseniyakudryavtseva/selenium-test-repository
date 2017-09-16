package finishTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Application {

    private WebDriverWait wait;
    private WebDriver driver;
    
    private MainPage mainPage;
    private ProductPage productPage;
    private CartPage cartPage;
 
    public Application() {
    	driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        mainPage = new MainPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }
 
    public void quit() {
    	driver.quit();
    }
    
    
    public void goToMainPage() {
    	mainPage.open();
    }
    
    public void addProductsToCart() {
		for (int i =0; i < 3; i++)
		{
			mainPage.firstProduct.click();
			int count = Integer.parseInt(productPage.numberProductsInCart.getText());
			String product_name = productPage.productTitle.getText();
			
			if (product_name.equals("Yellow Duck"))
			{
				WebElement product_size = productPage.productSizeSelect;
				Select select = new Select(product_size); 
				select.selectByVisibleText("Small");
			}
			productPage.addProductButton.click();
			count++;
			String count_str = Integer.toString(count);
			wait.until(ExpectedConditions.textToBePresentInElement(productPage.numberProductsInCart, count_str));
			productPage.goBack();
		}
    }
    
    public void openShoppingCart() {
    	productPage.shoppingCartLink.click();
    }
    
    public void deleteProducts() {
		List <WebElement> all_products = cartPage.productsList;
		for (int i=1;i<all_products.size()-4;i++)
			{
				if (all_products.size() == 6)
				{
					cartPage.removeButton.click();
					wait.until(ExpectedConditions.visibilityOf(cartPage.checkoutCartWrapper));
				}
				else
				{
					WebElement first_product = driver.findElement(By.cssSelector("table.dataTable tr:nth-child(2)"));
					cartPage.removeButton.click();
					wait.until(ExpectedConditions.stalenessOf(first_product));
				}
			}
		}
    	
    }
