package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import property.PropertyHelper;

public class ActionsClass4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("https://demoqa.com/text-box");	
		Actions act = new Actions(driver);		
		
		act.click(driver.findElement(By.id("userName"))).keyDown(Keys.SHIFT).sendKeys("welcome").keyUp(Keys.SHIFT).perform();
		boolean dis = isElementDisplayed(driver, driver.findElement(By.xpath("zdvfadgafdg")));
		

	}
	
	public static  boolean isElementDisplayed(WebDriver driver, WebElement el)
	{
		boolean flag = el.isDisplayed();
		return flag;
	}

}
