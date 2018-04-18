package Actions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.AddressInspectElements;
import Objects.BrowserCode;
import Objects.ReturnCustomer;
public class ReturnCustomerActions  {
	

	    
	    static XSSFWorkbook work;
		static XSSFSheet sheet;
		static XSSFCell cell;
		 static int i;
		public static void exeec11() throws Exception
		{
			//ReturnCustomer.login().click();
			Thread.sleep(5000);
		File f1= new File("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Bookstore11.xlsx");
		FileInputStream fis1 = new FileInputStream(f1);
		work=new XSSFWorkbook(fis1);
		sheet = work.getSheet("sheet1");
		//ReturnCustomer.login().click();
		//Thread.sleep(5000);
		
		for(int i=1; i<=2;i++)
		{	
			//BrowserCode.Browser();
			ReturnCustomer.login().click();
			try {
			cell=sheet.getRow(i).getCell(0);
			if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
			{
				
			
			 int cv =(int)cell.getNumericCellValue();
	 		String cn=String.valueOf(cv);
			
	 		
	 		ReturnCustomer.uid11().sendKeys(cn);
			}
			cell=sheet.getRow(i).getCell(0);
			    if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
			  {
			    	ReturnCustomer.uid11().sendKeys(cell.getStringCellValue());
			   }
			    cell=sheet.getRow(i).getCell(0);  
			if(cell.getCellType()==XSSFCell.CELL_TYPE_BLANK)
			{
				ReturnCustomer.uid11().sendKeys(null);
			}
			System.out.println("elements located succsesfully");
			//Log.info("elements located succsesfully");
		}
		catch(Exception e){
			System.out.println("unable to locate elements");
			//Log.error("unable to locate elements");
		}
			try {
			cell=sheet.getRow(i).getCell(1);
			//String data= (String)work.getSheetAt(0).getRow(i).getCell(2).getStringCellValue();
			
			
			if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
			{
				int cc =(int)cell.getNumericCellValue();
	 		String cs=String.valueOf(cc);
	 		ReturnCustomer.password().sendKeys(cs);
			}
			cell=sheet.getRow(i).getCell(1);
			if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
			
			{
				ReturnCustomer.password().sendKeys(cell.getStringCellValue());	
			}
			cell=sheet.getRow(i).getCell(1);
			if(cell.getCellType()==XSSFCell.CELL_TYPE_BLANK)
			{
				ReturnCustomer.password().sendKeys();
			}
			System.out.println("elements located succsesfully");
			//Log.info("elements located succsesfully");
			}
			catch(Exception e) {
				System.out.println("unable to locate elements");
				//Log.error("unable to locate elements");
				
			}
			ReturnCustomer.login22().click();

			}
			
			
			
			
		String s="pass";
			sheet.getRow(1).createCell(5).setCellValue(s);
			FileOutputStream fos=new FileOutputStream(f1);
			work.write(fos);
			fos.close();
			}
		

			
		
		}

		
		

			





