package br.com.rsinet.appium.tdd.Actions;


import org.junit.Assert;
import br.com.rsinet.appium.tdd.pageFactory.HomePage;
import br.com.rsinet.appium.tdd.pageFactory.ProductPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class searchAction {
	static TouchAction action;

	public static void ExecuteValidTextSearch(AndroidDriver<MobileElement> driver) {

		HomePage.btnSearch(driver).click();
		HomePage.boxSearch(driver).sendKeys("HP");
		HomePage.btnSearch(driver).click();
		ProductPage.produtoSearchTxt(driver).click();
		
	}

	public static void ExecuteInvalidTextSearch(AndroidDriver<MobileElement> driver) {

		HomePage.btnSearch(driver).click();
		HomePage.boxSearch(driver).sendKeys("iPhone");
		HomePage.btnSearch(driver).click();

		
	}
}