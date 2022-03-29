package test_appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class BP_Part {

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

		//select CSC by clicking 
		driver.findElementById("android:id/text1").click();
		Thread.sleep(2000);

		//select MCC by clicking 
		driver.findElementById("android:id/text1").click();
		Thread.sleep(2000);

		//Retrieve text for welcome page
		String shm=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_title").getText();
		System.out.println("Text1 is:"+shm);
		String shmtext=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_desc").getText();
		System.out.println("Text2 is :"+shmtext);
		String tcpp=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_pp_tnc_text").getText();
		System.out.println("Text3 is :"+tcpp);
		Thread.sleep(2000);

		//create touch object 
		TouchAction action=new TouchAction(driver);

		//tap on terms of use part ....................
		//.............................................
		action.press(PointOption.point(326, 1881)).release().perform();
		//tab on view as pdf
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"View as PDF, Button\"]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("	\r\n"
				+ "//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("	\r\n"
				+ "//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);

		//tap on Privacy Policy .......................
		//.............................................
		action.press(PointOption.point(636, 1876)).release().perform();
		//tab on view as pdf
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"View as PDF, Button\"]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("	\r\n"
				+ "//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("	\r\n"
				+ "//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);

		//Tab on Accept button
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_bottom_button").click();
		Thread.sleep(2000);

		//Tab on switch button for permissions
		driver.findElementById("com.sec.android.app.shealth:id/main_switch_widget_layout").click();
		Thread.sleep(2000);


		action.press(PointOption.point(393, 1328)).release().perform();
		Thread.sleep(2000);
		action.press(PointOption.point(636, 1476)).release().perform();
		Thread.sleep(2000);
		action.press(PointOption.point(408, 1902)).release().perform();

		//Tab on switch button for permissions
		driver.findElementById("com.sec.android.app.shealth:id/main_switch_widget_layout").click();
		Thread.sleep(2000);


		//Tab on done button
		driver.findElementById("com.sec.android.app.shealth:id/permission_popup_positive_button").click();
		Thread.sleep(2000);

         //Onboarding .........................
		//.....................................
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


		//male
		driver.findElementById("com.samsung.android.shealthmonitor:id/radio_button").click();
		Thread.sleep(2000);

		//save for male
		driver.findElementById("com.samsung.android.shealthmonitor:id/positive_button").click();
		Thread.sleep(2000);

		//finish button
		driver.findElementById("com.samsung.android.shealthmonitor:id/mFinishButton").click();
		Thread.sleep(15000);




		//Starting part on BP.........................................................................................................
		//...................................................................................................................
		//Tab on BP main menu option 









	}

	

}
