package HRMS_Project;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import java.io.InputStream;


public class TC_Excel_read {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("R:\\Assignment_On_Methodof_Selenium.xlsx");
          Workbook wb=Workbook.getWorkbook(file);
          Sheet st= wb.getSheet(0);
          int row =3;
          String method_name=st.getCell(0, row).getContents();
          String method =st.getCell(1, row).getContents();
          //String p

	}

}
