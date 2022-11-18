package desafio.exercises2;

import java.util.Scanner;

public class Ex2_ValidacaoDeParenteses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {

        if (s.contains("(") && s.contains(")")) {
            return true;
        } else if (s.contains("[") && s.contains("]")) {
            return true;
        } else if (s.contains("{") && s.contains("}")) {
            return true;
        } else {
            return false;
        }
    }
}
