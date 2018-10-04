/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Cliente;
import br.com.softflor.entidades.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Julio
 */
public class ProdutoTableModel extends AbstractTableModel{
    
    private final List<String> cabecalho;
    private List<Produto> listaProdutos;

    public ProdutoTableModel(List<Produto> listaProdutos,String quantidade, String ptotal) {
        this.listaProdutos = listaProdutos;
        cabecalho = new ArrayList<>();
        cabecalho.add("CODIGO");
        cabecalho.add("FORNECEDOR");
        cabecalho.add("NOME");
        cabecalho.add("PREÇO COMPRA");
        cabecalho.add("ESTOQUE");
        cabecalho.add("PREÇO UNITÁRIO");
        cabecalho.add(quantidade);     
        cabecalho.add(ptotal);      
        
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaClientes(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    
     @Override
    public String getColumnName(int column) {
        return cabecalho.get(column);
    }
    
    @Override
    public int getRowCount() {
        return listaProdutos.size();
    }

    @Override
    public int getColumnCount() {
       return cabecalho.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaProdutos.get(rowIndex).getIdproduto();                
            case 1:
                return listaProdutos.get(rowIndex).getFornecedor().get(0).getNome();
            case 2:
                 return listaProdutos.get(rowIndex).getNome();
            case 3:
                 return listaProdutos.get(rowIndex).getPreco_compra();
            case 4:
                 return listaProdutos.get(rowIndex).getQuantidade();
            case 5:
                 return listaProdutos.get(rowIndex).getPreco_venda();
//            case 6:
//                 return listaProdutos.get(rowIndex).getQuantidade();
//            case 7:
//                 return listaProdutos.get(rowIndex).getQuantidade();    
            
            default:
                return null;
        }
    }
    
}
