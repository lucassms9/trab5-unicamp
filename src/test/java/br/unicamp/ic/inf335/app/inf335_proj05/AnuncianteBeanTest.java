package br.unicamp.ic.inf335.app.inf335_proj05;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnuncianteBeanTest {
	
	@Test
	void testAddAnuncio() {
		var anuncios = new ArrayList<AnuncioBean>();
		
		ProdutoBean produto = new ProdutoBean("codigo-1", "nome-1", "descricao-1", 10.00, "SP");
		
		var urls =  new ArrayList<URL>();
		
		AnuncianteBean anunciante = new AnuncianteBean("lucas", "43031819861", anuncios);
		
		try {
			urls.add(new URL("http://www.javatpoint.com/java-tutorial"));
		}catch(Exception e){
			System.out.println(e);
		} 
		
		
		
		var anuncio = new AnuncioBean(produto, urls, 1.00);
		
		anunciante.addAnuncio(anuncio);
		
		assertEquals(1, anunciante.getAnuncios().size());
	}
	
	@Test
	void testRemoveAnuncio() {
		
		var anuncios = new ArrayList<AnuncioBean>();
		
		ProdutoBean produto = new ProdutoBean("codigo-1", "nome-1", "descricao-1", 10.00, "SP");
		
		var urls =  new ArrayList<URL>();
		
		AnuncianteBean anunciante = new AnuncianteBean("lucas", "43031819861", anuncios);
		
		try {
			urls.add(new URL("http://www.javatpoint.com/java-tutorial"));
		}catch(Exception e){
			System.out.println(e);
		} 
		
		
		
		var anuncio = new AnuncioBean(produto, urls, 1.00);
		
		anunciante.addAnuncio(anuncio);
		
		anunciante.removeAnuncio(0);
		
		assertEquals(0, anunciante.getAnuncios().size());
		
	}
	

	@Test
	void testValorMedioAnuncios() {
		
		var anuncios = new ArrayList<AnuncioBean>();
		
		ProdutoBean produto = new ProdutoBean("codigo-1", "nome-1", "descricao-1", 10.00, "SP");
		
		var urls =  new ArrayList<URL>();
		
		try {
			urls.add(new URL("http://www.javatpoint.com/java-tutorial"));
		}catch(Exception e){
			System.out.println(e);
		} 
		
		
		
		anuncios.add(new AnuncioBean(produto, urls, 1.00));
		anuncios.add(new AnuncioBean(produto, urls, 1.00));
		
		AnuncianteBean anunciante = new AnuncianteBean("lucas", "43031819861", anuncios);
		
		var result = anunciante.valorMedioAnuncios();
		
		assertEquals(9, result);
	}

}
