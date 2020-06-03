package br.ce.wcaquino.pages;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import br.ce.wcaquino.core.BasePage;

public class PokemonPage1 extends BasePage {

	public void verDetalhes1() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnBulbasaur");
		Assert.assertEquals("BULBASAUR", obterTexto("1"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes2() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnIvysaur");
		Assert.assertEquals("IVYSAUR", obterTexto("2"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes3() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnVenusaur");
		Assert.assertEquals("VENUSAUR", obterTexto("3"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes4() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnCharmander");
		Assert.assertEquals("CHARMANDER", obterTexto("4"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes5() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnCharmeleon");
		Assert.assertEquals("CHARMELEON", obterTexto("5"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes6() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnCharizard");
		Assert.assertEquals("CHARIZARD", obterTexto("6"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes7() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnSquirtle");
		Assert.assertEquals("SQUIRTLE", obterTexto("7"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes8() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnWartortle");
		Assert.assertEquals("WARTORTLE", obterTexto("8"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes9() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnBlastoise");
		Assert.assertEquals("BLASTOISE", obterTexto("9"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes10() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnCaterpie");
		Assert.assertEquals("CATERPIE", obterTexto("10"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes11() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnMetapod");
		Assert.assertEquals("METAPOD", obterTexto("11"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes12() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnButterfree");
		Assert.assertEquals("BUTTERFREE", obterTexto("12"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes13() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnWeedle");
		Assert.assertEquals("WEEDLE", obterTexto("13"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes14() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnKakuna");
		Assert.assertEquals("KAKUNA", obterTexto("14"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes15() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnBeedrill");
		Assert.assertEquals("BEEDRILL", obterTexto("15"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes16() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnPidgey");
		Assert.assertEquals("PIDGEY", obterTexto("16"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes17() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnPidgeotto");
		Assert.assertEquals("PIDGEOTTO", obterTexto("17"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes18() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnPidgeot");
		Assert.assertEquals("PIDGEOT", obterTexto("18"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes19() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnRattata");
		Assert.assertEquals("RATTATA", obterTexto("19"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes20() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnRaticate");
		Assert.assertEquals("RATICATE", obterTexto("20"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

}
