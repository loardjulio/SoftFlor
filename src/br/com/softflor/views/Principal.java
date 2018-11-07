/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.views;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class Principal extends javax.swing.JFrame {
//ProdutosEstoque pe = new ProdutosEstoque();
ImageIcon img = new ImageIcon("src/icons/backPrinc.png");


 
    public Principal() {
        JOptionPane.showMessageDialog(null, "Erro ao iniciar");
        System.exit(0);
    }
    
    public Principal(String nome,boolean nível) {        
        initComponents();       
        setLocationRelativeTo(null);
        img.setImage(img.getImage().getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), 1));
        lblImagem.setIcon(img);
        if (nível!=true) {
          MenuUsuario.setEnabled(false);   
        }     
        lblNome.setText("Olá, "+nome); 
       //esk.add(pe);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        PainelAcoes = new javax.swing.JPanel();
        btnProduto = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnOrcamento = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnProduto1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        Fornecedor = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        lblNome.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        lblNome.setText("nome");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SOFTFLOR - Sistema de gerenciamento");
        setLocationByPlatform(true);
        setResizable(false);

        PainelAcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/estoque.png"))); // NOI18N
        btnProduto.setPreferredSize(new java.awt.Dimension(70, 20));
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ListaCliente.png"))); // NOI18N
        btnCliente.setPreferredSize(new java.awt.Dimension(70, 20));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/listFornecedor.png"))); // NOI18N
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        btnOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/GeraOrc.png"))); // NOI18N
        btnOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrcamentoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("FORNECEDORES");

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("CLIENTES");

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("ESTOQUE");

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText("ORÇAMENTOS");

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("PRODUTOS");

        btnProduto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produtos.png"))); // NOI18N
        btnProduto1.setPreferredSize(new java.awt.Dimension(70, 20));
        btnProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduto1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/alerrta.png"))); // NOI18N

        javax.swing.GroupLayout PainelAcoesLayout = new javax.swing.GroupLayout(PainelAcoes);
        PainelAcoes.setLayout(PainelAcoesLayout);
        PainelAcoesLayout.setHorizontalGroup(
            PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcoesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAcoesLayout.createSequentialGroup()
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(PainelAcoesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(btnProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAcoesLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelAcoesLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel9)))
                .addGap(82, 82, 82))
        );
        PainelAcoesLayout.setVerticalGroup(
            PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcoesLayout.createSequentialGroup()
                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAcoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelAcoesLayout.createSequentialGroup()
                                .addComponent(btnProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)))
                            .addGroup(PainelAcoesLayout.createSequentialGroup()
                                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addGroup(PainelAcoesLayout.createSequentialGroup()
                                .addComponent(btnOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        lblImagem.setText("jLabel1");
        lblImagem.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jMenu1.setText("Clientes");

        jMenuItem2.setText("Cadastrar cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem6.setText("Listar Clientes");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        Fornecedor.setText("Fornecedor");

        jMenuItem3.setText("Cadastrar Fornecedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Fornecedor.add(jMenuItem3);

        jMenuItem7.setText("Listar fornecedores");
        Fornecedor.add(jMenuItem7);

        jMenuBar1.add(Fornecedor);

        jMenu2.setText("Produtos");

        jMenuItem4.setText("Cadastrar produto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem8.setText("Listar produtos");
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Orçamentos");

        jMenuItem5.setText("Listar orçamentos");
        jMenu4.add(jMenuItem5);

        jMenuItem9.setText("Novo orçamento");
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        MenuUsuario.setText("Usuários");

        jMenuItem13.setText("Gerenciar usuários");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        MenuUsuario.add(jMenuItem13);

        jMenuBar1.add(MenuUsuario);

        jMenu6.setText("Sobre");

        jMenuItem12.setText("Sistema");
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ajuda");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
         ListaClientes lc = new ListaClientes(this, true);
           lc.setVisible(true);
         
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        GerenciadorEstoque ge = new GerenciadorEstoque();
        ge.setVisible(true);
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        ListaFornecedores listagem = new ListaFornecedores();
        listagem.setVisible(true);
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastroCliente cc = new CadastroCliente(this, true);
        cc.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        ListaUsuarios lf = new ListaUsuarios(this,true);
       lf.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void btnOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrcamentoActionPerformed
        GeracaoOcamento go = new GeracaoOcamento();
        go.setVisible(true);
    }//GEN-LAST:event_btnOrcamentoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CadastroProduto cp = new CadastroProduto(this, true);
        cp.setVisible(true);       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       CadastroFornecedor cf = new CadastroFornecedor(this, true);
        cf.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduto1ActionPerformed
       ListaProdutos listagemProduto = new ListaProdutos(null, true);
        listagemProduto.loadTable(null);
        listagemProduto.setVisible(true);
    }//GEN-LAST:event_btnProduto1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Fornecedor;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JPanel PainelAcoes;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnOrcamento;
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnProduto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
