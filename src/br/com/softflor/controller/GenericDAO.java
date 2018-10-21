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
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 * @param <T>
 */
public class GenericDAO<T extends EntidadeBase> extends ConectaBD {

    EntityManager em = getEntityManager();

    public T salvarOuAtualizar(T t) {
        try {
            em.getTransaction().begin();
            if (t.getId() == null) { //verifica se é nulo ou não
                em.persist(t); // se for nulo executa o insert
                JOptionPane.showMessageDialog(null, "Salvo!");
            } else { //se nao for nulo 
                t = em.merge(t); //executa o update
                JOptionPane.showMessageDialog(null, "Atualizado!");
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar/Atualizar");
            FechaConexao();
        }
        return t;
    }

    public void remover(Class<T> clazz, Serializable id) { //clazz é so pra diferenciar da palavra reservada
        T t = em.find(clazz, id); //busca  o objeto         
        try {
            em.getTransaction().begin();
            em.remove(t); //executa o delete
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "(GenericDao) Erro ao remover o item: " + e);
            FechaConexao();
            throw e;
        }
    }

    public T buscarPorId(Class<T> clazz, Serializable id) {
        T t = null;
        try {
            t = em.find(clazz, id); //Busca o objeto
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar por ID");
            FechaConexao();
        }
        return t;
    }
}
