
import br.com.softflor.controller.OrcamentoDAO;
import br.com.softflor.controller.ProdutoDAO;
import br.com.softflor.entidades.Cliente;
import br.com.softflor.entidades.Contato;
import br.com.softflor.entidades.Endereco;
import br.com.softflor.entidades.Fornecedor;
import br.com.softflor.entidades.Orcamento;
import br.com.softflor.entidades.Produto;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class TesteOrc {
    
    public static void main(String[] args) throws Exception {
        
         Contato contato = new Contato();
        
        contato.setEmail("cliente@cliente.com");
        contato.setNome("Clientela");
        contato.setTelefone("2345543");
        
        
        Endereco end = new Endereco();
        end.setBairro("Centro");
        end.setCep("123456789");
        end.setCidade("NaVIRAI");
        end.setEstado("MS");
        end.setLogradouro("Av. Das américas");
        end.setNumero("12345");
        
        Cliente cliente = new Cliente();
        cliente.setContato(contato);
        cliente.setEndereco(end);
        cliente.setCpf("05451533255");
        cliente.setNome("João da silva");
        
        Produto p = new Produto();
        p.setEstoque_minimo(50.0);
        p.setFornecedor(null);
        p.setNome("Palmeira");
        p.setPreco_compra(100.0);
        p.setPreco_venda(50.0);
        p.setQuantidade(60.0);
        p.setUnidade_medida("Unidade");
        
        Fornecedor f1 = new Fornecedor();
        f1.setCnpj("123455");
        f1.setNome("Sou Fornecedor");
        f1.setStatus("Ativo");
        f1.setProduto(null);
        f1.setContato(null);
        f1.setEndereco(null);
        
        List<Fornecedor> listaFornecedor = new ArrayList();
        listaFornecedor.add(f1);
        
        Produto p2 = new Produto();
        p2.setEstoque_minimo(50.0);
        p2.setFornecedor(listaFornecedor);
        p2.setNome("Aromatica");
        p2.setPreco_compra(10.0);
        p2.setPreco_venda(40.0);
        p2.setQuantidade(10.0);
        p2.setUnidade_medida("Unidade");
        
        List<Produto> listaProduto = new ArrayList(); 
       listaProduto.add(p);
       listaProduto.add(p2);
        
       
        Orcamento orcamento = new Orcamento();
        orcamento.setCliente(cliente);
        orcamento.setProdutos(listaProduto);
       
       // orcamento.setValor_total(100.0);
       // orcamento.setQuantidade_produto(20.0);
       // 
        OrcamentoDAO odao = new OrcamentoDAO();
        odao.salvarOuAtualizar(orcamento);
        //odao.remover(Orcamento.class, 5);
        
    }
    
}
