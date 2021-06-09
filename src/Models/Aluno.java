/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author SESI_SENAI
 */
public class Aluno extends Pessoa {
    
    public Aluno(String matricula, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }
    
   public String matricula;
}
