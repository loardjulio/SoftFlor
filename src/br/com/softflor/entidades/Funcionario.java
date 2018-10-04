/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.entidades;

import java.io.Serializable;
import javax.persistence.Column;
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
@NamedQueries(
        @NamedQuery(name = "Funcionario.consultaPorNome", query = "SELECT f FROM Funcionario f WHERE f.nome = :nome")  //consulta nomeada
)
public class Funcionario implements EntidadeBase, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column
    private Integer idfuncionario;
    //@Column
    private String setor;
    //@Column
    private String nome;
    //@Column
    private String senha;

    @Override
    public Serializable getId() {
        return idfuncionario;
    }

    public Funcionario() {
    }

    public Funcionario(String setor, String nome, String senha) {
        
        this.setor = setor;
        this.nome = nome;
        this.senha = senha;
    }

    public Integer getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
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

}
