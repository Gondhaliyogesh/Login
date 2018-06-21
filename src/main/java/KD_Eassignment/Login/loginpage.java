/**
 * 
 */
package KD_Eassignment.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Yogiiii
 *
 */
public class loginpage 
{

	public static ReadProperties rp;

	public static void logpage(WebDriver driver) throws Exception
	{
		rp=new ReadProperties();
		System.out.println("properties class loaded successfully");

		driver.get(rp.getPropertiesData("URL"));
		driver.findElement(By.xpath(rp.getPropertiesData("login_link"))).click();
		
		driver.findElement(By.xpath(rp.getPropertiesData("Radio_button"))).click();
		driver.findElement(By.id(rp.getPropertiesData("Email"))).sendKeys(rp.getPropertiesData("email_id"));
		driver.findElement(By.id(rp.getPropertiesData("Password"))).sendKeys(rp.getPropertiesData("passwd"));
		driver.findElement(By.xpath(rp.getPropertiesData("Login_button"))).click();

	}
}

