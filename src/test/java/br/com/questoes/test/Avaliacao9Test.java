package br.com.questoes.test;

import br.com.questoes.Avaliacao9;
import br.com.questoes.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Avaliacao9Test {

    @Test
    public void deveRetornarSomaDeTodosOsNos_test() {
        Avaliacao9 avaliacao9 = new Avaliacao9();
        BinaryTree arv1 = new BinaryTree();
        arv1.setValor(11);

        BinaryTree arv2 = new BinaryTree();
        arv2.setValor(22);

        BinaryTree arv3 = new BinaryTree();
        arv3.setValor(33);

        arv1.setRight(arv2);
        arv1.setLeft(arv3);

        assertEquals("Deve retornar soma de todos os nos (66)", 66, avaliacao9.somaArvore(arv1));
    }


    @Test
    public void deveRetornarSomaNos1e2_test() {
        Avaliacao9 avaliacao9 = new Avaliacao9();
        BinaryTree arv1 = new BinaryTree();
        arv1.setValor(11);

        BinaryTree arv2 = new BinaryTree();
        arv2.setValor(22);

        arv1.setRight(null);
        arv1.setLeft(arv2);

        assertEquals("Deve retornar soma dos nos 1 e 2 (33)", 33, avaliacao9.somaArvore(arv1));


		avaliacao9 = new Avaliacao9();
		arv1 = new BinaryTree();
		arv1.setValor(22);

		arv2 = new BinaryTree();
		arv2.setValor(33);

		arv1.setRight(arv2);
		arv1.setLeft(null);

		assertEquals("Deve retornar soma dos nos 1 e 2 (55)", 55, avaliacao9.somaArvore(arv1));
    }

    @Test
    public void deveRetornarSomenteValorDoNoUm_test() {
        Avaliacao9 avaliacao9 = new Avaliacao9();
        BinaryTree arv1 = new BinaryTree();
        arv1.setValor(11);

        arv1.setRight(null);
        arv1.setLeft(null);

        assertEquals("Deve retornar somente valor do no 1 (11)", 11, avaliacao9.somaArvore(arv1));
    }
}
