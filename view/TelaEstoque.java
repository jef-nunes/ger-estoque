/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

/**
 *
 * @author jefadmin
 */
public class TelaEstoque extends javax.swing.JFrame {

    private DefaultTableModel tabela;
    private int idSelecionado = -1;
    private boolean modoAtualizacao = false;
    
    public void atualizarTabela() {
    tabela.setRowCount(0); // limpa os dados da tabela

    ArrayList<Produto> lista = GerenciaTelas.produtoControle.listar(); // busca do banco
    if(lista.size()>0){
            for (Produto p : lista) {
            // Obtendo o nome do usuário responsável
            // Salvar o ID (chave estrangeira)
            int usuarioID = p.getUsuarioID();
            // Obter o nome correspondente a partir do ID
            String nomeResponsavel = GerenciaTelas.produtoControle.obterNomeResponsavel(usuarioID);
        
            tabela.addRow(new Object[]{p.getNome(), p.getValorUnidade(), p.getQuantidadeDisponivel(), nomeResponsavel});
            }
        }
    }
   /*
    private void buscarDinamicamente() {
    String nomeBuscado = txtBusca.getText().trim();

    tabelaModelo.setRowCount(0); // limpa a tabela
    ArrayList<Pessoa> lista = controle.buscarPorNome(nomeBuscado);

    for (Pessoa p : lista) {
        tabelaModelo.addRow(new Object[]{p.getId(), p.getNome(), p.getIdade()});
    }
    } */
    
    /**
     * Creates new form TelaEstoque
     */
    public TelaEstoque() {
        initComponents();
        tabela = (DefaultTableModel) tabEstoque.getModel();
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabEstoque = new javax.swing.JTable();
        inpEstoqueNomeProduto = new javax.swing.JTextField();
        inpEstoqueQntDisponivel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inpEstoqueValorUni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btEstoqueCriarProduto = new javax.swing.JButton();
        btEstoqueAtualizarProduto = new javax.swing.JButton();
        btEstoqueRemoverProduto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        inpEstoqueBuscar = new javax.swing.JTextField();
        btEstoqueBuscar = new javax.swing.JButton();
        inpEstoqueCategoria = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Controle de Estoque");

        tabEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Valor Uni.", "Qnt. Disponível", "Responsável"
            }
        ));
        tabEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabEstoque);

        inpEstoqueNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpEstoqueNomeProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Quant. disponível");

        jLabel3.setText("Preço");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel5.setText("Gerenciar");

        jLabel6.setText("Adicione, edite, ou remova um produto.");

        jLabel7.setText("Para modificar um produto existente");

        jLabel8.setText("primeiro o selecione na tabela.");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel9.setText("Tabela");

        btEstoqueCriarProduto.setText("Criar");
        btEstoqueCriarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoqueCriarProdutoActionPerformed(evt);
            }
        });

        btEstoqueAtualizarProduto.setText("Atualizar");
        btEstoqueAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoqueAtualizarProdutoActionPerformed(evt);
            }
        });

        btEstoqueRemoverProduto.setText("Remover");
        btEstoqueRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoqueRemoverProdutoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel10.setText("Buscar");

        jLabel11.setText("Busque um produto por nome do produto ou");

        jLabel12.setText("nome do usuário responsável.");

        btEstoqueBuscar.setText("Buscar");

        jLabel13.setText("Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btEstoqueCriarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEstoqueAtualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEstoqueRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inpEstoqueQntDisponivel)
                                        .addComponent(inpEstoqueNomeProduto)
                                        .addComponent(inpEstoqueValorUni)
                                        .addComponent(inpEstoqueCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inpEstoqueBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btEstoqueBuscar)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(245, 245, 245)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inpEstoqueBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEstoqueBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inpEstoqueNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inpEstoqueCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inpEstoqueValorUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inpEstoqueQntDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEstoqueAtualizarProduto)
                            .addComponent(btEstoqueRemoverProduto)
                            .addComponent(btEstoqueCriarProduto))
                        .addGap(35, 35, 35))
                    .addComponent(jScrollPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inpEstoqueNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpEstoqueNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpEstoqueNomeProdutoActionPerformed

    private void btEstoqueCriarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoqueCriarProdutoActionPerformed
        // TODO add your handling code here:
        try{
            boolean erro = false;
            // Verificar se todos os campos foram preenchidos
            if(inpEstoqueNomeProduto.getText().isEmpty() ||
               inpEstoqueValorUni.getText().isEmpty() ||
               inpEstoqueQntDisponivel.getText().isEmpty() ||
               inpEstoqueCategoria.getText().isEmpty()){
                erro = true;
            }
            // Obter valores preenchidos em cada campo
            String nome = inpEstoqueNomeProduto.getText();
            float valorUni = Float.parseFloat(inpEstoqueValorUni.getText());
            int qntDisponivel = Integer.parseInt(inpEstoqueQntDisponivel.getText());
            String categoriaNome = inpEstoqueCategoria.getText();
            int usuarioID = GerenciaTelas.getUsuarioLogado().getUsuarioID();
            // Prosseguir com o registro do produto (e da categoria se necessário)
            if(!erro){
                if(!GerenciaTelas.categoriaControle.categoriaRegistrada(categoriaNome)){
                    GerenciaTelas.categoriaControle.registrar(categoriaNome);
                }
                GerenciaTelas.produtoControle.registrar(nome, valorUni, qntDisponivel, usuarioID, categoriaNome);
                atualizarTabela();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btEstoqueCriarProdutoActionPerformed

    private void btEstoqueRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoqueRemoverProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEstoqueRemoverProdutoActionPerformed

    private void btEstoqueAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoqueAtualizarProdutoActionPerformed
        // TODO add your handling code here:
        try{
            boolean erro = false;
            // Verificar se todos os campos foram preenchidos
            if(inpEstoqueNomeProduto.getText().isEmpty() ||
               inpEstoqueValorUni.getText().isEmpty() ||
               inpEstoqueQntDisponivel.getText().isEmpty() ||
               inpEstoqueCategoria.getText().isEmpty()){
                erro = true;
            }
            // Obter valores preenchidos em cada campo
            String nome = inpEstoqueNomeProduto.getText();
            float valorUni = Float.parseFloat(inpEstoqueValorUni.getText());
            int qntDisponivel = Integer.parseInt(inpEstoqueQntDisponivel.getText());
            String categoriaNome = inpEstoqueCategoria.getText();
            int usuarioID = GerenciaTelas.getUsuarioLogado().getUsuarioID();
            // Prosseguir com o registro do produto (e da categoria se necessário)
            if(!erro){
                if(!GerenciaTelas.categoriaControle.categoriaRegistrada(categoriaNome)){
                    GerenciaTelas.categoriaControle.registrar(categoriaNome);
                }
                GerenciaTelas.produtoControle.registrar(nome, valorUni, qntDisponivel, usuarioID, categoriaNome);
                atualizarTabela();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btEstoqueAtualizarProdutoActionPerformed

    private void tabEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabEstoqueMouseClicked
        // TODO add your handling code here:
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            idSelecionado = (int) tbListar.getValueAt(linha, 0); // Coluna ID
            String nome = (String) tbListar.getValueAt(linha, 1);
            int idade = (int) tbListar.getValueAt(linha, 2);

            txtNome.setText(nome);
            txtIdade.setText(String.valueOf(idade));
    }//GEN-LAST:event_tabEstoqueMouseClicked

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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEstoqueAtualizarProduto;
    private javax.swing.JButton btEstoqueBuscar;
    private javax.swing.JButton btEstoqueCriarProduto;
    private javax.swing.JButton btEstoqueRemoverProduto;
    private javax.swing.JTextField inpEstoqueBuscar;
    private javax.swing.JTextField inpEstoqueCategoria;
    private javax.swing.JTextField inpEstoqueNomeProduto;
    private javax.swing.JTextField inpEstoqueQntDisponivel;
    private javax.swing.JTextField inpEstoqueValorUni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabEstoque;
    // End of variables declaration//GEN-END:variables
}
