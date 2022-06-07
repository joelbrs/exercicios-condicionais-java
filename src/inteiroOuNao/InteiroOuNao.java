package inteiroOuNao;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InteiroOuNao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a;

        System.out.println("Escreva algum número inteiro aqui: ");
        a = scan.nextInt();

        if (a >= 0){
            System.out.println("Esse é um número inteiro positivo!!");
        } else {
            System.out.println("Esse é um número inteiro negativo!!");
        }

        System.out.println(a);

        scan.close();


    }
}
