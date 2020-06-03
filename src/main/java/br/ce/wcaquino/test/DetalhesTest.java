package br.ce.wcaquino.test;

import org.junit.Test;

import br.ce.wcaquino.core.BaseTest;


import br.ce.wcaquino.pages.DetalhesPage;

public class DetalhesTest extends BaseTest {
	
	DetalhesPage detalhesPage = new DetalhesPage();
	
	@Test
	public void testDetalhes() throws InterruptedException {
		detalhesPage.detalhes();
	}

}
