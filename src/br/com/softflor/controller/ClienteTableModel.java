/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Julio
 */
public class ClienteTableModel extends AbstractTableModel{
    
    private final List<String> cabecalho;
    private List<Cliente> listaClientes;

    public ClienteTableModel(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
        cabecalho = new ArrayList<>();
        cabecalho.add("ID");
        cabecalho.add("NOME");
        cabecalho.add("CPF");
        cabecalho.add("TELEFONE");
        cabecalho.add("RUA");
        cabecalho.add("NUMERO");
        cabecalho.add("BAIRRO");
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    
     @Override
    public String getColumnName(int column) {
        return cabecalho.get(column);
    }
    
    @Override
    public int getRowCount() {
        return listaClientes.size();
    }

    @Override
    public int getColumnCount() {
       return cabecalho.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaClientes.get(rowIndex).getIdCliente();                
            case 1:
                return listaClientes.get(rowIndex).getNome();
            case 2:
                 return listaClientes.get(rowIndex).getCpf();
            case 3:
                 return listaClientes.get(rowIndex).getContato().getTelefone();
            case 4:
                 return listaClientes.get(rowIndex).getEndereco().getLogradouro();
            case 5:
                 return listaClientes.get(rowIndex).getEndereco().getNumero();
            case 6:
                 return listaClientes.get(rowIndex).getEndereco().getBairro(); 
            default:
                return null;
        }
    }
    
}
