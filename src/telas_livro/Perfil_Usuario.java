package telas_livro;
import classes_banco.Conexao_db;
import classes_basic.Gerenciar_Usuario;
import classes_basic.Informacoes;
import com.mysql.jdbc.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import classes_basic.Usuario;
import classes_premium.Livro_Premium;
import classes_premium.Usuario_Premium;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import telas_usuario.Assinatura_Premium;
/**
 *
 * @author maria
 */
public class Perfil_Usuario extends javax.swing.JFrame {
    Conexao_db conexao;
    Connection con;
    Gerenciar_Usuario user;
    Usuario_Premium userpremium;
    Usuario usuario;
    
    /**
     * Creates new form Perfil_Usuario
     * @throws java.io.IOException
     */
    public Perfil_Usuario() throws IOException {
        initComponents();
        con = (Connection) Conexao_db.Conectar();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbExcluirConta = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfUF = new javax.swing.JTextField();
        lbAssinaturaPremium = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        tfDataNascimento = new javax.swing.JFormattedTextField();
        tfNumCelular = new javax.swing.JFormattedTextField();
        tfCPF1 = new javax.swing.JFormattedTextField();
        tfCEP1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Meu Perfil");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 80));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nome Completo:");

        btAlterar.setBackground(new java.awt.Color(142, 65, 0));
        btAlterar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar.setText("Alterar");
        btAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAlterarMouseClicked(evt);
            }
        });
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Livra");

        tfEmail.setBackground(new java.awt.Color(0, 0, 0));
        tfEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        tfNome.setBackground(new java.awt.Color(0, 0, 0));
        tfNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfNome.setForeground(new java.awt.Color(255, 255, 255));
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Meu Perfil");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data de Nascimento:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número de Celular:");

        lbExcluirConta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbExcluirConta.setForeground(new java.awt.Color(255, 255, 255));
        lbExcluirConta.setText("Excluir minha conta");
        lbExcluirConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbExcluirConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExcluirContaMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dados Usuário Premium");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CPF:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Logradouro:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nº:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cidade:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("UF:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CEP:");

        tfLogradouro.setBackground(new java.awt.Color(0, 0, 0));
        tfLogradouro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfLogradouro.setForeground(new java.awt.Color(255, 255, 255));
        tfLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLogradouroActionPerformed(evt);
            }
        });

        tfCidade.setBackground(new java.awt.Color(0, 0, 0));
        tfCidade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfCidade.setForeground(new java.awt.Color(255, 255, 255));
        tfCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCidadeActionPerformed(evt);
            }
        });

        tfNumero.setBackground(new java.awt.Color(0, 0, 0));
        tfNumero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfNumero.setForeground(new java.awt.Color(255, 255, 255));
        tfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroActionPerformed(evt);
            }
        });

        tfUF.setBackground(new java.awt.Color(0, 0, 0));
        tfUF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfUF.setForeground(new java.awt.Color(255, 255, 255));
        tfUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUFActionPerformed(evt);
            }
        });

        lbAssinaturaPremium.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbAssinaturaPremium.setForeground(new java.awt.Color(255, 255, 51));
        lbAssinaturaPremium.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAssinaturaPremium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAssinaturaPremiumMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Bairro:");

        tfBairro.setBackground(new java.awt.Color(0, 0, 0));
        tfBairro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfBairro.setForeground(new java.awt.Color(255, 255, 255));
        tfBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBairroActionPerformed(evt);
            }
        });

        tfDataNascimento.setBackground(new java.awt.Color(0, 0, 0));
        tfDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        try {
            tfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfNumCelular.setBackground(new java.awt.Color(0, 0, 0));
        tfNumCelular.setForeground(new java.awt.Color(255, 255, 255));
        try {
            tfNumCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfCPF1.setBackground(new java.awt.Color(0, 0, 0));
        tfCPF1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            tfCPF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfCEP1.setBackground(new java.awt.Color(0, 0, 0));
        tfCEP1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            tfCEP1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCEP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCEP1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 26, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel2)))
                                        .addGap(138, 138, 138)
                                        .addComponent(lbExcluirConta))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tfNumCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                                .addComponent(tfDataNascimento, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel17)
                                        .addGap(26, 26, 26)
                                        .addComponent(tfCEP1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfLogradouro))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addComponent(lbAssinaturaPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfCPF1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(80, 80, 80))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAlterar)))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbExcluirConta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAssinaturaPremium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel17)
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfCEP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 660, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/leitor.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 510));

        setSize(new java.awt.Dimension(755, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMouseClicked
        // Ao clicar alterar inserir no banco:
        String nome = String.valueOf(tfNome.getText());
        String data_nascimento = String.valueOf(tfDataNascimento.getText());
        String cel = String.valueOf(tfNumCelular.getText());
        String email = String.valueOf(tfEmail.getText());
        Boolean ePremium = Informacoes.ePremium; 
        System.out.println("E premium = "+ePremium);
        
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setData_nascimento(data_nascimento);
        usuario.setNum_celular(cel);
        usuario.setEmail(email);
        usuario.setId_usuario(Informacoes.id_usuario);
        usuario.setAdmin(Boolean.parseBoolean(Informacoes.eAdmin));
        usuario.setEpremium(ePremium);
        
        user = new Gerenciar_Usuario();
        userpremium = new Usuario_Premium();
        
        if (nome.length()>0 && data_nascimento.length()>0 && cel.length()>0 && email.length()>0){
            try {
                user.AltUsuario(con,usuario);
                if (ePremium == true){
                    userpremium.AltUsuarioPremium(con,Informacoes.id_usuario, tfLogradouro.getText(), Integer.parseInt(tfNumero.getText()) ,tfBairro.getText(), tfCidade.getText(),tfUF.getText(),tfCEP1.getText(), tfCPF1.getText());
                    GetDados();
                }
                
                GetDados();
                JOptionPane.showMessageDialog(null, "Alteração de Cadastro realizada com sucesso!", "Conta alterada!", 1);
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(Perfil_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos!", "Cadastro inválido!", 2);
        }

    }//GEN-LAST:event_btAlterarMouseClicked

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlterarActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLogradouroActionPerformed

    private void tfCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCidadeActionPerformed

    private void tfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroActionPerformed

    private void tfUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUFActionPerformed

    private void lbExcluirContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExcluirContaMouseClicked
        //Ao clicar em excluir minha conta:
        Usuario usuario = new Usuario();
            
        Integer id = Informacoes.id_usuario;
        usuario.setId_usuario(id);
        
        Object[] options = { "Sim", "Não" };
        int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir a sua conta?", "Excluir minha conta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        System.out.println("Opcao: " + opcao);
        
        if(opcao == 0){
           
            try {
                user.DelUsuario(con,usuario);
                JOptionPane.showMessageDialog(null, "A conta foi excluída com sucesso!", "Conta Excluída!", 1);
                System.exit(0);   
            } catch (SQLException ex) {
                Logger.getLogger(Perfil_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }      
         
        }       
       
        
    }//GEN-LAST:event_lbExcluirContaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Ao abrir a tela:
        conexao = new Conexao_db();
        try {
            con = (Connection) Conexao_db.Conectar();
            GetDados();
            
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Perfil_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Ao fechar a tela:
        //Conexao_db.Desconectar();
        
    }//GEN-LAST:event_formWindowClosing
    public void GetDados() throws SQLException{
            System.out.println("Id do usuario tela perfil: "+Informacoes.id_usuario);
            System.out.println("Nome do usuario tela perfil: "+String.valueOf(Informacoes.nomeusuario));
            
            Boolean ePremium = Informacoes.ePremium; 
            
            usuario = new Usuario();
            usuario.setId_usuario(Informacoes.id_usuario);
            
            tfNome.setText(String.valueOf(Informacoes.nomeusuario));
            tfNumCelular.setText(String.valueOf(Informacoes.numcelular));
            tfEmail.setText(String.valueOf(Informacoes.emailusuario));
            
            String dataNascimento = Informacoes.datanascimento;
           

            String dia = dataNascimento.substring(0,4);
            String mes= dataNascimento.substring(5,7);
            String ano= dataNascimento.substring(8);

            String data = ano+mes+dia;
            
            tfDataNascimento.setText(data);
            
            System.out.println("Data: " + dataNascimento);
            System.out.println("Data formatada: " + data);
            
            userpremium = new Usuario_Premium();
            if(ePremium == false){
                tfCEP1.setEnabled(false);
                tfCidade.setEnabled(false);
                tfLogradouro.setEnabled(false);
                tfCPF1.setEnabled(false);
                tfUF.setEnabled(false);
                tfBairro.setEnabled(false);
                tfNumero.setEnabled(false);
                
                lbAssinaturaPremium.setText("CLIQUE AQUI PARA SE TORNAR PRÊMIUM!");
            } else {
                userpremium.DadosUserPremium(con, usuario);
                
                tfCEP1.setText(String.valueOf(Informacoes.cep));
                tfCidade.setText(String.valueOf(Informacoes.cidade));
                tfLogradouro.setText(String.valueOf(Informacoes.logradouro));
                tfCPF1.setText(String.valueOf(Informacoes.cpf));
                tfUF.setText(String.valueOf(Informacoes.uf));
                tfNumero.setText(String.valueOf(Informacoes.numero));
                tfBairro.setText(String.valueOf(Informacoes.bairro));
            }
}
    private void lbAssinaturaPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAssinaturaPremiumMouseClicked
        //Ao clicar em assinatura premium:
        Assinatura_Premium ass;
        try {
            ass = new Assinatura_Premium();
            ass.setVisible(true);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(Perfil_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_lbAssinaturaPremiumMouseClicked

    private void tfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBairroActionPerformed

    private void tfCEP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCEP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCEP1ActionPerformed
    
//Limpando os campos:
    public void LimparCampos(){
        //Basic
        tfDataNascimento.setText("");
        tfEmail.setText("");
        tfNome.setText("");
        tfNumCelular.setText("");
        
        //Premium
        tfCEP1.setText("");
        tfCPF1.setText("");
        tfCidade.setText("");
        tfLogradouro.setText("");
        tfNumero.setText("");
        tfUF.setText("");
               
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
            java.util.logging.Logger.getLogger(Perfil_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Perfil_Usuario().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Perfil_Usuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAssinaturaPremium;
    private javax.swing.JLabel lbExcluirConta;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCEP1;
    private javax.swing.JFormattedTextField tfCPF1;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JFormattedTextField tfDataNascimento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfNumCelular;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfUF;
    // End of variables declaration//GEN-END:variables
}
