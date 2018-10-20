
import br.com.softflor.controller.ClienteDAO;
import br.com.softflor.controller.FornecedorDAO;
import br.com.softflor.controller.FuncionarioDAO;
import br.com.softflor.controller.OrcamentoDAO;
import br.com.softflor.controller.ProdutoDAO;
import br.com.softflor.entidades.Cliente;
import br.com.softflor.entidades.Fornecedor;
import br.com.softflor.entidades.Funcionario;
import br.com.softflor.entidades.Orcamento;
import br.com.softflor.entidades.Produto;
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
public class BuscaTeste {
    
    public static void main(String[] args) {
        ProdutoDAO pd = new ProdutoDAO(); 
        //ClienteDAO cd = new ClienteDAO();
       // FornecedorDAO fd = new FornecedorDAO();
        
//         Cliente cliente = cd.buscarPorId(Cliente.class, 1);      
//        System.out.println("Nome: "+cliente.getNome());
//       System.out.println("CPF: "+cliente.getCpf());
//       System.out.println("Telefone: "+cliente.getContato().getTelefone());
//       System.out.println("Rua: "+cliente.getEndereco().getLogradouro());
//       
//        OrcamentoDAO od = new OrcamentoDAO();
//        Orcamento orcamento = new Orcamento();
//        orcamento = od.buscarPorId(Orcamento.class, 6);
//        System.out.println("Nome Cliente:"+orcamento.getCliente().getNome());
//        System.out.println("Quantidade:"+orcamento.getQuantidade_produto());
//        System.out.println("Produto: "+orcamento.getProdutos().get(6).getNome());
        
       
        
       //  pd.remover(Produto.class, 1);
        
        
       /*TESTE CONSULTAS NOMEADAS*/
       
       
       //List<Produto> produtosRetornados = pd.consultarPorFornecedor(3);
      // percorrer a lista
//       
//        for (Produto f : produtosRetornados) {
//            System.out.println("Id: "+f.getId());
//            System.out.println("Nome: "+f.getNome());
//         // System.out.println("CNPJ: "+f.getCnpj());
//            //System.out.println("Fornecedor: "+p.getFornecedor().get(2).getNome());
//            
//        }
        
/* List<Cliente> clientesRetornados = cd.consultarPorNome("Jo");
//       //percorrer a lista

for (Cliente c :clientesRetornados) {
System.out.println("Id: "+c.getId());
System.out.println("Nome do cliente: "+c.getNome());
System.out.println("cpf: "+c.getCpf());
System.out.println("Endereco: "+c.getEndereco().getLogradouro());

}*/
       //pd.consultarPorFornecedor(3);

    }
    
    
    
}
