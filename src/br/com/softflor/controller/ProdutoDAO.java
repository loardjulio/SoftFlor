/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Produto;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Julio
 */
public class ProdutoDAO extends GenericDAO<Produto>{
    
    public List<Produto> consultarTodos(){       
        Query q = em.createNamedQuery("Produto.consultarTodos");
        List<Produto> produtos = q.getResultList();      
        return produtos;
    }
}
