/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.pay.entity;

/**
 *
 * @author dc7devs
 */
public class Item {
    private Produto produto;
    private int quantidade;
    private double desconto;
    private double preco;

    public Item(
        int quantidade,
        double desconto,
        double preco
    ) {
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
}
