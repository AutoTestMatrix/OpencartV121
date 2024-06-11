package day32_Reading_Writing_Excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//File --->Workbook ---> Sheets ---> Rows ---> Cells

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(); //in this case we should not pass the file inside the parenthesis 
		XSSFSheet sheet=workbook.createSheet(); //in reading excel we used workbook.getSheet
		
		//XSSFCell cell=sheet.createRow(0).createCell(1);
		//cell.setCellValue("welcome");
		
		//create a row object otherwise the cell data is overridden
		XSSFRow row1=sheet.createRow(0);
		
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue("xyz");
		row1.createCell(2).setCellValue("abc");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Hello");
		row2.createCell(1).setCellValue("how");
		row2.createCell(2).setCellValue("are you");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("writing is done !!!");
	}

}
