import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args)throws IOException, FileNotFoundException {
		ReadExcel1 readExcel= new ReadExcel1();
		String path="C:\\Users\\hp\\Desktop";		
		String fileName="TestData.xlsx";
		String sheetName="login";
		readExcel.Excel(path, fileName, sheetName);
	}

	public void Excel(String filePath, String fileName, String sheetName) throws IOException 
	{

		File f=new File(filePath+"\\"+fileName);
		FileInputStream fis= new FileInputStream(f);
		Workbook wb=null;
		String fileExtensionName=fileName.substring(fileName.indexOf("."));
		if(fileExtensionName.equals(".xlsx"))
		{
			wb=new XSSFWorkbook(fis);
		}
		else if (fileExtensionName.equals(".xls"))
		{
			wb= new HSSFWorkbook(fis);
		}
		
		Sheet sheet=wb.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for (int i=0;i<rowCount+1;i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				if(row.getCell(j).getCellTypeEnum()== CellType.STRING)
				{
					System.out.print(row.getCell(j).getStringCellValue()+"|");
				}
				else if(row.getCell(j).getCellTypeEnum()==CellType.FORMULA)
				{
					String cellValue=String.valueOf(row.getCell(j).getNumericCellValue());
					if(HSSFDateUtil.isCellDateFormatted(row.getCell(j)))
					{
						DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
						Date date= row.getCell(j).getDateCellValue();
						cellValue=df.format(date);
						System.out.print(cellValue+"|");
					}
				}
				else if(row.getCell(j).getCellTypeEnum()== CellType.NUMERIC)
				{
					double value=row.getCell(j).getNumericCellValue();
					DecimalFormat df=new DecimalFormat();
					NumberFormat nf= NumberFormat.getNumberInstance();
					String numValue=nf.format(value);
					Number n=null;
				try
				{
					n=df.parse(numValue);
					System.out.print(n+"|");
				}
				catch (Throwable e)
				{
				e.printStackTrace();	
				}
				}
			
				else if(row.getCell(j).getCellTypeEnum()==CellType.BLANK)
				{
					System.out.print(""+"|");
				}
				else
				{
					System.out.print(String.valueOf(row.getCell(j).getBooleanCellValue())+"|");
				}
				
			}
		System.out.println();
		}
		
	}
	
	
}
