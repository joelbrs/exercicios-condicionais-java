package inteiroOuNao;

import java.util.Scanner;

public class multiplosOuNao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B;

        System.out.println("Ponha dois números inteiros aqui: ");
        A = scan.nextInt();
        B= scan.nextInt();

        if (A%B == 0){
            System.out.println("São múltiplos!!");
        } else if (B%A == 0) {
            System.out.println("São múltiplos!!");
        } else {
            System.out.println("Não são Múltiplos!");
        }
    }
}
