import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SortCountries extends TestBase {
	@Test
	public void test1() throws InterruptedException {
	ArrayList<String> country_list = new ArrayList<String>();
	ArrayList<String> new_country_list = new ArrayList<String>();
	ArrayList<String> zone_list = new ArrayList<String>();
	ArrayList<String> new_zone_list = new ArrayList<String>();
	driver.get("http://localhost/litecart/admin/");
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.linkText("Countries")).click();
	List<WebElement> allCountries = driver.findElements(By.xpath("//tr[contains(@class, 'row')]/td[5]"));
	List<WebElement> allZones = driver.findElements(By.xpath("//tr[contains(@class, 'row')]/td[6]"));
	List<WebElement> editButtons = driver.findElements(By.xpath("//tr[contains(@class, 'row')]/td[7]"));
	for (int i=0; i<allZones.size(); i++)
	{
		country_list.add(allCountries.get(i).getText());
		new_country_list.add(allCountries.get(i).getText());
		int col = Integer.parseInt(allZones.get(i).getText());
		if (col > 0) 
			{
			editButtons.get(i).click();
			List<WebElement> allZonesNames = driver.findElements(By.xpath("//table[@id='table-zones']//tr/td[3]"));
			for (int j=0; j<allZonesNames.size()-1; j++)
			{
				zone_list.add(allZonesNames.get(j).getText());
				new_zone_list.add(allZonesNames.get(j).getText());
			}
			Collections.sort(new_zone_list);
			for (int k=0;k<zone_list.size();k++)
			{
				assertTrue(zone_list.get(k).equals(new_zone_list.get(k)));
			}
			driver.navigate().back();
			allZones = driver.findElements(By.xpath("//tr[contains(@class, 'row')]/td[6]"));
			allCountries = driver.findElements(By.xpath("//tr[contains(@class, 'row')]/td[5]"));
			editButtons = driver.findElements(By.xpath("//tr[contains(@class, 'row')]/td[7]"));
			zone_list = new ArrayList<String>();
			new_zone_list = new ArrayList<String>();
	    }	
	}
	Collections.sort(new_country_list);
	for (int i=0;i<country_list.size();i++)
	{
		assertTrue(country_list.get(i).equals(new_country_list.get(i)));
	}
	}
	
	@Test
	public void test2() throws InterruptedException {
	ArrayList<String> country_list = new ArrayList<String>();
	ArrayList<String> new_country_list = new ArrayList<String>();
	driver.get("http://localhost/litecart/admin/");
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.linkText("Geo Zones")).click();
	List<WebElement> allButtons = driver.findElements(By.xpath("//tr[contains(@class, 'row')]/td[5]"));
	for (int i=0; i<allButtons.size(); i++)
	{
		allButtons.get(i).click();
		List<WebElement> allCountries = driver.findElements(By.cssSelector("#table-zones tr:not(:last-child)  td:nth-child(3)  option[selected=selected]"));
		for (int j=0;j<allCountries.size();j++)
		{
			country_list.add(allCountries.get(j).getText());
			new_country_list.add(allCountries.get(j).getText());
		}
		Collections.sort(new_country_list);
		for (int k=0;k<country_list.size();k++)
		{
			assertTrue(country_list.get(k).equals(new_country_list.get(k)));
		}
		driver.navigate().back();
		allButtons = driver.findElements(By.xpath("//tr[contains(@class, 'row')]/td[5]"));
		country_list = new ArrayList<String>();
		new_country_list = new ArrayList<String>();
	}
	}
}