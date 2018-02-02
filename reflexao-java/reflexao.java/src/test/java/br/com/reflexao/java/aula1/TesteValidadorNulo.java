package br.com.reflexao.java.aula1;

import org.junit.Assert;
import org.junit.Test;

import br.com.reflexao.java.aula1.Produto;
import br.com.reflexao.java.aula1.ValidadorNulo;

public class TesteValidadorNulo {
	
	@Test
	public void testeValoresNulos() {
		
		Produto produto = new Produto();
		produto.cadastro = "Cad";
		produto.codigo = "1234";
		produto.nome = "ProdNome";
		
		Assert.assertEquals(0, ValidadorNulo.validarValoresNulos(produto).size());
		
		produto.nome = null;
		Assert.assertEquals(1, ValidadorNulo.validarValoresNulos(produto).size());
		
		produto.codigo = null;
		Assert.assertEquals(2, ValidadorNulo.validarValoresNulos(produto).size());
	}

}
