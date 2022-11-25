package navigation.method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import property.PropertyHelper;

public class NavigationClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyHelper ph = new PropertyHelper("Env.properties");
		// driver.get(ph.getKeyValueFromProerty("BaseURL")+"text-box");
		// Navigation nv = driver.navigate();
		// nv.to("https://demoqa.com/text-box");
		driver.navigate().to(ph.getKeyValueFromProerty("BaseURL") + "text-box");
		driver.findElement(By.xpath("//*[contains(text(),'Check Box')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Radio Button')]")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
