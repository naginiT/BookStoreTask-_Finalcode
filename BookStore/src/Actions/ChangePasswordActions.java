package Actions;

import java.awt.Robot;
import Objects.ReturnCustomer;
import Values.BrowserCodeValues;
import Actions.ReturnCustomerActions;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.ChangePasswordInspectElements;
import Objects.EditInspectElements;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Change your password Tab
 * Verifying Back Button
 * Verifying Continue Button
*
*/
public class ChangePasswordActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFSheet sheet1;
	static XSSFCell cell;
	static String s=null;
	static String s1=null;
	static String s2=null;
	//static String s3=null;
	public  static void password(String path, String value) throws Exception{
		ReturnCustomerActions.exeec11();
	
		/*ChangePasswordInspectElements.login().click();
		Thread.sleep(5000);
		
		ChangePasswordInspectElements.email().sendKeys("gk030994@gmail.com");
		     Thread.sleep(5000);
		     ChangePasswordInspectElements.pass().sendKeys("1234");
			 Thread.sleep(5000);
			 ChangePasswordInspectElements.clickonlogin().click();
		     Thread.sleep(5000);*/
		     ChangePasswordInspectElements.change().click();
		     ChangePasswordInspectElements.back().click();
		     ChangePasswordInspectElements.change().click();
		     
		     File f1=new File(path);
		 	FileInputStream fis=new FileInputStream(f1);
		 	workbook =new XSSFWorkbook(fis);
		 	sheet = workbook.getSheet(value);
		 	System.out.println("sheet.getLastRowNum()"+sheet.getLastRowNum());
			for(int j=1; j<=sheet.getLastRowNum(); j++) {
				
				ChangePasswordInspectElements.password().clear();
				 cell =sheet.getRow(j).getCell(1); 
				 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
				    	long k =(long)cell.getNumericCellValue();
				    		String g=String.valueOf(k);
				    	            System.out.println(g);
				    	            Thread.sleep(5000);
				    	            ChangePasswordInspectElements.password().sendKeys(g);
				   			   }
				       else {
				    	   ChangePasswordInspectElements.password().sendKeys(cell.getStringCellValue());
				         }
				 ChangePasswordInspectElements.repassword().clear();
				 cell =sheet.getRow(j).getCell(2); 
				 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
				    	long k =(long)cell.getNumericCellValue();
				    		String g=String.valueOf(k);
				    	            System.out.println(g);
				    	            Thread.sleep(5000);
				    	            ChangePasswordInspectElements.repassword().sendKeys(g);
				   			   }
				       else {
				    	   ChangePasswordInspectElements.repassword().sendKeys(cell.getStringCellValue());
				         }
	
			 EditInspectElements.cont().click();
			 
			  try {	
				  s=EditInspectElements.cont().getAttribute("value");
             System.out.println("text is " +s);
             if(s.equalsIgnoreCase(BrowserCodeValues.s1)){
             	Thread.sleep(5000);
             	System.out.println("validate");
             sheet.getRow(j).createCell(3).setCellValue("pass");
             FileOutputStream fos= new FileOutputStream(f1);
             workbook.write(fos);
             }
             }
            		 catch(Exception e){
            			 s2=ChangePasswordInspectElements.change().getText();
                         System.out.println("text is " +s2);
                          
     					System.out.println(s +s1);
     					if(s2.equalsIgnoreCase(BrowserCodeValues.s3)){
     						
     						sheet.getRow(j).createCell(3).setCellValue("pass");
     		                FileOutputStream fos= new FileOutputStream(f1);
     		                workbook.write(fos);
     						
     					}
     					else {
     					 sheet.getRow(j).createCell(3).setCellValue("fail");
     		                System.out.println("invalidate");
     		                FileOutputStream fos= new FileOutputStream(f1);
     		                workbook.write(fos);
     					System.out.println(e);
     				}
             }
			}	

	}
}
