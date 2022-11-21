package waits;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/radio-button");
		
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		
		
		WebDriverWait wt = new WebDriverWait(driver, 10);
		/*
		 * WebElement noRadio = driver.findElement(By.xpath("//label[@for='noRadio']"));
		 * ExpectedCondition<WebElement> in =
		 * ExpectedConditions.elementToBeClickable(noRadio); wt.until(in);
		 */		
	//	wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[@for='noRadio']"))));
		
	//	wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("sfgfg")));
	//	wt.until(ExpectedConditions.elementToBeSelected(By.id("noRadio")));
	//	wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//label[@for='noRadio']"))));
		wt.until(ExpectedConditions.alertIsPresent());
		
		System.out.println("wait is over");
		driver.findElement(By.xpath("//label[@for='noRadio']")).click();
		
		
		

	}

}
