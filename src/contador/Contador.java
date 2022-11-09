package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int firstParameter = Integer.parseInt(in.nextLine());
        System.out.println("Digite o segundo parâmetro");
        int secondParameter = Integer.parseInt(in.nextLine());

        try {
            contar(firstParameter, secondParameter);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }
    static void contar(int firstParameter, int secondParameter) throws ParametrosInvalidosException {
        if (firstParameter > secondParameter) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = secondParameter - firstParameter;
            for (int i = 0; i <= contagem; i++) {
                System.out.printf("Imprimindo o número %d. Contador: %d %n", firstParameter + i, i);
            }
        }
    }
}
