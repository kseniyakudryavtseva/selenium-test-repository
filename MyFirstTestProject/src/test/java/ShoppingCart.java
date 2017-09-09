import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart extends TestBase {
	
	@Test
	public void test01() throws InterruptedException {
		driver.get("http://localhost/litecart/en/");
		
		for (int i =0; i < 3; i++)
		{
			driver.findElement(By.cssSelector("#box-most-popular li:first-child")).click();
			int count = Integer.parseInt(driver.findElement(By.cssSelector("div#cart span.quantity")).getText());
			String product_name = driver.findElement(By.cssSelector("h1.title")).getText();
			if (product_name.equals("Yellow Duck"))
			{
				WebElement product_size = driver.findElement(By.cssSelector("select[name='options[Size]'"));
				Select select = new Select(product_size); 
				select.selectByVisibleText("Small");
			}
			driver.findElement(By.cssSelector("button[name=add_cart_product]")).click();
			count++;
			String count_str = Integer.toString(count);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div#cart span.quantity"), count_str));
			driver.navigate().back();
		}
			
		driver.findElement(By.cssSelector("div#cart a:last-child")).click();
		List <WebElement> all_products = driver.findElements(By.cssSelector("table.dataTable tr"));
		for (int i=1;i<all_products.size()-4;i++)
			{
				if (all_products.size() == 6)
				{
					driver.findElement(By.cssSelector("button[name='remove_cart_item'")).click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#checkout-cart-wrapper em")));
				}
				else
				{
					WebElement first_product = driver.findElement(By.cssSelector("table.dataTable tr:nth-child(2)"));
					driver.findElement(By.cssSelector("button[name='remove_cart_item'")).click();
					wait.until(ExpectedConditions.stalenessOf(first_product));
				}
			}
		}
	}

