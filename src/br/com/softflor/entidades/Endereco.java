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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
@Entity
@Table(name = "enderecos")
public class Endereco implements EntidadeBase, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column
    private Integer idendereco;
    //@Column
    private String logradouro;
    //@Column
    private String numero;
    //@Column
    private String bairro;
    //@Column
    private String cep;
    //@Column
    private String estado;
    //@Column
    private String cidade;

    @Override
    public Serializable getId() {
        return idendereco;
    }

    public Endereco() {
    }

    public boolean ChecaEstado(){ //SE RETORNAR TRUE ESTA CORRETO
        String padrao = "--SELECIONE--";
        if(estado == padrao){
        JOptionPane.showMessageDialog(null, "Selecione um estado");
           return false; 
        }else {
           return true;  
        }       
    }
    
    public Endereco(String logradouro, String numero, String bairro, String cep, String estado, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
    }

    public Integer getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Integer idendereco) {
        this.idendereco = idendereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    

}
