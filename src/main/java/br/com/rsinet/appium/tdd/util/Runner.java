package br.com.rsinet.appium.tdd.util;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rsinet.appium.tdd.teste.pesquisaTeste;
import br.com.rsinet.appium.tdd.teste.testSearchText;
import br.com.rsinet.appium.tdd.teste.testeCadastro;
import br.com.rsinet.appium.tdd.suport.ExtentReport;

@RunWith(Suite.class)
@SuiteClasses({  testeCadastro.class, pesquisaTeste.class, testSearchText.class })
public class Runner {

	@BeforeClass
	public static void iniciaReport() {
		ExtentReport.iniciaReport();
	}

	@AfterClass
	public static void fecharReport() {
		ExtentReport.fechaReport();
	}

}