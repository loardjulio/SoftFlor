/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.conexao.ConectaBD;
import br.com.softflor.entidades.EntidadeBase;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class GenericDAO<T extends EntidadeBase> extends ConectaBD {


    EntityManager em = getEntityManager();

    public T salvarOuAtualizar(T t){

        try {
            em.getTransaction().begin();
            if (t.getId() == null) { //verifica se é nulo ou não
                em.persist(t); // executa o insert
            } else { //se nao for nulo ele salva
                if (!em.contains(t)) {
                    if (em.find(t.getClass(), t.getId()) == null) {
                        throw new Exception("Erro ao atualizar!");
                    }
                }
                t = em.merge(t); //executa o update
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
        } 
        FechaConexao();
        
        return t;
        
    }

    public void remover(Class<T> clazz, Serializable id) { //clazz é so pra diferenciar da palavra reservada
        T t = em.find(clazz, id);
        
            try {
            em.getTransaction().begin();
            em.remove(t); //executa o delete
            em.getTransaction().commit();
              JOptionPane.showMessageDialog(null, "Excluido com sucesso."); 
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao remover o item");
                FechaConexao();
        }finally{
                FechaConexao();
 
            }
 
        
    }
    
  public T buscarPorId(Class<T> clazz, Serializable id){
        
      T t = null;
            
      try {
          System.out.println("Tentei buscar "+id);
          t = em.find(clazz, id);
      } catch (Exception e) { 
          JOptionPane.showMessageDialog(null,"Erro ao buscar por ID");
          FechaConexao();
      }finally{          
           FechaConexao();
                }
     return t;
 }
}
