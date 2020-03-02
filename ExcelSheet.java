package seleniumprac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
class Read
{
	public void readExcel(String filePath, String fileName, String sheetName) throws IOException
	{
		File file = new File(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook xy= null;
		String fileExtentionName = fileName.substring(fileName.indexOf("."));
		xy = new XSSFWorkbook(inputStream);
		Sheet sheet = xy.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		for (int i = 0; i <= rowCount; i++) {
			System.out.println(sheet.getRow(i));
			Row row = sheet.getRow(i);
			for(int j=0; j < row.getLastCellNum(); j++)
			{
				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
				
			}
			System.out.println();
			
			
		}
		
		
	}
}
public class ExcelSheet {

	
	public static void main(String[] args) throws IOException {
		Read read = new Read();
		read.readExcel("E:", "cse.xlsx", "Form responses 1");
//		
//		FileInputStream fis = new FileInputStream("E:\\cse.xlsx");
		XSSFWorkbook sheet = new XSSFWorkbook();
//		Workbook workbook = new XSSFWorkbook(fis);
//		
//		Sheet sheet1 = workbook.getSheetAt(0);
//		sheet1.getRow(0);
//		
//		Row row = sheet1.getRow(0);
//		Cell cell = row.getCell(0);
//		System.out.println(cell);
//		System.out.println(sheet1.getRow(0).getCell(0));
		
	}

}
