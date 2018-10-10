/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Fornecedor;
import br.com.softflor.entidades.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Julio
 */
public class FornecedorTableModel extends AbstractTableModel {

    private final List<String> cabecalho;
    private List<Fornecedor> listaFornecedores;

    public FornecedorTableModel(List<Fornecedor> listaFornecedores) {
        this.listaFornecedores = listaFornecedores;
        cabecalho = new ArrayList<>();
        cabecalho.add("ID");
        cabecalho.add("NOME");
        cabecalho.add("CNPJ");
        cabecalho.add("STATUS");
        cabecalho.add("TELEFONE");
        cabecalho.add("RESP.");
        cabecalho.add("E-MAIL");
        cabecalho.add("CIDADE");
    }

    public List<Fornecedor> getListaFornecedores() {
        return listaFornecedores;
    }

    public void setListaFornecedores(List<Fornecedor> listaFornecedores) {
        this.listaFornecedores = listaFornecedores;
    }

    @Override
    public String getColumnName(int column) {
        return cabecalho.get(column);
    }

    @Override
    public int getRowCount() {
        return listaFornecedores.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalho.size();
    }

    public void removeRow(int linha) {
        this.listaFornecedores.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaFornecedores.get(rowIndex).getIdfornecedor();
            case 1:
                return listaFornecedores.get(rowIndex).getNome();
            case 2:
                return listaFornecedores.get(rowIndex).getCnpj();
            case 3:
                return listaFornecedores.get(rowIndex).getStatus();
            case 4:
                return listaFornecedores.get(rowIndex).getContato().getTelefone();
            case 5:
                return listaFornecedores.get(rowIndex).getContato().getNome();
            case 6:
                return listaFornecedores.get(rowIndex).getContato().getEmail();
            case 7:
                return listaFornecedores.get(rowIndex).getEndereco().getCidade();
            default:
                return null;
        }
    }

}
