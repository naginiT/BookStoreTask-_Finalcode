package Executions;

import org.testng.annotations.Test;


import Actions.WishlistActions;
import Objects.BrowserCode;
/* author Gopi Kuncham 
 * Verifying Wishlist Tab
 * Verifying Delete Button
 * Verifying Continue Button
 * Verifying Addtocart Button
*/
public class WishlistExecutions {
	@Test
	public void indexEx() throws Exception {
		/*Thread.sleep(5000);
		BrowserCode.Browser();
*/		WishlistActions.wish();
}
}