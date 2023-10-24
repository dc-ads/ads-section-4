package br.edu.iftm.pay.templates;

import java.util.Objects;

/**
 *
 * @author dc7devs
 */
public class Product {
    private Integer id;
    private String nome;
    private double valorUnitario;

    public Product(Integer id, String nome, Float valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;

        final Product produto = (Product) obj;

        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
