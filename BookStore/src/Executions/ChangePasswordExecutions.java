package Executions;

import org.testng.annotations.Test;
import Actions.ChangePasswordActions;
import Objects.BrowserCode;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Change your password Tab
 * Verifying Back Button
 * Verifying Continue Button
*
*/
public class ChangePasswordExecutions  {
	@Test
	public void Signin() throws Exception
	{
	Thread.sleep(5000);
	BrowserCode.Browser();
	ChangePasswordActions.password("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx", "Sheet2");
	
	
	}
}



