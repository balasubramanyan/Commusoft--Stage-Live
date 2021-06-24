package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheetdata {
	XSSFWorkbook wb;
	XSSFSheet sh;
	DataFormatter formattor;

	public Excelsheetdata() throws IOException
	{
		File src = new File("./TestDatas/Datasheet.xlsx");
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis); 
		formattor = new DataFormatter();
	}
	
	public String sheetIN(String sheetname, int row, int cell)   //---Method Overloading----//
	{
		sh = wb.getSheet(sheetname);
		return	 formattor.formatCellValue(sh.getRow(row).getCell(cell));
	}
	
	public String sheetIN(int sheetnum, int row, int cell)   //---Method Overloading----//
	{
		sh = wb.getSheetAt(sheetnum);
		return	 formattor.formatCellValue(sh.getRow(row).getCell(cell));
	}
	
	
	
}
