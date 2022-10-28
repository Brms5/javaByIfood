package desafio.exercises;

import java.util.Scanner;

public class Ex5_BuscaSequencial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int numero = leitor.nextInt();
        int posicao = 0;
        boolean numeroEncontrado = false;

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == numero) {
                numeroEncontrado = true;
                posicao = i;
                break;
            }
        }

        if (numeroEncontrado) System.out.println("Achei " + numero + " na posicao " + posicao);
        else System.out.println("Numero " + numero + " nao encontrado!");
    }
}
