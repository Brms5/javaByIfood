package desafio.exercises;

import java.util.Scanner;

public class Ex2_SomandoMultiplos {
    public static void main(String[] args) {
        int A, N;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        int multiplos = N / A;

        int somaDosNumerosNaturais = multiplos * (multiplos + 1) / 2;

        int somaDosMultiplos = A * somaDosNumerosNaturais;

        System.out.println(somaDosMultiplos);
    }
}
