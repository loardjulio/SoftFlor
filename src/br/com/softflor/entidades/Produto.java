/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author Julio
 */
@Entity
@Table(name = "produtos")
@NamedQueries(
        @NamedQuery(name = "Produto.consultarTodos", query = "SELECT p FROM Produto p")  //consulta nomeada
)
public class Produto implements EntidadeBase, Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column
   private Integer idproduto;
    //@Column
   private String nome;
    //@Column
   private Double qntdOrc;
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
    
   
       
    @ManyToMany(cascade = javax.persistence.CascadeType.ALL)
    @JoinTable(name = "Produto_Fornecedor", joinColumns = @JoinColumn(name = "idproduto"),
            inverseJoinColumns = @JoinColumn(name = "idfornecedor"))
    private List<Fornecedor> fornecedor;
   
    
    public List<Fornecedor> getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(List<Fornecedor> fornecedor) {
        this.fornecedor = fornecedor;
    }
    
      
    
    @Override
    public Serializable getId() {
        return idproduto;
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
  


    public Double getQntdOrc() {
        return qntdOrc;
    }

    public void setQntdOrc(Double qntdOrc) {
        this.qntdOrc = qntdOrc;
    }

  
    
    
   
}
