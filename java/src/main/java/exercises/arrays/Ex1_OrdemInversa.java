package exercises.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, 5, 15, 20, 25};

        int contador = 0;
        while (contador < (vetor.length)) {
            System.out.println(vetor[contador]);
            contador++;
        }

        for(int i = (vetor.length -1); i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
