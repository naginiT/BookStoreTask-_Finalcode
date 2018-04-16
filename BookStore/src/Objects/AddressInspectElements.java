package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Modify your address book entries Tab
 * Verifying Back Button
 * Verifying Edit Button
 * Verifying Delete Button
 * Verifying Continue Button
 * Verifying NewAddress Button
*/
public class AddressInspectElements extends BrowserCode {
	static WebElement element;

	
	/*//sreturncoustmer.tatic By login=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li[2]/a/span");
	static By email=By.name("email");
	static By pass=By.name("password");*/
	//static By clickonlogin=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	static By address=By.xpath("//*[@id=\"content\"]/ul[1]/li[3]/a");
	static By edit=By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[2]/a[1]");
	static By delete=By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[2]/a[2]");
	static By newaddress=By.xpath("//*[@id=\"content\"]/div[2]/div[2]/a");////*[@id="content"]/div[2]/div[2]/a
	static By firstname=By.xpath("//*[@id=\"input-firstname\"]");
	static By lastname=By.xpath("//*[@id=\"input-lastname\"]");
	static By company=By.xpath("//*[@id=\"input-company\"]");
	static By address1=By.xpath("//*[@id=\"input-address-1\"]");
	static By address2=By.xpath("//*[@id=\"input-address-2\"]");
	static By city=By.xpath("//*[@id=\"input-city\"]");
	static By postcode=By.xpath("//*[@id=\"input-postcode\"]");
	static By country=By.xpath("//*[@id=\"input-country\"]");
	static By region=By.xpath("//*[@id=\"input-zone\"]");
	static By defaultaddressyes=By.xpath("//*[@id=\"content\"]/form/fieldset/div[10]/div/label[1]/input");
	static By defaultaddressno=By.xpath("//*[@id=\"content\"]/form/fieldset/div[10]/div/label[2]/input");
	static By cont=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
	static By back=By.xpath("//*[@id=\"content\"]/form/div/div[1]/a");
	static By back1=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/a");
	
	public AddressInspectElements(WebDriver driver)
	{
		super();
	}
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
	}*/
	/*public static WebElement clickonlogin()
	{
	element=driver.findElement(clickonlogin);
	return element;
	}*/
	public static WebElement address()
	{
	element= driver.findElement(address);
	return element;
	}
	public static WebElement  edit()
	{
	element=driver.findElement(edit);
	return element;
	}
	public static WebElement delete()
	{
	element=driver.findElement(delete);
	return element;
	}
	public static WebElement newaddress()
	{
	element=driver.findElement(newaddress);
	return element;
	}
	public static WebElement firstname()
	{
	element= driver.findElement(firstname);
	return element;
	}
	public static WebElement  lastname()
	{
	element=driver.findElement(lastname);
	return element;
	}
	
	public static WebElement company()
	{
	element=driver.findElement(company);
	return element;
	}
	public static WebElement address1()
	{
	element=driver.findElement(address1);
	return element;
	}
	public static WebElement address2()
	{
	element= driver.findElement(address2);
	return element;
	}
	public static WebElement  city()
	{
	element=driver.findElement(city);
	return element;
	}
	public static WebElement postcode()
	{
	element=driver.findElement(postcode);
	return element;
	}
	public static Select country()
	{
	Select s=new Select(element=driver.findElement(country));
    return s;
	}
	public static Select  region()
	{
		Select s=new Select(element=driver.findElement(region));
	    return s;
	}
	public static WebElement defaultaddressyes()
	{
	element= driver.findElement(defaultaddressyes);
	return element;
	}
	public static WebElement  defaultaddressno()
	{
	element=driver.findElement(defaultaddressno);
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
	public static WebElement back1()
	{
	element=driver.findElement(back1);
	return element;
	}
	
}
