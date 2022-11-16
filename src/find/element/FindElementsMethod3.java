package find.element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementsMethod3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		List<WebElement> elements = driver.findElements(By.xpath("//form//div//input"));
		
		elements.get(0).sendKeys("ABC");
		elements.get(1).sendKeys("PQRS");
	}

}
