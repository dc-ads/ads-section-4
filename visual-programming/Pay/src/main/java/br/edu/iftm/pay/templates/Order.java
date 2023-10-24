package br.edu.iftm.pay.templates;

import java.util.Date;
import java.util.List;

/**
 *
 * @author dc7devs
 */
public class Order {
    private static Integer contadorPedido = 1;
    private Integer id;
    private Date dataPedido;
    private List<OrderItem> listaDeItem;
    private Customer cliente;
    private double valorTotal;
    
    public Order(List<OrderItem> listaDeItem, Customer cliente) {
        this.id = contadorPedido++;
        this.dataPedido = new Date();
        this.listaDeItem = listaDeItem;
        this.cliente = cliente;
        calcularValorTotalPedido();
    }

    public Integer getId() {
        return id;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    public Customer getCliente() {
        return cliente;
    }

    public void setCliente(Customer cliente) {
        this.cliente = cliente;
    }

    public List<OrderItem> getListaDeItem() {
        return listaDeItem;
    }

    public void setListaDeItem(List<OrderItem> listaDeItem) {
        this.listaDeItem = listaDeItem;
        calcularValorTotalPedido();
    }
    
    public void calcularValorTotalPedido() {
        double total = 0.0;
        for(OrderItem item : listaDeItem) {
            total += item.getValorSubTotal();
        }
        
        valorTotal = total;
    }
}