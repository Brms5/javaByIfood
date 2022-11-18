package desafio.exercises2;

import java.util.Scanner;

public class Ex1_ChecagemDePalindromo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();
        String palindromo = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palindromo += palavra.charAt(i);
        }

        System.out.println(palindromo);
        System.out.println(palavra);
        System.out.println(palindromo.equals(palavra));
    }
}
