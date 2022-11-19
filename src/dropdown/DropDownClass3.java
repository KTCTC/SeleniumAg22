package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass3 {

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
		sel.selectByVisibleText("Orange");
		
		List<WebElement> allOps = sel.getOptions();
		System.out.println(allOps.size());
		for(WebElement each: allOps)
		{
			System.out.println(each.getText());
		}
		
		List<WebElement> selOps = sel.getAllSelectedOptions();
		
		for(WebElement each:selOps)
		{
			System.out.println(each.getText());
		}
		
		
		WebElement firstOp = sel.getFirstSelectedOption();
		
		String op1 = firstOp.getText();
		System.out.println(op1);
		
		sel.deselectAll();
		

	}

}
