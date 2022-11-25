package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import property.PropertyHelper;

public class ActionsClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyHelper ph = new PropertyHelper("Env.properties");
		driver.navigate().to(ph.getKeyValueFromProerty("BaseURL") + "buttons");		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Book Store Application')]"))).perform();
		act.click(driver.findElement(By.xpath("//*[contains(text(),'Interactions')]"))).perform();
		System.out.println("after click");

	}

}
