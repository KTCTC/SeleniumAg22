package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hwmf.record.HwmfFill.WmfExtFloodFill.HwmfFloodFillMode;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader6 {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir") + "\\KT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("KTCTC");
		int rn = sh.getLastRowNum();
		System.out.println(rn);
		int rnp = sh.getPhysicalNumberOfRows();
		System.out.println(rnp);
   ArrayList<String> keys = new ArrayList<>();
   ArrayList<String> values = new ArrayList<>();
		for (int i = 1; i <= rn; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(0);
			String kk = getCelValuesAccordingToCellType(cel);	
			keys.add(kk);
		}

		for (int i = 1; i <= rn; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(1);
			String vv = getCelValuesAccordingToCellType(cel);
			values.add(vv);
			
		}
		
		System.out.println(keys);
		System.out.println(values);

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
