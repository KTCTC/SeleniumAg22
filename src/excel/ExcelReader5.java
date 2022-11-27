package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hwmf.record.HwmfFill.WmfExtFloodFill.HwmfFloodFillMode;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader5 {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir") + "\\KT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("KTCTC");
		int rn = sh.getLastRowNum();
		System.out.println(rn);
		int rnp = sh.getPhysicalNumberOfRows();
		System.out.println(rnp);

		for (int i = 0; i <= rn; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(0);
			String kk = getCelValuesAccordingToCellType(cel);	
			System.out.println(kk);
		}

		for (int i = 0; i <= rn; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(1);
			String vv = getCelValuesAccordingToCellType(cel);
			System.out.println(vv);
			
		}

	}
	
	public static String getCelValuesAccordingToCellType(XSSFCell cel)
	{
		Object data = null;
		
		switch (cel.getCellType()) {
		case STRING:
                   data = cel.getStringCellValue();
			break;
		case BOOLEAN:
			data =cel.getBooleanCellValue();
			break;
		case NUMERIC:
			data =cel.getNumericCellValue();
			break;
		case FORMULA:
			data =cel.getCellFormula();
			break;

		default:
			System.out.println("Can not decide cell type");
			break;
		}
		
		return data.toString();
	}

}
