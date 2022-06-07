package inteiroOuNao;

import java.util.Locale;
import java.util.Scanner;

public class itemQtd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int codigo;

        System.out.println("Ponha o código do item desejado!!");
        codigo = scan.nextInt();

        double preco = 0;

        switch (codigo) {
            case 1:
                preco = 4.00;
                System.out.println("Você escolheu Cachorro-Quente!!");
                break;
            case 2:
                preco = 4.50;
                System.out.println("Você escolheu X-Salada!");
                break;
            case 3:
                preco = 5.00;
                System.out.println("Você escolheu X-bacon! ");
                break;
            case 4:
                preco = 2.00;
                System.out.println("Você escolheu Torrada Simples! ");
                break;
            case 5:
                preco = 1.50;
                System.out.println("Você escolheu Refrigerante! ");
                break;
            default:
                System.out.println("Código inexistente!!");
                break;
        }

        int quantd;

        System.out.println("Ponha a quantidade do item desejada!");
        quantd = scan.nextInt();

        double calcular;
        calcular = quantd * preco;

        System.out.printf("Você tem R$ " + String.format("%.2f", calcular) + " a pagar!");

        scan.close();

    }
}
