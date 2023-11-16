package Openmrs.Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected 	WebDriver driver;
	protected Properties prop;

	@BeforeClass
	public void InstantiateDriver()
	{	
		String browserType = prop.getProperty("browser");
		if(browserType.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	}	
	
	@BeforeTest
	public void readconfigFile() throws IOException
	{
		File f = new File(System.getProperty("user.dir")+"//Config.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println("Successfull");
	}
}
