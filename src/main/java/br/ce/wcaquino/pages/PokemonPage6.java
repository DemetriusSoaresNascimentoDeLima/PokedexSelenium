package br.ce.wcaquino.pages;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import br.ce.wcaquino.core.BasePage;

public class PokemonPage6 extends BasePage {

	public void verDetalhes101() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnElectrode");
		Assert.assertEquals("ELECTRODE", obterTexto("101"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes102() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnExeggcute");
		Assert.assertEquals("EXEGGCUTE", obterTexto("102"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes103() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnExeggutor");
		Assert.assertEquals("EXEGGUTOR", obterTexto("103"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes104() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnCubone");
		Assert.assertEquals("CUBONE", obterTexto("104"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes105() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMarowak");
		Assert.assertEquals("MAROWAK", obterTexto("105"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes106() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnHitmonlee");
		Assert.assertEquals("HITMONLEE", obterTexto("106"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes107() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnHitmonchan");
		Assert.assertEquals("HITMONCHAN", obterTexto("107"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes108() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnLickitung");
		Assert.assertEquals("LICKITUNG", obterTexto("108"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes109() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnKoffing");
		Assert.assertEquals("KOFFING", obterTexto("109"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes110() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnWeezing");
		Assert.assertEquals("WEEZING", obterTexto("110"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes111() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnRhyhorn");
		Assert.assertEquals("RHYHORN", obterTexto("111"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes112() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnRhydon");
		Assert.assertEquals("RHYDON", obterTexto("112"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes113() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnChansey");
		Assert.assertEquals("CHANSEY", obterTexto("113"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes114() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnTangela");
		Assert.assertEquals("TANGELA", obterTexto("114"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes115() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnKangaskhan");
		Assert.assertEquals("KANGASKHAN", obterTexto("115"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes116() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnHorsea");
		Assert.assertEquals("HORSEA", obterTexto("116"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes117() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnSeadra");
		Assert.assertEquals("SEADRA", obterTexto("117"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes118() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGoldeen");
		Assert.assertEquals("GOLDEEN", obterTexto("118"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes119() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnSeaking");
		Assert.assertEquals("SEAKING", obterTexto("119"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes120() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnStaryu");
		Assert.assertEquals("STARYU", obterTexto("120"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

}
