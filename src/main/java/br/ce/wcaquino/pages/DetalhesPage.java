package br.ce.wcaquino.pages;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.ce.wcaquino.core.BasePage;

public class DetalhesPage extends BasePage {
	
	public void detalhes() {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao("btnBulbasaur");
		Assert.assertEquals("Pokémon Details", obterTexto(By.xpath("//p")));
		clicarBotao("btnGoBack");
		Assert.assertEquals("Pokémon List", obterTexto(By.xpath("//*[.='Pokémon List']")));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
	}

}
