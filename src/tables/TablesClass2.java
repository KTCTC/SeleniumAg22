package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesClass2 {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		float cntPriceLtd = getCurrentSharePriceOfCompanyFromTable(driver, "Ltd");
		System.out.println(cntPriceLtd);
		float cntPriceBank = getCurrentSharePriceOfCompanyFromTable(driver, "Bank");
		System.out.println(cntPriceBank);
		
		
	}
	
	public static float getCurrentSharePriceOfCompanyFromTable(WebDriver driv, String cName)
	{
		String cntPrice = driv.findElement(By.xpath("//a[contains(text(),'"+cName+"')]/parent::td/following-sibling::td[3]")).getText();
		
		float p = Float.parseFloat(cntPrice);
		return p;
	}

}
