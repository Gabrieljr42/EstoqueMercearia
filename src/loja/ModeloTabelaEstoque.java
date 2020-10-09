/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gabri
 */
public class ModeloTabelaEstoque extends AbstractTableModel{
    public ModeloTabelaEstoque(){
        this.produtosEstoque = new Vector<>();
        atualizaDadosTabela("");
    }
    
    private Vector<Produtos> produtosEstoque;
    
    
    @Override
    public int getRowCount() {
       return produtosEstoque.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int coluna ) {
         switch(coluna){
            case 0: return "NOME";
            case 1: return "PREÇO";
            case 2: return "QUANTIDADE";
            case 3: return "CÓDIGO";
            default: return null;
                
        }
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0: return produtosEstoque.get(linha).getNome();
            case 1: return produtosEstoque.get(linha).getPreço();
            case 2: return produtosEstoque.get(linha).getQuantidade();
            case 3: return produtosEstoque.get(linha).getCodigo();
            default: return null;
                
        }
    }
    public void atualizaDadosTabela(String consulta){
        produtosEstoque = FakeBanco.consultaNome(consulta); 
        Collections.sort(produtosEstoque);
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
       if(coluna <= 2){
           return true;
       }
       else{
           return false;
       }
    }

    @Override
    public Class<?> getColumnClass(int coluna) {
         switch(coluna){
            case 0: return String.class;
            case 1: return Double.class;
            case 2: return Integer.class;
            case 3: return Integer.class;
            default: return null;
                
        }
    }

    @Override
    public void setValueAt(Object novoValor, int linha, int coluna) {
        switch(coluna){
            case 0: produtosEstoque.get(linha).setNome(((String) novoValor)); break;
            case 1: produtosEstoque.get(linha).setPreço((double) novoValor); break;
            case 2: produtosEstoque.get(linha).setQuantidade((int)novoValor);break;
            default:;
                
        }
    }
   public void removerProduto(int indice){
       Produtos temp = produtosEstoque.remove(indice);
       
       FakeBanco.deleteProduto(temp);
   }
    
}
