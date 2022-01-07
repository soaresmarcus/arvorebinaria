package br.com.questoes;

public class Avaliacao9 {

    public int somaArvore(BinaryTree tree) {
        if (tree == null) {
            return 0;
        }
        return tree.getValor() + somaArvore(tree.getLeft()) + somaArvore(tree.getRight());
    }
}

