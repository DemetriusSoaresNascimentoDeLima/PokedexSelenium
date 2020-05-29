package br.ce.wcaquino.pages;

import org.junit.Assert;

import br.ce.wcaquino.core.BasePage;

public class PokemonPage2 extends BasePage {

	public void verDetalhes21() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnSpearow");
		Assert.assertEquals("SPEAROW", obterTexto("21"));

	}
	
	public void verDetalhes22() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnFearow");
		Assert.assertEquals("FEAROW", obterTexto("22"));

	}
	
	public void verDetalhes23() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnEkans");
		Assert.assertEquals("EKANS", obterTexto("23"));

	}
	
	public void verDetalhes24() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnArbok");
		Assert.assertEquals("ARBOK", obterTexto("24"));

	}
	
	public void verDetalhes25() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnPikachu");
		Assert.assertEquals("PIKACHU", obterTexto("25"));

	}
	
	public void verDetalhes26() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnRaichu");
		Assert.assertEquals("RAICHU", obterTexto("26"));

	}
	
	public void verDetalhes27() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnSandshrew");
		Assert.assertEquals("SANDSHREW", obterTexto("27"));

	}
	
	public void verDetalhes28() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnSandslash");
		Assert.assertEquals("SANDSLASH", obterTexto("28"));

	}
	
	public void verDetalhes29() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnNidoran-f");
		Assert.assertEquals("NIDORAN-F", obterTexto("29"));

	}
	
	public void verDetalhes30() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnNidorina");
		Assert.assertEquals("NIDORINA", obterTexto("30"));

	}
	
	public void verDetalhes31() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnNidoqueen");
		Assert.assertEquals("NIDOQUEEN", obterTexto("31"));

	}
	
	public void verDetalhes32() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnNidoran-m");
		Assert.assertEquals("NIDORAN-M", obterTexto("32"));

	}
	
	public void verDetalhes33() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnNidorino");
		Assert.assertEquals("NIDORINO", obterTexto("33"));

	}
	
	public void verDetalhes34() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnNidoking");
		Assert.assertEquals("NIDOKING", obterTexto("34"));

	}
	
	public void verDetalhes35() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnClefairy");
		Assert.assertEquals("CLEFAIRY", obterTexto("35"));

	}
	
	public void verDetalhes36() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnClefable");
		Assert.assertEquals("CLEFABLE", obterTexto("36"));

	}
	
	public void verDetalhes37() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnVulpix");
		Assert.assertEquals("VULPIX", obterTexto("37"));

	}
	
	public void verDetalhes38() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnNinetales");
		Assert.assertEquals("NINETALES", obterTexto("38"));

	}
	
	public void verDetalhes39() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnJigglypuff");
		Assert.assertEquals("JIGGLYPUFF", obterTexto("39"));

	}
	
	public void verDetalhes40() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("next");
		clicarBotao("btnWigglytuff");
		Assert.assertEquals("WIGGLYTUFF", obterTexto("40"));

	}

}
