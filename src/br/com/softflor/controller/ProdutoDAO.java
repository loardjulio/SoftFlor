/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Produto;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class ProdutoDAO extends GenericDAO<Produto> {

    private Serializable id;

    public List<Produto> consultarTodos() {
        try {
             em.getTransaction().begin();
            Query q = em.createNamedQuery("Produto.consultarTodos");
            List<Produto> produtos = q.getResultList();            
            return produtos;
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro buscar Produtos"+ e);
            FechaConexao();
        }
        return null;
    }
    
    
    
    
     public List<Produto> consultarPorFornecedor(Integer id) {
        try {
             em.getTransaction().begin();            
            Query q = em.createNamedQuery("Produto.consultarPorFornecedor");            
            q.setParameter("idfornecedor", id );
            List<Produto> produtos = q.getResultList();            
            return produtos;
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro buscar Produtos"+ e);
            FechaConexao();
        }
        return null;
    }
     
     public List<Produto> consultarPorNome(String nome) {
        List<Produto> produtos = null;
        try {
            Query q = em.createNamedQuery("Produto.consultarPorNome");
            q.setParameter("nome", nome + "%");
            produtos = q.getResultList();
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Erro buscar Produtos"+ e);            
        } finally {
            FechaConexao();            
        }
        return produtos;
    }
     
      public List<Produto> consultarEstoque() {
        List<Produto> produtos = null;
        try {
            Query q = em.createNamedQuery("Produto.consultarEstoque");
            //Query e = em.createNativeQuery("SELECT * FROM produtos where produtos.quantidade <= produtos.estoque_minimo");
            produtos = q.getResultList();
            //e.executeUpdate();
            //System.out.println(e);
            //produtos = e.getResultList();
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Erro buscar Produtos"+ e);            
        } finally {
            FechaConexao();            
        }       
        return produtos;
          
    }

    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

   
}
