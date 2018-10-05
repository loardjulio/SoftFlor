
import br.com.softflor.controller.FuncionarioDAO;
import br.com.softflor.entidades.Funcionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class TesteFuncionario {
    
    
    public static void main(String[] args) throws Exception {
       
    Funcionario novo = new Funcionario("administrador", "", "");
        FuncionarioDAO fdao = new FuncionarioDAO();
        fdao.salvarOuAtualizar(novo);
       
       
    }
    
    
   
}
