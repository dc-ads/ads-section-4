/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.pay.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

import br.edu.iftm.pay.templates.Customer;
import br.edu.iftm.pay.utils.enumerations.EntityType;
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
    
    @Override
    public void setValueAt(Object valor, int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 1:
                dados.get(rowIndex).setName((String) valor);
                break;
            case 2:
                dados.get(rowIndex).setCpfOrCnpj((String) valor);
                break;
            case 3:
                dados.get(rowIndex).setPhoneNumber((String) valor);
                break;
            case 4:
                dados.get(rowIndex).setCustomerType(EntityType.valueOf((String) valor));
                break;
        }
        
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public void addRow(Customer newCliente) {
        dados.add(newCliente);
        this.fireTableDataChanged();
    }
    
    public Customer getRow(int rowIndex) {
        return dados.get(rowIndex);
    }
    
    public void removeRow(int rowIndex) {
        this.dados.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
