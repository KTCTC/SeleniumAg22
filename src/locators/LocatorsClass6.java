package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClass6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeDriver chdriver = new ChromeDriver();

		chdriver.get("https://www.facebook.com/");

		chdriver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("PQ");
		// try not to use below findElementByXPath method or similar findElementById, findElementByName etc
		chdriver.findElementByXPath("//input[@placeholder='Email address or phone number']").sendKeys("AB");

	}
	
	
	

}
