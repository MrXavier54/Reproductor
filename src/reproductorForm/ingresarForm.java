
package reproductorForm;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ingresarForm extends javax.swing.JFrame {

    public ingresarForm() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel31 = new swing.panel3();
        ingresarPanelInferior1 = new swing.ingresarPanelInferior();
        correo = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        ingresarBoton1 = new swing.ingresarBoton();
        ingresarLabel = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        atras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel31.setBackground(new java.awt.Color(102, 0, 255));
        panel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresarPanelInferior1.setBackground(new java.awt.Color(255, 255, 255));

        correo.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        correo.setForeground(new java.awt.Color(102, 0, 255));
        correo.setText("Correo");

        contraseña.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        contraseña.setForeground(new java.awt.Color(102, 0, 255));
        contraseña.setText("Contraseña");

        jTextField1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        ingresarBoton1.setBackground(new java.awt.Color(102, 0, 255));
        ingresarBoton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarBoton1MouseClicked(evt);
            }
        });

        ingresarLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ingresarLabel.setForeground(new java.awt.Color(255, 255, 255));
        ingresarLabel.setText("Ingresar");

        javax.swing.GroupLayout ingresarBoton1Layout = new javax.swing.GroupLayout(ingresarBoton1);
        ingresarBoton1.setLayout(ingresarBoton1Layout);
        ingresarBoton1Layout.setHorizontalGroup(
            ingresarBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarBoton1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(ingresarLabel)
                .addGap(92, 92, 92))
        );
        ingresarBoton1Layout.setVerticalGroup(
            ingresarBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarBoton1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ingresarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ingresarPanelInferior1Layout = new javax.swing.GroupLayout(ingresarPanelInferior1);
        ingresarPanelInferior1.setLayout(ingresarPanelInferior1Layout);
        ingresarPanelInferior1Layout.setHorizontalGroup(
            ingresarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarPanelInferior1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(ingresarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(correo)
                    .addComponent(contraseña))
                .addGap(40, 40, 40)
                .addGroup(ingresarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarPanelInferior1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(ingresarBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        ingresarPanelInferior1Layout.setVerticalGroup(
            ingresarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarPanelInferior1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(ingresarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(ingresarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseña)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(ingresarBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        panel31.add(ingresarPanelInferior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 184, 499, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo2.png"))); // NOI18N
        panel31.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 300, 82));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-cancelar-30 (1).png"))); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        panel31.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-flecha-izquierda-30.png"))); // NOI18N
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        panel31.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        getContentPane().add(panel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        // Crear una instancia de loginForm
    loginForm loginFormInstance = new loginForm();
    
    // Hacer visible el nuevo JFrame
    loginFormInstance.setVisible(true);
    
    // Cerrar el JFrame actual
    this.dispose();
    }//GEN-LAST:event_atrasMouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    private boolean autenticarUsuario(String correo, String contraseña) {
        String rutaArchivo = "C:/Users/xavia/Desktop/usuarios.txt"; // Reemplaza con la ruta correcta

    try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
        String line;
        while ((line = reader.readLine()) != null) {
            // Dividir la línea en nombre y valor
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String nombreCampo = parts[0].trim();
                String valorCampo = parts[1].trim();

                // Verificar si el correo y la contraseña coinciden con algún registro
                if (nombreCampo.equals("Correo") && valorCampo.equals(correo)) {
                    // Leer la siguiente línea para obtener la contraseña
                    line = reader.readLine();
                    String[] passwordParts = line.split(":");
                    if (passwordParts.length == 2) {
                        String contraseñaAlmacenada = passwordParts[1].trim();

                        // Comparar la contraseña almacenada con la proporcionada
                        if (contraseñaAlmacenada.equals(contraseña)) {
                            return true; // Usuario autenticado correctamente
                        }
                    }
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al autenticar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
    }

    return false; // Usuario no autenticado
    }
    private void ingresarBoton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBoton1MouseClicked
       String correoIngresado = jTextField1.getText();
        String contraseñaIngresada = new String(jPasswordField1.getPassword());

        if (autenticarUsuario(correoIngresado, contraseñaIngresada)) {
            JOptionPane.showMessageDialog(this, "Acceso exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            // Aquí puedes redirigir al usuario a otra ventana o realizar otras acciones después del acceso exitoso.
        } else {
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_ingresarBoton1MouseClicked
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
            java.util.logging.Logger.getLogger(ingresarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel correo;
    private swing.ingresarBoton ingresarBoton1;
    private javax.swing.JLabel ingresarLabel;
    private swing.ingresarPanelInferior ingresarPanelInferior1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    private swing.panel3 panel31;
    // End of variables declaration//GEN-END:variables
}
