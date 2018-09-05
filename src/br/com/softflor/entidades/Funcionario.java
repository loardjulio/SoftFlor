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

/**
 *
 * @author Julio
 */
@Entity
@Table(name = "funcionarios")
public class Funcionario implements EntidadeBase {

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

    public Funcionario(Integer idfuncionario, String setor, String nome, String senha) {
        this.idfuncionario = idfuncionario;
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
