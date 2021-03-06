/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.views;

import br.com.softflor.controller.ProdutoDAO;
import br.com.softflor.controller.tableModel.ProdutoTableModel;
import br.com.softflor.entidades.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class ListaProdutos extends javax.swing.JDialog {

    /**
     * Creates new form BuscaProdutos
     */
    public int idSelecionado;
    public ProdutoTableModel tableModel;
    ProdutoDAO pd = new ProdutoDAO();

    public ListaProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void loadTable(Integer idFornecedor) {
        //ProdutoDAO pd = new ProdutoDAO();
        if (idFornecedor == null) {
            tableModel = new ProdutoTableModel(pd.consultarTodos());
        } else {
            tableModel = new ProdutoTableModel(pd.consultarPorFornecedor(idFornecedor));           
        }
        listaBuscaProduto.setModel(tableModel);
    }

    public void carregaTabela() {
        // ProdutoDAO pd = new ProdutoDAO();
        tableModel = new ProdutoTableModel(pd.consultarTodos());
        listaBuscaProduto.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        painelProduto = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaBuscaProduto = new javax.swing.JTable();
        painelBotao = new javax.swing.JPanel();
        btEDITAR = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btEXCLUIR = new javax.swing.JButton();
        btCADASTRAR = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtNomeBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnEntrada = new javax.swing.JButton();
        btnSaida = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("SAÍDA");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de produtos");

        painelProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listaBuscaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listaBuscaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaBuscaProdutoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaBuscaProduto);

        painelBotao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btEDITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/EditarProduto.png"))); // NOI18N
        btEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEDITARActionPerformed(evt);
            }
        });

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/voltar.png"))); // NOI18N
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excluirProduto.png"))); // NOI18N
        btEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEXCLUIRActionPerformed(evt);
            }
        });

        btCADASTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CadastrarProduto.png"))); // NOI18N
        btCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCADASTRARActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("CADASTRAR");

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("EDITAR");

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("EXCLUIR");

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("VOLTAR");

        javax.swing.GroupLayout painelBotaoLayout = new javax.swing.GroupLayout(painelBotao);
        painelBotao.setLayout(painelBotaoLayout);
        painelBotaoLayout.setHorizontalGroup(
            painelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotaoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel10))
                    .addGroup(painelBotaoLayout.createSequentialGroup()
                        .addComponent(btCADASTRAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotaoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotaoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(28, 28, 28)))
                .addGroup(painelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotaoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotaoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(52, 52, 52))))
        );
        painelBotaoLayout.setVerticalGroup(
            painelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEDITAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCADASTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEXCLUIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)))
        );

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtNomeBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeBuscaActionPerformed(evt);
            }
        });

        jLabel1.setText("BUSCAR POR NOME:");

        btnEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/EntradaProduto.png"))); // NOI18N
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/saidaProduto.png"))); // NOI18N
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelProdutoLayout = new javax.swing.GroupLayout(painelProduto);
        painelProduto.setLayout(painelProdutoLayout);
        painelProdutoLayout.setHorizontalGroup(
            painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutoLayout.createSequentialGroup()
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE))
                    .addGroup(painelProdutoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeBusca)
                .addGap(47, 47, 47)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        painelProdutoLayout.setVerticalGroup(
            painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutoLayout.createSequentialGroup()
                        .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSaida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntrada, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(20, 20, 20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel5.setText("LISTAGEM");

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel4.setText("PRODUTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(painelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaBuscaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaBuscaProdutoMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = listaBuscaProduto.getSelectedRow();
            int id = (int) tableModel.getValueAt(linha, 0);
            this.idSelecionado = id;
            this.dispose();
        }
    }//GEN-LAST:event_listaBuscaProdutoMouseClicked

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCADASTRARActionPerformed
        CadastroProduto cp = new CadastroProduto(null, true);
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCADASTRARActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nome = txtNomeBusca.getText();

        if (!nome.equals("") && !nome.equals(" ")) {
            tableModel = new ProdutoTableModel(pd.consultarPorNome(nome));
            listaBuscaProduto.setModel(tableModel);
        } else {
            JOptionPane.showMessageDialog(this, "Informe um produto");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEXCLUIRActionPerformed

        switch (JOptionPane.showConfirmDialog(null, "Deseja Excluir o item selecionado?")) {
            case 0:
                int linha = listaBuscaProduto.getSelectedRow();
                int id = (int) tableModel.getValueAt(linha, 0);
                ProdutoDAO pd = new ProdutoDAO();
                pd.remover(Produto.class, id);
                tableModel.removeRow(linha);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Operação cancelada");
                break;
            case 2:
                System.out.println("botao cancel clicado");
                break;

        }

    }//GEN-LAST:event_btEXCLUIRActionPerformed

    private void btEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEDITARActionPerformed
        int linha = listaBuscaProduto.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto");
        } else {
            ProdutoDAO pd = new ProdutoDAO();
            int id = (int) tableModel.getValueAt(linha, 0);
            CadastroProduto cp = new CadastroProduto(null, true);
            cp.Atualiza(pd.buscarPorId(Produto.class, id));
            this.setVisible(false);
        }


    }//GEN-LAST:event_btEDITARActionPerformed

    private void txtNomeBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeBuscaActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
        int linha = listaBuscaProduto.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto");
        } else {
            int id = (int) tableModel.getValueAt(linha, 0);
            AlteraEstoque ae = new AlteraEstoque(null, true, "-");
            ae.recebeProduto(id); //ENVIA O ID PARA O FRAME ALTERA ESTOQUE
            ae.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        int linha = listaBuscaProduto.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto");
        } else {
            int id = (int) tableModel.getValueAt(linha, 0);
            AlteraEstoque ae = new AlteraEstoque(null, true, "+");
            ae.recebeProduto(id); //ENVIA O ID PARA O FRAME ALTERA ESTOQUE
            ae.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(ListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaProdutos dialog = new ListaProdutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btCADASTRAR;
    private javax.swing.JButton btEDITAR;
    private javax.swing.JButton btEXCLUIR;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEntrada;
    public javax.swing.JButton btnSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable listaBuscaProduto;
    public javax.swing.JPanel painelBotao;
    private javax.swing.JPanel painelProduto;
    private javax.swing.JTextField txtNomeBusca;
    // End of variables declaration//GEN-END:variables
}
