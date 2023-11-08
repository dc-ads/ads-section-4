/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.pay.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

import br.edu.iftm.pay.templates.Customer;
import java.util.List;

/**
 *
 * @author dc7devs
 */
public class CustomerTableModel extends AbstractTableModel {
    
    private List<Customer> dados = new ArrayList<>();
    final private String[] colunas = { "ID", "Nome", "CPF/CNPJ", "Telefone", "Tipo" };

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return dados.get(rowIndex).getId();
            case 1:
                return dados.get(rowIndex).getName();
            case 2:
                return dados.get(rowIndex).getCpfOrCnpj();
            case 3:
                return dados.get(rowIndex).getPhoneNumber();
            case 4:
                return dados.get(rowIndex).getCustomerType();
        }
        
        return null;
    }
    
    public void addRow(Customer newCliente) {
        this.dados.add(newCliente);
    }
}
