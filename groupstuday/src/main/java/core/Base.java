package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	private String propertiyPath= ".\\src\\test\\resouces\\input\\properties.properties";
	private String log4jPath=".\\src\\test\\resouces\\input\\log4j.properties";
	
	public Base() {
		try {
		BufferedReader reader = new BufferedReader(new FileReader(propertiyPath));
		properties = new Properties();
		properties.load(reader);
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
			
		}
		
		logger = Logger.getLogger("looger_File");
		PropertyConfigurator.configure(log4jPath);
		
		
		}
	public static String getUrl() {
		String url=properties.getProperty("url");
		return url;
	}
	public static String getBrowser() {
		String browser= properties.getProperty("browser");
		return browser;
		
	}
	public static void launchBrowser() {
		driver.get(getUrl());
	}
	public static void tearDown() {
    	driver.close();
		driver.close();
	}
	public static void browser() {
		String browserName = getBrowser();
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//delete all browser cookies
		driver.manage().deleteAllCookies();

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
