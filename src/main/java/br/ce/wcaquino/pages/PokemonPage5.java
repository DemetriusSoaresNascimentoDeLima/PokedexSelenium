package br.ce.wcaquino.pages;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import br.ce.wcaquino.core.BasePage;

public class PokemonPage5 extends BasePage {

	public void verDetalhes81() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMagnemite");
		Assert.assertEquals("MAGNEMITE", obterTexto("81"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes82() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMagneton");
		Assert.assertEquals("MAGNETON", obterTexto("82"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes83() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnFarfetchd");
		Assert.assertEquals("FARFETCHD", obterTexto("83"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes84() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnDoduo");
		Assert.assertEquals("DODUO", obterTexto("84"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes85() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnDodrio");
		Assert.assertEquals("DODRIO", obterTexto("85"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes86() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnSeel");
		Assert.assertEquals("SEEL", obterTexto("86"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes87() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnDewgong");
		Assert.assertEquals("DEWGONG", obterTexto("87"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes88() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGrimer");
		Assert.assertEquals("GRIMER", obterTexto("88"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes89() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMuk");
		Assert.assertEquals("MUK", obterTexto("89"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes90() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnShellder");
		Assert.assertEquals("SHELLDER", obterTexto("90"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes91() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnCloyster");
		Assert.assertEquals("CLOYSTER", obterTexto("91"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes92() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGastly");
		Assert.assertEquals("GASTLY", obterTexto("92"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes93() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnHaunter");
		Assert.assertEquals("HAUNTER", obterTexto("93"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes94() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGengar");
		Assert.assertEquals("GENGAR", obterTexto("94"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes95() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnOnix");
		Assert.assertEquals("ONIX", obterTexto("95"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes96() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnDrowzee");
		Assert.assertEquals("DROWZEE", obterTexto("96"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes97() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnHypno");
		Assert.assertEquals("HYPNO", obterTexto("97"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes98() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnKrabby");
		Assert.assertEquals("KRABBY", obterTexto("98"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes99() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnKingler");
		Assert.assertEquals("KINGLER", obterTexto("99"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}
	
	public void verDetalhes100() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnVoltorb");
		Assert.assertEquals("VOLTORB", obterTexto("100"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

}
