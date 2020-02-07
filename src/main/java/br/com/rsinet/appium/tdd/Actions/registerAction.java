package br.com.rsinet.appium.tdd.Actions;

import java.time.Duration;

import org.junit.Assert;

import br.com.rsinet.appium.tdd.pageFactory.HomePage;
import br.com.rsinet.appium.tdd.pageFactory.CadastroPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;

public class registerAction {

	static TouchAction action;

	static String user = "renatgo12";

	public static void ExecuteRegister(AndroidDriver<MobileElement> driver) {
		action = new TouchAction(driver);

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		HomePage.optionsBtn(driver).click();
		HomePage.loginBtn(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
		HomePage.createLnk(driver).click();
		CadastroPage.bxUsername(driver).click();
		CadastroPage.bxUsername(driver).sendKeys(user);
		CadastroPage.bxEmail(driver).click();
		CadastroPage.bxEmail(driver).sendKeys("renato.nascimento@rsinet.com.br");
		CadastroPage.bxPassword(driver).click();
		CadastroPage.bxPassword(driver).sendKeys("Renato1@");
		CadastroPage.bxConfirmPassword(driver).click();
		CadastroPage.bxConfirmPassword(driver).sendKeys("Renato1@");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxFirstName(driver).sendKeys("Renato");
		CadastroPage.bxLastName(driver).click();
		CadastroPage.bxLastName(driver).sendKeys("Grasso");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxState(driver).sendKeys("São Paulo");
		CadastroPage.bxCountry(driver).click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Brazil" + "\").instance(0))")
				.click();
		CadastroPage.bxPhoneNumber(driver).click();
		CadastroPage.bxPhoneNumber(driver).sendKeys("11111111");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxState(driver).click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxAdress(driver).sendKeys("Rua da Silva");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxCity(driver).sendKeys("São Paulo");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxZip(driver).click();
		CadastroPage.bxZip(driver).sendKeys("03066020");
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "REGISTER" + "\").instance(0))");
		CadastroPage.btnRegister(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
		HomePage.optionsBtn(driver).click();
		Assert.assertTrue(HomePage.usernameCheck(driver).getText().contains(user));
	}

	public static void ExecuteInvalidRegister(AndroidDriver<MobileElement> driver) {
		action = new TouchAction(driver);

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		HomePage.optionsBtn(driver).click();
		HomePage.loginBtn(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
		HomePage.createLnk(driver).click();
		CadastroPage.bxUsername(driver).click();
		CadastroPage.bxUsername(driver).sendKeys("renatgo12");
		CadastroPage.bxEmail(driver).click();
		CadastroPage.bxEmail(driver).sendKeys("renato.nascimento@rsinet.com.br");
		CadastroPage.bxPassword(driver).click();
		CadastroPage.bxPassword(driver).sendKeys("Test1234");
		CadastroPage.bxConfirmPassword(driver).click();
		CadastroPage.bxConfirmPassword(driver).sendKeys("Test12341");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxFirstName(driver).sendKeys("Renato");
		CadastroPage.bxLastName(driver).click();
		CadastroPage.bxLastName(driver).sendKeys("Grasso");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxState(driver).sendKeys("São Paulo");
		CadastroPage.bxCountry(driver).click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Brazil" + "\").instance(0))")
				.click();
		CadastroPage.bxPhoneNumber(driver).click();
		CadastroPage.bxPhoneNumber(driver).sendKeys("11111111");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxState(driver).click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxAdress(driver).sendKeys("Rua da Silva");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		CadastroPage.bxCity(driver).sendKeys("São Paulo");
		CadastroPage.bxZip(driver).click();
		CadastroPage.bxZip(driver).sendKeys("03066020");
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "REGISTER" + "\").instance(0))");
		Assert.assertFalse(CadastroPage.btnRegister(driver).isEnabled());
	}
}