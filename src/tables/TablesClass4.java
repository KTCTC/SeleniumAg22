package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesClass4 {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr"));
		
		for (WebElement each:rows)
		{
			String names = each.findElement(By.xpath("td/a")).getText();
			String currentPrice = each.findElement(By.xpath("td[4]")).getText();
			System.out.println(names+" = "+currentPrice);
		}
		
		
		//String msg = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr")).findElement(By.xpath("td/a")).getText();
		//System.out.println(msg);
		
	}
	


}
