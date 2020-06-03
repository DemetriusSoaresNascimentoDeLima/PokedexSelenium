package br.ce.wcaquino.pages;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import br.ce.wcaquino.core.BasePage;

public class SearchPage extends BasePage {
	
	public void search(String nome) {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("searchBar");
		escrever("searchBar", nome);
		Assert.assertEquals("Bulbasaur", obterTexto("1"));
	}

}
