package Calculadora;

import java.util.Scanner;
import static Calculadora.Operacoes.*;

public class Main {
    public static int num1, num2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();

        System.out.printf("As quatro operações com os números %d e %d formam:\n", num1, num2);
        System.out.println(soma());
        System.out.println(subtracao());
        System.out.println(divisao());
        System.out.println(multiplicacao());
    }
}