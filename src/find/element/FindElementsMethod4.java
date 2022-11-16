package find.element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementsMethod4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		
		List<WebElement> data = driver.findElements(By.xpath("aswfWEFEWQCQEVTRQE"));
		
		
		WebElement element = driver.findElement(By.xpath("//form//div//input"));
		element.sendKeys("ABCGFTFDR");
		
	}

}
