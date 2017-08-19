package myTestProject;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class testClass {

	  private WebDriver driver;
	  private WebDriverWait wait;
	  
	  @Before
	  public void setUp() throws Exception {
		  driver = new ChromeDriver();
		  wait = new WebDriverWait(driver, 10);
	  }
	  

	  @Test
	  public void test1() throws Exception {
	    driver.get("https://yandex.ru/");
	  }

	  @After
	  public void stop() {
		driver.quit();
		driver=null;
	  }
	  	
}
