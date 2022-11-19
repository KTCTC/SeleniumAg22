package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.xpath("//*[@value='checkbox1']")).click();
		driver.findElement(By.xpath("//*[@value='checkbox2']")).click();
		driver.findElement(By.xpath("//*[@value='checkbox2']")).click();
		driver.findElement(By.xpath("//*[@value='checkbox3']")).click();
		
		checkOrUncheckCheckBox(driver, By.xpath("//*[@value='checkbox2']"), true);


	}
	
	
	public static void checkOrUncheckCheckBox(WebDriver driver, By loc, boolean checkUncheckFlag)
	{
		
		
		
	}

}
