package NotaDeAulaProduto.PagFuncionario;

public class Funcionario {
    String nome;
    int matricula;
    double salarioBruto;

    double INSS = 0.15;

    public double getINSS() {
        return INSS;
    }

    public Funcionario() {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBruto = salarioBruto;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}


