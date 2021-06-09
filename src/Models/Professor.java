package Models;

public class Professor extends Funcionario{

    public Professor(String departamento, double salario, String codigo, String nome, String cpf, String endereco) {
        super(salario, codigo, nome, cpf, endereco);
        this.departamento = departamento;
    }

    public String departamento;
    
}
