/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Compras extends javax.swing.JPanel {
    // Armazena temp. o produto com o codigo 
   private Produtos produtoSelecionado;
   private ModeloCompra carrinho;
   private double precoCompra;
    public Compras() {
        initComponents();
        MeuInitComponents();
    }
    
    private void MeuInitComponents(){
    precoCompra = 0.0;
    this.carrinho = new ModeloCompra(this);
    //criar a conexão dos dados(compartamento) do obj da classe com a tabela Gui
    tabelaCarrinho.setModel(carrinho);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPreçoUnit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        Rem = new javax.swing.JButton();
        Finalizar = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        addproduto = new javax.swing.JButton();
        txtMoney = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Codigo");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNome.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade");

        txtQuant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtQuant.setText("1");
        txtQuant.setEnabled(false);
        txtQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantActionPerformed(evt);
            }
        });
        txtQuant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Preço Unitario");

        txtPreçoUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPreçoUnit.setEnabled(false);

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaCarrinho);

        Rem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Rem.setText("Remover");
        Rem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemActionPerformed(evt);
            }
        });

        Finalizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Finalizar.setText("Finalizar");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        Estoque.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Estoque.setText("Estoque");

        addproduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addproduto.setText("ADD PRODUTO");
        addproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addprodutoActionPerformed(evt);
            }
        });

        txtMoney.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txtMoney.setText("0,00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("VALOR TOTAL :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addproduto)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Finalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPreçoUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(txtCodigo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Rem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Estoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPreçoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(Rem)
                        .addGap(58, 58, 58)
                        .addComponent(Estoque)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtMoney))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addproduto)
                                .addComponent(Finalizar)))
                        .addGap(29, 29, 29))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantActionPerformed

    private void RemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemActionPerformed
       int linha = tabelaCarrinho.getSelectedRow();
       
       if(linha > -1){
           //Selecionou um produto
           
           int op = JOptionPane.showConfirmDialog(null, "Deseja remover o produto selecionado ?","Confimação de exclusão", JOptionPane.YES_NO_OPTION);
           
           if(op == JOptionPane.YES_OPTION){
               String senha = JOptionPane.showInputDialog(null, "Informe a senha do gerente", "operação restrita", JOptionPane.YES_NO_OPTION);
               //Remove o produto e atualiza as quantidades
             if(senha.equals("ifmg")){
               carrinho.removeProdutoCarrinho(linha);
               atualizaQuantidades();
           }
           }
           
       }else{
           JOptionPane.showMessageDialog(null, "Selecione uma linha, por favor", " ERRO", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_RemActionPerformed

    private void addprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addprodutoActionPerformed
        
       if(produtoSelecionado != null && !txtPreçoUnit.getText().equals("Nada")){
           //produto esta apt. a ser add na tabela
           int quantidade = Integer.parseInt(txtQuant.getText());
           if(quantidade <= produtoSelecionado.getQuantidade()){
               Produtos vendido = new Produtos(produtoSelecionado.getCodigo(),produtoSelecionado.getNome(), produtoSelecionado.getPreço(), quantidade);
               //produtoSelecionado.setQuantidade(produtoSelecionado.getQuantidade() - quantidade);
               precoCompra += produtoSelecionado.getPreço() * quantidade;
               //Limpando informações
               txtCodigo.setText("");
               txtNome.setText("");
               txtQuant.setText("1");
               txtPreçoUnit.setText("");
               produtoSelecionado = null;
               txtQuant.setEnabled(false);
               
               
               txtMoney.setText(String.format("%.2f", precoCompra));
               //add o produto vendido para o carinho de compra
               carrinho.addNovoProduto(vendido);
               tabelaCarrinho.updateUI();
           }else{
               JOptionPane.showMessageDialog(null, "Não há quantidade suficiente para realizar a venda deste produto", "quantidade insuf",JOptionPane.INFORMATION_MESSAGE);
           }
               
       }else{
            JOptionPane.showMessageDialog(null, "A quantidade de produtos informada deve ser um valor numérico", "entrada de quantidade inválida",JOptionPane.INFORMATION_MESSAGE);
       }
        
    }//GEN-LAST:event_addprodutoActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
      //verificando se a tecla pressionada é o Enter(codigo do ENTER é \n)
        if(evt.getKeyChar() == '\n'){
        //Se existe informação no código
        if(!txtCodigo.getText().isEmpty()){
           try{
           //Se é numerico
           int cod = Integer.parseInt(txtCodigo.getText());
           
           produtoSelecionado = FakeBanco.consulta(cod);
           
           if(produtoSelecionado!= null){
               txtNome.setText(produtoSelecionado.getNome());
               txtPreçoUnit.setText(produtoSelecionado.getPreço() +"");
               txtQuant.setEnabled(true);
           } else {
               JOptionPane.showMessageDialog(null, "Não possui produto com esse codigo ","Erro",JOptionPane.ERROR_MESSAGE);
           }
           
           }catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null,"Apenas números","Erro", JOptionPane.ERROR_MESSAGE);
                      
           }
        }
       }
        
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtQuantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantKeyReleased
        
        //Calcula o preço com  base nas quantidades
       if(!txtQuant.getText().isEmpty()){
           int quantidade = Integer.parseInt(txtQuant.getText());
           
           double parc = produtoSelecionado.getPreço() * quantidade;
           txtPreçoUnit.setText(parc +"");
       }else{
           //Campo sem nada
           txtPreçoUnit.setText("Nada");
       }
        
    }//GEN-LAST:event_txtQuantKeyReleased

    private boolean verificaQuatidades (){
       Vector<Produtos> produtos =  carrinho.getProdutosCarrinho();
       
       for(int cont = 0;cont <produtos.size(); cont ++){
           Produtos estoque = FakeBanco.consulta(produtos.get(cont).getCodigo());
           if(produtos.get(cont).getQuantidade() > estoque.getQuantidade()){
               JOptionPane.showMessageDialog(null, "não a quantidade do produto : "+estoque.getNome()+" no estoque ", "Quantidade insuficiente", JOptionPane.INFORMATION_MESSAGE);
               return false;
           }
       }
       return true;
    }
    
    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
      
        //verificar se temos as quantidade dos produtos que estão sendo vendidos
        if(verificaQuatidades()){
             //atualizar o nosso banco de dados FAKE(mémoria RAM)
            Vector<Produtos> produtos =  carrinho.getProdutosCarrinho();
            for(int cont = 0; cont != produtos.size();cont ++){
                Produtos estoque = FakeBanco.consulta(produtos.get(cont).getCodigo());
                estoque.setQuantidade(estoque.getQuantidade() - produtos.get(cont).getQuantidade());
                 //zerando o valor total para a próxima compra
                precoCompra = 0.0;
                txtMoney.setText("0.0");        
        
                //remover os produtos do carinho de compra(da compra finalizada)
                carrinho.limpaCarrinho();
                tabelaCarrinho.updateUI();
        
            }
        }
       
    }//GEN-LAST:event_FinalizarActionPerformed

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }
    public void atualizaQuantidades(){
        //Atualiza as informações da tabela
        tabelaCarrinho.updateUI();
        
        //atualizamos o valor da compra dos carinhos
        double preco = carrinho.CalculaPrecoParcialCompra();
        txtMoney.setText(String.format("%.2f", preco));
        setPrecoCompra(preco);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Estoque;
    private javax.swing.JButton Finalizar;
    private javax.swing.JButton Rem;
    private javax.swing.JButton addproduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtMoney;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreçoUnit;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables
}
