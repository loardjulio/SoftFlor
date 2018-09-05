
import br.com.softflor.conexao.ConectaBD;
import br.com.softflor.controller.ClienteDAO;
import br.com.softflor.controller.ContatoDAO;
import br.com.softflor.controller.EnderecoDAO;
import br.com.softflor.controller.FornecedorDAO;
import br.com.softflor.controller.GenericDAO;
import br.com.softflor.controller.ProdutoDAO;
import br.com.softflor.entidades.Cliente;
import br.com.softflor.entidades.Contato;
import br.com.softflor.entidades.Endereco;
import br.com.softflor.entidades.Fornecedor;
import br.com.softflor.entidades.Produto;
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
public class teste {
    public static void main(String[] args) {
        
    
        
        Contato contato = new Contato();
        contato.setCelular("99999999");
        contato.setEmail("Fulanodetal@hotmail.com");
        contato.setNome("CONTATO TESTE PARA FORNECEDOR");
        contato.setTelefone("34612222");
//      //  contato.setIdcontato(1);
//        
        ContatoDAO cDao = new ContatoDAO();
//        try {
//           // cDao.remover(Contato.class, 6);
//            cDao.salveOrUpdate(contato);
//        } catch (Exception ex) {
//            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        Endereco endereco = new Endereco();
//        endereco.setBairro("Centro");
//        endereco.setCep("79950000");
//        endereco.setCidade("Navirai");
//        endereco.setEstado("MS");
//        endereco.setLogradouro("Rua dos Bobos");
//        endereco.setNumero("0");    
//        
//        EnderecoDAO eDao = new EnderecoDAO();
//        try {
//            eDao.salveOrUpdate(endereco);
//        } catch (Exception ex) {
//            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
//        }

      //  GenericDAO testa = new GenericDAO();

//        
//        Cliente cliente = new Cliente();
//        cliente.setCpf("1234567");
//        cliente.setNome("Josecreudo");
//        cliente.setEndereco(null);
//        cliente.setContato(null);
//        
//        ClienteDAO cliDAO = new ClienteDAO();
//        try {
//            cliDAO.salveOrUpdate(cliente);
//        } catch (Exception ex) {
//            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
        Fornecedor f1 = new Fornecedor();
        f1.setCnpj("123456789");
        f1.setContato(contato);
        f1.setEndereco(null);
        f1.setStatus(1);
        f1.setProdutos(null);
        
//        FornecedorDAO fDao = new FornecedorDAO();
//        try {
//            fDao.salveOrUpdate(f1);
//        } catch (Exception ex) {
//            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
//        
        Produto p2 = new Produto();
        ProdutoDAO pDao = new ProdutoDAO();
        p2.setEstoque_minimo(22.0);        
        p2.setNome("Novo Produto");
        p2.setPreco_compra(21.00);
        p2.setPreco_venda(50.0);
        p2.setQuantidade(10.0);
        p2.setUnidade_medida("Unidade");
        p2.setFornecedor((List<Fornecedor>) f1);
        
        try {
            pDao.salveOrUpdate(p2);
        } catch (Exception ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
//        
        
          
        
        
        
        
    }
}
