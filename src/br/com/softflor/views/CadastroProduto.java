/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.views;

import br.com.softflor.controller.FornecedorDAO;
import br.com.softflor.controller.ProdutoDAO;
import br.com.softflor.entidades.Cliente;
import br.com.softflor.entidades.Fornecedor;
import br.com.softflor.entidades.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class CadastroProduto extends javax.swing.JDialog {

    Produto produto = new Produto();
    ProdutoDAO pd = new ProdutoDAO();
    Fornecedor fornecedor = new Fornecedor();
    FornecedorDAO fdao = new FornecedorDAO();
    String nomeForn; //USADO PARA BUSCAR O FORNECEDOR DE UM DETERMINADO PRODUTO

    public CadastroProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PreCombo(); //CARREGA O COMBOBOX COM OS FORNECEDORES
        this.setLocationRelativeTo(null);
    }

    //--------METODO QUE PREENCHE O COMBOX COM FORNECEDORES--------------//
    private void PreCombo() {

        for (Fornecedor f : fdao.consultarTodos()) {
            ComboFornecedor.addItem(f.getNome());
        }
    }

    private void LimpaTela() {
        txtEstoqueMin.setText("");
        txtNomeProduto.setText("");
        txtPrecoCompra.setText("");
        txtPrecoVenda.setText("");
        txtQuantidadeProduto.setText("");
    }

    //-------------SETA OS DADOS DO PRODUTO NA TELA PARA REALIZAR A EDICAO-------///
    public void Atualiza(Produto produto) {
        try {
            if (produto == null) { //verifa se tem produto, se nao tiver exibe mensagem
                JOptionPane.showMessageDialog(this, "Erro ao retornar produto");
            } else {
                // SE EXISTIR O OBJETO SETA OS DADOS
                lblID.setText(produto.getId().toString());
                txtEstoqueMin.setText(produto.getEstoque_minimo().toString());
                txtNomeProduto.setText(produto.getNome());
                txtPrecoVenda.setText(produto.getPreco_venda().toString());
                txtPrecoCompra.setText(produto.getPreco_compra().toString());
                txtQuantidadeProduto.setText(produto.getQuantidade().toString());
                ComboFornecedor.addItem(produto.getFornecedor().get(0).getNome());
                ComboMedida.addItem(produto.getUnidade_medida());
                this.setVisible(true);
            }

        } catch (Exception e) {
            // CASO OCORRA ALGUM ERRO INESPERADO
            JOptionPane.showMessageDialog(this, "Erro inesperado :(" + e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtQuantidadeProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboMedida = new javax.swing.JComboBox<>();
        txtPrecoCompra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEstoqueMin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboFornecedor = new javax.swing.JComboBox<>();
        btnSair = new javax.swing.JButton();
        btnCadastrarPro = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("NOME:");

        jLabel8.setText("QUANTIDADE:");

        jLabel2.setText("UNIDADE DE MEDIDA:");

        ComboMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECIONE--", "Unidade", "Kg", "Metro", "M²" }));

        jLabel9.setText("PREÇO COMPRA:");

        jLabel10.setText("PREÇO VENDA:");

        jLabel11.setText("ESTOQUE MÍNIMO:");

        jLabel3.setText("FORNECEDOR:");

        ComboFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECIONE--" }));

        btnSair.setBackground(new java.awt.Color(255, 51, 51));
        btnSair.setText("VOLTAR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCadastrarPro.setBackground(new java.awt.Color(153, 255, 153));
        btnCadastrarPro.setText("CADASTRAR");
        btnCadastrarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 22)); // NOI18N
        jLabel5.setText("CADASTRO ");

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 22)); // NOI18N
        jLabel4.setText("PRODUTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(ComboMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(232, 232, 232))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ComboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSair)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(643, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(222, 222, 222))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ComboMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(ComboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSair))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProActionPerformed

        produto.setNome(txtNomeProduto.getText()); //PEGA P NOME DO PRODUTO NO CAMPO       
        
        if (lblID.getText().equals("") == false) {  //SE O CAMPO ID NÃO ESTIVER VAZIO ELE PEGA O DADO         
               produto.setIdproduto(Integer.parseInt(lblID.getText()));
        } 
        produto.setEstoque_minimo(Double.parseDouble(txtEstoqueMin.getText())); //SETA O ESTOQUE
        produto.setPreco_compra(Double.parseDouble(txtPrecoCompra.getText())); //SETA PRECO COMPRA
        produto.setPreco_venda(Double.parseDouble(txtPrecoVenda.getText()));
        produto.setQuantidade(Double.parseDouble(txtQuantidadeProduto.getText()));
        
        nomeForn = (String) ComboFornecedor.getSelectedItem(); //PEGA O NOME DO FORN QUE TA NO COMBO       
        produto.setUnidade_medida((String) ComboMedida.getSelectedItem());   //SETA A UNIDADE DE MEDIDA     
        

        if (produto.ChecaFornecedor(nomeForn) && produto.ChecaUnidade() == true) { //VERIFICA OS COMBOS
            produto.setFornecedor(fdao.fornecedorProduto(nomeForn)); //PEGA O FORNECEDOR JA CADASTRADO E SETA ELE NO PRODUTO
            pd.salvarOuAtualizar(produto); //SALVA O PRODUTO
        LimpaTela();
        this.dispose(); 
        }
        
        
       
        

    }//GEN-LAST:event_btnCadastrarProActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        pd.FechaConexao();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                CadastroProduto dialog = new CadastroProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboFornecedor;
    private javax.swing.JComboBox<String> ComboMedida;
    private javax.swing.JButton btnCadastrarPro;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables

}
