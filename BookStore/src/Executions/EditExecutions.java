package Executions;

import org.testng.annotations.Test;

import Actions.EditActions;
import Objects.BrowserCode;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Email Text Box
 * Verifying Password Text Box
 * Verifying Login Button
 * Verifying Edit Tab
 * Verifying Continue Button
*
*/
public class EditExecutions extends EditActions {
	@Test
	public void Signin() throws Exception
	{
	Thread.sleep(5000);
	BrowserCode.Browser();
	EditExecutions obj = new EditExecutions();
	obj.edit("C:\\Users\\cubic\\git\\BOOKSTORE_TASK12\\BookStore\\External Files\\Book1.xlsx","Sheet1");
	
	}
}
 