/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacao;

import Modelagem.Venda;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vsouza
 */
public class FVenda extends javax.swing.JFrame {

    /**
     * Creates new form FVenda
     */
    public FVenda() {
        initComponents();
    }
    
    Venda vd = new Venda();
    
    @SuppressWarnings("unchecked")
    
    public void consultardados(){
               //MOSTRAR OS DADOS NA TABELA
        ResultSet tabela;
        tabela = null;
        
        //CHAMAR O MÉTODO CONSULTAR
        tabela = vd.listarProduto();

        DefaultTableModel modelo = (DefaultTableModel) tbl_venda.getModel();
        modelo.setNumRows(0);

        try{
            do{
                modelo.addRow(new String[]{tabela.getString(2), tabela.getString(3), tabela.getString(4), tabela.getString(1)});
            }
            while(tabela.next());
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro preencher tabela" + erro);

        }
       
      }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_vendedor = new javax.swing.JTextField();
        txt_produto = new javax.swing.JTextField();
        btn_gravar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_venda = new javax.swing.JTable();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Cadastro de Venda");

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nome do Produto:");

        jLabel4.setText("Nome do Vendedor:");

        btn_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/save.png"))); // NOI18N
        btn_gravar.setText("Gravar");
        btn_gravar.setToolTipText("");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        btn_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/edit_clear.png"))); // NOI18N
        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/exit.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        tbl_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome Vendedor", "Nome Produto"
            }
        ));
        jScrollPane1.setViewportView(tbl_venda);

        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/pencil.png"))); // NOI18N
        btn_alterar.setText("Alterar");
        btn_alterar.setToolTipText("");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/delete.png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.setToolTipText("");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 34, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btn_gravar)
                                .addGap(39, 39, 39)
                                .addComponent(btn_limpar)
                                .addGap(26, 26, 26)
                                .addComponent(btn_alterar)
                                .addGap(58, 58, 58)
                                .addComponent(btn_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sair)))
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(305, 305, 305))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_gravar)
                    .addComponent(btn_limpar)
                    .addComponent(btn_sair)
                    .addComponent(btn_alterar)
                    .addComponent(btn_excluir))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        vd.setCodigo(Integer.parseInt(txt_codigo.getText()));
        vd.setName_vendedor(txt_vendedor.getText());
        vd.setName_produto(txt_produto.getText());
        vd.cadastrarVenda();
        
        ResultSet tabela;
        tabela = null;
        
        tabela = vd.listarProduto();
        DefaultTableModel modelo = (DefaultTableModel) tbl_venda.getModel();
        modelo.setNumRows(0);
        try{
            do{
                modelo.addRow(new String[]{tabela.getString(2), tabela.getString(3), tabela.getString(4)});
            }
            while(tabela.next());
        }catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela" + erro);
        }
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        txt_codigo.setText("");
        txt_produto.setText("");
        txt_vendedor.setText("");
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
       vd.setName_produto(txt_produto.getText());
       vd.setName_vendedor(txt_vendedor.getText());
       vd.setCodigo(Integer.parseInt(txt_codigo.getText()));
       vd.alterar();    
       consultardados(); 
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        vd.setCodigo(Integer.parseInt(txt_codigo.getText()));
        vd.excluir();    
        consultardados();
    }//GEN-LAST:event_btn_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(FVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_venda;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_produto;
    private javax.swing.JTextField txt_vendedor;
    // End of variables declaration//GEN-END:variables
}
