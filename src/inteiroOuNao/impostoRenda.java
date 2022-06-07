package inteiroOuNao;

import java.util.Locale;
import java.util.Scanner;

public class impostoRenda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        double salario;

        System.out.println("Ponha seu salário aqui: ");
        salario = scan.nextDouble();

        double imposto = 0.0;
        if ( salario <= 2000 ) {
            imposto = 0.0;
        } else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
        } else if (salario > 4500) {
            imposto = (salario - 4500) * 0.28 + 1500  * 0.18 + 1000 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Você é ISENTO do Imposto de Renda!");
        }else {
            System.out.println("Você tem R$" + String.format("%.2f", imposto) + " a pagar!");
        }
    }
}
