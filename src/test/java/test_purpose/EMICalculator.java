package test_purpose;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EMICalculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\amin.al\\Desktop\\Device_photo\\Fake_Country_App_BP_ECG.apk");			
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
	}

}
