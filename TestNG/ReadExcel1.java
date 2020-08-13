package practice1.TestNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;

public class ReadExcel1 {

	
	public static String[][] excelread(String filname) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+ filname + ".xlsx");
		System.out.println(filname);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum();
		int columncount  = sh.getRow(0).getLastCellNum();
		System.out.println(columncount);
		System.out.println(rowcount);
		String [][] data = new String[rowcount][columncount];
		for(int i=1;i<=rowcount;i++)
		{
			System.out.println(i);
			for(int j=0;j<columncount;j++)
			{
				System.out.println(j);
				data [i-1][j] = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println("read data method" + data [i-1][j]);
				
			}
		}
		
		
wb.close();
return data;
	}

}
