import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\TestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheetAt(0);
		Row row=sheet.getRow(0);
		
		int rcount=sheet.getLastRowNum()+1;
		int ccount=row.getLastCellNum();
		
		for(int i=0;i<rcount;i++)
		{
			for(int j=0;j<ccount;j++)
			{
				String s=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(s+" ");		
			}
			System.out.println();
		}
		
		
	}

}
