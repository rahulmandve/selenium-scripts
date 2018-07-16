
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class CopyDataFromXlSheet {

	    public static void main(String[] args) throws Exception {
	        // TODO Auto-generated method stub

	      //  File src = new File("C:\\Users\\hp\\Desktop\\TestData.xlsx");
	        FileInputStream fs = new FileInputStream("C:\\Users\\hp\\Desktop\\TestData.xlsx");
	        XSSFWorkbook wb =new XSSFWorkbook(fs);
	        XSSFSheet sheet1=wb.getSheetAt(1);
	        XSSFRow r=sheet1.getRow(0);
	        
	        int rowcount=sheet1.getLastRowNum()+1;
            //System.out.println("Number of rows"+rowcount);
	        	
            	int cellcount=r.getLastCellNum();
	           // System.out.println("Number of Columns"+count);
	          
	            
	           // System.out.println("user name Password details");
	            for(int i=1;i<rowcount;i++)
	            {
	            	for(int j=0;j<cellcount;j++)
	            	{
	            		String s=sheet1.getRow(i).getCell(j).getStringCellValue();
	            		System.out.print(s+"  ");
	            		
	            	}
	            	System.out.println();
	            }
	            
	        

	        
	    }

	}
	



