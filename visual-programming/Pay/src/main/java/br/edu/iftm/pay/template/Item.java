/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.pay.template;

/**
 *
 * @author dc7devs
 */
public class Item {
    private Long id;
    private int quantidade=1;
    private double desconto;
    private double valorSubtotalTotal;
    private Produto produto;

    public Item(
        int quantidade,
        double desconto,
        double valorSubTotal,
        Produto produto
    ) {
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.produto = produto;
        this.valorSubtotalTotal = produto.getValorUnitario() * quantidade;
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

    public double getValorSubtotalTotal() {
        return valorSubtotalTotal;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
}
