package br.com.rsinet.appium.tdd.teste;


import static br.com.rsinet.appium.tdd.driver.DriverFactory.iniciarDriver;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import br.com.rsinet.appium.tdd.pageFactory.CadastroPage;
import br.com.rsinet.appium.tdd.pageFactory.ContaPage;
import br.com.rsinet.appium.tdd.pageFactory.HomePage;
import br.com.rsinet.appium.tdd.util.Actions;


import io.appium.java_client.android.AndroidDriver;

public class testeCadastro {

//	private AndroidDriver<MobileElement> driver;
	private AndroidDriver<WebElement> driver;
	private CadastroPage cadastro;
	private HomePage telaInicial;
	private ContaPage novaConta;
	private Actions acao;

	@Before
	public void inicio() throws MalformedURLException, InterruptedException {

		driver = iniciarDriver();
		telaInicial = new HomePage(driver);
		cadastro = new CadastroPage(driver);
		novaConta = new ContaPage(driver);
		acao = new Actions(driver);
	}

	@Test
	public void deveFazerUmtesteComSucesso() throws Exception {

		telaInicial.clicarMenu();
		
		novaConta.clickLogin();
		novaConta.criarContaNova();

		cadastro.usuario();
		cadastro.email();
		cadastro.senha();
		cadastro.confirmeSenha();

		cadastro.primeiroNome();
		cadastro.ultimoNome();
		cadastro.telefone();

		acao.scrollPais();
		
		cadastro.pais(driver);
		cadastro.estado();
		cadastro.endereco();
		cadastro.cidade();
		cadastro.cartaoPostal();
		
		acao.scrollRegistro();
		
		cadastro.Registrar();
		
		telaInicial.clicarMenu();
	}

	@After
	public void finalizar() throws Exception {

		Thread.sleep(3000);
		driver.quit();
	}

}