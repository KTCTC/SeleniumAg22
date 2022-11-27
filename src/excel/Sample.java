package excel;

import java.util.HashMap;
import java.util.Map.Entry;

public class Sample {

	public static void main(String[] args) {

		ExcelHelper eh = new ExcelHelper("KT2.xlsx", "July");
		HashMap<String, String> data = eh.getKeyValuePairFromFile();
		
		for (Entry<String, String> each:data.entrySet())
		{
			System.out.println(each.getKey());
			System.out.println(each.getValue());
		}
  
	}
	

}
