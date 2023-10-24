/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.pay.templates;

/**
 *
 * @author dc7devs
 */
public class OrderItem {
    private static Long nextId = 1L;
    private Long id;
    private int quantidade = 1;
    private double desconto = 0.0;
    private double valorSubTotal;
    private Product produto;

    public OrderItem(int quantidade, double desconto, Product produto) {
        this.id = nextId++;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.produto = produto;
        recalcularValorSubtotalTotal();
    }
    
    public OrderItem(int quantidade, Product produto) {
        this.id = nextId++;
        this.quantidade = quantidade;
        this.produto = produto;
        recalcularValorSubtotalTotal();
    }
    
    
    public Long getId() {
        return id;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        recalcularValorSubtotalTotal();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
        recalcularValorSubtotalTotal();
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValorSubTotal() {
        return valorSubTotal;
    }

    public void setProduto(Product produto) {
        this.produto = produto;
        recalcularValorSubtotalTotal();
        
    }

    public Product getProduto() {
        return produto;
    }

    private void recalcularValorSubtotalTotal() {
        valorSubTotal = (produto.getValorUnitario() * quantidade) - desconto;
    }
}
