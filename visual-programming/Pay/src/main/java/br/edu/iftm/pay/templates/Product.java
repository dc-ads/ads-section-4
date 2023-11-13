package br.edu.iftm.pay.templates;

import java.util.Objects;

/**
 *
 * @author dc7devs
 */
public class Product {
    private static Integer productCounter = 1;
    private Integer id;
    private String name;
    private float unitPrice;
    private String description;

    public Product(String name, float unitPrice, String description) {
        this.id = productCounter++;
        this.name = name;
        this.unitPrice = unitPrice;
        this.description = description;
    }
    
    public Product(String name, float unitPrice) {
        this.id = productCounter++;
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

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
