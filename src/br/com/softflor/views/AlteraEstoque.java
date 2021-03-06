/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softflor.views;

import br.com.softflor.controller.ProdutoDAO;
import br.com.softflor.entidades.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class AlteraEstoque extends javax.swing.JDialog {
    String sinal;
    //----- OBJETOs USADO PARA MANIPULAR UM FUNCIONARIO------------//
    ProdutoDAO pd = new ProdutoDAO();
     String a = "a2w5sd6545";
     Produto p;
    /**
     * Creates new form CadastroCliente1
     */
    public AlteraEstoque(java.awt.Frame parent, boolean modal,String sinal) {
        super(parent, modal);
        this.sinal=sinal;
        initComponents();
        setLocationRelativeTo(null);
        lblAlerta.setVisible(false);
        if (sinal.equals("+")) {
            btnAdd.setVisible(true);
            btnSub.setVisible(false);
             lblQuantidade.setText("QUANTIDADE DE ENTRADA");
               lbltitulo.setText("ENTRADA DE ESTOQUE");      
        
        }else if(sinal.equals("-")){
           btnAdd.setVisible(false);
            btnSub.setVisible(true); 
             lblQuantidade.setText("QUANTIDADE RETIRADA");
               lbltitulo.setText("SAÍDA DE ESTOQUE");
        }
       
    }

    private AlteraEstoque(java.awt.Frame parent, boolean modal) {
       super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void recebeProduto(int id){ 
        //ProdutoDAO pd = new ProdutoDAO();
       Produto p=  pd.buscarPorId(Produto.class, id); //BUSCA O PRODUTO E SETA OS VALORES         
        txtQuantidade.setText(p.getQuantidade().toString());
        txtEstoque.setText(p.getEstoque_minimo().toString());  
        lblID.setText(p.getIdproduto().toString());
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
        btnAdd = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        lblAlerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de cliente");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CadastrarProduto.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lbltitulo.setFont(new java.awt.Font("Constantia", 1, 22)); // NOI18N
        lbltitulo.setText("ALTERAR PRODUTO");

        jLabel8.setText("QUANTIDADE EM ESTOQUE");

        txtQuantidade.setEditable(false);

        jLabel10.setText("ESTOQUE MÍNIMO");

        txtEstoque.setEditable(false);

        lblQuantidade.setText("QUANTIDADE DE ENTRADA");

        txtEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEntradaFocusLost(evt);
            }
        });

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/voltar.png"))); // NOI18N
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btnSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CadastrarProduto.png"))); // NOI18N
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        lblAlerta.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        lblAlerta.setForeground(new java.awt.Color(255, 0, 0));
        lblAlerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/alerrta.png"))); // NOI18N
        lblAlerta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblAlertaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblAlertaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lbltitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblQuantidade)
                                    .addGap(31, 31, 31)
                                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSub)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitulo))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(lblAlerta)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd)
                    .addComponent(btVoltar)
                    .addComponent(btnSub))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
               
//VERIFICA CAMPOS VAZIOS
        if (txtEntrada.equals("") && txtEntrada.equals(a.contains("^[a-Z]"))) {
            JOptionPane.showMessageDialog(this, "Informe um valor de entrada válido");
        } else {                     
            int resp = JOptionPane.showConfirmDialog(null, "Deseja ADICIONAR ao estoque?", "Aguardando resposta...", JOptionPane.YES_NO_CANCEL_OPTION);
            if (resp == 0) {                
                //ProdutoDAO pd = new ProdutoDAO();      
                //BUSCA NOVAMENTE O PRODUTO, SETA SOMENTE O ALTERADO E FAZ O UPDATE
                Produto p = pd.buscarPorId(Produto.class, Integer.parseInt(lblID.getText()));                 
                p.setQuantidade(Double.parseDouble(txtEntrada.getText())+Double.parseDouble(txtQuantidade.getText()));               
                pd.salvarOuAtualizar(p); //FAZ O UPDATE
                                
            } else if (resp == 1) {
                JOptionPane.showMessageDialog(this, "Operação cancelada");                
            }
            this.dispose();
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
               //VERIFICA CAMPOS VAZIOS
              
        if (txtEntrada.equals("") && txtEntrada.equals(a.contains("^[a-Z]"))) {
            JOptionPane.showMessageDialog(this, "Informe um valor de saída válido");
        } else {                     
            int resp = JOptionPane.showConfirmDialog(null, "Deseja SUBTRAIR do estoque?", "Aguardando resposta...", JOptionPane.YES_NO_CANCEL_OPTION);
            if (resp == 0) {
                
                 //ProdutoDAO pd = new ProdutoDAO();      
                //BUSCA NOVAMENTE O PRODUTO, SETA SOMENTE O ALTERADO E FAZ O UPDATE
                 Produto p =  pd.buscarPorId(Produto.class, Integer.parseInt(lblID.getText()));
                p.setIdproduto(Integer.parseInt(lblID.getText()));
                p.setQuantidade( (Double.parseDouble(txtQuantidade.getText())-Double.parseDouble(txtEntrada.getText())));               
                pd.salvarOuAtualizar(p);
                                               
            } else if (resp == 1) {
                JOptionPane.showMessageDialog(this, "Operação cancelada");                
            }
            this.dispose();
        }

    }//GEN-LAST:event_btnSubActionPerformed

    private void txtEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEntradaFocusLost
          if (sinal.equals("+")) {
            Double valor =  (Double.parseDouble(txtEntrada.getText()))+(Double.parseDouble(txtQuantidade.getText()));
             lblAlerta.setText("NOVA QUANTIDADE NO ESTOQUE: "+valor); 
             lblAlerta.setVisible(true);
        }else if(sinal.equals("-")){
            Double valor =  ((Double.parseDouble(txtQuantidade.getText())-Double.parseDouble(txtEntrada.getText())));
          lblAlerta.setText("NOVA QUANTIDADE NO ESTOQUE: "+valor);    
          lblAlerta.setVisible(true);
           if (valor<0) {
                 lblAlerta.setText("ESTOQUE INSUFICIENTE!");  
                 btnSub.setVisible(false);
              }
        }
    }//GEN-LAST:event_txtEntradaFocusLost

    private void lblAlertaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblAlertaFocusLost
        
      
       
        
    }//GEN-LAST:event_lblAlertaFocusLost

    private void lblAlertaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblAlertaFocusGained
     
    }//GEN-LAST:event_lblAlertaFocusGained

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
            java.util.logging.Logger.getLogger(AlteraEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlteraEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlteraEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlteraEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlteraEstoque dialog = new AlteraEstoque(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

}
