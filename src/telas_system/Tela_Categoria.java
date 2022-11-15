package telas_system;

import classes_banco.Conexao_db;
import classes_basic.GerenciarCategoria;
import classes_basic.Categoria;
import classes_basic.Informacoes;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class Tela_Categoria extends javax.swing.JFrame {
    Conexao_db conexao;
    Connection con;
    GerenciarCategoria cat;
    
    String sql = "select * from categoria order by id_categoria";
    /**
     * Creates new form Categoria
     * @throws java.io.IOException
     * @throws java.sql.SQLException
     */
    public Tela_Categoria() throws IOException, SQLException {
        initComponents();
        con = (Connection) Conexao_db.Conectar();
        PreencherTabela(sql);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbNova = new javax.swing.JLabel();
        lbEditar = new javax.swing.JLabel();
        lbExcluir = new javax.swing.JLabel();
        lbRedefinir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel2.setBackground(new java.awt.Color(0, 0, 0, 80));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CATEGORIAS");

        tfCategoria.setBackground(new java.awt.Color(0, 0, 0));
        tfCategoria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfCategoria.setForeground(new java.awt.Color(255, 255, 255));
        tfCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCategoriaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoria:");

        tabela.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Categoria"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel2))
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 560, 450));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lbNova.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbNova.setForeground(new java.awt.Color(255, 255, 255));
        lbNova.setText("Nova");
        lbNova.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNova.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovaMouseClicked(evt);
            }
        });

        lbEditar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbEditar.setForeground(new java.awt.Color(255, 255, 255));
        lbEditar.setText("Editar");
        lbEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditarMouseClicked(evt);
            }
        });

        lbExcluir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbExcluir.setForeground(new java.awt.Color(255, 255, 255));
        lbExcluir.setText("Excluir");
        lbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExcluirMouseClicked(evt);
            }
        });

        lbRedefinir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbRedefinir.setForeground(new java.awt.Color(255, 255, 255));
        lbRedefinir.setText("Redefinir");
        lbRedefinir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbRedefinir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRedefinirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRedefinir)
                .addGap(27, 27, 27)
                .addComponent(lbNova)
                .addGap(27, 27, 27)
                .addComponent(lbEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lbExcluir)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNova)
                    .addComponent(lbEditar)
                    .addComponent(lbExcluir)
                    .addComponent(lbRedefinir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plano-de-fundo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 500));

        setSize(new java.awt.Dimension(657, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCategoriaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Ao abrir a tela:
        conexao = new Conexao_db();

        try {
            con = (Connection) Conexao_db.Conectar();
            PreencherTabela(sql);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Tela_Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Ao fechar a tela:;
        Conexao_db.Desconectar();
    }//GEN-LAST:event_formWindowClosing

    private void lbNovaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovaMouseClicked
        // Ao clicar em nova:
        String campo_categoria = String.valueOf(tfCategoria.getText());
        
        Categoria categoria = new Categoria();
        categoria.setNome_categoria(campo_categoria);
        categoria.setId_categoria(0);
        
        cat = new GerenciarCategoria();
        if (campo_categoria.length()>0){
         
            try {
                if (cat.VerificarCategoria(con,categoria) == false){
                    cat.AddCategoria(con,categoria);
                    JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso", "Categoria cadastrada!",1);
                    PreencherTabela(sql);
                } else {
                    JOptionPane.showMessageDialog(null,"A categoria já está cadastrada!", "Erro!", 2);
                }
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(Tela_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else {
            JOptionPane.showMessageDialog(null,"Todos os campos precisam ser preenchidos!", "Erro!", 2);
        }
        
    }//GEN-LAST:event_lbNovaMouseClicked

    private void lbEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditarMouseClicked
        //Ao clicar em editar:
        int linha = tabela.getSelectedRow();  
        Integer id = Integer.parseInt(tabela.getValueAt(linha,0).toString());
        String campo_categoria = String.valueOf(tfCategoria.getText());
        
        Categoria categoria = new Categoria();
        categoria.setNome_categoria(campo_categoria);
        categoria.setId_categoria(id);
        
        cat = new GerenciarCategoria();
        if (campo_categoria.length()>0){
         
            try {
                cat.AltCategoria(con,categoria);
                JOptionPane.showMessageDialog(null, "Categoria Alterada com sucesso", "Categoria Alterada!",1);
                PreencherTabela(sql);
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(Tela_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else {
            JOptionPane.showMessageDialog(null,"Todos os campos precisam ser preenchidos!", "Erro!", 2);
        }
    }//GEN-LAST:event_lbEditarMouseClicked

    private void lbExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExcluirMouseClicked
        // Ao clicar em excluir:
        int linha = tabela.getSelectedRow();
         
        Integer id = Integer.parseInt(tabela.getValueAt(linha,0).toString());
        
        String campo_categoria = String.valueOf(tfCategoria.getText());
        
        Categoria categoria = new Categoria();
        categoria.setId_categoria(id);
        
        cat = new GerenciarCategoria();
        //cat = new GerenciarCategoria();
        
        Object[] options = { "Sim", "Não" };
        int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir esta categoria?", "Excluir categoria", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        System.out.println("Opcao: " + opcao);
        
        if(opcao == 0){
            try {
                cat.DelCategoria(con,categoria);
                JOptionPane.showMessageDialog(null, "A conta foi excluída com sucesso!", "Conta Excluída!", 1);
                PreencherTabela(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Tela_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         
        }   
    }//GEN-LAST:event_lbExcluirMouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // Ao clicar na tabela (quando se clica na linha da tabela aparece os dados completos do uuário)
        int linha = tabela.getSelectedRow();
        
       
        tfCategoria.setText(tabela.getValueAt(linha,1).toString());
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void lbRedefinirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRedefinirMouseClicked
        // Ao clicar em redefinir:
        tfCategoria.setText("");
    

    }//GEN-LAST:event_lbRedefinirMouseClicked
    public void PreencherTabela(String sql) throws SQLException{ 
       PreparedStatement stmt = con.prepareStatement(sql);
       ResultSet rs = stmt.executeQuery(); //Resultado do banco de dados
       
       //Gravando as informações da tabela no banco de dados
       DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
       modelo.setNumRows(0);
       
       while(rs.next()) {
          modelo.addRow(new Object[]
          {
             
              rs.getInt("id_categoria"),
               rs.getString("nome_categoria"),
          });
       
     } //Fim while
      rs.close();
      stmt.close();
    }
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
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Tela_Categoria().setVisible(true);
            } catch (IOException | SQLException ex) {
                Logger.getLogger(Tela_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEditar;
    private javax.swing.JLabel lbExcluir;
    private javax.swing.JLabel lbNova;
    private javax.swing.JLabel lbRedefinir;
    private javax.swing.JPanel painel2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfCategoria;
    // End of variables declaration//GEN-END:variables
}
