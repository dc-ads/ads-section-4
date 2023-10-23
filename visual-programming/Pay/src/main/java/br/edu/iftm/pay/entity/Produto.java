/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.pay.entity;

/**
 *
 * @author dc7devs
 */
public class Produto {

    private Integer ID;
    private String nome;
    private Float preco;

    public Produto(Integer ID, String nome, Float preco) {
        this.ID = ID;
        this.nome = nome;
        this.nome = nome;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Float getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Produto other = (Produto) obj;

        if ((this.ID == null) ? (other.ID != null) : !this.ID.equals(other.ID)) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.ID != null ? this.ID.hashCode() : 0);
        return hash;
    }
}
