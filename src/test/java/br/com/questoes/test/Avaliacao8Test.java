package br.com.questoes.test;

import br.com.questoes.Avaliacao8;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Avaliacao8Test {

	@Test
	public void valorCDeveRetornarNumeroAConcatenadoComB_test() {
		assertEquals("valorC deve retornar numero A concatenado com B (15475)",15475, Avaliacao8.getValorC(1, 5475));
	}

	@Test
	public void valorCDeveRetornarIntercaladosComTresNofinal_test() {
		int numeroC = Avaliacao8.getValorC(123, 56);
		assertEquals("valorC deve retornar numero A concatenado com B (15263)", 15263, numeroC);
		assertEquals("valorC deve retornar intercalados com numero 3 no final (3)",numeroC % 10, 3);
	}

	@Test
	public void valorCDeveRetornarMenosUm(){
		assertEquals("valorC deve retornar -1",-1, Avaliacao8.getValorC(10256, 512));
	}

}
