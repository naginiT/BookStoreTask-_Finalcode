package Actions;
import Objects.ReturnCustomer;

import org.testng.annotations.Test;

import Actions.ReturnCustomerActions;
import Objects.WishlistInspectElements;

/* author Gopi Kuncham 
 * Verifying Wishlist Tab
 * Verifying Delete Button
 * Verifying Continue Button
 * Verifying Addtocart Button
*/
public class WishlistActions {
	@Test
	public static void wish() throws Exception{
		ReturnCustomerActions.exeec11();
		
		/*WishlistInspectElements.login().click();
		Thread.sleep(5000);
		
		WishlistInspectElements.email().sendKeys("gk030994@gmail.com");
		Thread.sleep(5000);
		WishlistInspectElements.pass().sendKeys("1234");
			 Thread.sleep(5000);
			 WishlistInspectElements.clickonlogin().click();*/
			 WishlistInspectElements.clickonwishlist().click();
			 WishlistInspectElements.delete().click();
			 WishlistInspectElements.cont().click();
			 Thread.sleep(5000);
			 WishlistInspectElements.clickonwishlist().click();
			 WishlistInspectElements.addtocart().click();
			 WishlistInspectElements.cont().click();
	}
}
