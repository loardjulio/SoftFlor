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



/**
 *
 * @author Julio
 */
 @Entity
@Table(name = "contatos")
public class Contato implements Serializable,EntidadeBase {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer idcontato;
    @Column
    private String telefone;
    @Column
    private String email;
        @Column
    private String nome;

    @Override
    public Serializable getId() {
       return idcontato;
    }

    public Contato() {
    }

    public Contato(String telefone, String email,String nome) {
        this.telefone = telefone;
        this.email = email;
       
        this.nome = nome;
    }

    public Integer getIdcontato() {
        return idcontato;
    }

    public void setIdcontato(Integer idcontato) {
        this.idcontato = idcontato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
