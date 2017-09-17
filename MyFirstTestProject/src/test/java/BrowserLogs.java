import static org.junit.Assert.*;

import java.util.List;

import org.apache.http.impl.io.SocketOutputBuffer;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BrowserLogs extends TestBase {

	@Test
	public void getBrowserLogs() {
		
		driver.get("http://localhost/litecart/admin/");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.cssSelector("ul#box-apps-menu li:nth-child(2)")).click();
		List<WebElement> all_rows = driver.findElements(By.cssSelector("tr.row td:nth-child(5)"));
		for (int i=2; i<all_rows.size();i++)
		{
			all_rows.get(i).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p img")));
			System.out.println(driver.manage().logs().get("browser").getAll());
			assertTrue(driver.manage().logs().get("browser").getAll().isEmpty());
			driver.navigate().back();
			all_rows = driver.findElements(By.cssSelector("tr.row td:nth-child(5)"));
		}		
	}
}
