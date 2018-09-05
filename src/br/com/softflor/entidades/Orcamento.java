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
import javax.persistence.ManyToOne;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column
    private Integer idorcamento;
    //@Column
    private Double quantidade_produto;

    //@Column
    private Double valor_total;
    //@Column
    private Double valor_unitario;

    @OneToMany
    private List<Produto> produtos;

    @OneToOne
    private Cliente cliente;

    @Override
    public Serializable getId() {
        return idorcamento;
    }

    public Orcamento() {
    }

    public Orcamento(Integer idorcamento, Double quantidade_produto, Double valor_total, Double valor_unitario, List<Produto> produtos, Cliente cliente) {
        this.idorcamento = idorcamento;
        this.quantidade_produto = quantidade_produto;
        this.valor_total = valor_total;
        this.valor_unitario = valor_unitario;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public Integer getIdorcamento() {
        return idorcamento;
    }

    public void setIdorcamento(Integer idorcamento) {
        this.idorcamento = idorcamento;
    }

    public Double getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(Double quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    public Double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Double valor_unitario) {
        this.valor_unitario = valor_unitario;
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

}
