package day32_Reading_Writing_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//File --->Workbook ---> Sheets ---> Rows ---> Cells

public class ReadingExcel {
	
	public static void main(String[] args) throws IOException {
		FileInputStream File= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(File);
		XSSFSheet sheet =workbook.getSheet("Sheet1"); //workbook.getSheetAt(0)
		
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(1).getLastCellNum();
		
		//System.out.println("Number of rows: "+totalRows);
		//System.out.println("Number of Cells: "+totalCells);
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow CurrentRow=sheet.getRow(r);  //capture the particular row
			
			for (int c=0;c<totalCells;c++)
			{
				XSSFCell cell=CurrentRow.getCell(c);
				String value=cell.toString();
				
				//String value=CurrentRow.getCell(c).toString();
				System.out.print(value+"            ");
		
			}
			System.out.println();
		}
		
		workbook.close();
		File.close();

	
	}
	
}
