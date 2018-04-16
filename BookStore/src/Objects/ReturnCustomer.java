package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReturnCustomer extends BrowserCode{
	static By login=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li[2]/a/span");
	static By uname=By.xpath("//*[@id=\'input-email\']");
	static By pwd=By.xpath("//*[@id=\'input-password\']");
	static By click11=By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input");
	static WebElement ele;
	//public void AdminLoginPageObject(WebDriver driver) 0...00000000000000000000000000
	public ReturnCustomer(WebDriver driver)
	{
		super();
	}
	public static WebElement login()
	{
	ele= driver.findElement(login);
	return ele;
	}

		
	
	public static WebElement uid11()
	{
		ele=driver.findElement(uname);
		return ele;
	}
	public static WebElement password()
	{
		ele=driver.findElement(pwd);
		return ele;
	}
	public static WebElement login22()
	{
		ele=driver.findElement(click11);
		return ele;
		
	}
	

}
