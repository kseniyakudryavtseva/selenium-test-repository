import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;


public class LoginTest extends TestBase{
	
	
	@Test
	public void Test() {
	    driver.get("http://localhost/litecart/admin/");
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("admin");
	    driver.findElement(By.name("login")).click();
	    driver.findElement(By.linkText("Appearence")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-template")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-logotype")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Catalog")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-catalog")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-product_groups")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));	    
	    driver.findElement(By.id("doc-option_groups")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-manufacturers")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-suppliers")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-delivery_statuses")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-sold_out_statuses")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-quantity_units")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.cssSelector("li#app-.selected li#doc-csv")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Countries")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Currencies")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Customers")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-customers")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.cssSelector("li#app-.selected li#doc-csv")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-newsletter")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Geo Zones")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Languages")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-languages")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-storage_encoding")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Modules")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-jobs")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-customer")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-shipping")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-payment")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-order_total")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-order_success")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-order_action")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Orders")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-orders")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-order_statuses")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1"))); 
	    driver.findElement(By.linkText("Pages")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Reports")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-monthly_sales")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-most_sold_products")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-most_shopping_customers")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Settings")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-store_info")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-defaults")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-general")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-listings")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-images")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-checkout")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-advanced")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-security")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Slides")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Tax")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-tax_classes")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-tax_rates")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Translations")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-search")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-scan")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.cssSelector("li#app-.selected li#doc-csv")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("Users")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.linkText("vQmods")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    driver.findElement(By.id("doc-vqmods")).click();
	    assertTrue(isElementPresent(By.cssSelector("td#content h1")));
	    
	    
}
	
}
