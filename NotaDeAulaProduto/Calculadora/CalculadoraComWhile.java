package NotaDeAulaProduto.Calculadora;

import java.util.Scanner;

public class CalculadoraComWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Informe a operação : \n opção 1: Soma \n opção 2: Subtração \n opção 3: Divisão \n opção 4: Multiplicação \n opção 0: Sair");

            int operacao = scanner.nextInt();

            if (operacao == 0) {
                System.out.println("Calculadora encerrada.");
                break;
            }

            if (operacao < 1 || operacao > 4) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            System.out.println("Digite o primeiro número:");

            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");

            double num2 = scanner.nextDouble();

            double resultado = 0.0;

            switch (operacao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("O resultado da soma: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("O resultado da subtração: " + resultado);
                    break;
                case 3:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("O resultado da divisão: " + resultado);
                    } else {
                        System.out.println("A divisão por 0 Inválida");
                    }
                    break;
                case 4:
                    resultado = num1 * num2;
                    System.out.println("O Resultado da multiplicação: " + resultado);
                    break;
            }
        }

    }
}


