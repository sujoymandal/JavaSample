package JavaProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {

		String path=System.getProperty("user.dir")+"\\src\\main\\java\\SampleFiles\\SampleStud.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rows+1;i++){
			for(int j=0;j<cols;j++){
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" | ");
			}
			System.out.println();
		}
		
	}

}
