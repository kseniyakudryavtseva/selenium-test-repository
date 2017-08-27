import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

public class Sticker extends TestBase {


		@Test
		public void test() {
			driver.get("http://localhost/litecart/en/");
			assertTrue(isOneElementPresent(By.cssSelector("div#box-most-popular li:first-child [class^=sticker]")));
			assertTrue(isOneElementPresent(By.cssSelector("div#box-most-popular li:nth-child(2) [class^=sticker]")));
			assertTrue(isOneElementPresent(By.cssSelector("div#box-most-popular li:nth-child(3) [class^=sticker]")));
			assertTrue(isOneElementPresent(By.cssSelector("div#box-most-popular li:nth-child(4) [class^=sticker]")));
			assertTrue(isOneElementPresent(By.cssSelector("div#box-most-popular li:last-child [class^=sticker]")));
			assertTrue(isOneElementPresent(By.cssSelector("div#box-campaigns li:first-child [class^=sticker]")));
			assertTrue(isOneElementPresent(By.cssSelector("div#box-latest-products li:first-child [class^=sticker]")));
			assertTrue(isOneElementPresent(By.cssSelector("div#box-latest-products li:nth-child(2) [class^=sticker]")));
			assertTrue(isOneElementPresent(By.cssSelector("div#box-latest-products li:nth-child(3) [class^=sticker]")));
			assertTrue(isOneElementPresent(By.cssSelector("div#box-latest-products li:nth-child(4) [class^=sticker]")));
			assertTrue(isOneElementPresent(By.cssSelector("div#box-latest-products li:last-child [class^=sticker]")));
			
		}
}
