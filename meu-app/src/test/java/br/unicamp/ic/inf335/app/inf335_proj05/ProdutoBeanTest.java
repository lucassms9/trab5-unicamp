package br.unicamp.ic.inf335.app.inf335_proj05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoBeanTest {
	
	@Test
	public void testGettersAndSetters() {
		ProdutoBean produto = new ProdutoBean();
		produto.setCodigo("002");
		produto.setNome("Shorts");
		produto.setDescricao("Shorts jeans tamanho P");
		produto.setValor(49.90);
		produto.setEstado("Usado");
		assertNotNull(produto);
		assertEquals("002", produto.getCodigo());
		assertEquals("Shorts", produto.getNome());
		assertEquals("Shorts jeans tamanho P", produto.getDescricao());
		assertEquals(49.90, produto.getValor(), 0.01);
		assertEquals("Usado", produto.getEstado());
	}
	

	@Test
	void testCompareTo() {
		  // given:
	    ProdutoBean produto1 = new ProdutoBean("codigo-1", "nome-1", "descricao-1", 1.00, "SP");
	    ProdutoBean produto2 = new ProdutoBean("codigo-2", "nome-2", "descricao-2", 2.00, "RJ");
	    
	    // when: then:
	    assertEquals(-1, produto1.compareTo(produto2), "Should produto1 be smaller than produto2");
	    
	    
	    
	    // given:
	    produto1 = new ProdutoBean("codigo-1", "nome-1", "descricao-1", 2.00, "SP");
	    produto2 = new ProdutoBean("codigo-2", "nome-2", "descricao-2", 2.00, "RJ");
	    
	    // when: then:
	    assertEquals(0, produto1.compareTo(produto2), "Should produto1 and produto2 should be equal");
	    
	    // given:
	    produto1 = new ProdutoBean("codigo-1", "nome-1", "descricao-1", 3.00, "SP");
	    produto2 = new ProdutoBean("codigo-2", "nome-2", "descricao-2", 2.00, "RJ");
	    
	    // when: then:
	    assertEquals(1, produto1.compareTo(produto2), "Should produto2 be bigger than produto1");
	    
	}

}
