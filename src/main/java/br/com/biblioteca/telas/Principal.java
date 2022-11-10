/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.telas;

import java.awt.CardLayout;
import java.awt.Color;
import main.java.br.com.biblioteca.entidades.AutorEntidade;
import main.java.br.com.biblioteca.repositorios.AutorRepositorio;
import main.java.br.com.biblioteca.repositorios.interfaces.AutorRepositorioInterface;
import main.java.br.com.biblioteca.telas.autor.AutorTabela;

/**
 *
 * @author lucas
 */
public class Principal extends javax.swing.JFrame {
      
    /**
     * Creates new form Teste
     */
    public Principal() {
        initComponents();
        AutorTabela.atualizarTabela(autorListagemTbl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraLateralPanel = new javax.swing.JPanel();
        livroBarraLateralBtn = new javax.swing.JButton();
        autorBarraLateralBtn = new javax.swing.JButton();
        clienteBarraLateralBtn = new javax.swing.JButton();
        compraBarraLateralBtn = new javax.swing.JButton();
        revistaBarraLateralBtn = new javax.swing.JButton();
        periodicoBarraLateralBtn = new javax.swing.JButton();
        paiPanel = new javax.swing.JPanel();
        autorPanel = new javax.swing.JPanel();
        cadastroAutorPanel = new javax.swing.JPanel();
        nomeAutorTxt = new javax.swing.JTextField();
        cadastrarAutorBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        statusAutorLbl = new javax.swing.JLabel();
        listagemAutorPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        autorListagemTbl = new javax.swing.JTable();
        atualizarAutorBtn = new javax.swing.JButton();
        clientePanel = new javax.swing.JPanel();
        compraPanel = new javax.swing.JPanel();
        revistaPanel = new javax.swing.JPanel();
        periodicoPanel = new javax.swing.JPanel();
        livroPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraLateralPanel.setBackground(new java.awt.Color(240, 150, 123));

        livroBarraLateralBtn.setText("Livro");
        livroBarraLateralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livroBarraLateralBtnActionPerformed(evt);
            }
        });

        autorBarraLateralBtn.setText("Autor");
        autorBarraLateralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorBarraLateralBtnActionPerformed(evt);
            }
        });

        clienteBarraLateralBtn.setText("Cliente");
        clienteBarraLateralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteBarraLateralBtnActionPerformed(evt);
            }
        });

        compraBarraLateralBtn.setText("Compra");
        compraBarraLateralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraBarraLateralBtnActionPerformed(evt);
            }
        });

        revistaBarraLateralBtn.setText("Revista");
        revistaBarraLateralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revistaBarraLateralBtnActionPerformed(evt);
            }
        });

        periodicoBarraLateralBtn.setText("Periódico");
        periodicoBarraLateralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodicoBarraLateralBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraLateralPanelLayout = new javax.swing.GroupLayout(barraLateralPanel);
        barraLateralPanel.setLayout(barraLateralPanelLayout);
        barraLateralPanelLayout.setHorizontalGroup(
            barraLateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLateralPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraLateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(revistaBarraLateralBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(livroBarraLateralBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(autorBarraLateralBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clienteBarraLateralBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(compraBarraLateralBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLateralPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(periodicoBarraLateralBtn)))
                .addContainerGap())
        );
        barraLateralPanelLayout.setVerticalGroup(
            barraLateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLateralPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(autorBarraLateralBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clienteBarraLateralBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(compraBarraLateralBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(revistaBarraLateralBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(periodicoBarraLateralBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(livroBarraLateralBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paiPanel.setPreferredSize(new java.awt.Dimension(1125, 0));
        paiPanel.setLayout(new java.awt.CardLayout());

        cadastroAutorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Cadastro"));

        nomeAutorTxt.setBackground(new java.awt.Color(240, 240, 240));
        nomeAutorTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nomeAutorTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cadastrarAutorBtn.setText("Cadastrar");
        cadastrarAutorBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cadastrarAutorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAutorBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("NOME");

        javax.swing.GroupLayout cadastroAutorPanelLayout = new javax.swing.GroupLayout(cadastroAutorPanel);
        cadastroAutorPanel.setLayout(cadastroAutorPanelLayout);
        cadastroAutorPanelLayout.setHorizontalGroup(
            cadastroAutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroAutorPanelLayout.createSequentialGroup()
                .addGroup(cadastroAutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadastroAutorPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nomeAutorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cadastroAutorPanelLayout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(statusAutorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                        .addComponent(cadastrarAutorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(cadastroAutorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cadastroAutorPanelLayout.setVerticalGroup(
            cadastroAutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroAutorPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeAutorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(cadastroAutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarAutorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusAutorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        listagemAutorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Listagem"));

        autorListagemTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(autorListagemTbl);
        if (autorListagemTbl.getColumnModel().getColumnCount() > 0) {
            autorListagemTbl.getColumnModel().getColumn(0).setResizable(false);
            autorListagemTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        atualizarAutorBtn.setText("Atualizar");
        atualizarAutorBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout listagemAutorPanelLayout = new javax.swing.GroupLayout(listagemAutorPanel);
        listagemAutorPanel.setLayout(listagemAutorPanelLayout);
        listagemAutorPanelLayout.setHorizontalGroup(
            listagemAutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listagemAutorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atualizarAutorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        listagemAutorPanelLayout.setVerticalGroup(
            listagemAutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listagemAutorPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(atualizarAutorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout autorPanelLayout = new javax.swing.GroupLayout(autorPanel);
        autorPanel.setLayout(autorPanelLayout);
        autorPanelLayout.setHorizontalGroup(
            autorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(autorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroAutorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listagemAutorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        autorPanelLayout.setVerticalGroup(
            autorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroAutorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listagemAutorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        paiPanel.add(autorPanel, "autorCartao");

        javax.swing.GroupLayout clientePanelLayout = new javax.swing.GroupLayout(clientePanel);
        clientePanel.setLayout(clientePanelLayout);
        clientePanelLayout.setHorizontalGroup(
            clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        clientePanelLayout.setVerticalGroup(
            clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        paiPanel.add(clientePanel, "clienteCartao");

        javax.swing.GroupLayout compraPanelLayout = new javax.swing.GroupLayout(compraPanel);
        compraPanel.setLayout(compraPanelLayout);
        compraPanelLayout.setHorizontalGroup(
            compraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1135, Short.MAX_VALUE)
        );
        compraPanelLayout.setVerticalGroup(
            compraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        paiPanel.add(compraPanel, "compraCartao");

        javax.swing.GroupLayout revistaPanelLayout = new javax.swing.GroupLayout(revistaPanel);
        revistaPanel.setLayout(revistaPanelLayout);
        revistaPanelLayout.setHorizontalGroup(
            revistaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1135, Short.MAX_VALUE)
        );
        revistaPanelLayout.setVerticalGroup(
            revistaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        paiPanel.add(revistaPanel, "revistaCartao");

        javax.swing.GroupLayout periodicoPanelLayout = new javax.swing.GroupLayout(periodicoPanel);
        periodicoPanel.setLayout(periodicoPanelLayout);
        periodicoPanelLayout.setHorizontalGroup(
            periodicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1135, Short.MAX_VALUE)
        );
        periodicoPanelLayout.setVerticalGroup(
            periodicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        paiPanel.add(periodicoPanel, "periodicoCartao");

        javax.swing.GroupLayout livroPanelLayout = new javax.swing.GroupLayout(livroPanel);
        livroPanel.setLayout(livroPanelLayout);
        livroPanelLayout.setHorizontalGroup(
            livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1135, Short.MAX_VALUE)
        );
        livroPanelLayout.setVerticalGroup(
            livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        paiPanel.add(livroPanel, "livroCartao");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraLateralPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraLateralPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void livroBarraLateralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livroBarraLateralBtnActionPerformed
        CardLayout principalCardLayout = (CardLayout) paiPanel.getLayout();
        principalCardLayout.show(paiPanel, "livroCartao");
    }//GEN-LAST:event_livroBarraLateralBtnActionPerformed

    private void autorBarraLateralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorBarraLateralBtnActionPerformed
        CardLayout principalCardLayout = (CardLayout) paiPanel.getLayout();
        principalCardLayout.show(paiPanel, "autorCartao");
    }//GEN-LAST:event_autorBarraLateralBtnActionPerformed

    private void clienteBarraLateralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteBarraLateralBtnActionPerformed
        CardLayout principalCardLayout = (CardLayout) paiPanel.getLayout();
        principalCardLayout.show(paiPanel, "clienteCartao");
    }//GEN-LAST:event_clienteBarraLateralBtnActionPerformed

    private void compraBarraLateralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraBarraLateralBtnActionPerformed
        CardLayout principalCardLayout = (CardLayout) paiPanel.getLayout();
        principalCardLayout.show(paiPanel, "compraCartao");
    }//GEN-LAST:event_compraBarraLateralBtnActionPerformed

    private void revistaBarraLateralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revistaBarraLateralBtnActionPerformed
        CardLayout principalCardLayout = (CardLayout) paiPanel.getLayout();
        principalCardLayout.show(paiPanel, "revistaCartao");
    }//GEN-LAST:event_revistaBarraLateralBtnActionPerformed

    private void periodicoBarraLateralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodicoBarraLateralBtnActionPerformed
        CardLayout principalCardLayout = (CardLayout) paiPanel.getLayout();
        principalCardLayout.show(paiPanel, "periodicoCartao");
    }//GEN-LAST:event_periodicoBarraLateralBtnActionPerformed

    private void cadastrarAutorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAutorBtnActionPerformed
        String texto = nomeAutorTxt.getText();
        if (texto.isEmpty()) {
            statusAutorLbl.setText("Um nome deve ser informada para se cadastrar um autor.");
            statusAutorLbl.setForeground(Color.red);
        } else {
            statusAutorLbl.setForeground(Color.black);
            statusAutorLbl.setText("Autor cadastrado com sucesso.");
            
            AutorEntidade autorEntidade = new AutorEntidade(
                texto,
                null
            );
            
            AutorRepositorioInterface autorRepositorioInterface = new AutorRepositorio();
            autorRepositorioInterface.criar(autorEntidade);
            
            AutorTabela.atualizarTabela(autorListagemTbl);
        }
    }//GEN-LAST:event_cadastrarAutorBtnActionPerformed

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
        java.awt.EventQueue.invokeLater(
            () -> {   
                new Principal().setVisible(true);
            }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarAutorBtn;
    private javax.swing.JButton autorBarraLateralBtn;
    private javax.swing.JTable autorListagemTbl;
    private javax.swing.JPanel autorPanel;
    private javax.swing.JPanel barraLateralPanel;
    private javax.swing.JButton cadastrarAutorBtn;
    private javax.swing.JPanel cadastroAutorPanel;
    private javax.swing.JButton clienteBarraLateralBtn;
    private javax.swing.JPanel clientePanel;
    private javax.swing.JButton compraBarraLateralBtn;
    private javax.swing.JPanel compraPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listagemAutorPanel;
    private javax.swing.JButton livroBarraLateralBtn;
    private javax.swing.JPanel livroPanel;
    private javax.swing.JTextField nomeAutorTxt;
    private javax.swing.JPanel paiPanel;
    private javax.swing.JButton periodicoBarraLateralBtn;
    private javax.swing.JPanel periodicoPanel;
    private javax.swing.JButton revistaBarraLateralBtn;
    private javax.swing.JPanel revistaPanel;
    private javax.swing.JLabel statusAutorLbl;
    // End of variables declaration//GEN-END:variables
}
