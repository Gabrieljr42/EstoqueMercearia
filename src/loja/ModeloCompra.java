    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gabri
 */
public class ModeloCompra extends AbstractTableModel{
    
    private Vector<Produtos> carrinhoCompra;
    private Compras painel;
    public ModeloCompra(Compras painel) {
        this.carrinhoCompra = new Vector<>();
        this.painel = painel;
    }
    
    @Override
    public int getRowCount() {
       return carrinhoCompra.size();
    }

    @Override
    public int getColumnCount() {
    return 4;    
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
       Produtos temp = carrinhoCompra.get(linha);
        
        switch(coluna){
            case 0: return temp.getNome();
            case 1: return temp.getPreço();
            case 2: return temp.getQuantidade();
            case 3: return temp.getQuantidade() * temp.getPreço();
            default : return null;
       }
           
    }
    public void addNovoProduto(Produtos Vendido){
        this.carrinhoCompra.add(Vendido);
    }

    public Vector<Produtos> getProdutosCarrinho() {
        return carrinhoCompra;
    }
    
    public void removeProdutoCarrinho(int indice){
        carrinhoCompra.remove(indice);
    }
    
    @Override
    public String getColumnName(int coluna) {
        switch(coluna){
        case 0 : return"NOME";
        case 1 : return "PREÇO UNITARIO"; 
        case 2 : return "QUANTIDADE";  
        case 3 : return "PREÇO PARÇIAL";      
        default : return "";
        }
       
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
       if(coluna == 2){
           return true;
       }else{
           return false; 
    }
    }

    @Override
    public void setValueAt(Object novoValor, int linha, int coluna) {
        if(coluna == 2){
            //Pedindo a senha do gerente
            String senha = JOptionPane.showInputDialog(null, "Informe a senha do gerente", "Acesso restrito", JOptionPane.INFORMATION_MESSAGE);       
            if(senha.equals("ifmg")){
            carrinhoCompra.get(linha).setQuantidade((int)novoValor);
            this.painel.atualizaQuantidades();
            }else{
                
            }
        }
    }

    @Override
    public Class<?> getColumnClass(int coluna) {
        switch(coluna){
            case 0: return String.class;
            case 1 :return double.class;
            case 2 : return Integer.class;
            case 3: return double.class;
            default : return null;
        }
    }
    
    public double CalculaPrecoParcialCompra(){
       double valor = 0.0;
       //Recalculando o valor do carinho om os atuais produtos
       for(Produtos p: carrinhoCompra){
           valor += p.getQuantidade() * p.getPreço();
       }
       return valor;
    }
    
    public void limpaCarrinho(){
    this.carrinhoCompra.clear();
    }
}
