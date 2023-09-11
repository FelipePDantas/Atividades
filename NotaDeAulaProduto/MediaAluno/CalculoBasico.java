package NotaDeAulaProduto.MediaAluno;

import java.util.Scanner;

public class CalculoBasico {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aluno al = new Aluno();
        int media;

        System.out.println("digite o nome do aluno ?");

        al.nome = s.nextLine();

        System.out.println("digite a primeira nota ?");
        al.nota1 = s.nextInt();
        System.out.println("digite a segunda nota ?");
        al.nota2 = s.nextInt();

        media = (al.nota1 + al.nota2) / 2;
        if (media >= 7) {
            System.out.println("Aluno aprovado, nota :" + media);
        } else if (media < 4) {
            System.out.println("Aluno reprovado, nota :" + media);
        } else {
            System.out.println("Recuperação");
        }


    }
}
