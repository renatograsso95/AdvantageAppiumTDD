package br.com.rsinet.appium.tdd.teste;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.appium.tdd.Actions.searchAction;
import br.com.rsinet.appium.tdd.pageFactory.ProductPage;

import br.com.rsinet.appium.tdd.driver.DriverFactory;
import br.com.rsinet.appium.tdd.suport.ExtentReport;
import br.com.rsinet.appium.tdd.util.ScreenShot;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class testSearchText {
	public static AndroidDriver<MobileElement> driver;

	@Before
	public void startDriver() throws MalformedURLException {

		driver = br.com.rsinet.appium.tdd.driver.DriverFactory.startDriver();
	}

	ExtentTest test = ExtentReport.getTest();
	ExtentReports extent = ExtentReport.getExtent();

	@Test
	public void TextSearchValid() throws IOException {
		test = extent.startTest("Pesquisa por texto válida");

		searchAction.ExecuteValidTextSearch(driver);
		Assert.assertEquals(ProductPage.produtoText(driver).getText(), "HP PAVILION 15T TOUCH LAPTOP");
		String screenShotPath = ScreenShot.capture(driver, "TextSearchValid");
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
	}

	@Test
	public void TextSearchInvalid() throws IOException {
		test = extent.startTest("Pesquisa por texto inválida");

		searchAction.ExecuteInvalidTextSearch(driver);
		Assert.assertTrue(ProductPage.notFoundMessage(driver).getText().contains("No results for "));
		String screenShotPath = ScreenShot.capture(driver, "TextSearchInvalid");
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
	}

	@After
	public void closeDriver() {
		DriverFactory.closeDriver(driver);
	}
}
