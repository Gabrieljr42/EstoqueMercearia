/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Estoque extends javax.swing.JPanel {
    
    private ModeloTabelaEstoque informaçõesTabela;
    
    public Estoque() {
        initComponents();
        meuInitComponents();
        
    }
    private void meuInitComponents(){
        informaçõesTabela = new ModeloTabelaEstoque();
        TabelaEstoque.setModel(informaçõesTabela);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaEstoque = new javax.swing.JTable();
        botDeletar = new javax.swing.JButton();
        botNovo = new javax.swing.JButton();
        botVoltar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(990, 636));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("NOME :");

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("ESTOQUE");

        botBusca.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botBusca.setText("BUSCA");

        TabelaEstoque.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabelaEstoque);

        botDeletar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botDeletar.setText("DELETAR");
        botDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDeletarActionPerformed(evt);
            }
        });

        botNovo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botNovo.setText("NOVO");
        botNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoActionPerformed(evt);
            }
        });

        botVoltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botVoltar.setText("VOLTAR");
        botVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 282, Short.MAX_VALUE)
                                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(botBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(387, 387, 387)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addComponent(jLabel1)))
                                .addGap(320, 320, 320)))
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(botVoltar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(botBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(botDeletar)
                        .addGap(64, 64, 64)
                        .addComponent(botNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void botDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDeletarActionPerformed
     
        int indice = TabelaEstoque.getSelectedRow();
        if(indice == -1){
         JOptionPane.showMessageDialog(null,"É preciso selcionar um produto para continuar com a exclusão", "Seleção de produtos", JOptionPane.INFORMATION_MESSAGE);
         
        }
        else{
            informaçõesTabela.removerProduto(indice);
             TabelaEstoque.updateUI();
        }
        
    }//GEN-LAST:event_botDeletarActionPerformed

    private void botVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVoltarActionPerformed
       TelaPrincipal.efetuatransição(null, "compras");
    }//GEN-LAST:event_botVoltarActionPerformed

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        String textoBusca = txtBusca.getText();

        informaçõesTabela.atualizaDadosTabela(textoBusca);
        TabelaEstoque.updateUI();
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void botNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNovoActionPerformed
    
        JDialog janelaCadastro = new JDialog();
        janelaCadastro.setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
        janelaCadastro.setSize(403, 376);
        janelaCadastro.setLocationRelativeTo(this);
        
        janelaCadastro.add(new Cadastro(janelaCadastro, informaçõesTabela));
        janelaCadastro.setVisible(true);
    }//GEN-LAST:event_botNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaEstoque;
    private javax.swing.JButton botBusca;
    private javax.swing.JButton botDeletar;
    private javax.swing.JButton botNovo;
    private javax.swing.JButton botVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
