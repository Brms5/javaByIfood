package exercises.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [4, 5, 6, 7.5, 8, 9.3, 10], faça:
//        ArrayList<Double> notas = new ArrayList<>();

        List<Double> notas = new ArrayList<>();
        notas.add(4.0);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(7.5);
        notas.add(8.0);
        notas.add(9.3);
        notas.add(10.0);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 6.5 na posição 3: " );
        notas.add(3, 6.5);

        System.out.println("Substitua a nota 5.0 pela nota 5.75: ");
        notas.set(notas.indexOf(5.0), 5.75);

        System.out.println("Confira se a nota 5.75 está na lista: " + notas.contains(5.75));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
//        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
    }
}
