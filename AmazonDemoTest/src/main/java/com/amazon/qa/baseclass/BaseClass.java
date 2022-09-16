package com.amazon.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.qa.utilpacakage.Util;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() throws IOException
	{
		try {
			prop = new Properties();
			FileInputStream fp= new FileInputStream("C:\\Users\\Singh_Shub\\eclipse-workspace\\AmazonDemoTest\\src\\main\\java\\com\\amazon"
					+ "\\qa\\config\\Config.properties");
			prop.load(fp);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void initilization() {
		String BrowserName= prop.getProperty("browser");
		if(BrowserName.equals("chrome"))
		{
			//Object WebDriverManager;
			System.setProperty("webdrievr.chrome.driver", "C:/Users/Singh_Shub/Desktop/SeleniumProject/ChromeDriver");
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Util.page_load_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.implicit_time, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
				
	}

}
