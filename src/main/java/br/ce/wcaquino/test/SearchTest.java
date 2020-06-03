package br.ce.wcaquino.test;

import org.junit.Test;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.pages.SearchPage;

public class SearchTest extends BaseTest {
	
	SearchPage searchPage = new SearchPage();
	
	@Test
	public void testSearch() throws InterruptedException {
		searchPage.search("Bulbasaur");
	}

}
