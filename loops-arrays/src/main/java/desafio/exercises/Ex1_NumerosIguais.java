package desafio.exercises;

import java.util.Scanner;

public class Ex1_NumerosIguais {
    public static void main(String[] args) {
//      Imprima se os valores numéricos passados são iguais ou não.
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        if(A == B) System.out.println("Sao iguais!");
        else System.out.println("Nao sao iguais!");
    }
}
