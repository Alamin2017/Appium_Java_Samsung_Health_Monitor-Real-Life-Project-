package test_appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ECG_Part {

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
		//text for first page
		String shm=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_title").getText();
		System.out.println("Text1 is:"+shm);
		String shmtext=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_desc").getText();
		System.out.println("Text2 is :"+shmtext);
		String tcpp=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_pp_tnc_text").getText();
		System.out.println("Text3 is :"+tcpp);
		Thread.sleep(3000);
	
		
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


		//Tab on done button in permission page 
		driver.findElementById("com.sec.android.app.shealth:id/permission_popup_positive_button").click();
		Thread.sleep(2000);
		

		//input firstname
		driver.findElementById("com.samsung.android.shealthmonitor:id/mEditTextFirstName").sendKeys("Al");
		Thread.sleep(2000);

		//input lastname
		driver.findElementById("com.samsung.android.shealthmonitor:id/mEditTextLastName").sendKeys("Amin");
		Thread.sleep(2000);

		//birthdate
		AndroidElement drpdown=(AndroidElement) driver.findElementById("com.samsung.android.shealthmonitor:id/mEditBirthDay");
		action.tap(ElementOption.element(drpdown)).release().perform();
		Thread.sleep(2000);

		//save button for birth date 
		AndroidElement savebtn=(AndroidElement) driver.findElementById("com.samsung.android.shealthmonitor:id/positive_button");
		action.tap(ElementOption.element(savebtn)).release().perform();
		Thread.sleep(2000);


		//male select 
		AndroidElement male=(AndroidElement) driver.findElementById("com.samsung.android.shealthmonitor:id/radio_button");
		action.tap(ElementOption.element(male)).release().perform();
		Thread.sleep(2000);

		//save for male
		AndroidElement malesave=(AndroidElement) driver.findElementById("com.samsung.android.shealthmonitor:id/positive_button");
		action.tap(ElementOption.element(malesave)).release().perform();
		Thread.sleep(2000);

		//continue button for onboarding completed
		AndroidElement continuebtn=(AndroidElement) driver.findElementById("com.samsung.android.shealthmonitor:id/mFinishButton");
		action.tap(ElementOption.element(continuebtn)).release().perform();
		Thread.sleep(2000);

		//view more
		AndroidElement viewmore=(AndroidElement) driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_main_top_intro_view_more");
		action.tap(ElementOption.element(viewmore)).release().perform();
		Thread.sleep(3000);

		//how to use
		AndroidElement howtouse=(AndroidElement) driver.findElementById("com.samsung.android.shealthmonitor:id/mHowToUseButton");
		action.tap(ElementOption.element(howtouse)).release().perform();
		Thread.sleep(3000);
		
		// how to use 4 items test in  BP ..........................
		//...........................................................
		
		action.press(PointOption.point(408, 367)).release().perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		action.press(PointOption.point(408, 584)).release().perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		action.press(PointOption.point(419, 801)).release().perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		action.press(PointOption.point(403, 1085)).release().perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);
		
		
		
		
		
		//back button 
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();


		//Starting part on ECG.........................................................................................................
		//...................................................................................................................
		//Tab on ECG main menu option 
		driver.findElementByXPath("	\r\n"
				+ "//android.widget.LinearLayout[@content-desc=\"ECG, Tab, 2 of 2., Not selected\"]/android.widget.LinearLayout").click();
		Thread.sleep(2000);
		
		//tab on get started ECG.................
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_on_boarding_button").click();
		Thread.sleep(2000);
		
		
		//how to use how the ecg app works 
		//..............................
		
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_onboarding_item_menu_how_to_use").click();
		Thread.sleep(2000);
		
		
		action.press(PointOption.point(439, 363)).release().perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);
		action.press(PointOption.point(408, 579)).release().perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);
		action.press(PointOption.point(419, 791)).release().perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);
		action.press(PointOption.point(315, 1008)).release().perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);
		
		
		
		
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(2000);
		//above back button for how to use for how the ecg app works 
		
		//next button for how the ecg app works.............
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_on_boarding_activity_next").click();
		Thread.sleep(2000);
		

		//next button for you may see one of these result..........
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_on_boarding_activity_next").click();
		Thread.sleep(2000);
		
		//Next button how to use for you should know 
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_on_boarding_activity_next").click();
		Thread.sleep(2000);
		

		//next button for you should know 2 ..........
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_on_boarding_activity_next").click();
		Thread.sleep(2000);
		

		// wrist Orientation

		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_on_boarding_activity_next").click();

		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_on_boarding_done_activity_done").click();

		//Measurement History page..............................
		
		//tab on sync button
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_data_sync_text").click();
		Thread.sleep(2000);

		//learn how to record
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_no_data_learn_view").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();

		//view histry
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_card_data_button").click();
		Thread.sleep(2000);

		//tab on Sinus rhythm
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_history_tab_1").click();
		Thread.sleep(2000);
		//Afib
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_history_tab_2").click();
		Thread.sleep(2000);
		//tab on Inconclusive
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_history_tab_3").click();
		Thread.sleep(2000);
		//tab on poor recording 
		driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_ecg_history_tab_4").click();
		Thread.sleep(2000);
	

		//tab on more button
		driver.findElementByClassName("android.widget.ImageView").click();
		Thread.sleep(2000);
		
		//how to use
		driver.findElementById("com.samsung.android.shealthmonitor:id/title").click();
		Thread.sleep(2000);
		//back button
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		//back button 
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();









	}

}
