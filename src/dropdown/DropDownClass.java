package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		
		Select sel = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		sel.selectByVisibleText("Green");
		sel.selectByValue("6");
		sel.selectByIndex(1);
		
		sel.deselectByVisibleText("Blue");
		

	}

}
