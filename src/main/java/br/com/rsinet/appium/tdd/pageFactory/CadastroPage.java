package br.com.rsinet.appium.tdd.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;


public class CadastroPage {

	private WebDriverWait wait;
	private WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/child::*[1]")
	private WebElement username;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextEmail']/child::*[1]")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPassword']/child::*[1]")
	private WebElement senha;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextConfirmPassword']/child::*[1]")
	private WebElement confirmarSenha;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextFirstName']/child::*[1]")
	private WebElement nome;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLastName']/child::*[1]")
	private WebElement ultimoNome;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPhoneNumber']/child::*[1]")
	private WebElement telefone;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountries")
	private WebElement pais;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]")
	private WebElement txtbx_Estado;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/child::*[1]")
	private WebElement txtbx_Endereco;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/child::*[1]")
	public WebElement txtbx_Cidade;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/child::*[1]")
	private WebElement txtbx_CartaoPostal;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement btn_Registrar;

	public CadastroPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 20);
	}

	public void usuario() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(username)).click();
		username.sendKeys("jsk123");
	}

	public void email() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(email)).click();
		email.sendKeys("renatograsso@gmail.com");
	}

	public void senha() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(senha)).click();
		senha.sendKeys("Renato1@");

	}

	public void confirmeSenha() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(confirmarSenha)).click();
		confirmarSenha.sendKeys("Renato1@");
	}

	public void primeiroNome() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(nome)).click();
		nome.sendKeys("Renato");
	}

	public void ultimoNome() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(ultimoNome)).click();
		ultimoNome.sendKeys("Grasso");
	}

	public void telefone() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(telefone)).click();
		telefone.sendKeys("(11)96837-6190");
	}

	public void pais(AndroidDriver<WebElement> driver) {

		wait.until(ExpectedConditions.visibilityOf(pais)).click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Brazil" + "\").instance(0))")
				.click();
	}

	public void cidade() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(txtbx_Cidade)).click();
		txtbx_Cidade.sendKeys("São Paulo");
	}

	public void endereco() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(txtbx_Endereco)).click();
		txtbx_Endereco.sendKeys("Rua Soriano de Souza");
	}

	public void estado() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(txtbx_Estado)).click();
		txtbx_Estado.sendKeys("São Paulo");
	}

	public void cartaoPostal() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(txtbx_CartaoPostal)).click();
		txtbx_CartaoPostal.sendKeys("01010-000");
	}
	public void Registrar() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(btn_Registrar));
		btn_Registrar.click();
	}
}