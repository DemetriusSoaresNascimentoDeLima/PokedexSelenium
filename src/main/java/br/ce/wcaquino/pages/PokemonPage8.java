package br.ce.wcaquino.pages;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import br.ce.wcaquino.core.BasePage;
import br.ce.wcaquino.core.DriverFactory;

public class PokemonPage8 extends BasePage {

	public void verDetalhes141() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnKabutops");
		Assert.assertEquals("KABUTOPS", obterTexto("141"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes142() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
        clicarBotao("btnAerodactyl");
		Assert.assertEquals("AERODACTYL", obterTexto("142"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes143() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnSnorlax");
		Assert.assertEquals("SNORLAX", obterTexto("143"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes144() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnArticuno");
		Assert.assertEquals("ARTICUNO", obterTexto("144"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes145() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnZapdos");
		Assert.assertEquals("ZAPDOS", obterTexto("145"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes146() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMoltres");
		Assert.assertEquals("MOLTRES", obterTexto("146"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes147() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnDratini");
		Assert.assertEquals("DRATINI", obterTexto("147"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes148() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnDragonair");
		Assert.assertEquals("DRAGONAIR", obterTexto("148"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes149() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnDragonite");
		Assert.assertEquals("DRAGONITE", obterTexto("149"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes150() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMewtwo");
		Assert.assertEquals("MEWTWO", obterTexto("150"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes151() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMew");
		Assert.assertEquals("MEW", obterTexto("151"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes152() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnChikorita");
		Assert.assertEquals("CHIKORITA", obterTexto("152"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes153() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnBayleef");
		Assert.assertEquals("BAYLEEF", obterTexto("153"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes154() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnMeganium");
		Assert.assertEquals("MEGANIUM", obterTexto("154"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes155() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnCyndaquil");
		Assert.assertEquals("CYNDAQUIL", obterTexto("155"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes156() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnQuilava");
		Assert.assertEquals("QUILAVA", obterTexto("156"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes157() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnTyphlosion");
		Assert.assertEquals("TYPHLOSION", obterTexto("157"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes158() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnTotodile");
		Assert.assertEquals("TOTODILE", obterTexto("158"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes159() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnCroconaw");
		Assert.assertEquals("CROCONAW", obterTexto("159"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public void verDetalhes160() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("next");
		clicarBotao("btnFeraligatr");
		Assert.assertEquals("FERALIGATR", obterTexto("160"));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

}
