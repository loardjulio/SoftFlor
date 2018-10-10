/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Cliente;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Julio
 */
public class ClienteDAO extends GenericDAO<Cliente> {

    public List<Cliente> consultarTodos() {

        List<Cliente> clientes = null;
        try {
            Query q = em.createQuery("SELECT c FROM Cliente c");
            clientes = q.getResultList();
        } catch (Exception e) {
            System.out.println("Erro clienteDAO: " + e);
        } finally {
            // FechaConexao();
        }

        return clientes;
    }

    public List<Cliente> consultarPorNome(String nome) {

        List<Cliente> clientes = null;
        try {
            Query q = em.createNamedQuery("Cliente.consultarPorNome");
            q.setParameter("nome", nome + "%");
            clientes = q.getResultList();
        } catch (Exception e) {
            System.out.println("Erro clienteDAO: " + e);
        } finally {
            FechaConexao();
            System.out.println("Consultas realizadas");
        }

        return clientes;
    }
}
