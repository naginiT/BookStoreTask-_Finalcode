package Actions;


import org.openqa.selenium.Keys;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Actions.ReturnCustomerActions;
import Objects.EditInspectElements;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Email Text Box
 * Verifying Password Text Box
 * Verifying Login Button
 * Verifying Edit Tab
 * Verifying Continue Button
*
*/
public class EditActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	String s=null;
	String s1=null;
	String er=null;
	String ar=null;
	
	public void edit(String path, String value) throws Exception{
		ReturnCustomerActions.exeec11();
	
		/*EditInspectElements.login().click();
		Thread.sleep(5000);
		
			 EditInspectElements.email().sendKeys("gk030994@gmail.com");
		Thread.sleep(5000);
			 EditInspectElements.pass().sendKeys("1234");
			 Thread.sleep(5000);
		    EditInspectElements.clickonlogin().click();
		     Thread.sleep(5000);*/
		     EditInspectElements.edit().click();
		     EditInspectElements.back().click(); //clicking on back button
		    // EditInspectElements.edit().click();
		     
		     File f1=new File(path);
		 	FileInputStream fis=new FileInputStream(f1);
		 	workbook =new XSSFWorkbook(fis);
		 	sheet = workbook.getSheet(value);
		 	
		 	System.out.println("sheet.getLastRowNum()"+sheet.getLastRowNum());
			for(int j=1; j<=3; j++) {
				 EditInspectElements.edit().click();
				 EditInspectElements.firstname().clear();
				 EditInspectElements.lastname().clear();
				 EditInspectElements.emailid().clear();
				 EditInspectElements.mobile().clear();
				EditInspectElements.fax().clear();
				  EditInspectElements.cont().click();		//clicking on continue button
				  
				 cell =sheet.getRow(j).getCell(1);
				 EditInspectElements.firstname().sendKeys(cell.getStringCellValue());
					 cell =sheet.getRow(j).getCell(2);
					 EditInspectElements.lastname().sendKeys(cell.getStringCellValue());
						 cell =sheet.getRow(j).getCell(3);
						 EditInspectElements.emailid().sendKeys(cell.getStringCellValue());
							cell =sheet.getRow(j).getCell(4);
							 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
						    	long k =(long)cell.getNumericCellValue();
						    		String g=String.valueOf(k);
						    	            System.out.println(g);
						    	            Thread.sleep(5000);
						    	            EditInspectElements.mobile().sendKeys(g);
						   			   }
						       else {
							                EditInspectElements.mobile().sendKeys(cell.getStringCellValue());
						         }
							
				 cell =sheet.getRow(j).getCell(5);
				 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
				    	long k =(long)cell.getNumericCellValue();
				    		String g=String.valueOf(k);
				    	            System.out.println(g);
				    	            Thread.sleep(5000);
				    	            EditInspectElements.fax().sendKeys(g);
				   			   }
				       else {
					                EditInspectElements.fax().sendKeys(cell.getStringCellValue());
				         }
				  EditInspectElements.cont().click();		//clicking on continue button
				 //Writing Status on Excel
				
					 
				  try {
				  s=EditInspectElements.cont().getAttribute("value");
				
	                System.out.println("text is " +s);
	                 s1="Continue"; 
	                if(s.equalsIgnoreCase(s1)){
	                	Thread.sleep(5000);
	                	System.out.println("validate");
	                sheet.getRow(j).createCell(6).setCellValue("pass");
	                FileOutputStream fos= new FileOutputStream(f1);
	                workbook.write(fos);
	                System.out.println("for git");
	                }
	             
	                EditInspectElements.back().click(); //clicking on back button  
	               
				  }
				  
				catch(Exception e){
					System.out.println(s +s1);
					if(s!=s1 && er.equalsIgnoreCase(ar)){
						
						System.out.println("2 if");
						sheet.getRow(j).createCell(6).setCellValue("pass");
		                FileOutputStream fos= new FileOutputStream(f1);
		                workbook.write(fos);
						
					}
					else {
					 sheet.getRow(j).createCell(6).setCellValue("fail");
		                System.out.println("invalidate");
		                FileOutputStream fos= new FileOutputStream(f1);
		                workbook.write(fos);
					System.out.println(e);
				}
				}
			
}
}
}

