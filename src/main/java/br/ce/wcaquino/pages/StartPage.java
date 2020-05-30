package br.ce.wcaquino.pages;

import br.ce.wcaquino.core.BasePage;
import br.ce.wcaquino.core.DriverFactory;

public class StartPage extends BasePage {
	
	public void acessarTelaInicial() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ClarissadaNobregaDia\\Downloads\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
		DriverFactory.getDriver().get("http://localhost:4200/");
	}
	
		
}
