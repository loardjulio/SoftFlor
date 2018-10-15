/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Cliente;
import br.com.softflor.entidades.Produto;
import br.com.softflor.views.ListaProdutos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Julio
 */
public class ProdutoTableModel extends AbstractTableModel{
    
    private  List<String> cabecalho;
    private List<Produto> listaProdutos;

    
     public ProdutoTableModel(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
        cabecalho = new ArrayList<>();
        cabecalho.add("CODIGO");        
        cabecalho.add("NOME");
        
        cabecalho.add("EM ESTOQUE");
        cabecalho.add("PREÇO COMPRA");        
        cabecalho.add("PREÇO VENDA");              
        cabecalho.add("ESTOQUE MÍNIMO");  
        cabecalho.add("UNIDADE MEDIDA");  
    }

    public ProdutoTableModel() {
       
    }
    
    
      public void removeRow(int linha) {
        this.listaProdutos.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
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
                return listaProdutos.get(rowIndex).getId();
            case 1:
                 return listaProdutos.get(rowIndex).getNome();
            case 2:
                  return listaProdutos.get(rowIndex).getQuantidade();
            case 3:
                return listaProdutos.get(rowIndex).getPreco_compra();
            case 4:
                   return listaProdutos.get(rowIndex).getPreco_venda();
            case 5:
                return listaProdutos.get(rowIndex).getEstoque_minimo();
            case 6:
                 return listaProdutos.get(rowIndex).getUnidade_medida();
            default:
                System.out.println("retornarei nulo");
                return null;
                
        }
    }
    
    
}