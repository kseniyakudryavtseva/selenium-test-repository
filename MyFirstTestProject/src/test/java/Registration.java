import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration extends TestBase {

	@Test
	public void test1() throws InterruptedException {
		String email;
		String mCHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		int STR_LENGTH = 7;
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < STR_LENGTH; i++) {
		int number = random.nextInt(mCHAR.length());
		char ch = mCHAR.charAt(number);
		builder.append(ch);
		}
		email = builder.toString();
		driver.get("http://localhost/litecart/en/");
		driver.findElement(By.linkText("New customers click here")).click();
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("firstNameTest");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("lastNameTest");
		driver.findElement(By.name("address1")).clear();
		driver.findElement(By.name("address1")).sendKeys("address1Test");
		driver.findElement(By.name("postcode")).clear();
		driver.findElement(By.name("postcode")).sendKeys("12345");
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("cityTest");
		WebElement country = driver.findElement(By.cssSelector("select[name=country_code]"));
		Select select = new Select(country); 
		select.selectByVisibleText("United States");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(email+"@mail.ru");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys(Keys.HOME + "9151112233");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmed_password")).clear();
		driver.findElement(By.name("confirmed_password")).sendKeys("123456");
		driver.findElement(By.name("create_account")).click();
		System.out.println(email);
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(email+"@mail.ru");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[name=login]")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
