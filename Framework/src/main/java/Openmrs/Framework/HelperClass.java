package Openmrs.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperClass {
	WebDriver driver;
	
	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	public void navigateToFindPatient()
	{
		driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension'"));
	}
	
	public void navigateToVisit()
	{
		driver.findElement(By.id("org-openmrs-module-coreapps-activeVisitsHomepageLink-org-openmrs-module-coreapps-activeVisitsHomepageLink-extension"));
	}
	
	
	public void navigateToRegisterPatient()
	{
		driver.findElement(By.xpath(" //i[@class='icon-user']"));
	}
	
	public void launchBrowser(String url)
	{
		driver.get(url);
	}
}
