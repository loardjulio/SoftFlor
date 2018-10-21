/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author Julio
 */
@Entity
@Table(name = "clientes")
@NamedQueries(
        @NamedQuery(name = "Cliente.consultarPorNome",
                query = "SELECT c from Cliente c WHERE c.nome LIKE :nome")//consulta nomeada
)

public class Cliente implements Serializable, EntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCliente;

    private String nome;

    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    private Contato contato;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @Override
    public Serializable getId() {
        return idCliente;
    }

    public Cliente() {
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente(Integer idCliente, String nome, String cpf, Contato contato, Endereco endereco) {

        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
    }

}
