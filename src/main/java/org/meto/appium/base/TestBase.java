package org.meto.appium.base;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.utils.AppiumUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.opentelemetry.context.Context;

public class TestBase extends AppiumUtils{

	public static AndroidDriver driver;
	public AppiumDriverLocalService service;
	public static FormPage formPage;
	public static FormProspect formProspect;
	
	@BeforeSuite
	public static void setup(ITestContext testContext) throws MalformedURLException {
		
		/*
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//meto//appium//resources//data.properties");
		prop.load(fis);
		String ipAddress = prop.getProperty("ipAddress");
		String port = prop.getProperty("port");
		service = startAppiumServer(ipAddress, ,Integer.parseInt(port));
		*/
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setDeviceName("samsung SM-T395"); //5200fa184e619579   samsung SM-T395
		options.setUdid("5200fa184e619579"); //metodio
	//	options.setUdid("520074ed4689172f"); //celeste
	//	options.setDeviceName("samsung SM-T575"); //5200fa184e619579   samsung SM-T395
	//	options.setUdid("RX2RB00S5WJ"); //meto  
	//	options.setUdid("R52RA00QSKK"); //ariana
		options.setApp("com.android.contacts");
		options.setCapability("ignoreHiddenApiPolicyError", true);
	//	options.setCapability("enableMultiWindows", true);   // nuevo
//		options.setChromedriverExecutable("C://Users//Praxis//OneDrive//Documents//automatizedTests//src//drivers//chromedriver");
		//options.setChromedriverExecutable("C://Users//Praxis//Documents//chromedriver");
		options.setChromedriverExecutable(System.getProperty("user.dir")+"//src//test//resources//driver//chromedriver");

	//	options.setApp("C://code//AppiumFrameworkSurgir//src//test//resources//app//Surgir_debug_4.3.0_Release4.3.0.apk");
	//	options.setApp("C://code//AppiumFrameworkSurgir3//src//test//resources//app//Surgir_debug4.5.0_test.apk");
		options.setApp(System.getProperty("user.dir")+"//src//test//resources//app//Surgir_debug_5.0.0_Release5.0.0.apk"); //hasta las 11
		
		options.setAppWaitActivity("com.saucelabs.mydemoapp.rn.MainActivity"); //nuevo
		

		options.setCapability("appWaitActivity", ".ui.login.LoginActivity,.ui.splash.SplashActivity");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), options);
	//	driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);

	//	driver = new AndroidDriver(new URL("http://localhost:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		formPage = new FormPage(driver); 
		formProspect = new FormProspect(driver); 


	}
	


	@AfterSuite
	public void teardown() {
		 driver.quit();
		 service.stop();
		 
	}

}
