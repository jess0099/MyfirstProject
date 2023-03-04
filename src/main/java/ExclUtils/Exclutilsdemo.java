package ExclUtils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exclutilsdemo {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	
	public Exclutilsdemo(String xlpath,String Sheetname) throws IOException {
		
		workbook=new XSSFWorkbook(xlpath);
		 sheet=workbook.getSheet(Sheetname);
		
	}
	
	public int rowcount() {
		int rownum=sheet.getPhysicalNumberOfRows();
		return rownum;
	}
	public int cellcount() {
		int celnum=sheet.getRow(0).getPhysicalNumberOfCells();
		return celnum;
	}
	public String  getdatecellstring(int ronum,int colnum) throws IOException{
		
		DataFormatter format=new DataFormatter();
		String val=format.formatCellValue(sheet.getRow(ronum).getCell(colnum));
		return val;
	}
	

}
