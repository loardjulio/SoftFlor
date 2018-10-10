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
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Julio
 */
public class OrcamentoTableModel extends AbstractTableModel{
    
    private final  List<String> cabecalho;   
   private List<Produto> listaProdutos = new ArrayList<>();;
   

       

    public OrcamentoTableModel() {      
       cabecalho = new ArrayList<>();
        cabecalho.add("ITEM");        
        cabecalho.add("PRODUTO");
        cabecalho.add("UNIDADE MEDIDA"); 
        cabecalho.add("QUANTIDADE");
        cabecalho.add("PREÇO UNITÁRIO");        
        cabecalho.add("PREÇO TOTAL");             
             }
    

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
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
    public void addRow(Produto produto){     
        this.listaProdutos.add(produto);       
      this.fireTableDataChanged();
        
    }
    
   
    
      public void removeRow(int linha){
        this.listaProdutos.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:               
                return listaProdutos.get(rowIndex);
            case 1:
                 return listaProdutos.get(rowIndex).getNome();
            case 2:
                 return listaProdutos.get(rowIndex).getUnidade_medida();
            case 3:
                 return listaProdutos.get(rowIndex).getQntdOrc();
            case 4:
               return listaProdutos.get(rowIndex).getPreco_venda();
            case 5:
               return listaProdutos.get(rowIndex).getPrecoTotal();
            
            default:
                JOptionPane.showMessageDialog(null, "Algo deu errado na geração da tabela orçamento");
                return null;
                
        }
    }

 
      
    
    
}
