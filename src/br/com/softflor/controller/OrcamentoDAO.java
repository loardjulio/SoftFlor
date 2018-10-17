/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Orcamento;
import java.awt.Dialog.ModalityType;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Julio
 */
public class OrcamentoDAO extends GenericDAO<Orcamento> {

    
    
//    public void abirOrcamento(JTable tabela) throws JRException{
//      
//        String arquivo = "relatorio/relatorioOrc.jasper";
//        java.io.InputStream file = getClass().getClassLoader().getResourceAsStream(arquivo); //carrego o arquivo
//        JRTableModelDataSource tabela = new JRTableModelDataSource(tabela.getModel()); //aqui eu crio um datasource usando a propria jtable
//        Map parametros = new HashMap(); //apenas crio um map, mas nem passo parametro nem nada, os parametros sao as colunas da jtable
//        JasperPrint printer = JasperFillManager.fillReport(file, parametros, tabela); //aqui eu passo a jtable(tabela) para o relatorio
//        JRViewer view = new JRViewer(printer); //preview
//        JDialog dialog = new JDialog(); //jdialog que contem o preview
//        dialog.getContentPane().add(view); //adiciono o preview
//        dialog.setSize(800, 600);
//        //dialog.setLocationRelativeTo(this);
//        //dialog.setModalityType(ModalityType.APPLICATION_MODAL);
//        //dialog.setModal(true);
//        dialog.setVisible(true);
//    }

}
