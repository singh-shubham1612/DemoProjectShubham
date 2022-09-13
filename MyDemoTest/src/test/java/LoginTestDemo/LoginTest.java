package LoginTestDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public interface LoginTest {


	@SuppressWarnings("deprecation")
	public static void main(String arg[]) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();

	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();
	    driver.close();
		
	}

}
