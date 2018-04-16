package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Change your password Tab
 * Verifying Back Button
 * Verifying Continue Button
*
*/
public class ChangePasswordInspectElements  extends BrowserCode{
		static WebElement element;
		static By login=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li[2]/a/span");
		static By email=By.name("email");
		static By pass=By.name("password");
		static By clickonlogin=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		static By change=By.xpath("//*[@id=\"content\"]/ul[1]/li[2]/a");
		static By password=By.xpath("//*[@id=\"input-password\"]");
		static By repassword=By.xpath("//*[@id=\"input-confirm\"]");
		static By cont=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
		static By back=By.xpath("//*[@id=\"content\"]/form/div/div[1]/a");
		public ChangePasswordInspectElements(WebDriver driver)
		{
			super();
		}

		
		public static WebElement login()
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
		}
		
		
		
		public static WebElement change()
		{
		element= driver.findElement(change);
		return element;
		}
		public static WebElement  password()
		{
		element=driver.findElement(password);
		return element;
		}
		public static WebElement repassword()
		{
		element=driver.findElement(repassword);
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
