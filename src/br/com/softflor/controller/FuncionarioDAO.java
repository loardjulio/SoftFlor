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
 private String nome;
 private boolean nível;

  

    public boolean InfoAcesso(String usuario, String senha) {
        
        List<Funcionario> funcionarios = null;
        //consulta por nome
        Query q = em.createNamedQuery("Funcionario.consultaPorUsuario");
        q.setParameter("usuario", usuario);
        //pode receber uma lista de resultados
        funcionarios = q.getResultList();
        //verifica as credenciais de acesso
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSenha() == null ? senha == null : funcionario.getSenha().equals(senha)) {
              this.nome = funcionario.getNome();
              this.nível = funcionario.isAdministrador();
                acesso = true;   
              
            } else {
                acesso = false;
            }
        }
        valida(acesso); //Envia o resultado para o método valida

        if (acesso == true) {
            return true; //SE RETORNA TRUE É PQ A JANELA DEVE SER FECHADA
        } else {
            return false;
        }

    }

    private void valida(boolean chave) {
        if (chave == true) {          
                                   
            JOptionPane.showMessageDialog(null, "Acesso liberado. Bem vindo"); 
            
            
            new Principal(nome,nível).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }
    }

    public List<Funcionario> consultarTodos() {
        try {
            Query q = em.createNamedQuery("Funcionario.consultarTodos");
            List<Funcionario> funcionarios = q.getResultList();
            return funcionarios;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro buscar Produtos" + e);
            FechaConexao();
        }
        return null;
    }
    
    //fazer uma consulta no banco de dados. caso o id 1 nao existir, ele deve 
    //criar usuario admin, senha admin nome Adminstrador
    //caso existir 
    
    
    //VERIFICA SE O ADMIN FIXO DE ID 1 EXISTE. SE SIM NÃO FAZ NADA, SE NÃO ELE CRIA O ADMIN FIXO
    public void userAdmin(){
       
        Funcionario funcionario = null;
        try {              
            funcionario = em.find(Funcionario.class, 1);  
            
        } catch (Exception e) {
            System.out.println("Erro FuncionarioDAO: " + e);
        } 
        
        if (funcionario == null) { 
            Funcionario padrão = new Funcionario(true, "Administrador", "admin", "admin") ;   
             // this.salvarOuAtualizar(padrão);
             em.getTransaction().begin();
             em.persist(padrão);
             em.getTransaction().commit();  
             
        }        
        
    }


}
