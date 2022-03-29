package test_appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class BP_ECG_Drawer_Menu {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\amin.al\\Desktop\\Device_photo\\Fake_Country_App_BP_ECG.apk");			
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		AndroidTouchAction touch=new AndroidTouchAction(driver);


		//select CSC
		driver.findElementById("android:id/text1").click();
		Thread.sleep(2000);
		//select MCC
		driver.findElementById("android:id/text1").click();
		Thread.sleep(2000);

		//Matching all text from first page
		String shm=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_title").getText();
		System.out.println("Text1 is:"+shm);
		String shmtext=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_desc").getText();
		System.out.println("Text2 is:"+shmtext);
		String tcpp=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_pp_tnc_text").getText();
		System.out.println("Text3 is:"+tcpp);
		Thread.sleep(3000);

		//Tab on Accept button
		AndroidElement accept=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_init_bottom_button");
		touch.tap(ElementOption.element(accept)).release().perform();
		Thread.sleep(2000);

		//Tab on switch button for permissions
		AndroidElement sbtnper=driver.findElementById("com.sec.android.app.shealth:id/main_switch_widget_layout");
		touch.tap(ElementOption.element(sbtnper)).release().perform();
		Thread.sleep(2000);


		//Tab on done button for SH 
		AndroidElement donebtn=driver.findElementById("com.sec.android.app.shealth:id/permission_popup_positive_button");
		touch.tap(ElementOption.element(donebtn)).release().perform();
		Thread.sleep(2000);

		//input firstname
		driver.findElementById("com.samsung.android.shealthmonitor:id/mEditTextFirstName").sendKeys("Al");
		Thread.sleep(2000);

		//input lastname
		driver.findElementById("com.samsung.android.shealthmonitor:id/mEditTextLastName").sendKeys("Amin");
		Thread.sleep(2000);

		//birthdate
		AndroidElement drpdown=driver.findElementById("com.samsung.android.shealthmonitor:id/mEditBirthDay");
		touch.tap(ElementOption.element(drpdown)).release().perform();
		Thread.sleep(2000);

		//save button for birth date 
		AndroidElement savebtn=driver.findElementById("com.samsung.android.shealthmonitor:id/positive_button");
		touch.tap(ElementOption.element(savebtn)).release().perform();
		Thread.sleep(2000);


		//male select 
		AndroidElement male=driver.findElementById("com.samsung.android.shealthmonitor:id/radio_button");
		touch.tap(ElementOption.element(male)).release().perform();
		Thread.sleep(2000);

		//save for male
		AndroidElement malesave=driver.findElementById("com.samsung.android.shealthmonitor:id/positive_button");
		touch.tap(ElementOption.element(malesave)).release().perform();
		Thread.sleep(2000);

		//continue button for onboarding completed
		AndroidElement continuebtn=driver.findElementById("com.samsung.android.shealthmonitor:id/mFinishButton");
		touch.tap(ElementOption.element(continuebtn)).release().perform();
		Thread.sleep(2000);

		//view more
		AndroidElement viewmore=driver.findElementById("com.samsung.android.shealthmonitor:id/shealth_monitor_main_top_intro_view_more");
		touch.tap(ElementOption.element(viewmore)).release().perform();
		Thread.sleep(3000);

		//how to use
		AndroidElement howtouse=driver.findElementById("com.samsung.android.shealthmonitor:id/mHowToUseButton");
		touch.tap(ElementOption.element(howtouse)).release().perform();
		Thread.sleep(3000);

		//Setting up samsung health monitor
		AndroidElement sushm=driver.findElementById("com.samsung.android.shealthmonitor:id/mHowToUseProfile");
		touch.tap(ElementOption.element(sushm)).release().perform();
		Thread.sleep(3000);
		//back button
		AndroidElement backbutton=driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		touch.tap(ElementOption.element(backbutton)).release().perform();
		Thread.sleep(3000);

		//calibrating your galaxy watch
		AndroidElement caligw=driver.findElementById("com.samsung.android.shealthmonitor:id/mHowToUseOnBoarding");
		touch.tap(ElementOption.element(caligw)).release().perform();
		Thread.sleep(3000);

		//back button 
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);

		//measuring your blood pressure
		AndroidElement mbp=driver.findElementById("com.samsung.android.shealthmonitor:id/mHowToUseMeasuring");
		touch.tap(ElementOption.element(mbp)).release().perform();
		Thread.sleep(3000);
		//back button 
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();

		//reviewing your blood pressure
		AndroidElement rbp=driver.findElementById("com.samsung.android.shealthmonitor:id/mHowToUseBpResult");
		touch.tap(ElementOption.element(rbp)).release().perform();
		Thread.sleep(3000);
		//back button 
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);

		//back button
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		//back button
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);

		//tab on retry button
		AndroidElement retrybtn=driver.findElementById("com.samsung.android.shealthmonitor:id/mRetry");
		touch.tap(ElementOption.element(retrybtn)).release().perform();
		Thread.sleep(6000);

		//tab on drawer menu
		AndroidElement drawerbtn=driver.findElementById("com.samsung.android.shealthmonitor:id/mOpenDrawer");
		touch.tap(ElementOption.element(drawerbtn)).release().perform();
		Thread.sleep(3000);

		//acessories
		AndroidElement accessories=driver.findElementById("com.samsung.android.shealthmonitor:id/mAccessoriesContainer");
		touch.tap(ElementOption.element(accessories)).release().perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();

		//notifications
		AndroidElement notification=driver.findElementById("com.samsung.android.shealthmonitor:id/mNotificationContainer");
		touch.tap(ElementOption.element(notification)).release().perform();
		Thread.sleep(3000);

		//push notifications
		driver.findElementById("com.samsung.android.shealthmonitor:id/mNotificationSwitch").click();
		driver.findElementById("com.samsung.android.shealthmonitor:id/mNotificationSwitch").click();
		Thread.sleep(3000);

		//calibration reminder switch
		AndroidElement cremswitch=driver.findElementById("com.samsung.android.shealthmonitor:id/mCalibrationReminderSwitch");
		touch.tap(ElementOption.element(cremswitch)).release().perform();
		Thread.sleep(3000);

		//ECG report switch
		AndroidElement ecgreportswitch=driver.findElementById("com.samsung.android.shealthmonitor:id/mEcgResultSwitch");
		touch.tap(ElementOption.element(ecgreportswitch)).release().perform();
		Thread.sleep(3000);

		//back button
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();

		//Go to Data............
		AndroidElement data=driver.findElementById("com.samsung.android.shealthmonitor:id/mDataPermissionContainer");
		touch.tap(ElementOption.element(data)).release().perform();
		Thread.sleep(3000);

		//data permission
		AndroidElement datapermission=driver.findElementByXPath("//android.widget.TextView[@text='Samsung Health']");
		touch.tap(ElementOption.element(datapermission)).release().perform();

		//done button
		//Tab on done button for SH 
		AndroidElement donebtn2=driver.findElementById("com.sec.android.app.shealth:id/permission_popup_positive_button");
		touch.tap(ElementOption.element(donebtn2)).release().perform();
		Thread.sleep(2000);


		//download ECG Data
		AndroidElement ecgdata=driver.findElementById("com.samsung.android.shealthmonitor:id/mViewDescription");
		touch.tap(ElementOption.element(ecgdata)).release().perform();
		Thread.sleep(3000);

		//ok button 
		AndroidElement ok=driver.findElementById("com.samsung.android.shealthmonitor:id/positive_button");
		touch.tap(ElementOption.element(ok)).release().perform();
		Thread.sleep(3000);

		//back button
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();

		//How to use............
		AndroidElement howtouse2=driver.findElementById("com.samsung.android.shealthmonitor:id/mHowToUseContainer");
		touch.tap(ElementOption.element(howtouse2)).release().perform();
		Thread.sleep(3000);
		
		

		//back button for how to use
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();


		//About...............
		//....................
		AndroidElement about=driver.findElementById("com.samsung.android.shealthmonitor:id/mAboutContainer");
		touch.tap(ElementOption.element(about)).release().perform();
		Thread.sleep(3000);

		//tab on terms of use
		driver.findElementById("com.samsung.android.shealthmonitor:id/mTermOfUse").click();
		Thread.sleep(3000);
		driver.findElementById("com.samsung.android.shealthmonitor:id/view_in_pdf_app").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		//tab on Privacy policy
		driver.findElementById("com.samsung.android.shealthmonitor:id/mPrivacyPolicy").click();
		Thread.sleep(3000);
		driver.findElementById("com.samsung.android.shealthmonitor:id/view_in_pdf_app").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		//Open Source licenses
		driver.findElementById("com.samsung.android.shealthmonitor:id/mOPenSource").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);

		//Blood Pressure for IU and Label
		driver.findElementById("com.samsung.android.shealthmonitor:id/mInstructionForUse").click();
		Thread.sleep(3000);
		driver.findElementById("com.samsung.android.shealthmonitor:id/view_in_pdf_app").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		//Label
		driver.findElementById("com.samsung.android.shealthmonitor:id/mManufacturer").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);



		//ECG for IU and Label
		driver.findElementById("com.samsung.android.shealthmonitor:id/mInstructionForUse").click();
		Thread.sleep(3000);
		driver.findElementById("com.samsung.android.shealthmonitor:id/view_in_pdf_app").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);
		//Label
		driver.findElementById("com.samsung.android.shealthmonitor:id/mManufacturer").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);






		//back button
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();

		//Contact US...........
		AndroidElement contactus=driver.findElementById("com.samsung.android.shealthmonitor:id/mContactUsContainer");
		touch.tap(ElementOption.element(contactus)).release().perform();
		Thread.sleep(3000);
		//back button
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		Thread.sleep(3000);

		//drawer layout............
		AndroidElement drawerlayout=driver.findElementById("com.samsung.android.shealthmonitor:id/mOpenDrawer");
		touch.tap(ElementOption.element(drawerlayout)).release().perform();







	}


}
