package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/radio.html");
		boolean fl = driver.findElement(By.xpath("//*[@value='Optwregqegqegrhion 2']")).isDisplayed();
		
		WebElement ch1 = driver.findElement(By.xpath("//*[@value='Optwregqegqegrhion 2']"));
		
		boolean disp = ch1.isDisplayed();
		System.out.println(disp);
		boolean ena = ch1.isEnabled();
		System.out.println(ena);
		boolean sel = ch1.isSelected();
		System.out.println(sel);
		


	}
	
	

}
