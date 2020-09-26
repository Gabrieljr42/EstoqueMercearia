/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
/**
 *
 * @author gabri
 */
public class FakeBanco {
    private static Vector<Produtos> produtos;
    private static void cargaArquivo(){
        //Ajuste na criação
        if(produtos == null){
            produtos = new Vector<>();
        }else{
            produtos.clear();
        }
        //Estrutura de leitura do arquivo
        File arquivoCsv = new File("C:\\Users\\gabri\\Downloads\\Produtos.csv");
        try{
        FileReader marcaleitura = new FileReader(arquivoCsv);
        BufferedReader buf = new BufferedReader(marcaleitura);
        //Ler primeira linha(cabeçario) - descartar
        buf.readLine();
        String linha = buf.readLine();
        while(linha != null){
            //Linhas seguintes, até o final do documento
            String infos[] = linha.split(";");
            int cod = Integer.parseInt(infos[0]);
            String nome = infos[1];
            double preco = Double.parseDouble(infos[2]);
            int quant = Integer.parseInt(infos[3]);
            
            produtos.add(new Produtos(cod, nome, preco, quant));
            linha = buf.readLine();
            
        }
        
        //liberando o arquivo para outros processos
        buf.close();
        }catch(FileNotFoundException ex){
            System.err.println("Arquivo inexistente ");
        }catch(IOException e){
            System.err.println("Erro ao acessar o arquivo");
        }
    }
    public static Produtos consulta(int cod){
       if(produtos == null){
        cargaArquivo();
    }
       //Busca pelo produto
       for(Produtos prodI : produtos){
           if(prodI.getCodigo() == cod){
               return prodI;
           }
       }
        return null;
    }
    
    public static void atualizaArquivo(){
       File arquivo = new File("C:\\Users\\gabri\\Downloads\\Produtos.csv");
       try{
        FileWriter escritor = new FileWriter(arquivo);
        
           BufferedWriter bufEscrita = new BufferedWriter(escritor);
           bufEscrita.write("codigo;produto;preço;quantidade\n");
           for(int cont = 0; cont < produtos.size();cont ++){
               bufEscrita.write(produtos.get(cont)+"\n");
           }
           bufEscrita.flush();
           bufEscrita.close();
       }catch(IOException ex){
           System.err.println("dispositivo com falha");
       }
       
    }
}
