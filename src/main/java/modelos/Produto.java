/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Bruno
 */
public class Produto {

    public static final String NA = "Selecione um produto";
    private String nome, id_produto = "";
    private String preco;
    private String quantidade;

    public Produto() {

    }

    public Produto(String nome, String preco, String quantidade, String id_produto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id_produto = id_produto;
    }
 public Produto(String nome, String preco, String quntidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quntidade;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quntidade) {
        this.quantidade = quntidade;
    }

    public String getId_produto() {
        return id_produto;
    }

    public void setId_produto(String id_produto) {
        this.id_produto = id_produto;
    }
    
    @Override
    public String toString(){
        return nome;
    }

}
