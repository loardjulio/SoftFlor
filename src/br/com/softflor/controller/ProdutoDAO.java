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

    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

   
}
