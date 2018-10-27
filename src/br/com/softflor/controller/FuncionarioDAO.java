/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.controller;

import br.com.softflor.entidades.Cliente;
import br.com.softflor.entidades.Funcionario;
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

    public Boolean InfoAcesso(String usuario, String senha) {
        List<Funcionario> funcionarios = null;
        //consulta por nome
        Query q = em.createNamedQuery("Funcionario.consultaPorUsuario");
        q.setParameter("usuario", usuario);
        //pode receber uma lista de resultados
        funcionarios = q.getResultList();
        //verifica as credenciais de acesso
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSenha() == null ? senha == null : funcionario.getSenha().equals(senha)) {
                acesso = true;
            }
        }
        valida(acesso); //Envia o resultado para o método valida

        return acesso = false;

    }

    private void valida(boolean chave) {
        if (chave == true) {
            JOptionPane.showMessageDialog(null, "Acesso liberado. Bem vindo");
            FecharJanela = true; //SE RETORNA TRUE É PQ A JANELA DEVE SER FECHADA
            new Principal().setVisible(true);
        } else {
            FecharJanela = false;
            JOptionPane.showMessageDialog(null, "Acesso negado");

        }
    }

    

    public List<Funcionario> consultarTodos() {
         try {            
            Query q = em.createNamedQuery("Funcionario.consultarTodos");
            List<Funcionario> funcionarios = q.getResultList();            
            return funcionarios;
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro buscar Produtos"+ e);
            FechaConexao();
        }
        return null;
    }

}

