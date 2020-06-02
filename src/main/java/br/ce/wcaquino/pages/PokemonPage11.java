package br.ce.wcaquino.pages;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import br.ce.wcaquino.core.BasePage;

public class PokemonPage11 extends BasePage {

	public void verDetalhes201() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnUnown");
		Assert.assertEquals("UNOWN", obterTexto("201"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes202() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
        clicarBotao("btnWobbuffet");
		Assert.assertEquals("WOBBUFFET", obterTexto("202"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes203() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGirafarig");
		Assert.assertEquals("GIRAFARIG", obterTexto("203"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes204() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnPineco");
		Assert.assertEquals("PINECO", obterTexto("204"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes205() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnForretress");
		Assert.assertEquals("FORRETRESS", obterTexto("205"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes206() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnDunsparce");
		Assert.assertEquals("DUNSPARCE", obterTexto("206"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes207() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGligar");
		Assert.assertEquals("GLIGAR", obterTexto("207"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes208() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnSteelix");
		Assert.assertEquals("STEELIX", obterTexto("208"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes209() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnSnubbull");
		Assert.assertEquals("SNUBBULL", obterTexto("209"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes210() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnGranbull");
		Assert.assertEquals("GRANBULL", obterTexto("210"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes211() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnQwilfish");
		Assert.assertEquals("QWILFISH", obterTexto("211"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes212() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnScizor");
		Assert.assertEquals("SCIZOR", obterTexto("212"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes213() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnShuckle");
		Assert.assertEquals("SHUCKLE", obterTexto("213"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes214() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnHeracross");
		Assert.assertEquals("HERACROSS", obterTexto("214"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes215() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnSneasel");
		Assert.assertEquals("SNEASEL", obterTexto("215"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes216() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnTeddiursa");
		Assert.assertEquals("TEDDIURSA", obterTexto("216"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes217() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnUrsaring");
		Assert.assertEquals("URSARING", obterTexto("217"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes218() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnSlugma");
		Assert.assertEquals("SLUGMA", obterTexto("218"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes219() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMagcargo");
		Assert.assertEquals("MAGCARGO", obterTexto("219"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes220() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnSwinub");
		Assert.assertEquals("SWINUB", obterTexto("220"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

}
