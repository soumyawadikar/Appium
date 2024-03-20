package Appiumproject.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumBasics {

         

	@Test
	
	/*public void appiumTest() throws MalformedURLException {
	
		
		File f= new File("src");
		File fs= new File(f,"ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Niharika");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		//UiAutomator2Options options=new UiAutomator2Options();
	//options.setDeviceName("soumyaemulator1");
		//options.setApp("//Users//excel//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	}*/
	
	public void Launch() throws MalformedURLException {
		UiAutomator2Options opt=new UiAutomator2Options();
		opt.setPlatformName("Android");
		opt.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
		opt.setDeviceName("Niharika");
		opt.setAppActivity("com.touchboarder.androidapidemos.MainActivity");
		opt.setAppPackage("com.touchboarder.android.api.demos");
		opt.setApp("C:\\Users\\excel\\Downloads\\base.apk");
		opt.setNoReset(false);
		opt.setFullReset(true);		
		AndroidDriver driver;
		new AndroidDriver(new URL("http://127.0.0.1:4723"),opt);
	

}
}
