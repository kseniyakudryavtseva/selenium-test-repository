import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Windows extends TestBase {

	@Test
	public void test01() {
		driver.get("http://localhost/litecart/admin/");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Countries")).click();
		driver.findElement(By.cssSelector("a.button")).click();
		List <WebElement> all_links = driver.findElements(By.cssSelector("form a[target='_blank'"));
		for (int i = 0; i < all_links.size(); i++)
		{
			all_links.get(i).click();
			wait.until((WebDriver driver) -> driver.getWindowHandles().size() > 1);			
			Set<String> handlesSet = driver.getWindowHandles();
		    List<String> handlesList = new ArrayList<String>(handlesSet);
		    driver.switchTo().window(handlesList.get(1));
		    driver.close();
		    driver.switchTo().window(handlesList.get(0));
	        all_links = driver.findElements(By.cssSelector("form a[target='_blank'"));
		}
		
	}
}
