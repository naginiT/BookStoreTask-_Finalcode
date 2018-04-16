package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Email Text Box
 * Verifying Password Text Box
 * Verifying Login Button
 * Verifying Edit Tab
 * Verifying Continue Button
*
*/
public class EditInspectElements extends BrowserCode {
	static WebElement element;
	/*static By login=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li[2]/a/span");
	static By email=By.name("email");
	static By pass=By.name("password");
	static By clickonlogin=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");*/
	static By edit=By.xpath("//*[@id=\"content\"]/ul[1]/li[1]/a");
	static By firstname=By.xpath("//*[@id=\"input-firstname\"]");
	static By lastname=By.xpath("//*[@id=\"input-lastname\"]");
	static By emailid=By.xpath("//*[@id=\"input-email\"]");
	static By mobile=By.xpath("//*[@id=\"input-telephone\"]");
	static By fax=By.name("fax");
	static By cont=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
	static By back=By.xpath("//*[@id=\"content\"]/form/div/div[1]/a");
	public EditInspectElements(WebDriver driver)
	{
		super();
	}
	//*[@id="content"]/form/div/div[2]/input
	
	/*public static WebElement login()
	{
	element= driver.findElement(login);
	return element;
	}
	public static WebElement  email()
	{
	element=driver.findElement(email);
	return element;
	}
	public static WebElement pass()
	{
	element=driver.findElement(pass);
	return element;
	}
	public static WebElement clickonlogin()
	{
	element=driver.findElement(clickonlogin);
	return element;
	}*/
	
	public static WebElement edit()
	{
	element= driver.findElement(edit);
	return element;
	}
	
	
	
	public static WebElement  firstname()
	{
	element=driver.findElement(firstname);
	return element;
	}
	public static WebElement lastname()
	{
	element=driver.findElement(lastname);
	return element;
	}
	public static WebElement emailid()
	{
	element=driver.findElement(emailid);
	return element;
	}
	public static WebElement mobile()
	{
	element= driver.findElement(mobile);
	return element;
	}
	public static WebElement  fax()
	{
	element=driver.findElement(fax);
	return element;
	}
	public static WebElement cont()
	{
	element=driver.findElement(cont);
	return element;
	}
	public static WebElement back()
	{
	element=driver.findElement(back);
	return element;
	}
	
	
	
	
	
	
}
