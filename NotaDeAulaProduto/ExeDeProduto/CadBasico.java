package NotaDeAulaProduto.ExeDeProduto;

import NotaDeAulaProduto.ExeDeProduto.CadastroDeProduto;

import java.util.Scanner;

public class CadBasico {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        CadastroDeProduto cadastro = new CadastroDeProduto();

        System.out.println("digite o código do produto ?");
        cadastro.setCodigo(s.nextInt());
        System.out.println("digite o nome do produto ?");
        s.nextLine();
        cadastro.setNome(s.nextLine());
        System.out.println("digite a quantidade de produtos que será alocado em estoque ?");
        cadastro.setQuantidade(s.nextInt());
        System.out.println(cadastro);
        System.out.println("deseja realizar alguma venda:  1-para Sim ou 0-para Não");
        int result = s.nextInt();

        switch (result) {

            case (1):
                System.out.println("digite a quantidade que deseja vender");
                cadastro.setVendas(s.nextInt());
                cadastro.vendas();
                break;
            case (0):
                System.out.println("Encerrando o programa");
                break;
            default:
                System.out.println("Opção inválida ");
        }
    }

}

