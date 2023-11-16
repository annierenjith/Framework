package Openmrs.Framework.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Openmrs.Framework.BaseClass;
import Openmrs.Framework.HelperClass;
import Openmrs.Framework.OpemMrsLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindAPatientRecordTest extends BaseClass	 {
	@Parameters({"patientName","username","password"})
	@Test
	public void ValidateFindAPatientRecordValidData(String patientName,String username,String password) throws InterruptedException
	{	
		HelperClass helperObj = new HelperClass(driver);
		helperObj.launchBrowser(prop.getProperty("url"));
		OpemMrsLibrary OpenMRS = new OpemMrsLibrary(driver);
		OpenMRS.login(username,password);
		boolean result = OpenMRS.FindAPatientRecord(patientName);
		Assert.assertTrue(result);	
	}
	
	@Parameters({"username","password","invalidPatientName"})
	@Test
	public void ValidateFindAPatientRecordInvalidData(String username,String password,String invalidPatientName) throws InterruptedException
	{	
		HelperClass helperObj = new HelperClass(driver);
		helperObj.launchBrowser(prop.getProperty("url"));
		OpemMrsLibrary OpenMRS = new OpemMrsLibrary(driver);
		OpenMRS.login(username,password);
		boolean result = OpenMRS.FindAPatientRecordInvalidData(invalidPatientName);
		
		Assert.assertTrue(result);	
	}
}
