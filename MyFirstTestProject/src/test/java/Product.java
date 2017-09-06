import static org.junit.Assert.*;

import java.io.File;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Product extends TestBase{
	@Test
	public void test01() throws InterruptedException {
		driver.get("http://localhost/litecart/admin/");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Catalog")).click();
		int count;
		List<WebElement> all_products = driver.findElements(By.cssSelector("table.dataTable tr"));
		count = all_products.size();
		driver.findElement(By.cssSelector("td#content div a:last-child")).click();
		driver.findElement(By.cssSelector("input[name='status'][value='1']")).click();
		driver.findElement(By.cssSelector("input[name='name[en]'")).clear();
		driver.findElement(By.cssSelector("input[name='name[en]'")).sendKeys("test");
		String code;
		String mCHAR = "1234567890";
		int STR_LENGTH = 5;
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < STR_LENGTH; i++) 
		{
			int number = random.nextInt(mCHAR.length());
			char ch = mCHAR.charAt(number);
			builder.append(ch);
		}
		code = builder.toString();
		driver.findElement(By.cssSelector("input[name='code'")).clear();
		driver.findElement(By.cssSelector("input[name='code'")).sendKeys(code);
		driver.findElement(By.cssSelector("input[type='checkbox'][name ='categories[]'][value='1']")).click();
		driver.findElement(By.cssSelector("input[type='checkbox'][name ='product_groups[]'][value='1-2']")).click();
		driver.findElement(By.cssSelector("input[name='quantity'")).clear();
		driver.findElement(By.cssSelector("input[name='quantity'")).sendKeys("10");
		File file = new File("pictures\\duck.JPG");
		String path = file.getAbsolutePath();
		driver.findElement(By.cssSelector("input[name='new_images[]']")).sendKeys(path);
		driver.findElement(By.cssSelector("input[name='date_valid_from'")).sendKeys("01012017");
		driver.findElement(By.cssSelector("input[name='date_valid_to'")).sendKeys("01012018");
		driver.findElement(By.cssSelector("ul.index li:nth-child(2)")).click();
		Thread.sleep(1000);
		WebElement manufacturer = driver.findElement(By.cssSelector("select[name='manufacturer_id']"));
		Select select1 = new Select(manufacturer); 
		select1.selectByVisibleText("ACME Corp.");
		driver.findElement(By.cssSelector("input[name='keywords'")).clear();
		driver.findElement(By.cssSelector("input[name='keywords'")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name='short_description[en]'")).clear();
		driver.findElement(By.cssSelector("input[name='short_description[en]'")).sendKeys("test");
		driver.findElement(By.cssSelector("textarea[name='description[en]'")).click();
		driver.findElement(By.cssSelector("textarea[name='description[en]'")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name='head_title[en]'")).clear();
		driver.findElement(By.cssSelector("input[name='head_title[en]'")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name='meta_description[en]'")).clear();
		driver.findElement(By.cssSelector("input[name='meta_description[en]'")).sendKeys("test");
		driver.findElement(By.cssSelector("ul.index li:nth-child(4)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='purchase_price'")).clear();
		driver.findElement(By.cssSelector("input[name='purchase_price'")).sendKeys("20");
		WebElement purchase_price = driver.findElement(By.cssSelector("select[name=purchase_price_currency_code]"));
		Select select2 = new Select(purchase_price); 
		select2.selectByVisibleText("US Dollars");
		driver.findElement(By.cssSelector("input[name='prices[USD]'")).clear();
		driver.findElement(By.cssSelector("input[name='prices[USD]'")).sendKeys("21");
		driver.findElement(By.cssSelector("input[name='prices[EUR]'")).clear();
		driver.findElement(By.cssSelector("input[name='prices[EUR]'")).sendKeys("22");
		driver.findElement(By.cssSelector("button[name=save")).click();
		Thread.sleep(1000);
		int count_new;
		List<WebElement> all_products_new = driver.findElements(By.cssSelector("table.dataTable tr"));
		count_new = all_products_new.size();
		assertTrue(count_new>count);
	}

}
