package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DatePickerClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/date-picker");

		WebElement datePick = driver.findElement(By.id("datePickerMonthYearInput"));
		
		//datePick.clear();
		datePick.click();
		for(int i=1;i<=10;i++)
		{
			datePick.sendKeys(Keys.BACK_SPACE);
		}
		
		datePick.sendKeys("03/25/2015");
		datePick.sendKeys(Keys.ENTER);
		
	}

}
