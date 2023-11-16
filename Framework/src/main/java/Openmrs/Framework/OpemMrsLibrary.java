package Openmrs.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpemMrsLibrary {
	
	WebDriver driver;
   public OpemMrsLibrary(WebDriver driver) {
	 this.driver = driver;  
   }
	
	public void login(String username,String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//li[@id='Inpatient Ward']")).click();
		driver.findElement(By.id("loginButton")).click();
	}
	
	public boolean FindAPatientRecord(String patientName)
	{
		driver.findElement(By.cssSelector("i.icon-search")).click();
		driver.findElement(By.id("patient-search")).sendKeys(patientName);
		String expected = driver.findElement(By.id("patient-search")).getAttribute("value");
		String actual =	driver.findElement(By.xpath("//table[@id='patient-search-results-table']/tbody/tr[1]/td[2]")).getText();
		return actual.equals(expected);
		
	}
	
	public boolean FindAPatientRecordInvalidData(String invalidPatientName) throws InterruptedException
	{
		driver.findElement(By.cssSelector("i.icon-search")).click();
		driver.findElement(By.id("patient-search")).sendKeys(invalidPatientName);
		String expected = "No matching records found";
		Thread.sleep(2000);
		String actual =	driver.findElement(By.xpath("(//td[@class='dataTables_empty'])[1]")).getText();
		return actual.equals(expected);
		
	}
}
