package edu.Stefany.Desafio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = scanner.nextInt();

        try {
            contar(n1, n2);
            }
        catch (ParametrosInvalidosException e) {
            System.out.println("Erro:" + e.erro);
        }
        finally {
            scanner.close();
        }
    }

    private static void contar(int n1, int n2) throws ParametrosInvalidosException {
        int contagem = n2 - n1;

        if (n2 < n1) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }


}
