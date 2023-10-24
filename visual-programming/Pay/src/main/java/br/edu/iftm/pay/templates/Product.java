package br.edu.iftm.pay.templates;

import java.util.Objects;

/**
 *
 * @author dc7devs
 */
public class Product {
    private Integer id;
    private String name;
    private double unitPrice;

    public Product(Integer id, String name, double unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;

        final Product product = (Product) obj;

        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
