import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@Before
	public void start() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
	}
	
	@Test
	public void Test() {
	driver.get("https://yandex.ru");

}
	@After
	public void stop() {
		driver.quit();
		driver=null;
	}
}
