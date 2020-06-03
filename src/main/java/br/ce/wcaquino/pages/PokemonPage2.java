package br.ce.wcaquino.pages;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import br.ce.wcaquino.core.BasePage;

public class PokemonPage2 extends BasePage {

	public void verDetalhes21() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		clicarBotao("next");
		clicarBotao("btnSpearow");
		Assert.assertEquals("SPEAROW", obterTexto("21"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		

	}
	
	public void verDetalhes22() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnFearow");
		Assert.assertEquals("FEAROW", obterTexto("22"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes23() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnEkans");
		Assert.assertEquals("EKANS", obterTexto("23"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes24() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnArbok");
		Assert.assertEquals("ARBOK", obterTexto("24"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes25() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnPikachu");
		Assert.assertEquals("PIKACHU", obterTexto("25"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes26() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnRaichu");
		Assert.assertEquals("RAICHU", obterTexto("26"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes27() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnSandshrew");
		Assert.assertEquals("SANDSHREW", obterTexto("27"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes28() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnSandslash");
		Assert.assertEquals("SANDSLASH", obterTexto("28"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes29() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnNidoran-f");
		Assert.assertEquals("NIDORAN-F", obterTexto("29"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes30() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnNidorina");
		Assert.assertEquals("NIDORINA", obterTexto("30"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes31() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnNidoqueen");
		Assert.assertEquals("NIDOQUEEN", obterTexto("31"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes32() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnNidoran-m");
		Assert.assertEquals("NIDORAN-M", obterTexto("32"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes33() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnNidorino");
		Assert.assertEquals("NIDORINO", obterTexto("33"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes34() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnNidoking");
		Assert.assertEquals("NIDOKING", obterTexto("34"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes35() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnClefairy");
		Assert.assertEquals("CLEFAIRY", obterTexto("35"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes36() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnClefable");
		Assert.assertEquals("CLEFABLE", obterTexto("36"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes37() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnVulpix");
		Assert.assertEquals("VULPIX", obterTexto("37"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes38() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnNinetales");
		Assert.assertEquals("NINETALES", obterTexto("38"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes39() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnJigglypuff");
		Assert.assertEquals("JIGGLYPUFF", obterTexto("39"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes40() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("btnWigglytuff");
		Assert.assertEquals("WIGGLYTUFF", obterTexto("40"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

}
