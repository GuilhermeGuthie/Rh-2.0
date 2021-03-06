/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Funcionario;
import escola.Escola;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SESI_SENAI
 */
public class ConsultaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaFuncionario
     */
    
    public ConsultaFuncionario() {
        initComponents();
        this.carregaTabela();
    }
    
    public void carregaTabela(){
        DefaultTableModel tabela = (DefaultTableModel) tabelaFuncionarios.getModel(); 
        String nome;
        String cpf;
        String endereco;
        double salario;
        String codigo;
       
        
        for(int i = 0; i < Escola.listaPessoa.size(); i++){        
            nome = Escola.listaPessoa.get(i).nome;
            cpf = Escola.listaPessoa.get(i).cpf;
            endereco = Escola.listaPessoa.get(i).endereco;
            Object[] dado = {nome, cpf, endereco};
            tabela.addRow(dado);
        }
        
          for(int i = 0; i < Escola.listaProfessor.size(); i++){        
            nome = Escola.listaProfessor.get(i).nome;
            cpf = Escola.listaProfessor.get(i).cpf;
            endereco = Escola.listaProfessor.get(i).endereco;
            salario = Escola.listaProfessor.get(i).salario;
            codigo = Escola.listaProfessor.get(i).codigo;
            Object[] dado = {nome, cpf, endereco, salario, codigo, "Professor"};
            tabela.addRow(dado);
        }
    for(int i = 0; i < Escola.listaCoordenador.size(); i++){        
            nome = Escola.listaCoordenador.get(i).nome;
            cpf = Escola.listaCoordenador.get(i).cpf;
            endereco = Escola.listaCoordenador.get(i).endereco;
            salario = Escola.listaCoordenador.get(i).salario;
            codigo = Escola.listaCoordenador.get(i).codigo;
   

            Object[] dado = {nome, cpf, endereco, salario, codigo, "Coordenador"};
            tabela.addRow(dado);
        }
    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Endere??o", "Salario", "Codigo", "Tipo funcionario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFuncionario().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionarios;
    // End of variables declaration//GEN-END:variables
}
