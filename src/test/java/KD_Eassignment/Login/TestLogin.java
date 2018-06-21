/**
 * 
 */
package KD_Eassignment.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Yogiiii
 *
 */
public class TestLogin 
{

	
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Run_Mode.run_mode(driver);
		
		Thread.sleep(3000);
	}

}
