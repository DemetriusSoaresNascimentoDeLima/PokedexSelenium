package br.ce.wcaquino.pages;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import br.ce.wcaquino.core.BasePage;

public class PokemonPage3 extends BasePage {

	public void verDetalhes41() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnZubat");
		Assert.assertEquals("ZUBAT", obterTexto("41"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes42() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGolbat");
		Assert.assertEquals("GOLBAT", obterTexto("42"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes43() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnOddish");
		Assert.assertEquals("ODDISH", obterTexto("43"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes44() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGloom");
		Assert.assertEquals("GLOOM", obterTexto("44"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes45() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnVileplume");
		Assert.assertEquals("VILEPLUME", obterTexto("45"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes46() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnParas");
		Assert.assertEquals("PARAS", obterTexto("46"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes47() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnParasect");
		Assert.assertEquals("PARASECT", obterTexto("47"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes48() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnVenonat");
		Assert.assertEquals("VENONAT", obterTexto("48"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes49() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnVenomoth");
		Assert.assertEquals("VENOMOTH", obterTexto("49"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes50() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnDiglett");
		Assert.assertEquals("DIGLETT", obterTexto("50"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes51() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnDugtrio");
		Assert.assertEquals("DUGTRIO", obterTexto("51"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes52() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMeowth");
		Assert.assertEquals("MEOWTH", obterTexto("52"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes53() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnPersian");
		Assert.assertEquals("PERSIAN", obterTexto("53"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes54() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnPsyduck");
		Assert.assertEquals("PSYDUCK", obterTexto("54"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes55() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGolduck");
		Assert.assertEquals("GOLDUCK", obterTexto("55"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes56() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMankey");
		Assert.assertEquals("MANKEY", obterTexto("56"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes57() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnPrimeape");
		Assert.assertEquals("PRIMEAPE", obterTexto("57"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes58() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGrowlithe");
		Assert.assertEquals("GROWLITHE", obterTexto("58"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes59() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnArcanine");
		Assert.assertEquals("ARCANINE", obterTexto("59"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes60() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnPoliwag");
		Assert.assertEquals("POLIWAG", obterTexto("60"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

}
