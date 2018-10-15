/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Julio
 */
@Entity
@Table(name = "orcamentos")
public class Orcamento implements EntidadeBase, Serializable {

    @Id  
    // @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idorcamento;
    
    private Double valorTotal;
    
    @OneToOne(cascade = CascadeType.REFRESH)    
    private Cliente cliente;
        
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "orcamento_produtos", 
            joinColumns = @JoinColumn(name = "idorcamento"),
            inverseJoinColumns = @JoinColumn(name = "idproduto"))
    
    private List<Produto> produtos;
    

    @Override
    public Serializable getId() {
        return idorcamento;
    }

    public Orcamento() {
    }

    

    public Integer getIdorcamento() {
        return idorcamento;
    }

    public void setIdorcamento(Integer idorcamento) {
        this.idorcamento = idorcamento;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    

    
    
}
