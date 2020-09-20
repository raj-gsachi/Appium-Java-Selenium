import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends mobileMain {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementByClassName("android.widget.CheckBox").click();
		driver.findElementByXPath("//android.widget.LinearLayout[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("HELLO WORLD..!!");
		driver.findElementsByXPath("//android.widget.Button").get(0).click();

	}

	

}
