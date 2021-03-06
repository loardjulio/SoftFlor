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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Julio
 */
public class OrcamentoDAO extends GenericDAO<Orcamento> {

    public void GeradorOrcamento(List<Produto> p, String nome2, String total2) throws JRException {
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        Date hora = Calendar.getInstance().getTime();
        String dataFormatada = sdf.format(hora);

          InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("relatorio/orcamento.jasper");
         JasperReport report = (JasperReport) JRLoader.loadObject(inputStream);
       // String arquivo = "orcamento.jasper"; //Local do modelo do relatório
        String nome = nome2; //pega o nome do cliente
        String total = total2; //pega o valor total
        //cria datasource a partir da collection e manda o objeto
        JRBeanCollectionDataSource jrds = new JRBeanCollectionDataSource(p);
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("parameter1", nome); //Manda o nome como parametro pro relatório
        parametros.put("parameter2", total); //Manda o  total como parametro pro relatório

        JasperPrint printer = null;
        try {
            printer = JasperFillManager.fillReport(report, parametros, jrds);

            JasperExportManager.exportReportToPdfFile(printer, "C:/Users/Public/" + dataFormatada + "Orcamento.pdf");
            Desktop desktop = Desktop.getDesktop();
            File file = new File("C:/Users/Public/" + dataFormatada + "Orcamento.pdf");
            desktop.open(file);

        } catch (JRException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void RelatorioProdutos(List<Produto> p) throws JRException {
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        Date hora = Calendar.getInstance().getTime();
        String dataFormatada = sdf.format(hora);
        
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("relatorio/TodosProdutos.jasper");
         JasperReport report = (JasperReport) JRLoader.loadObject(inputStream);

      //  String arquivo = "src/relatorio/TodosProdutos.jasper"; //Local do modelo do relatório      
        //cria datasource a partir da collection e manda o objeto
        JRBeanCollectionDataSource jrds = new JRBeanCollectionDataSource(p);
        Map<String, Object> parametros = new HashMap<>();

        JasperPrint printer = null;
        try {
            printer = JasperFillManager.fillReport(report, parametros, jrds);

            JasperExportManager.exportReportToPdfFile(printer, "C:/Users/Public/" + dataFormatada + "Produtos.pdf");
            Desktop desktop = Desktop.getDesktop();
            File file = new File("C:/Users/Public/" + dataFormatada + "Produtos.pdf");
            desktop.open(file);

        } catch (JRException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void RelatorioEstoqueBaixo(List<Produto> p) throws JRException {
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        Date hora = Calendar.getInstance().getTime();
        String dataFormatada = sdf.format(hora);

        
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("relatorio/RelatorioEstoqueBaixo.jasper");
         JasperReport report = (JasperReport) JRLoader.loadObject(inputStream);
        
        //String arquivo = "src/relatorio/RelatorioEstoqueBaixo.jasper"; //Local do modelo do relatório      
        //cria datasource a partir da collection e manda o objeto
        JRBeanCollectionDataSource jrds = new JRBeanCollectionDataSource(p);
        Map<String, Object> parametros = new HashMap<>();

        JasperPrint printer = null;
        try {
            printer = JasperFillManager.fillReport(report, parametros, jrds);

            JasperExportManager.exportReportToPdfFile(printer, "C:/Users/Public/" + dataFormatada + "EstoqueBaixoProdutos.pdf");
            Desktop desktop = Desktop.getDesktop();
            File file = new File("C:/Users/Public/" + dataFormatada + "EstoqueBaixoProdutos.pdf");
            desktop.open(file);

        } catch (JRException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeracaoOcamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void RelatorioProdutoFornecedor(List<Produto> p) {

        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        Date hora = Calendar.getInstance().getTime();
        String dataFormatada = sdf.format(hora);
 JRBeanCollectionDataSource jrds = new JRBeanCollectionDataSource(p);
        String arquivo = "src/relatorio/ProdutosFornecedor.jasper"; //Local do modelo do relatório      
                
        JasperPrint printer = null;
        try {
            // printer = JasperFillManager.fillReport(arquivo, parametros, jrds);
            printer = JasperFillManager.fillReport(arquivo, null,jrds);

            JasperExportManager.exportReportToPdfFile(printer, "C:/Users/Public/" + dataFormatada + "ProdutoFornecedor.pdf");
            Desktop desktop = Desktop.getDesktop();
            File file = new File("C:/Users/Public/" + dataFormatada + "ProdutoFornecedor.pdf");
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
