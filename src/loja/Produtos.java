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
public class Produtos implements Comparable<Produtos>{
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

    public void setNome(String nome) {
        this.nome = nome;
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

    public Produtos(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produtos o) {
       return this.nome.toLowerCase().compareTo(o.getNome().toLowerCase());
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
        
    
}
