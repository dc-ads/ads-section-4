/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.pay.models;

import br.edu.iftm.pay.templates.Order;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Formato
 */
public class OrderTableModel extends AbstractTableModel {
    private List<Order> dados = new ArrayList<>();
    final private String[] colunas = { "ID", "Data", "Preço", "Cliente", "Itens",  "Valor Total" };
    
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
                return null;
            case 1:
                return null;
            case 2:
                return null;
        }
        
        return new Object();
    }
    
    @Override
    public void setValueAt(Object valor, int rowIndex, int columnIndex) {
        switch(columnIndex) {
        }
    }
    
    public void addRow(Order newOrder) {
        dados.add(newOrder);
        this.fireTableDataChanged();
    }
    
    public Order getRow(int rowIndex) {
        return dados.get(rowIndex);
    }
    
    public void removeRow(int rowIndex) {
        this.dados.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
