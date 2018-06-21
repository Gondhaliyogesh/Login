/**
 * 
 */
package KD_Eassignment.Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

/**
 * @author Yogiiii
 *
 */
public class Run_Mode
{
	
	
	public static void run_mode(WebDriver driver) throws Exception
	{
		System.out.println("b4_inside run_mode");		
		FileInputStream	fis=new FileInputStream("C:\\Users\\Yogiiii\\Desktop\\data1.xlsx");
		System.out.println(fis);	
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		System.out.println(wb);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println("sh"+sh);
		int row=sh.getLastRowNum();
		


		for(int i=1;i<=row;i++)
		{
			String data1=sh.getRow(i).getCell(2).toString();
			System.out.println("data1"+data1);

			if(data1.equalsIgnoreCase("Yes"))
			{
				System.out.println("driver"+driver);
				ReadExcel.readexcels(driver);
			}

			else if(data1.equalsIgnoreCase("No"))
			{
				driver.close();
				System.out.println("Close Successfully");
			}
			
			
				sh.getRow(i).createCell(3).setCellValue("Pass");
				System.out.println(data1);
				FileOutputStream fos=new FileOutputStream("C:\\Users\\Yogiiii\\Desktop\\data1.xlsx");
			
		}
	}
}
