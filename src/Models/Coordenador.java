package Models;

public class Coordenador extends Funcionario{

    public Coordenador(String curso, double salario, String codigo, String nome, String cpf, String endereco) {
        super(salario, codigo, nome, cpf, endereco);
        this.curso = curso;
    }
    
    
    public String curso;
}
