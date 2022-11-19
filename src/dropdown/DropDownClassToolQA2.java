package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClassToolQA2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		
		//WebElement dd = driver.findElement(By.id("withOptGroup"));
		
		//dd.click();
		driver.findElement(By.xpath("//*[@id='withOptGroup']//input")).sendKeys("Another root option");
		
		driver.findElement(By.xpath("//*[@id='withOptGroup']//input")).sendKeys(Keys.ENTER);
		
		

	}

}
