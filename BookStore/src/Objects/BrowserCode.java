package Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Values.BrowserCodeValues;
public class BrowserCode {
	public static  WebDriver driver;
	public static void Browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\gopikuncham\\Jarfiles\\chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("Start-Maximized");
		  driver= new ChromeDriver(co);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(BrowserCodeValues.URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	

}
