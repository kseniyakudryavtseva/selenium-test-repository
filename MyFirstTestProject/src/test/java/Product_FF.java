
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Product_FF  {

	private WebDriver driver;
	ArrayList<String> price1_color_list = new ArrayList<String>();
	ArrayList<String> ac_price1_color_list = new ArrayList<String>();
	ArrayList<String> price2_color_list = new ArrayList<String>();
	ArrayList<String> ac_price2_color_list = new ArrayList<String>();
	
	@Before
	public void start() {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.get("http://localhost/litecart/en/");
		String name1 = driver.findElement(By.cssSelector("div#box-campaigns li:first-child div.name")).getText();
		String price1 = driver.findElement(By.cssSelector("div#box-campaigns li:first-child s.regular-price")).getText();
		String ac_price1 = driver.findElement(By.cssSelector("div#box-campaigns li:first-child strong.campaign-price")).getText();;
		//обычная цена зачёркнутая
		String price1_style = driver.findElement(By.cssSelector("div#box-campaigns li:first-child s.regular-price")).getTagName();
		assertTrue(price1_style.equals("s"));
		//обычная цена серая
		String price1_color = driver.findElement(By.cssSelector("div#box-campaigns li:first-child s.regular-price")).getCssValue("color");
		StringTokenizer st1 = new StringTokenizer(price1_color, " ,()");
		while(st1.hasMoreTokens()){
			price1_color_list.add(st1.nextToken());
			}
		String price1_color_r = price1_color_list.get(1);
		String price1_color_g = price1_color_list.get(2); 
		String price1_color_b = price1_color_list.get(3); 
		assertTrue(price1_color_r.equals(price1_color_g));
		assertTrue(price1_color_g.equals(price1_color_b));
		//акционная цена жирная
		String ac_price1_style = driver.findElement(By.cssSelector("div#box-campaigns li:first-child strong.campaign-price")).getTagName();
		assertTrue(ac_price1_style.equals("strong"));
		//акционная цена красная
		String ac_price1_color = driver.findElement(By.cssSelector("div#box-campaigns li:first-child strong.campaign-price")).getCssValue("color");
		StringTokenizer st2 = new StringTokenizer(ac_price1_color, " ,()");
		while(st2.hasMoreTokens()){
			ac_price1_color_list.add(st2.nextToken());
			}
		String ac_price1_color_g = ac_price1_color_list.get(2); 
		String ac_price1_color_b = ac_price1_color_list.get(3); 
		assertTrue(ac_price1_color_g.equals("0"));
		assertTrue(ac_price1_color_b.equals("0"));		
		//акционная цена крупнее, чем обычная
		int price1_Height = Integer.parseInt(driver.findElement(By.cssSelector("div#box-campaigns li:first-child s.regular-price")).getAttribute("offsetHeight"));
		int ac_price1_Height = Integer.parseInt(driver.findElement(By.cssSelector("div#box-campaigns li:first-child strong.campaign-price")).getAttribute("offsetHeight"));
		assertTrue(price1_Height<ac_price1_Height);
		//переходим на страницу товара
		driver.findElement(By.cssSelector("div#box-campaigns li:first-child img")).click();
		String name2 = driver.findElement(By.cssSelector("h1")).getText();
		String price2 = driver.findElement(By.cssSelector("div.information s.regular-price")).getText();
		String ac_price2  = driver.findElement(By.cssSelector("div.information strong.campaign-price")).getText();				
		//обычная цена зачёркнутая
		String price2_style = driver.findElement(By.cssSelector("div.information s.regular-price")).getTagName();
		assertTrue(price2_style.equals("s"));
		//обычная цена серая
		String price2_color = driver.findElement(By.cssSelector("div.information s.regular-price")).getCssValue("color");
		StringTokenizer st3 = new StringTokenizer(price2_color, " ,()");
		while(st3.hasMoreTokens()){
			price2_color_list.add(st3.nextToken());
			}
		String price2_color_r = price2_color_list.get(1);
		String price2_color_g = price2_color_list.get(2); 
		String price2_color_b = price2_color_list.get(3); 
		assertTrue(price2_color_r.equals(price2_color_g));
		assertTrue(price2_color_g.equals(price2_color_b));
		//акционная цена жирная
		String ac_price2_style = driver.findElement(By.cssSelector("div.information strong.campaign-price")).getTagName();
		assertTrue(ac_price2_style.equals("strong"));
		//акционная цена красная
		String ac_price2_color= driver.findElement(By.cssSelector("div.information strong.campaign-price")).getCssValue("color");
		StringTokenizer st4 = new StringTokenizer(ac_price2_color, " ,()");
		while(st4.hasMoreTokens()){
			ac_price2_color_list.add(st4.nextToken());
			}
		String ac_price2_color_g = ac_price2_color_list.get(2); 
		String ac_price2_color_b = ac_price2_color_list.get(3); 
		assertTrue(ac_price2_color_g.equals("0"));
		assertTrue(ac_price2_color_b.equals("0"));
		//акционная цена крупнее, чем обычная
		int price2_Height = Integer.parseInt(driver.findElement(By.cssSelector("div.information s.regular-price")).getAttribute("offsetHeight"));
		int ac_price2_Height = Integer.parseInt(driver.findElement(By.cssSelector("div.information strong.campaign-price")).getAttribute("offsetHeight"));
		assertTrue(price2_Height<ac_price2_Height);
		//на главной странице и на странице товара совпадает текст названия товара
		assertTrue(name1.equals(name2));
		//на главной странице и на странице товара совпадают обычные цены
		assertTrue(price1.equals(price2));
		//на главной странице и на странице товара совпадают акционные цены 
		assertTrue(ac_price1.equals(ac_price2));
	}
	
	@After
	public void stop() {
		driver.quit();
		driver=null;
	}
}