/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Coordenador;
import Models.Funcionario;
import Models.Professor;
import escola.Escola;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author SESI_SENAI
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    public CadastroFuncionario() {
        initComponents();
        campoSelecionavel.setVisible(false);
        labelSelecional.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoFuncionario = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoCpfFuncionario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoNomeFuncionario = new javax.swing.JTextField();
        campoEnderecoFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoSalarioFuncionario = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        opcaoCoordenador = new javax.swing.JRadioButton();
        opcaoProfessor = new javax.swing.JRadioButton();
        campoSelecionavel = new javax.swing.JTextField();
        labelSelecional = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO FUNCIONÁRIO");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE FUNCIONÁRIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NOME");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("CPF");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ENDEREÇO");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("SALÁRIO");

        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.setEnabled(false);
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        tipoFuncionario.add(opcaoCoordenador);
        opcaoCoordenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opcaoCoordenador.setText("COORDENADOR");
        opcaoCoordenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoCoordenadorActionPerformed(evt);
            }
        });

        tipoFuncionario.add(opcaoProfessor);
        opcaoProfessor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opcaoProfessor.setText("PROFESSOR");
        opcaoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoProfessorActionPerformed(evt);
            }
        });

        campoSelecionavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSelecionavelActionPerformed(evt);
            }
        });
        campoSelecionavel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSelecionavelKeyPressed(evt);
            }
        });

        labelSelecional.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelSelecional.setText("DEPARTAMENTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSelecional)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoSalarioFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(campoEnderecoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addComponent(campoCpfFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(opcaoProfessor)
                                    .addGap(27, 27, 27)
                                    .addComponent(opcaoCoordenador))
                                .addComponent(jLabel2)
                                .addComponent(campoSelecionavel)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcaoCoordenador)
                    .addComponent(opcaoProfessor))
                .addGap(13, 13, 13)
                .addComponent(labelSelecional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSelecionavel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed

        Random r = new Random();
        int aleatorio = r.nextInt();
        
        String nome = campoNomeFuncionario.getText();
        String cpf = campoCpfFuncionario.getText();
        String endereco = campoEnderecoFuncionario.getText();
        String salario = campoSalarioFuncionario.getText();
        String codigo = Integer.toString(aleatorio);
        String cursoOuDepartamento = campoSelecionavel.getText();

        if (!"".equals(nome) && !"".equals(cpf) && !"".equals(endereco) && !"".equals(salario) && !"".equals(cursoOuDepartamento)) {
            double salarioConvertido = Double.parseDouble(salario);
            boolean opcaoProfessorEstaSelecionado = opcaoProfessor.isSelected();
            boolean opcaoCoordenadorEstaSelecionado = opcaoCoordenador.isSelected();

            if (opcaoProfessor.isSelected()) {
                Professor p = new Professor(cursoOuDepartamento, salarioConvertido, codigo, nome, cpf, endereco);
                Escola.listaProfessor.add(p);
                JOptionPane.showMessageDialog(rootPane, "O CADASTRO DO PROFESSOR FOI FEITO COM SUCESSO");
            } else {
                Coordenador c = new Coordenador(cursoOuDepartamento, salarioConvertido, codigo, nome, cpf, endereco);
                Escola.listaCoordenador.add(c);
                JOptionPane.showMessageDialog(rootPane, "O CADASTRO DO COORDENADOR FOI FEITO COM SUCESSO");
            }

            campoNomeFuncionario.setText("");
            campoCpfFuncionario.setText("");
            campoEnderecoFuncionario.setText("");
            campoSalarioFuncionario.setText("");
            campoSelecionavel.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "VOCÊ PRECISA PREENCHER TODOS OS CAMPOS");
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void opcaoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoProfessorActionPerformed
        if (campoSelecionavel.isVisible()) {
            labelSelecional.setText("DEPARTAMENTO");
        } else {
            campoSelecionavel.setVisible(true);
            labelSelecional.setVisible(true);
            labelSelecional.setText("DEPARTAMENTO");
        }
    }//GEN-LAST:event_opcaoProfessorActionPerformed

    private void opcaoCoordenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoCoordenadorActionPerformed

        if (campoSelecionavel.isVisible()) {
            labelSelecional.setText("CURSO");
        } else {
            campoSelecionavel.setVisible(true);
            labelSelecional.setVisible(true);
            labelSelecional.setText("CURSO");
        }

    }//GEN-LAST:event_opcaoCoordenadorActionPerformed

    private void campoSelecionavelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSelecionavelKeyPressed
        botaoCadastrar.setEnabled(true);
    }//GEN-LAST:event_campoSelecionavelKeyPressed

    private void campoSelecionavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSelecionavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSelecionavelActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JTextField campoCpfFuncionario;
    private javax.swing.JTextField campoEnderecoFuncionario;
    private javax.swing.JTextField campoNomeFuncionario;
    private javax.swing.JTextField campoSalarioFuncionario;
    private javax.swing.JTextField campoSelecionavel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelSelecional;
    private javax.swing.JRadioButton opcaoCoordenador;
    private javax.swing.JRadioButton opcaoProfessor;
    private javax.swing.ButtonGroup tipoFuncionario;
    // End of variables declaration//GEN-END:variables
}
