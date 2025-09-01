package br.com.unicuritiba;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Calculadora");
        System.out.println("---------------------------");

        while (true) {
            System.out.print("Digite o primeiro número (ou 's' para sair): ");
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
            } else if (scanner.next().equalsIgnoreCase("s")) {
                System.out.println("Saindo da calculadora. Até mais!");
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
                continue;
            }

            System.out.print("Digite o operador (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Digite o segundo número: ");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
                continue;
            }

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operador inválido. Por favor, use +, -, * ou /.");
            }
            System.out.println("---------------------------");
        }
        scanner.close();
    }
}