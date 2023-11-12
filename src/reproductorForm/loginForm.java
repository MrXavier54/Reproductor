
package reproductorForm;

import java.awt.Color;
import javax.swing.JFrame;

public class loginForm extends javax.swing.JFrame {

    public loginForm() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel21 = new swing.panel2();
        jLabel1 = new javax.swing.JLabel();
        registrarPanel1 = new swing.registrarPanel();
        jLabel3 = new javax.swing.JLabel();
        ingresarPanel1 = new swing.ingresarPanel();
        jLabel2 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel21.setBackground(new java.awt.Color(102, 0, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo2.png"))); // NOI18N

        registrarPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarPanel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setText("Registrar");

        javax.swing.GroupLayout registrarPanel1Layout = new javax.swing.GroupLayout(registrarPanel1);
        registrarPanel1.setLayout(registrarPanel1Layout);
        registrarPanel1Layout.setHorizontalGroup(
            registrarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        registrarPanel1Layout.setVerticalGroup(
            registrarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        ingresarPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarPanel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setText("Ingresar");

        javax.swing.GroupLayout ingresarPanel1Layout = new javax.swing.GroupLayout(ingresarPanel1);
        ingresarPanel1.setLayout(ingresarPanel1Layout);
        ingresarPanel1Layout.setHorizontalGroup(
            ingresarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        ingresarPanel1Layout.setVerticalGroup(
            ingresarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-cancelar-30 (1).png"))); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel21Layout = new javax.swing.GroupLayout(panel21);
        panel21.setLayout(panel21Layout);
        panel21Layout.setHorizontalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel21Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel21Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel21Layout.createSequentialGroup()
                        .addGroup(panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registrarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addComponent(cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel21Layout.setVerticalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel21Layout.createSequentialGroup()
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(ingresarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(registrarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        getContentPane().add(panel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void ingresarPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarPanel1MouseClicked
         
    ingresarForm ingresarForm = new ingresarForm();
    
    
    ingresarForm.setVisible(true);
    
     this.dispose();  
    }//GEN-LAST:event_ingresarPanel1MouseClicked

    private void registrarPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarPanel1MouseClicked
       registrarForm registrarForm = new registrarForm();
    
    
    registrarForm.setVisible(true);
    
     this.dispose();  
    }//GEN-LAST:event_registrarPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrar;
    private swing.ingresarPanel ingresarPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private swing.panel2 panel21;
    private swing.registrarPanel registrarPanel1;
    // End of variables declaration//GEN-END:variables
}
