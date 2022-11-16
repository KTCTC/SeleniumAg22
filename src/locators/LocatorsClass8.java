package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsClass8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\edgedriver_win64 (2)\\msedgedriver.exe");

		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();

		driver.get("https://demoqa.com/webtables");
		
		String firstName = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]/preceding-sibling::div[3]")).getText();
		System.out.println(firstName);
		String lastName = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]/preceding-sibling::div[2]")).getText();
		System.out.println(lastName);
		String age = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]/preceding-sibling::div[1]")).getText();
		System.out.println(age);
		String email = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]")).getText();
		System.out.println(email);
		String salary = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]/following-sibling::div[1]")).getText();
		System.out.println(salary);
		String department = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]/following-sibling::div[2]")).getText();
		System.out.println(department);
		
		
 

	}
	
	
	

}
