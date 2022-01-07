package br.com.questoes;

public class Avaliacao8 {

    public static int getValorC(int numeroA, int numeroB) {
        StringBuilder valorC = new StringBuilder();
        int lengthA = String.valueOf(numeroA).length();
        int lengthB = String.valueOf(numeroB).length();
        int limite = Math.max(numeroA, numeroB);

        for (int i = 0; i < limite; i++) {
            if (i < lengthA) {
                valorC.append(String.valueOf(numeroA).charAt(i));
            }
            if (i < lengthB) {
                valorC.append(String.valueOf(numeroB).charAt(i));
            }
        }

        return valorC.length() > 6 ? -1 : Integer.parseInt(valorC.toString());
    }
}
