/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.SwingWorker;

/**
 *
 * @author Julio
 */
public class ConectaBD {

    public  EntityManagerFactory factory;

    public  EntityManager getEntityManager() {
        factory = Persistence.createEntityManagerFactory("tcc");
        return factory.createEntityManager();

    }

    public void FechaConexao() {
        factory.close();     
    }

}
