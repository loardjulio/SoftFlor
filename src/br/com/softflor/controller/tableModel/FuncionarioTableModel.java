/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller.tableModel;

import br.com.softflor.entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Julio
 */
public class FuncionarioTableModel extends AbstractTableModel {

    private final List<String> cabecalho;
    private List<Funcionario> listaFuncionarios = new ArrayList<>();

    public FuncionarioTableModel(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios= listaFuncionarios;
        cabecalho = new ArrayList<>();
        cabecalho.add("ID");
        cabecalho.add("SETOR");
        cabecalho.add("NOME");
        cabecalho.add("USUARIO");      
    }

    public List<Funcionario> getlistaFuncionarios() {
        return listaFuncionarios;
    }

    public void setlistaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    @Override
    public String getColumnName(int column) {
        return cabecalho.get(column);
    }

    @Override
    public int getRowCount() {        
        
        return listaFuncionarios.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalho.size();
    }

    public void addRow(Funcionario funcionario) {
        this.listaFuncionarios.add(funcionario);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.listaFuncionarios.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaFuncionarios.get(rowIndex).getIdfuncionario();
            case 1:
                return listaFuncionarios.get(rowIndex).getSetor();
            case 2:
                return listaFuncionarios.get(rowIndex).getNome();
            case 3:
                return listaFuncionarios.get(rowIndex).getUsuario();
          
           
            default:
                JOptionPane.showMessageDialog(null, "Algo deu errado na geração da tabela funcionarios");
                return null;

        }
    }
}
