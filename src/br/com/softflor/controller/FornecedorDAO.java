/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Cliente;
import br.com.softflor.entidades.Fornecedor;
import java.util.List;
import javax.persistence.Query;


/**
 *
 * @author Julio
 */
public class FornecedorDAO extends GenericDAO<Fornecedor>{
    
    public List<Fornecedor> consultarTodos(){  
                 
         List<Fornecedor> fornecedores = null;
         try {
             Query q = em.createNamedQuery("Fornecedor.consultarTodos");
             fornecedores = q.getResultList();      
            
         } catch (Exception e) {
             System.out.println("Erro FornecedorDAO: "+e);   
            
         }finally{
               FechaConexao();
             System.out.println("Consultas realizadas");
             
         }           
         return fornecedores;
        
    }
    
}
