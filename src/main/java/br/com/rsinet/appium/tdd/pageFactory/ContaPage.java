package br.com.rsinet.appium.tdd.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContaPage {
	
	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement login;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewSingUpToday")
	private WebElement createAcc;
	
	public ContaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 20);
}
	
	public void clickLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}

	public void criarContaNova() {
		wait.until(ExpectedConditions.elementToBeClickable(createAcc));
		createAcc.click();
	}
	
}