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
 *""
 */
public class ReadExcel
{
	public static void readexcels(WebDriver driver) throws Exception
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Yogiiii\\Desktop\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		System.out.println("inside readexcelswb"+wb);
		XSSFSheet sh=wb.getSheetAt(0);
		int row=sh.getLastRowNum();
		System.out.println("row"+row);
		FileInputStream fs=new FileInputStream("C:\\Users\\Yogiiii\\Desktop\\data1.xlsx");
		System.out.println(fs);
		XSSFWorkbook wb1=new XSSFWorkbook(fs);
		XSSFSheet sh1=wb.getSheetAt(0);
		int rows=sh.getLastRowNum();
		System.out.println("rows"+rows);
		
		
		for(int i=0;i<=row;i++)
		{	
			System.out.println("just b4for");
			String data=sh.getRow(i).getCell(1).toString();
			System.out.println("data "+data);
		
//			for(int j=0;j<=rows;j++)
//			{
//			
			String data1=sh1.getRow(i).getCell(1).toString();
			System.out.println("data1 "+i+data1);
//			
			if(data.equalsIgnoreCase("Registration")&&data1.equalsIgnoreCase("Yes"))
			{
				Employer_Reg.employer_reg(driver);
			}
			else if(data.equalsIgnoreCase("Registration")&&data1.equalsIgnoreCase("No"))
			{
				driver.close();
			}
			
			else if(data.equalsIgnoreCase("Login")&&data1.equalsIgnoreCase("Yes"))
			{
				loginpage.logpage(driver);
			}
			else if(data.equalsIgnoreCase("Login")&&data1.equalsIgnoreCase("No"))
			{
				driver.close();
			}
			
			if(data1.contains("Yes"))
			{
			sh.getRow(i).createCell(3).setCellValue("Pass");
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Yogiiii\\Desktop\\data1.xlsx");
			wb.write(fos);
			}
			else if(data1.contains("No"))
			{
				sh.getRow(i).createCell(3).setCellValue("Failed");
				System.out.println(data1);
				FileOutputStream fos=new FileOutputStream("C:\\Users\\Yogiiii\\Desktop\\data1.xlsx");
				wb.write(fos);
			}
		
		//}
		
		
	}}
}
