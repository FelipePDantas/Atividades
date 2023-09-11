package NotaDeAulaProduto.PagFuncionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe seu nome ");
        String nome = scanner.nextLine();
        funcionario.setNome(nome);

        System.out.println("informe sua matricula ");
        int matricula = scanner.nextInt();
        funcionario.setMatricula(matricula);

        System.out.println("informe seu salario bruto ");
        double salBruto = scanner.nextDouble();
        funcionario.setSalarioBruto(salBruto);

        double resultINSS = funcionario.getSalarioBruto() * funcionario.getINSS();
        double salarioLiquido = funcionario.getSalarioBruto() - resultINSS;

        System.out.println("matricula: " + funcionario.getMatricula() + "" +
                "\nnome:" + funcionario.getNome() + "\nsalario bruto:" + funcionario.getSalarioBruto() + "\ndesconto do inss: " + resultINSS +
                "\nsalario liquido: " + salarioLiquido);
    }
}
