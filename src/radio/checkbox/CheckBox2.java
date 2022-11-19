package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement ch1 = driver.findElement(By.xpath("//*[@value='checkbox1']"));
		
		boolean disp = ch1.isDisplayed();
		System.out.println(disp);
		boolean ena = ch1.isEnabled();
		System.out.println(ena);
		boolean sel = ch1.isSelected();
		System.out.println(sel);
		
		ch1.click();
		
		 disp = ch1.isDisplayed();
		System.out.println(disp);
		 ena = ch1.isEnabled();
		System.out.println(ena);
		 sel = ch1.isSelected();
		System.out.println(sel);


	}
	
	

}
