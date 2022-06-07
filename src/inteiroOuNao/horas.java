package inteiroOuNao;

import java.util.Scanner;

public class horas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("O jogo iniciou às: ");
        a = scan.nextInt();

        System.out.println("O jogo terminou às:");
        b = scan.nextInt();

        int duracao;
        if (a < b) {
           duracao = b - a;
        } else {
            duracao = 24 - b + a;
        }

        System.out.println("O jogo terminou às " + duracao + " hora(s)");
    }
}
