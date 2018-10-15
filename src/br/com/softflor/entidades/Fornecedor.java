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
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.swing.JOptionPane;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author Julio
 */
 @Entity
@Table(name = "fornecedores")
 @NamedQueries({
        @NamedQuery(name = "Fornecedor.consultarTodos", query = "SELECT f FROM Fornecedor f"), //consulta nomeada
        @NamedQuery(name = "Fornecedor.consultarPorNome",query = "SELECT f from Fornecedor f WHERE f.nome LIKE :nome")//consulta nomeada
 
 })
public class Fornecedor implements Serializable,EntidadeBase {
      
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   // @Column
    private Integer idfornecedor;
    //@Column
    private String status;
     //@Column
    private String cnpj;    
    
    private String nome;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Contato contato;
   
    @OneToOne (cascade = CascadeType.ALL)
    private Endereco endereco;

    @ManyToMany(mappedBy = "fornecedor")
     private List<Produto> produto; 
    
    
     public boolean ChecaStatus(){
        String padrao = "--SELECIONE--";
        if(status == padrao){
        JOptionPane.showMessageDialog(null, "Selecione um status", "Algo deu errado :(", 0);
        return false;
    }else {
            return true;
            
        }
     }
    
   
      public Fornecedor() {
    }

    public Fornecedor(String status, String cnpj, String nome, Contato contato, Endereco endereco) {
        this.status = status;
        this.cnpj = cnpj;
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
    }
     
    @Override
    public Serializable getId() {
       return idfornecedor;
    }

    public Integer getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }


   
    
}
