package desafio.exercises2;

import java.util.Scanner;

public class Ex3_QuadradosPerfeitos {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] d = new int[n + 1];

        d[0] = 0;
        d[1] = 1;

        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                int rem = i - j * j;
                if (d[rem] < min) {
                    min = d[rem];
                }
            }

            d[i] = min + 1;
        }
        System.out.println(d[n]);
    }
}
