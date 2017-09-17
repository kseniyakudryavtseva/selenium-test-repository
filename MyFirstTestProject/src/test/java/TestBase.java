import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public EventFiringWebDriver driver;
	public WebDriverWait wait;
	
	
	public boolean isElementPresent(By locator) {
		  try {
		    driver.findElement(locator);
		    return true;
		  } catch (NoSuchElementException ex) {
		    return false;
		  }
		}
	
	boolean areElementsPresent(By locator) {
		  return driver.findElements(locator).size() > 0;
		}
	
	public static class MyListener extends AbstractWebDriverEventListener {
	    @Override
	    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
	        System.out.println(by);
	    }

	    @Override
	    public void afterFindBy(By by, WebElement element, WebDriver driver) {
	        System.out.println(by +  " found");
	    }

	    @Override
	    public void onException(Throwable throwable, WebDriver driver) {
	        System.out.println(throwable);
	    }
	}
	
	@Before
	public void start() {
		driver = new EventFiringWebDriver(new ChromeDriver());
		driver.register(new MyListener());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
}
	
	
	@After
	public void stop() {
		driver.quit();
		driver=null;
	}
}