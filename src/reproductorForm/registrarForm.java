
package reproductorForm;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class registrarForm extends javax.swing.JFrame {

    public registrarForm() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel41 = new swing.panel4();
        registrarPanelInferior1 = new swing.registrarPanelInferior();
        nombre = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        confirmarContraseña = new javax.swing.JLabel();
        nombreTexto = new javax.swing.JTextField();
        correoTexto = new javax.swing.JTextField();
        contraseñaTexto = new javax.swing.JPasswordField();
        confirmarCTexto = new javax.swing.JPasswordField();
        registrarBoton1 = new swing.registrarBoton();
        registrarLabel = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        atras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel41.setBackground(new java.awt.Color(255, 255, 255));
        panel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrarPanelInferior1.setBackground(new java.awt.Color(102, 0, 255));

        nombre.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre");

        correo.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        correo.setForeground(new java.awt.Color(255, 255, 255));
        correo.setText("Correo");

        contraseña.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña");

        confirmarContraseña.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        confirmarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        confirmarContraseña.setText("Confirmar contraseña");

        nombreTexto.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nombreTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextoActionPerformed(evt);
            }
        });

        correoTexto.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        correoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoTextoActionPerformed(evt);
            }
        });

        contraseñaTexto.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        contraseñaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaTextoActionPerformed(evt);
            }
        });

        confirmarCTexto.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        confirmarCTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarCTextoActionPerformed(evt);
            }
        });

        registrarBoton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarBoton1MouseClicked(evt);
            }
        });

        registrarLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        registrarLabel.setText("Registrar");

        javax.swing.GroupLayout registrarBoton1Layout = new javax.swing.GroupLayout(registrarBoton1);
        registrarBoton1.setLayout(registrarBoton1Layout);
        registrarBoton1Layout.setHorizontalGroup(
            registrarBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarBoton1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(registrarLabel)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        registrarBoton1Layout.setVerticalGroup(
            registrarBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarBoton1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout registrarPanelInferior1Layout = new javax.swing.GroupLayout(registrarPanelInferior1);
        registrarPanelInferior1.setLayout(registrarPanelInferior1Layout);
        registrarPanelInferior1Layout.setHorizontalGroup(
            registrarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarPanelInferior1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(registrarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmarContraseña)
                    .addComponent(contraseña)
                    .addComponent(correo)
                    .addComponent(nombre))
                .addGap(29, 29, 29)
                .addGroup(registrarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreTexto)
                    .addComponent(correoTexto)
                    .addComponent(contraseñaTexto)
                    .addComponent(confirmarCTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarPanelInferior1Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(registrarBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        registrarPanelInferior1Layout.setVerticalGroup(
            registrarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarPanelInferior1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(registrarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(nombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(registrarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo)
                    .addComponent(correoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(registrarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseña)
                    .addComponent(contraseñaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrarPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarContraseña)
                    .addComponent(confirmarCTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(registrarBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panel41.add(registrarPanelInferior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 184, 500, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo3.png"))); // NOI18N
        panel41.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 300, 82));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-cancelar-30.png"))); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        panel41.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-flecha-izquierda-30 (1).png"))); // NOI18N
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        panel41.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void nombreTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextoActionPerformed

    private void correoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoTextoActionPerformed

    private void contraseñaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaTextoActionPerformed

    private void confirmarCTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarCTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarCTextoActionPerformed

    private void registrarBoton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBoton1MouseClicked
         String nombreUsuario = nombreTexto.getText();
    String correoUsuario = correoTexto.getText();
    String contraseñaUsuario = new String(contraseñaTexto.getPassword());
    String confirmarContraseñaUsuario = new String(confirmarCTexto.getPassword());

    // Verificar si los campos están vacíos
    if (nombreUsuario.isEmpty() || correoUsuario.isEmpty() || contraseñaUsuario.isEmpty() || confirmarContraseñaUsuario.isEmpty()) {
        // Mostrar un mensaje de error
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Verificar si las contraseñas coinciden
    if (!contraseñaUsuario.equals(confirmarContraseñaUsuario)) {
        // Mostrar un mensaje de error
        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Guardar los datos en un archivo de texto
    String rutaArchivo = "/C:/Users/xavia/Desktop/usuarios.txt/"; // Reemplaza con la ruta correcta
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
        // Escribir los datos en el archivo
        writer.write("Nombre: " + nombreUsuario);
        writer.newLine();
        writer.write("Correo: " + correoUsuario);
        writer.newLine();
        writer.write("Contraseña: " + contraseñaUsuario);
        writer.newLine();
        writer.write("Confirmar contraseña: " + confirmarContraseñaUsuario);
        writer.newLine();
        // Puedes agregar más información según tus necesidades

        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(this, "Usuario registrado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        // Manejar la excepción en caso de error al escribir en el archivo
        // Cerrar el JFrame actual
         this.dispose();

         // Abrir el JFrame "loginForm"
         loginForm loginForm = new loginForm();
         loginForm.setVisible(true);
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_registrarBoton1MouseClicked

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
            java.util.logging.Logger.getLogger(registrarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JLabel cerrar;
    private javax.swing.JPasswordField confirmarCTexto;
    private javax.swing.JLabel confirmarContraseña;
    private javax.swing.JLabel contraseña;
    private javax.swing.JPasswordField contraseñaTexto;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField correoTexto;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreTexto;
    private swing.panel4 panel41;
    private swing.registrarBoton registrarBoton1;
    private javax.swing.JLabel registrarLabel;
    private swing.registrarPanelInferior registrarPanelInferior1;
    // End of variables declaration//GEN-END:variables
}
