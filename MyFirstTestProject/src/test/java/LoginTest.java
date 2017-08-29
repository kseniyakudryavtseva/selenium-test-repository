import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends TestBase{
	
	
	@Test
	public void Test(){
	    driver.get("http://localhost/litecart/admin/");
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("admin");
	    driver.findElement(By.name("login")).click();
	    List <WebElement> menu = driver.findElements(By.cssSelector("li#app-"));
	    for (int i = 0; i < menu.size() ; i++ )
        {
                menu.get(i).click();
                assertTrue(isElementPresent(By.cssSelector("td#content h1")));
                List <WebElement> submenu = driver.findElements(By.cssSelector("li.selected ul li"));
                for (int j = 0; j < submenu.size() ; j++ )
                {
                	submenu.get(j).click();
                	assertTrue(isElementPresent(By.cssSelector("td#content h1")));
                	submenu = driver.findElements(By.cssSelector("li.selected ul li"));
                }
                menu = driver.findElements(By.cssSelector("li#app-"));
        }
	    
	}
}
