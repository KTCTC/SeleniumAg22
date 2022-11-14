package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClass5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");	

		ChromeDriver chdriver = new ChromeDriver();
		
		chdriver.get("https://www.facebook.com/");
		
		By passLoc = By.xpath("//form/div[1]/div[2]/div/input");
		
		WebElement passElement = chdriver.findElement(passLoc);
		
		passElement.sendKeys("Password@123");
		
		chdriver.findElement(By.xpath("//form/div[1]/div[2]/div/input")).sendKeys("Second time");
		
		

	}

}
