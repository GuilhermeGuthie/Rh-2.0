package Models;
public class Funcionario extends Pessoa{

    public Funcionario(double salario, String codigo, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.salario = salario;
        this.codigo = codigo;
    }
       
    public double salario;
    public String codigo;
}
