/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author Julio
 */
@Entity
@Table(name = "funcionarios")
@NamedQueries({
        @NamedQuery(name = "Funcionario.consultaPorUsuario", query = "SELECT f FROM Funcionario f WHERE f.usuario = :usuario"),  //consulta nomeada
         @NamedQuery(name = "Funcionario.consultarTodos", query = "SELECT f FROM Funcionario f")  //consulta nomeada
})
public class Funcionario implements EntidadeBase, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column
    private Integer idfuncionario;   
    //@Column
    private Boolean administrador=false;
    //@Column
    private String nome;
    //@Column
    private String usuario;
    //@Column
    private String senha;

    @Override
    public Serializable getId() {
        return idfuncionario;
    }

    public Funcionario() {
    }

    public Funcionario(boolean administrador, String nome, String usuario, String senha) {
        
        this.administrador = administrador;
        this.nome = nome;
         this.usuario = usuario;
        this.senha = senha;
    }
    
    
    
    public Integer getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

   
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    

}
