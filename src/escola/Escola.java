package escola;

import Models.Aluno;
import Models.Coordenador;
import Models.Pessoa;
import Models.Professor;
import Views.TelaInicial;
import java.util.ArrayList;

public class Escola {

    public static ArrayList<Pessoa> listaPessoa = new ArrayList<>(); //FAKE DB
    public static ArrayList<Aluno> listaAluno = new ArrayList<>(); //FAKE DB
    public static ArrayList<Professor> listaProfessor = new ArrayList<>(); //FAKE DB
    public static ArrayList<Coordenador> listaCoordenador = new ArrayList<>(); //FAKE DB

    public static void main(String[] args) {
        TelaInicial t = new TelaInicial();
        t.setVisible(true);
    }

}
