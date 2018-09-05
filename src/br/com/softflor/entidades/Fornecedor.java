/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Julio
 */
 @Entity
@Table(name = "fornecedores")
public class Fornecedor implements EntidadeBase, Serializable{

    @ManyToMany(mappedBy = "fornecedor")
    private List<Produto> produtos;
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   // @Column
    private Integer idfornecedor;
    //@Column
    private Integer status;
     //@Column
    private String cnpj;    
    
    @OneToOne
    private Contato contato;
   
    @OneToOne
    private Endereco endereco;

    @Override
    public Serializable getId() {
       return idfornecedor;
    }

    public Fornecedor(List<Produto> produtos, Integer idfornecedor, Integer status, String cnpj, Contato contato, Endereco endereco) {
        this.produtos = produtos;
        this.idfornecedor = idfornecedor;
        this.status = status;
        this.cnpj = cnpj;
        this.contato = contato;
        this.endereco = endereco;
    }

    public Fornecedor() {
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Integer getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
    
    
    
}
