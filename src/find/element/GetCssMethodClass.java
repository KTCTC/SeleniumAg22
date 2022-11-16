package find.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssMethodClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 WebElement textElement = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you connect and share with the')]"));
		 
		String fontSize = textElement.getCssValue("font-size");
		System.out.println(fontSize);
		String fontFamily = textElement.getCssValue("font-family");
		System.out.println(fontFamily);
		String color = textElement.getCssValue("color");
		System.out.println(color);		
		String bgcolor = textElement.getCssValue("background-color");
		System.out.println(bgcolor);
		

	}

}
