package br.edu.iftm.pay.templates;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dc7devs
 */
public class Inventory {
    private static Integer counterInventory = 0;
    private Integer id;
    private List<Product> products;
    private String categoryName;
    
    public Inventory(ArrayList<Product> products, String categoryName) {
        this.id = counterInventory++;
        this.categoryName = categoryName;
    }

    public Integer getId() {
        return id;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
