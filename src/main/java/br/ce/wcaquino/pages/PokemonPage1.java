package br.ce.wcaquino.pages;

import org.junit.Assert;

import br.ce.wcaquino.core.BasePage;

public class PokemonPage1 extends BasePage {

	public void verDetalhes1() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("btnBulbasaur");
		Assert.assertEquals("BULBASAUR", obterTexto("1"));

	}
	
	public void verDetalhes2() throws InterruptedException {
		clicarBotao("btnIvysaur");
		Assert.assertEquals("IVYSAUR", obterTexto("2"));

	}
	
	public void verDetalhes3() throws InterruptedException {
		clicarBotao("btnVenusaur");
		Assert.assertEquals("VENUSAUR", obterTexto("3"));

	}
	
	public void verDetalhes4() throws InterruptedException {
		clicarBotao("btnCharmander");
		Assert.assertEquals("CHARMANDER", obterTexto("4"));

	}
	
	public void verDetalhes5() throws InterruptedException {
		clicarBotao("btnCharmeleon");
		Assert.assertEquals("CHARMELEON", obterTexto("5"));

	}
	
	public void verDetalhes6() throws InterruptedException {
		clicarBotao("btnCharizard");
		Assert.assertEquals("CHARIZARD", obterTexto("6"));

	}
	
	public void verDetalhes7() throws InterruptedException {
		clicarBotao("btnSquirtle");
		Assert.assertEquals("SQUIRTLE", obterTexto("7"));

	}
	
	public void verDetalhes8() throws InterruptedException {
		clicarBotao("btnWartortle");
		Assert.assertEquals("WARTORTLE", obterTexto("8"));

	}
	
	public void verDetalhes9() throws InterruptedException {
		clicarBotao("btnBlastoise");
		Assert.assertEquals("BLASTOISE", obterTexto("9"));

	}
	
	public void verDetalhes10() throws InterruptedException {
		clicarBotao("btnCaterpie");
		Assert.assertEquals("CATERPIE", obterTexto("10"));

	}
	
	public void verDetalhes11() throws InterruptedException {
		clicarBotao("btnMetapod");
		Assert.assertEquals("METAPOD", obterTexto("11"));

	}
	
	public void verDetalhes12() throws InterruptedException {
		clicarBotao("btnButterfree");
		Assert.assertEquals("BUTTERFREE", obterTexto("12"));

	}
	
	public void verDetalhes13() throws InterruptedException {
		clicarBotao("btnWeedle");
		Assert.assertEquals("WEEDLE", obterTexto("13"));

	}
	
	public void verDetalhes14() throws InterruptedException {
		clicarBotao("btnKakuna");
		Assert.assertEquals("KAKUNA", obterTexto("14"));

	}
	
	public void verDetalhes15() throws InterruptedException {
		clicarBotao("btnBeedrill");
		Assert.assertEquals("BEEDRILL", obterTexto("15"));

	}
	
	public void verDetalhes16() throws InterruptedException {
		clicarBotao("btnPidgey");
		Assert.assertEquals("PIDGEY", obterTexto("16"));

	}
	
	public void verDetalhes17() throws InterruptedException {
		clicarBotao("btnPidgeotto");
		Assert.assertEquals("PIDGEOTTO", obterTexto("17"));

	}
	
	public void verDetalhes18() throws InterruptedException {
		clicarBotao("btnPidgeot");
		Assert.assertEquals("PIDGEOT", obterTexto("18"));

	}
	
	public void verDetalhes19() throws InterruptedException {
		clicarBotao("btnRattata");
		Assert.assertEquals("RATTATA", obterTexto("19"));

	}
	
	public void verDetalhes20() throws InterruptedException {
		clicarBotao("btnRaticate");
		Assert.assertEquals("RATICATE", obterTexto("20"));

	}

}
