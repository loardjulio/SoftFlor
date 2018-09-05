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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Julio
 */
@Entity
@Table(name = "produtos")
public class Produto implements EntidadeBase, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column
    private Integer idproduto;
    //@Column
    private String nome;
    //@Column
    private Double quantidade;
    //@Column
    private Double preco_compra;
    //@Column
    private Double preco_venda;
    //@Column
    private Double estoque_minimo;
    //@Column
    private String unidade_medida;

    @ManyToMany
    private List<Fornecedor> fornecedor;

    @Override
    public Serializable getId() {
        return idproduto;
    }

    public Produto() {
    }

    public Produto(Integer idproduto, String nome, Double quantidade, Double preco_compra, Double preco_venda, Double estoque_minimo, String unidade_medida, List<Fornecedor> fornecedor) {
        this.idproduto = idproduto;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco_compra = preco_compra;
        this.preco_venda = preco_venda;
        this.estoque_minimo = estoque_minimo;
        this.unidade_medida = unidade_medida;
        this.fornecedor = fornecedor;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(Double preco_compra) {
        this.preco_compra = preco_compra;
    }

    public Double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(Double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public Double getEstoque_minimo() {
        return estoque_minimo;
    }

    public void setEstoque_minimo(Double estoque_minimo) {
        this.estoque_minimo = estoque_minimo;
    }

    public String getUnidade_medida() {
        return unidade_medida;
    }

    public void setUnidade_medida(String unidade_medida) {
        this.unidade_medida = unidade_medida;
    }

    public List<Fornecedor> getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(List<Fornecedor> fornecedor) {
        this.fornecedor = fornecedor;
    }

}
