/**
 * 
 */
package KD_Eassignment.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Yogiiii
 *
 */
public class Employer_Reg
{
	//public static ReadProperties rp;

	public static void employer_reg(WebDriver driver) throws Exception 
	{
		
		driver.get("http://www.eassignments.in/ca/");
		Actions act=new Actions(driver);
		WebElement Reg_lnk=driver.findElement(By.xpath("html/body/div[1]/header/div[2]/div/nav/ul/li[2]/a"));
		act.moveToElement(Reg_lnk).build().perform();
		
		driver.findElement(By.linkText("Employer Registration")).click();
		driver.findElement(By.id("orgtype")).sendKeys("CA");
		
		Thread.sleep(3000);
	}
}
