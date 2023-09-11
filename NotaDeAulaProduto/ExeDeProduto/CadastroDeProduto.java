package NotaDeAulaProduto.ExeDeProduto;

public class CadastroDeProduto {
    private int codigo;

    private String nome;

    private int quantidade;

    private int vendas;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "CadastroDeProduto{" +
                "codigo do produto : " + codigo +
                ", nome do produto : " + nome + '\'' +
                ", quantidade em estoque: " + quantidade +
                "}\n Cadastro Realizado com Sucesso";
    }

    public void vendas() {
        quantidade = quantidade - vendas;
        System.out.println("Quantidade em Estoque: " + quantidade);
    }

}
