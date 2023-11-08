package br.edu.iftm.pay.templates;

import java.util.Date;
import java.util.List;

/**
 *
 * @author dc7devs
 */
public class Order {
    private static Integer orderCounter = 1;
    private Integer id;
    private Date orderDate;
    private List<OrderItem> itemList;
    private Customer customer;
    private double totalValue;
    
    public Order() {}
    public Order(List<OrderItem> itemList, Customer customer) {
        this.id = orderCounter++;
        this.orderDate = new Date();
        this.itemList = itemList;
        this.customer = customer;
        calculateTotalOrderValue();
    }

    public Integer getId() {
        return id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getTotalValue() {
        return totalValue;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<OrderItem> itemList) {
        this.itemList = itemList;
        calculateTotalOrderValue();
    }
    
    public void calculateTotalOrderValue() {
        double total = 0.0;
        for(OrderItem item : itemList) {
            total += item.getSubtotalValue();
        }
        
        totalValue = total;
    }
}