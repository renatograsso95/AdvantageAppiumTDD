package br.com.rsinet.appium.tdd.teste;
import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.appium.tdd.Actions.registerAction;
import br.com.rsinet.appium.tdd.driver.DriverFactory;
import br.com.rsinet.appium.tdd.suport.ExtentReport;
import br.com.rsinet.appium.tdd.util.ScreenShot;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class testeCadastro {

	public static AndroidDriver<MobileElement> driver;

	@Before
	public void startDriver() throws MalformedURLException {

		driver = br.com.rsinet.appium.tdd.driver.DriverFactory.startDriver();
	}

	ExtentTest test = ExtentReport.getTest();
	ExtentReports extent = ExtentReport.getExtent();

	@Test
	public void RegisterValid() throws InterruptedException, IOException {
		test = extent.startTest("Registro válido");

		registerAction.ExecuteRegister(driver);
		String screenShotPath = ScreenShot.capture(driver, "RegisterValid");
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
	}

	@Test
	public void RegisterInvalid() throws IOException {

		test = extent.startTest("Registro inválido");

		registerAction.ExecuteInvalidRegister(driver);
		String screenShotPath = ScreenShot.capture(driver, "RegisterInvalid");
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
	}

	@After
	public void closeDriver() {
		DriverFactory.closeDriver(driver);
	}
}