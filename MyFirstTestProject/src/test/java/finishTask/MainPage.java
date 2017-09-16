package finishTask;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page{
	
	
    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
    	driver.get("http://localhost/litecart/en/");
    }
	
	@FindBy (css = "#box-most-popular li:first-child")
	public WebElement firstProduct;
	
}
