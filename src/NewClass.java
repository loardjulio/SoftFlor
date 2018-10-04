
import br.com.softflor.controller.ClienteDAO;
import br.com.softflor.controller.ContatoDAO;
import br.com.softflor.controller.EnderecoDAO;
import br.com.softflor.controller.FornecedorDAO;
import br.com.softflor.controller.ProdutoDAO;
import br.com.softflor.entidades.Cliente;
import br.com.softflor.entidades.Contato;
import br.com.softflor.entidades.Endereco;
import br.com.softflor.entidades.Fornecedor;
import br.com.softflor.entidades.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class NewClass {
    public static void main(String[] args) throws Exception {
        
        Contato contato = new Contato();
        contato.setEmail("acontato@jsjssjjs.com");
        contato.setNome("Sicrano");
        contato.setTelefone("000099999");
        
        
        Endereco end = new Endereco();
        end.setBairro("Bairro");
        end.setCep("1292929");
        end.setCidade("NaVIRAI");
        end.setEstado("MS");
        end.setLogradouro("logradouro");
        end.setNumero("3434");
               
        
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setCnpj("123456");
        fornecedor.setNome("Flores Divoneis");
        //fornecedor.setStatus(1);
        fornecedor.setContato(contato);
        fornecedor.setEndereco(end);
        //fornecedor.setIdfornecedor(1);
        
//          Fornecedor f2 = new Fornecedor();
//        f2.setCnpj("121212");
//        f2.setNome("Flores MS");
//        f2.setStatus(2);
//        f2.setContato(contato);
//        f2.setEndereco(end);
        //fornecedor.setIdfornecedor(1);
                      
              
       List<Fornecedor> listaFornecedor = new ArrayList(); 
       listaFornecedor.add(fornecedor);
       //listaFornecedor.add(f2);
       
      FornecedorDAO fd = new FornecedorDAO();
       fd.salvarOuAtualizar(fornecedor);
               
//        Produto p = new Produto();
//        p.setEstoque_minimo(100.0);
//        p.setFornecedor(listaFornecedor);
//        p.setNome("FloR");
//        p.setPreco_compra(40.0);
//        p.setPreco_venda(80.0);
//        p.setQuantidade(90.0);
//        p.setUnidade_medida("Unidade");
//        
//        ProdutoDAO pd = new ProdutoDAO();
//        pd.salveOrUpdate(p);
        
        
    }
}
