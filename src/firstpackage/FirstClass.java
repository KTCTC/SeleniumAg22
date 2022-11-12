package firstpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClass {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\edgedriver_win64 (2)\\msedgedriver.exe");

ChromeDriver chdriver = new ChromeDriver();

EdgeDriver eddriver = new EdgeDriver();

ChromeDriver ch2driver = new ChromeDriver();

chdriver.get("https://www.facebook.com/");

eddriver.get("https://demoqa.com/text-box");

chdriver.close();
eddriver.close();




	}

}
