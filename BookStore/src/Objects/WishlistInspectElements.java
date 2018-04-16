package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/* author Gopi Kuncham 
 * Verifying Wishlist Tab
 * Verifying Delete Button
 * Verifying Continue Button
 * Verifying Addtocart Button
*/
public class WishlistInspectElements extends BrowserCode{
		static WebElement element;
		/*static By login=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li[2]/a/span");
		static By email=By.name("email");
		static By pass=By.name("password");
		static By clickonlogin=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");*/
		static By clickonwishlist=By.xpath("//*[@id=\"content\"]/ul[1]/li[4]/a");
		static By delete=By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/a");
		static By cont=By.xpath("//*[@id=\"content\"]/div[2]/div/a");
		static By addtocart=By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/button");
		public WishlistInspectElements(WebDriver driver)
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
		}
		public static WebElement clickonlogin()
		{
		element=driver.findElement(clickonlogin);
		return element;
		}*/
		public static WebElement clickonwishlist()
		{
		element=driver.findElement(clickonwishlist);
		return element;
		}
		
		public static WebElement delete()
		{
		element=driver.findElement(delete);
		return element;
		}
		public static WebElement cont()
		{
		element=driver.findElement(cont);
		return element;
		}
		public static WebElement addtocart()
		{
		element=driver.findElement(addtocart);
		return element;
		}
		
		
		
}
