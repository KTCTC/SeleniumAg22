package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClass2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");	

		ChromeDriver chdriver = new ChromeDriver();
		
		chdriver.get("https://www.facebook.com/");
		
		
		
		chdriver.findElement(By.id("email")).sendKeys("Second");
		
		/*
		 * By passLocator = By.name("pass");
		 * 
		 * WebElement passTextBox = chdriver.findElement(passLocator);
		 * 	passTextBox.sendKeys("Welcome@456");
		 */
		
		chdriver.findElement(By.name("pass")).sendKeys("ABDC");
		
	
		/*
		 * By loginLocator = By.name("login");
		 * 
		 * WebElement loginButton = chdriver.findElement(loginLocator);
		 * loginButton.click();
		 */
		
		
		chdriver.findElement(By.name("login")).click();

	}

}
