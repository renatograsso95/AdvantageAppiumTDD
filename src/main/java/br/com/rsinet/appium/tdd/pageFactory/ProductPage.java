package br.com.rsinet.appium.tdd.pageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProductPage {

	static AndroidDriver<MobileElement> driver;

	public static MobileElement produto(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.widget.RelativeLayout[@content-desc=\"Speakers\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]");
	}

	public static MobileElement produtoText(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewProductName");
	}

	public static MobileElement produtoSearchTxt(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]");
	}

	public static MobileElement notFoundMessage(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewNoProductsToShow");
	}

}