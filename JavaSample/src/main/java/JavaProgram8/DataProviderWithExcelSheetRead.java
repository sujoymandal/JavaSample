package JavaProgram8;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcelSheetRead {
	FileInputStream fis;
	XSSFWorkbook book;
	XSSFSheet sheet;

	@DataProvider(name="provider")
	public Object[][] readExcel() throws Exception {

		fis = new FileInputStream("D:/04_03_sampleData.xlsx");
		book = new XSSFWorkbook(fis);
		sheet = book.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[row ][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}

		}
		return data;

	}

	@Test(dataProvider="provider")
	public void dataGetter(String name,String pwd,String stat){
		
		System.out.println(name +" and "+pwd + " and status is :"+stat);
		
	}
}
