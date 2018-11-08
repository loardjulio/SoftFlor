/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Orcamento;
import br.com.softflor.entidades.Produto;
import br.com.softflor.views.GeracaoOcamento;
import java.awt.Desktop;
import java.awt.Dialog.ModalityType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Julio
 */
public class OrcamentoDAO extends GenericDAO<Orcamento> {

    
     public void GeradorOrcamento(List<Produto> p,String nome2,String total2){
            SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        Date hora = Calendar.getInstance().getTime(); 
        String dataFormatada = sdf.format(hora);
        
        String arquivo = "relatorio/orcamento.jasper"; //Local do modelo do relatório
        String nome = nome2; //pega o nome do cliente
        String total = total2; //pega o valor total
        //cria datasource a partir da collection e manda o objeto
        JRBeanCollectionDataSource jrds = new JRBeanCollectionDataSource(p);
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("parameter1", nome); //Manda o nome como parametro pro relatório
        parametros.put("parameter2", total); //Manda o  total como parametro pro relatório

        JasperPrint printer = null;
        try {
            printer = JasperFillManager.fillReport(arquivo, parametros, jrds);
            
            JasperExportManager.exportReportToPdfFile(printer,"C:/Users/Public/"+dataFormatada+"Orcamento.pdf");
            Desktop desktop = Desktop.getDesktop();
            File file = new File("C:/Users/Public/"+dataFormatada+"Orcamento.pdf");
            desktop.open(file);
            
            
        } catch (JRException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
}
