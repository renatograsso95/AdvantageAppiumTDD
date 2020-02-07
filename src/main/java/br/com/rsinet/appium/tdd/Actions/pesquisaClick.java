package br.com.rsinet.appium.tdd.Actions;

import java.time.Duration;

import br.com.rsinet.appium.tdd.pageFactory.HomePage;
import br.com.rsinet.appium.tdd.pageFactory.ProductPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;

public class pesquisaClick {

	static TouchAction action;

	public static void ExecuteClickSearch(AndroidDriver<MobileElement> driver) {
		action = new TouchAction(driver);

		HomePage.categorySpeaker(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
		ProductPage.produto(driver).click();
	}
}