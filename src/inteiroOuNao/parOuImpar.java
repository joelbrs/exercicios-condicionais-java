package inteiroOuNao;

import java.util.Scanner;

public class parOuImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Coloque um número inteiro qualquer aqui: ");
        numero = scan.nextInt();

        if (numero%2 == 0) {
            System.out.println("Esse número é par!!");
        } else {
            System.out.println("Esse número é ímpar!!");
        }
    }
}
