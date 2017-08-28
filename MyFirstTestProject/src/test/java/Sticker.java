import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sticker extends TestBase {


		@Test
		public void test() {
			driver.get("http://localhost/litecart/en/");
			List<WebElement> allProducts = driver.findElements(By.cssSelector("li.product"));
			for (WebElement product : allProducts) { 
				List <WebElement> stickers = product.findElements(By.cssSelector("div.sticker"));
				assertTrue(stickers.size()==1);
			}
		}
}
