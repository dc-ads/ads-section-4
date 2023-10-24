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
    private int quantity = 1;
    private double discount = 0.0;
    private double subtotalValue;
    private Product product;

    public OrderItem(int quantity, double discount, Product product) {
        this.id = nextId++;
        this.quantity = quantity;
        this.discount = discount;
        this.product = product;
        recalculateSubtotalValue();
    }
    
    public OrderItem(int quantity, Product product) {
        this.id = nextId++;
        this.quantity = quantity;
        this.product = product;
        recalculateSubtotalValue();
    }
    
    
    public Long getId() {
        return id;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        recalculateSubtotalValue();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
        recalculateSubtotalValue();
    }

    public double getDiscount() {
        return discount;
    }

    public double getSubtotalValue() {
        return subtotalValue;
    }

    public void setProduct(Product product) {
        this.product = product;
        recalculateSubtotalValue();
    }

    public Product getProduct() {
        return product;
    }

    private void recalculateSubtotalValue() {
        subtotalValue = (product.getUnitPrice() * quantity) - discount;
    }
}
