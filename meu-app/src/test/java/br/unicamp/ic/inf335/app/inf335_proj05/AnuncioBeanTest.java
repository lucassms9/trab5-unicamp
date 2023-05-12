package br.unicamp.ic.inf335.app.inf335_proj05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

class AnuncioBeanTest {

	private ProdutoBean produto;
	private ArrayList<URL> fotosUrl;
	private Double desconto;
	private AnuncioBean anuncio;

	@BeforeEach
	public void setUp() throws MalformedURLException {
		produto = new ProdutoBean("codigo-1", "nome-1", "descricao-1", 100.00, "SP");

		fotosUrl = new ArrayList<>();
		fotosUrl.add(new URL("http://example.com/foto1.jpg"));
		fotosUrl.add(new URL("http://example.com/foto2.jpg"));
		
		desconto = 10.0;
		anuncio =  new AnuncioBean(produto, fotosUrl, desconto);
	}
	    
	@Test
	void testGetValor() {
		Double expectedValue = 90.0;
		
	    assertEquals(expectedValue, anuncio.getValor());
	}

}
