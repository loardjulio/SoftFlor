
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
        contato.setEmail("Cliente1@gmail.com");
        contato.setNome("Maria da penha");
        contato.setTelefone("999999");
        
        
        Endereco end = new Endereco();
        end.setBairro("Bairro");
        end.setCep("1292929");
        end.setCidade("NaVIRAI");
        end.setEstado("MS");
        end.setLogradouro("logradouro");
        end.setNumero("3434");
               
        
        Cliente cliente = new Cliente();
        cliente.setContato(contato);
        cliente.setEndereco(end);
        cliente.setCpf("0545555334");
        cliente.setNome("Maria da Pena Silveira");
        
        ClienteDAO cd = new ClienteDAO();
        cd.salvarOuAtualizar(cliente);
        
        //Fornecedor fornecedor = new Fornecedor();
       // fornecedor.setCnpj("123456");
       // fornecedor.setNome("Plantas paraná");
       // fornecedor.setStatus("ATIVO");
       // fornecedor.setContato(contato);
       // fornecedor.setEndereco(end);
       
        
      //   Fornecedor f2 = new Fornecedor();
      //  f2.setCnpj("121212");
     //  f2.setNome("Flores MS");
     //  f2.setStatus("INATIVO");
     //   f2.setContato(contato);
       //         f2.setEndereco(end);
        //fornecedor.setIdfornecedor(1);
                      
              
      // List<Fornecedor> listaFornecedor = new ArrayList(); 
      // listaFornecedor.add(fornecedor);
       //listaFornecedor.add(f2);
       
     // FornecedorDAO fd = new FornecedorDAO();
      // fd.salvarOuAtualizar(fornecedor);
               
      //  Produto p = new Produto();
//        p.setEstoque_minimo(100.0);
//       p.setFornecedor(listaFornecedor);
//        p.setNome("Palmeira Imperial");
//        p.setPreco_compra(200.0);
//        p.setPreco_venda(500.0);
//       p.setQuantidade(3.0);
//        p.setUnidade_medida("Unidade");
        
      //  ProdutoDAO pd = new ProdutoDAO();
      //  pd.salvarOuAtualizar(p);
        
        
    }
}
