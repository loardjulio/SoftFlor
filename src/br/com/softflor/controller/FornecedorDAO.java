/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Julio
 */
public class FornecedorDAO extends GenericDAO<Fornecedor> {

    public List<Fornecedor> consultarTodos() {

        List<Fornecedor> fornecedores = null;
        try {            
            Query q = em.createNamedQuery("Fornecedor.consultarTodos");
            fornecedores = q.getResultList();            
            return fornecedores;
        } catch (Exception e) {
            System.out.println("Erro FornecedorDAO: " + e);
        FechaConexao(); 
        } 
        
return null;
    }

    public Fornecedor consultarPorNome(String nome) {

        Fornecedor fornecedor = null;
        try {
             em.getTransaction().begin();
            Query q = em.createNamedQuery("Fornecedor.consultarPorNome");
            q.setParameter("nome", nome + "%");
            fornecedor = (Fornecedor) q.getSingleResult();
            
//            if (q.getMaxResults() > 1) {
//                JOptionPane.showMessageDialog(null, "Fornecedor com nome duplicado");
//            } else {
//                fornecedor = (Fornecedor) q.getSingleResult();
//            }
        } catch (Exception e) {
            System.out.println("Erro fornecedorDAO: " + e);
             FechaConexao();
        }

        return fornecedor;
    }

    //--------- PARA PEGAR O FORNECEDOR DE UM DETERMINADO PRODUTO-------------
     public List<Fornecedor> fornecedorProduto(String nome) {
        List<Fornecedor> fornecedores = new ArrayList<>();
        Fornecedor fornecedor = consultarPorNome(nome);
        
         if (fornecedor==null) {
             System.out.println("erro ao buscar fornecedor");
         }
        //fornecedor.setIdfornecedor(null);
        //fornecedor.getContato().setIdcontato(null);
        //fornecedor.getEndereco().setIdendereco(null);        
         fornecedores.add(fornecedor);  
         
        return fornecedores;

    }
    
}
