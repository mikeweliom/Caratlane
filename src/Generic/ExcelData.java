package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ExcelData implements Stable
{
	public static String getCellValue(String PATH, String sheet, int row, int cell)
	{
		String v="";
		try
		{
			FileInputStream fis=new FileInputStream(PATH);
			Workbook wb=WorkbookFactory.create(fis);
			v=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}catch(Exception e)
		{
			Reporter.log("Path is invalid", true);
		}
		return v;
		
	}
}
