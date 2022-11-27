package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hwmf.record.HwmfFill.WmfExtFloodFill.HwmfFloodFillMode;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader2 {

	public static void main(String[] args) throws IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\KT.xlsx");
		FileInputStream fis = new FileInputStream(f);		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("KTCTC");		
		int rn = sh.getLastRowNum();
		System.out.println(rn);		
		int rnp = sh.getPhysicalNumberOfRows();
		System.out.println(rnp);
		for (int i=0;i<=rn;i++)
		{
			XSSFRow row = sh.getRow(i);		
			XSSFCell cel = row.getCell(0); 
			System.out.println(cel.getStringCellValue());
		}
		
		for (int i=0;i<=rn;i++)
		{
			XSSFRow row = sh.getRow(i);		
			XSSFCell cel = row.getCell(1); 
			System.out.println(cel.getStringCellValue());
			
		}
		
		
		
	}

}
