package mercurypack;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

		
		XSSFWorkbook wb;
		XSSFSheet sheet;
		
		
		public ReadExcelFile(String excelPath) {
			// TODO Auto-generated method stub
			try
			{
				File src = new File(excelPath);
				FileInputStream fis = new FileInputStream(src);
				wb = new XSSFWorkbook(fis);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}			
			
		
	}
		public Object getData(int sheetnumber, int row, int column) {
			// TODO Auto-generated method stub
			sheet = wb.getSheetAt(sheetnumber);
			String data = sheet.getRow(row).getCell(column).getStringCellValue();
			return data;
		}
		



		public int getRowCount(int sheetIndex) {
			// TODO Auto-generated method stub
			int row1 = wb.getSheetAt(sheetIndex).getLastRowNum();
			row1 = row1 + 1;
			return row1;
		}


		

		
}
