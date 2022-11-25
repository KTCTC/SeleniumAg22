package property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		File f = new File(System.getProperty("user.dir")+"\\Env.properties");
		
		FileInputStream fis = new FileInputStream(f);		
		Properties propObj = new Properties();
        propObj.load(fis);       
       String url = propObj.getProperty("BaseURL");
       System.out.println(url);
       System.out.println(propObj.getProperty("UserName"));
       System.out.println(propObj.getProperty("Password"));

	}

}
