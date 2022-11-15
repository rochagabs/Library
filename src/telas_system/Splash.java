package telas_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import telas_usuario.Login;

/**
 *
 * @author maria
 */
public class Splash extends javax.swing.JFrame {
    //Configurar o Atríbuto:
    private Timer t;
    private final ActionListener al;
    
    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        //Configurar o timer:
         al = (ActionEvent ae) -> {
             //Se barra de rolagem <100% continuar somando 1
             if(BarradeRolagem.getValue()<100){
                 BarradeRolagem.setValue(BarradeRolagem.getValue()+1);
             }//Fim if
             else{
                 //Desligar o Timer
                 t.stop();
                 //Abrir tela de Loging
                 Login login;
                 try {
                     login = new Login();
                     login.setVisible(true);
                     dispose();
                 } catch (IOException ex) {
                     Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }//Fim else
             
             //Modificando label carregando:
             if (BarradeRolagem.getValue()==30){
                 lbCarregando.setText("Carregando Arquivos...");
             }
             if (BarradeRolagem.getValue()==50){
                 lbCarregando.setText("Carregando Banco de Dados...");
             }
             if (BarradeRolagem.getValue()==80){
                 lbCarregando.setText("Finalizando...");
             }
        };//Fim ActionListener
         t = new Timer(40, al);
         t.start();
         
    }//Fim public Splash

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarradeRolagem = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCarregando = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarradeRolagem.setBackground(new java.awt.Color(0, 153, 153));
        BarradeRolagem.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(BarradeRolagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 380, 20));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 80));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Livra");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Versão 1.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 200, 200));

        lbCarregando.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbCarregando.setForeground(new java.awt.Color(255, 255, 255));
        lbCarregando.setText("Carregando...");
        getContentPane().add(lbCarregando, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/livros.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 440, 330));

        setSize(new java.awt.Dimension(431, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarradeRolagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCarregando;
    // End of variables declaration//GEN-END:variables
}
