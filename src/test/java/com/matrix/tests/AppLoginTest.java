package com.matrix.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppLoginTest {
	
	@Test
	public void loginTest() throws MalformedURLException {
		AndroidDriver<MobileElement> driver;
		System.out.println("----------  Before Test Matrix Mobile Test tearDown method.----------");
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0"); //8.1.0|9
		caps.setCapability(MobileCapabilityType.UDID, "5203828d4c3cc305");//5203828d4c3cc305|41d76a8e
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SamsungGalaxy");//SamsungGalaxy
		
		/*app.com.pasangmatrix/app.com.pasangmatrix.Activity.LoginActivity}
		 * plateform-tools>adb shell (Enter)
		 * now paste - dumpsys window windows | grep -E ‘mCurrentFocus|mFocusedApp’
		 * ToolsQA - https://www.toolsqa.com/mobile-automation/appium/how-to-find-apppackage-and-appactivity-for-apk-file/*/
		
		caps.setCapability("appPackage", "app.com.pasangmatrix");			
		caps.setCapability("appActivity", "app.com.pasangmatrix.Activity.SplashActivity");			
		System.out.println("In Login Test Package and Activity taken");
	
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
			
		//app.com.pasangmatrix:id/input_userNameNew|app.com.pasangmatrix:id/btnLogin|app.com.pasangmatrix:id/input_password|app.com.pasangmatrix:id/btnLoginWithPass
		//0 Username | 2 LOGIN
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("app.com.pasangmatrix:id/input_userNameNew")).sendKeys("arunw2");
		driver.findElement(By.id("app.com.pasangmatrix:id/btnLogin")).click();
		driver.findElement(By.id("app.com.pasangmatrix:id/input_password")).sendKeys("123456");
		driver.findElement(By.id("app.com.pasangmatrix:id/btnLoginWithPass")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("app.com.pasangmatrix:id/lytFormSubmit")).click();//Agree button kirim
		driver.findElement(By.id("app.com.pasangmatrix:id/imgGame")).click();//Sg game click
		driver.findElement(By.id("app.com.pasangmatrix:id/txtGamename")).click();//4D/3d/2D game click
		driver.findElement(By.id("app.com.pasangmatrix:id/lytAddmore")).click();//Add more click
		
		driver.findElement(By.id("app.com.pasangmatrix:id/e1")).sendKeys("5");//Add more click
		driver.findElement(By.id("app.com.pasangmatrix:id/e2")).sendKeys("6");//Add more click
		driver.findElement(By.id("app.com.pasangmatrix:id/e3")).sendKeys("7");//Add more click
		driver.findElement(By.id("app.com.pasangmatrix:id/e4")).sendKeys("8");//Add more click
		
		driver.findElement(By.id("app.com.pasangmatrix:id/edit4d1")).sendKeys("1000");//Add more click
		driver.findElement(By.id("app.com.pasangmatrix:id/edit3d1")).sendKeys("1000");//Add more click
		driver.findElement(By.id("app.com.pasangmatrix:id/edit2d1")).sendKeys("1000");//Add more click
		
		driver.findElement(By.id("app.com.pasangmatrix:id/lytFormSubmit")).click();//Add more click
		driver.findElement(By.id("app.com.pasangmatrix:id/buttonAlertCancel")).click();//Add more click
		
		/*driver.findElement(By.name("Username")).sendKeys("arunw2");
		driver.findElement(By.name("LOGIN")).click();*/
		
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("----------  After Test Matrix Mobile Test tearDown method.----------");

	}

}
