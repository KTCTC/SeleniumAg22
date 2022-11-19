package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://output.jsbin.com/osebed/2");
		
		Select sel = new Select(driver.findElement(By.id("fruits")));
		
		boolean flag = sel.isMultiple();
		System.out.println(flag);
		
		sel.selectByValue("apple");
		sel.selectByVisibleText("Grape");
		sel.selectByVisibleText("Banana");
		
		sel.deselectByValue("banana");
		sel.deselectByVisibleText("Apple");
		
		sel.deselectAll();
		

	}

}
