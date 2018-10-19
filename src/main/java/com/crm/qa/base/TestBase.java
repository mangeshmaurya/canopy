package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	protected TestBase(){
		super();
		try{
			
			prop=new Properties();
			FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

	public static void initialization() throws Exception
	{
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\testdata\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(TestUtil.Page_Load_timeout,TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			Thread.sleep(5000);
			
		}
	}

}
