/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author gabri
 */
public class Produtos {
    private int codigo;
    private String nome;
    private double preço;
    private int quantidade;

    public Produtos(int codigo, String nome, double preço, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.codigo+";"+this.nome+";"+this.preço+";"+this.quantidade;
    }

   

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
        
    
}
