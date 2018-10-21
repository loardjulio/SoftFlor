/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Cliente;
import br.com.softflor.entidades.Funcionario;
import br.com.softflor.views.Login;
import br.com.softflor.views.Principal;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class FuncionarioDAO extends GenericDAO<Funcionario> {

    private boolean acesso;
    public boolean FecharJanela;

    public boolean InfoAcesso(String nome, String senha) {
        List<Funcionario> funcionarios = null;
        //consulta por nome
        Query q = em.createNamedQuery("Funcionario.consultaPorNome");
        q.setParameter("nome", nome);
        //pode receber uma lista de resultados
        funcionarios = q.getResultList();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSenha() == null ? senha == null : funcionario.getSenha().equals(senha)) {
                acesso = true;
            } else {
                acesso = false;
            }
        }
        valida(acesso);
        if (acesso == true) {
            return FecharJanela = true; //SE RETORNA TRUE É PQ A JANELA DEVE SER FECHADA
        } else {
            return false;
        }

    }

    private void valida(boolean chave) {
        if (chave == true) {
            JOptionPane.showMessageDialog(null, "Acesso liberado. Bem vindo");
            new Principal().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }
    }

}
