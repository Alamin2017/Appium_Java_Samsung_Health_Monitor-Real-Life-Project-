package test_purpose;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BP_ECG_SHM {

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
		//select CSC
		driver.findElementById("android:id/text1").click();
		Thread.sleep(2000);
		//select MCC
		driver.findElementById("android:id/text1").click();
		Thread.sleep(2000);
		String shm=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_title").getText();
		System.out.println("Text1 is:"+shm);
		String shmtext=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_desc").getText();
		System.out.println("Text2 is :"+shmtext);
		String tcpp=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_pp_tnc_text").getText();
		System.out.println("Text3 is :"+tcpp);
		Thread.sleep(3000);
		//Tab on Accept button
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_bottom_button").click();
		Thread.sleep(2000);
		//Tab on switch button for permissions
		driver.findElementById("com.sec.android.app.shealth:id/main_switch_widget_layout").click();
		Thread.sleep(2000);
		//Tab on done button
		driver.findElementById("com.sec.android.app.shealth:id/permission_popup_positive_button").click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//input firstname
		driver.findElementById("com.samsung.android.shealthmonitor:id/mEditTextFirstName").sendKeys("Al");
		Thread.sleep(2000);
		//input lastname
		driver.findElementById("com.samsung.android.shealthmonitor:id/mEditTextLastName").sendKeys("Amin");
		Thread.sleep(2000);
		//birthdate
		WebElement drpdown=driver.findElementById("com.samsung.android.shealthmonitor:id/mEditBirthDay");
		drpdown.click();
		Thread.sleep(2000);
		driver.findElementById("com.samsung.android.shealthmonitor:id/positive_button").click();
		Thread.sleep(2000);
		//driver.findElementById("com.samsung.android.shealthmonitor:id/mEditTextGender").click();
		//male
		driver.findElementById("com.samsung.android.shealthmonitor:id/radio_button").click();
		Thread.sleep(2000);
		//save for male
		driver.findElementById("com.samsung.android.shealthmonitor:id/positive_button").click();
		Thread.sleep(2000);
		//finish button
		driver.findElementById("com.samsung.android.shealthmonitor:id/mFinishButton").click();
		Thread.sleep(30000);
	
		
	}

}
