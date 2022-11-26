package windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSelenium2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.id("windowButton")).click();

		
		switchToRequiredWindow(driver, 2);
		
		

		/*
		 * for (String each : allHandles) { if (!each.equals(parentWindow)) {
		 * driver.switchTo().window(each); }
		 * 
		 * }
		 */
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.switchTo().window(parentWindow);
        driver.quit();
	}

	
	 public static void switchToRequiredWindow(WebDriver driver, int windowIndex)
	 {
		 Set<String> allHandles = driver.getWindowHandles();
		 int count=0;
			for (String each : allHandles)
			{
				
				if (count==windowIndex-1)
				{
					driver.switchTo().window(each);
				}
				count++;
			}
	 }
}
