
package reproductorForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.sound.sampled.Clip;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;
import javax.sound.sampled.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.BitstreamException;

public class reproductorForm extends javax.swing.JFrame {

    
     

    public reproductorForm() {
        initComponents();
        init();
        
    }
    
    
    private void init(){
         setBackground(new Color(0, 0, 0, 0));
         pausar.setVisible(false);     // Asegura que pausar esté oculto al inicio
         favoritoNo.setVisible(true);
         favoritoSi.setVisible(false);
         mensajeLabel.setVisible(false);  // Hace que el mensajeLabel sea invisible al inicio
         reproducirPanel.setVisible(false);
         favoritoPanel.setVisible(false);
         cancionAntPanel.setVisible(false);
         sigcancionPanel.setVisible(false);
         repetirPanel.setVisible(false);
         pausarPanel.setVisible(false);
         agregarPanel.setVisible(false);
         silencio.setVisible(false);
         DefaultListModel<String> modeloLista = new DefaultListModel<>();
         listaDeCanciones.setModel(modeloLista);
         gradiente.setVisible(false);
         mensajeLabel2.setVisible(false);
         listaPanel.setVisible(true);
         listaPanel2.setVisible(false);
         listaPanel3.setVisible(false);
         
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new swing.panel();
        panelPlay1 = new swing.panelPlay();
        favoritoPanel = new javax.swing.JPanel();
        favoritoLabel = new javax.swing.JLabel();
        reproducirPanel = new javax.swing.JPanel();
        reproducirLabel = new javax.swing.JLabel();
        sigcancionPanel = new javax.swing.JPanel();
        sigCancionLabel = new javax.swing.JLabel();
        cancionAntPanel = new javax.swing.JPanel();
        canAntLabel = new javax.swing.JLabel();
        repetirPanel = new javax.swing.JPanel();
        repetirLabel = new javax.swing.JLabel();
        pausarPanel = new javax.swing.JPanel();
        pausarLabel = new javax.swing.JLabel();
        agregarPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        reproducir = new javax.swing.JLabel();
        cancionAnterior = new javax.swing.JLabel();
        siguienteCancion = new javax.swing.JLabel();
        pausar = new javax.swing.JLabel();
        volumenSlider = new javax.swing.JSlider();
        noSilencio = new javax.swing.JLabel();
        repetir = new javax.swing.JLabel();
        favoritoSi = new javax.swing.JLabel();
        favoritoNo = new javax.swing.JLabel();
        Agregar = new javax.swing.JLabel();
        mensajeLabel = new javax.swing.JLabel();
        silencio = new javax.swing.JLabel();
        mensajeLabel2 = new javax.swing.JLabel();
        panelSuperior1 = new swing.panelSuperior();
        logo = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        favoritos = new javax.swing.JLabel();
        playlists = new javax.swing.JLabel();
        canciones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        listaPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDePlaylist = new javax.swing.JList<>();
        listaPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaDeFavoritos = new javax.swing.JList<>();
        listaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeCanciones = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        gradiente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(40, 40, 40));
        background.setPreferredSize(new java.awt.Dimension(1005, 615));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPlay1.setBackground(new java.awt.Color(102, 0, 255));
        panelPlay1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favoritoPanel.setBackground(new java.awt.Color(31, 31, 31));
        favoritoPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        favoritoLabel.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        favoritoLabel.setForeground(new java.awt.Color(255, 255, 255));
        favoritoLabel.setText("Favoritos");

        javax.swing.GroupLayout favoritoPanelLayout = new javax.swing.GroupLayout(favoritoPanel);
        favoritoPanel.setLayout(favoritoPanelLayout);
        favoritoPanelLayout.setHorizontalGroup(
            favoritoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(favoritoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(favoritoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        favoritoPanelLayout.setVerticalGroup(
            favoritoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(favoritoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelPlay1.add(favoritoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, 20));

        reproducirPanel.setBackground(new java.awt.Color(31, 31, 31));
        reproducirPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        reproducirLabel.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        reproducirLabel.setForeground(new java.awt.Color(255, 255, 255));
        reproducirLabel.setText("Reproducir");

        javax.swing.GroupLayout reproducirPanelLayout = new javax.swing.GroupLayout(reproducirPanel);
        reproducirPanel.setLayout(reproducirPanelLayout);
        reproducirPanelLayout.setHorizontalGroup(
            reproducirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reproducirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reproducirLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reproducirPanelLayout.setVerticalGroup(
            reproducirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reproducirPanelLayout.createSequentialGroup()
                .addComponent(reproducirLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPlay1.add(reproducirPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 75, 20));

        sigcancionPanel.setBackground(new java.awt.Color(31, 31, 31));
        sigcancionPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sigCancionLabel.setBackground(new java.awt.Color(255, 255, 255));
        sigCancionLabel.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        sigCancionLabel.setForeground(new java.awt.Color(255, 255, 255));
        sigCancionLabel.setText("Siguiente canción");

        javax.swing.GroupLayout sigcancionPanelLayout = new javax.swing.GroupLayout(sigcancionPanel);
        sigcancionPanel.setLayout(sigcancionPanelLayout);
        sigcancionPanelLayout.setHorizontalGroup(
            sigcancionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sigcancionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sigCancionLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sigcancionPanelLayout.setVerticalGroup(
            sigcancionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sigcancionPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sigCancionLabel))
        );

        panelPlay1.add(sigcancionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 110, 20));

        cancionAntPanel.setBackground(new java.awt.Color(31, 31, 31));
        cancionAntPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        canAntLabel.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        canAntLabel.setForeground(new java.awt.Color(255, 255, 255));
        canAntLabel.setText("Canción anterior");

        javax.swing.GroupLayout cancionAntPanelLayout = new javax.swing.GroupLayout(cancionAntPanel);
        cancionAntPanel.setLayout(cancionAntPanelLayout);
        cancionAntPanelLayout.setHorizontalGroup(
            cancionAntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancionAntPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canAntLabel)
                .addGap(25, 25, 25))
        );
        cancionAntPanelLayout.setVerticalGroup(
            cancionAntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancionAntPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(canAntLabel))
        );

        panelPlay1.add(cancionAntPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 105, 20));

        repetirPanel.setBackground(new java.awt.Color(31, 31, 31));
        repetirPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        repetirLabel.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        repetirLabel.setForeground(new java.awt.Color(255, 255, 255));
        repetirLabel.setText("Repetir");

        javax.swing.GroupLayout repetirPanelLayout = new javax.swing.GroupLayout(repetirPanel);
        repetirPanel.setLayout(repetirPanelLayout);
        repetirPanelLayout.setHorizontalGroup(
            repetirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, repetirPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(repetirLabel)
                .addGap(30, 30, 30))
        );
        repetirPanelLayout.setVerticalGroup(
            repetirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, repetirPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(repetirLabel))
        );

        panelPlay1.add(repetirPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 53, 20));

        pausarPanel.setBackground(new java.awt.Color(31, 31, 31));
        pausarPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pausarLabel.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        pausarLabel.setForeground(new java.awt.Color(255, 255, 255));
        pausarLabel.setText("Pausar");

        javax.swing.GroupLayout pausarPanelLayout = new javax.swing.GroupLayout(pausarPanel);
        pausarPanel.setLayout(pausarPanelLayout);
        pausarPanelLayout.setHorizontalGroup(
            pausarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pausarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pausarLabel)
                .addGap(30, 30, 30))
        );
        pausarPanelLayout.setVerticalGroup(
            pausarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pausarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pausarLabel))
        );

        panelPlay1.add(pausarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 50, 20));

        agregarPanel.setBackground(new java.awt.Color(31, 31, 31));
        agregarPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar canciones");

        javax.swing.GroupLayout agregarPanelLayout = new javax.swing.GroupLayout(agregarPanel);
        agregarPanel.setLayout(agregarPanelLayout);
        agregarPanelLayout.setHorizontalGroup(
            agregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(26, 26, 26))
        );
        agregarPanelLayout.setVerticalGroup(
            agregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        panelPlay1.add(agregarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 115, 20));

        reproducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-play-50.png"))); // NOI18N
        reproducir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reproducirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reproducirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reproducirMouseExited(evt);
            }
        });
        panelPlay1.add(reproducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 19, -1, -1));

        cancionAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/image.png"))); // NOI18N
        cancionAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancionAnteriorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancionAnteriorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancionAnteriorMouseExited(evt);
            }
        });
        panelPlay1.add(cancionAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        siguienteCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-fin-30.png"))); // NOI18N
        siguienteCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteCancionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                siguienteCancionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                siguienteCancionMouseExited(evt);
            }
        });
        panelPlay1.add(siguienteCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 28, -1, -1));

        pausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-pausa-50.png"))); // NOI18N
        pausar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pausarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pausarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pausarMouseExited(evt);
            }
        });
        panelPlay1.add(pausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 50, 50));
        panelPlay1.add(volumenSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 170, 30));

        noSilencio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-volumen-medio-30 (2).png"))); // NOI18N
        noSilencio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noSilencioMouseClicked(evt);
            }
        });
        panelPlay1.add(noSilencio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 30, 30));

        repetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-repetir-30.png"))); // NOI18N
        repetir.setText("jLabel2");
        repetir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repetirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                repetirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                repetirMouseExited(evt);
            }
        });
        panelPlay1.add(repetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 28, 30, 30));

        favoritoSi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-me-gusta-30 (1).png"))); // NOI18N
        favoritoSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoritoSiMouseClicked(evt);
            }
        });
        panelPlay1.add(favoritoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 30, 30));

        favoritoNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-me-gusta-30.png"))); // NOI18N
        favoritoNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoritoNoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                favoritoNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                favoritoNoMouseExited(evt);
            }
        });
        panelPlay1.add(favoritoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 30, 30));

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-más-30.png"))); // NOI18N
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarMouseExited(evt);
            }
        });
        panelPlay1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 30, 30));

        mensajeLabel.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        mensajeLabel.setForeground(new java.awt.Color(255, 255, 255));
        mensajeLabel.setText("Añadido a favoritos");
        panelPlay1.add(mensajeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 29));

        silencio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-sin-audio-30.png"))); // NOI18N
        silencio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                silencioMouseClicked(evt);
            }
        });
        panelPlay1.add(silencio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 30, 30));

        mensajeLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        mensajeLabel2.setForeground(new java.awt.Color(255, 255, 255));
        mensajeLabel2.setText("Selecciona una canción");
        panelPlay1.add(mensajeLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        background.add(panelPlay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 525, 1005, 90));

        panelSuperior1.setBackground(new java.awt.Color(31, 31, 31));
        panelSuperior1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/harmony.png"))); // NOI18N
        panelSuperior1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));

        jPanel14.setBackground(new java.awt.Color(31, 31, 31));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(31, 31, 31));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        favoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-me-gusta-30 (2).png"))); // NOI18N
        favoritos.setText("jLabel5");
        favoritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoritosMouseClicked(evt);
            }
        });

        playlists.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-lista-de-reproducción-30.png"))); // NOI18N
        playlists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playlistsMouseClicked(evt);
            }
        });

        canciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-canciones-30.png"))); // NOI18N
        canciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancionesMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-accede-redondeado-derecho-30.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(canciones)
                .addGap(27, 27, 27)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(playlists)
                .addGap(27, 27, 27)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(favoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(playlists)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canciones, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(favoritos)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        panelSuperior1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 470, 60));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-cancelar-30.png"))); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        panelSuperior1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 0, 30, 30));
        panelSuperior1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-minimizar-30.png"))); // NOI18N
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        panelSuperior1.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 30, 30));

        background.add(panelSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1005, 60));

        listaPanel2.setBackground(new java.awt.Color(51, 51, 51));
        listaPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaDePlaylist.setBackground(new java.awt.Color(51, 51, 51));
        listaDePlaylist.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Playlists", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Black", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        listaDePlaylist.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        listaDePlaylist.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(listaDePlaylist);

        listaPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 458, 448));

        background.add(listaPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 470, 470));

        listaPanel3.setBackground(new java.awt.Color(51, 51, 51));
        listaPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaDeFavoritos.setBackground(new java.awt.Color(51, 51, 51));
        listaDeFavoritos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Favoritos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Black", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        listaDeFavoritos.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        listaDeFavoritos.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(listaDeFavoritos);

        listaPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 458, 448));

        background.add(listaPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 470, 470));

        listaPanel.setBackground(new java.awt.Color(51, 51, 51));
        listaPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                listaPanelPropertyChange(evt);
            }
        });
        listaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaDeCanciones.setBackground(new java.awt.Color(51, 51, 51));
        listaDeCanciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Canciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Black", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        listaDeCanciones.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        listaDeCanciones.setForeground(new java.awt.Color(255, 255, 255));
        listaDeCanciones.setSelectionBackground(new java.awt.Color(102, 0, 255));
        listaDeCanciones.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(listaDeCanciones);

        listaPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 458, 448));

        background.add(listaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 470, 470));

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 10, 100));

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 10, 120));

        jPanel4.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 10, 110));

        jPanel3.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 10, 110));

        jPanel6.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        background.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, 10, 110));

        jPanel5.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        background.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 10, 110));

        jPanel7.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        background.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, 10, 110));

        jPanel8.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        background.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, 10, 110));

        jPanel9.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        background.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 10, 110));

        jPanel10.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        background.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 10, 110));

        jPanel11.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        background.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 390, 10, 120));

        jPanel12.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, 10, 100));

        gradiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/giphy.gif"))); // NOI18N
        background.add(gradiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 230, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// </editor-fold>                        
// </editor-fold>                        
// </editor-fold>                        
    private AdvancedPlayer player;
    
    private int clipPosition = 0; // Posición actual de reproducción
    
    
    private void listaPanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_listaPanelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPanelPropertyChange
    private String obtenerRutaCancion(int index) {
        // Obtén la lista de canciones
        DefaultListModel<String> model = (DefaultListModel<String>) listaDeCanciones.getModel();

        // Asegúrate de que el índice esté dentro de los límites
        if (index >= 0 && index < model.getSize()) {
            // Construye la ruta completa (puedes ajustar la lógica según la ubicación real de tus archivos)
            String fileName = model.getElementAt(index);
            return "C:/Users/xavia/Desktop/Musica/" + fileName;
        }
        return null;
    }
    private void reproducirCancion(String filePath) {
        try {
            if (player != null) {
                player.close();
            }

            // Crea un nuevo reproductor para la canción seleccionada
            FileInputStream fileInputStream = new FileInputStream(filePath);
            player = new AdvancedPlayer(fileInputStream);
            player.setPlayBackListener(new PlaybackListener() {
                @Override
                public void playbackFinished(PlaybackEvent evt) {
                    // Reproducción terminada, puedes realizar acciones adicionales aquí
                    clipPosition = evt.getFrame(); // Obtiene la posición de reproducción
                }
            });

            // Reproduce la canción en un hilo separado
            new Thread(() -> {
                try {
                    // Configura la posición de reproducción si es diferente de cero
                    if (clipPosition > 0) {
                        player.play(clipPosition, Integer.MAX_VALUE);
                    } else {
                        player.play();
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }
    }

    // Método para pausar la reproducción
    private void pausarCancion() {
        if (player != null) {
            player.close();
        }  player.close();
        }
    private void showMessageWithFade2(String message, JLabel label) {
    label.setText(message);
    label.setForeground(Color.WHITE);
    label.setFont(new Font("Roboto Light", Font.PLAIN, 12));

    label.setVisible(true); // Hace que el mensajeLabel sea visible

    Timer timer = new Timer(20, new ActionListener() {
        float alpha = 1.0f;

        @Override
        public void actionPerformed(ActionEvent e) {
            alpha -= 0.02f;
            if (alpha <= 0.0f) {
                ((Timer) e.getSource()).stop();
                label.setVisible(false); // Oculta el mensajeLabel después de la animación
            } else {
                label.setForeground(new Color(1.0f, 1.0f, 1.0f, alpha));
            }
        }
    });

    timer.setDelay(20);
    timer.start();
}

    private void reproducirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reproducirMouseClicked
        int selectedIndex = listaDeCanciones.getSelectedIndex();
    if (selectedIndex != -1) {
        // Hay una canción seleccionada, reproducir
        reproducir.setVisible(false);  // Oculta el JLabel reproducir
        pausar.setVisible(true);       // Muestra el JLabel pausar
        gradiente.setVisible(true);
        String filePath = obtenerRutaCancion(selectedIndex);
        reproducirCancion(filePath);
    } else {
        // No hay una canción seleccionada, muestra el mensaje en mensajeLabel2
        mostrarMensajeNoCancionSeleccionada();
    }
} 

private void mostrarMensajeNoCancionSeleccionada() {
    showMessageWithFade("Selecciona una canción", mensajeLabel2);
    // Oculta el JLabel "pausar" y el gradiente
    pausar.setVisible(false);
    gradiente.setVisible(false);

    }//GEN-LAST:event_reproducirMouseClicked

    private void pausarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pausarMouseClicked
        pausar.setVisible(false);      // Oculta el JLabel pausar
        reproducir.setVisible(true);   // Muestra el JLabel reproducir
        gradiente.setVisible(false);
        pausarCancion();
    }//GEN-LAST:event_pausarMouseClicked
    private void favoritoSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritoSiMouseClicked
        favoritoSi.setVisible(false);
        favoritoNo.setVisible(true);
    }//GEN-LAST:event_favoritoSiMouseClicked
    private void showMessageWithFade(String message, JLabel label) {
    label.setText(message);
    label.setForeground(Color.WHITE);
    label.setFont(new Font("Roboto Light", Font.PLAIN, 12));

    label.setVisible(true); // Hace que el mensajeLabel sea visible

    Timer timer = new Timer(20, new ActionListener() {
        float alpha = 1.0f;

        @Override
        public void actionPerformed(ActionEvent e) {
            alpha -= 0.02f;
            if (alpha <= 0.0f) {
                ((Timer) e.getSource()).stop();
                label.setVisible(false); // Oculta el mensajeLabel después de la animación
            } else {
                label.setForeground(new Color(1.0f, 1.0f, 1.0f, alpha));
            }
        }
    });

    timer.setDelay(20);
    timer.start();
}
    private void favoritoNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritoNoMouseClicked
        favoritoNo.setVisible(false);
        favoritoSi.setVisible(true);
        showMessageWithFade("Añadido a favoritos", mensajeLabel);

        
    }//GEN-LAST:event_favoritoNoMouseClicked

    private Timer temporizador;
    private final int TIEMPO_ESPERA = 1000; // 1 segundo
    
    private void reproducirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reproducirMouseEntered
        // Inicializa el temporizador si aún no está creado
    if (temporizador == null) {
        temporizador = new Timer(TIEMPO_ESPERA, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hace visible el componente cuando el temporizador expira
                reproducirPanel.setVisible(true);
                // Detiene el temporizador después de hacer visible el componente
                temporizador.stop();
            }
        });
    }

    // Reinicia el temporizador cada vez que el mouse entra al componente
    temporizador.restart();
    }//GEN-LAST:event_reproducirMouseEntered

    private void reproducirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reproducirMouseExited
          // Detiene el temporizador cuando el mouse sale del componente
    if (temporizador != null) {
        temporizador.stop();
    }

    // Oculta el componente
    reproducirPanel.setVisible(false);
    }//GEN-LAST:event_reproducirMouseExited
    private Timer temporizador2;
    private final int TIEMPO_ESPERA2 = 1000; // 1 segundo
    private void favoritoNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritoNoMouseEntered
        if (temporizador2 == null) {
        temporizador2 = new Timer(TIEMPO_ESPERA2, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hace visible el componente cuando el temporizador expira
                favoritoPanel.setVisible(true);
                // Detiene el temporizador después de hacer visible el componente
                temporizador2.stop();
            }
        });
    }

    // Reinicia el temporizador cada vez que el mouse entra al componente
    temporizador2.restart();
    
    }//GEN-LAST:event_favoritoNoMouseEntered

    private void favoritoNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritoNoMouseExited
        if (temporizador2 != null) {
        temporizador2.stop();
    }

    // Oculta el componente
    favoritoPanel.setVisible(false);
    }//GEN-LAST:event_favoritoNoMouseExited
    
    private Timer temporizador3;
    private final int TIEMPO_ESPERA3 = 1000; // 1 segundo
    
    private void cancionAnteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancionAnteriorMouseEntered
           // Inicializa el temporizador si aún no está creado
    if (temporizador3 == null) {
        temporizador3 = new Timer(TIEMPO_ESPERA3, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hace visible el componente cuando el temporizador expira
                cancionAntPanel.setVisible(true);
                // Detiene el temporizador después de hacer visible el componente
                temporizador3.stop();
            }
        });
    }

    // Reinicia el temporizador cada vez que el mouse entra al componente
    temporizador3.restart();
    }//GEN-LAST:event_cancionAnteriorMouseEntered

    private void cancionAnteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancionAnteriorMouseExited
        if (temporizador3 != null) {
        temporizador3.stop();
    }

    // Oculta el componente
    cancionAntPanel.setVisible(false);
    }//GEN-LAST:event_cancionAnteriorMouseExited
     
    private Timer temporizador4;
    private final int TIEMPO_ESPERA4 = 1000; // 1 segundo
    
    private void siguienteCancionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteCancionMouseEntered
        // Inicializa el temporizador si aún no está creado
    if (temporizador4 == null) {
        temporizador4 = new Timer(TIEMPO_ESPERA4, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hace visible el componente cuando el temporizador expira
                sigcancionPanel.setVisible(true);
                // Detiene el temporizador después de hacer visible el componente
                temporizador4.stop();
            }
        });
    }

    // Reinicia el temporizador cada vez que el mouse entra al componente
    temporizador4.restart();
    }//GEN-LAST:event_siguienteCancionMouseEntered

    private void siguienteCancionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteCancionMouseExited
        if (temporizador4 != null) {
        temporizador4.stop();
    }

    // Oculta el componente
    sigcancionPanel.setVisible(false);
    }//GEN-LAST:event_siguienteCancionMouseExited

     private Timer temporizador5;
     private final int TIEMPO_ESPERA5 = 1000; // 1 segundo
    
    private void repetirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repetirMouseEntered
        if (temporizador5 == null) {
        temporizador5 = new Timer(TIEMPO_ESPERA4, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hace visible el componente cuando el temporizador expira
                repetirPanel.setVisible(true);
                // Detiene el temporizador después de hacer visible el componente
                temporizador5.stop();
            }
        });
    }

    // Reinicia el temporizador cada vez que el mouse entra al componente
    temporizador5.restart();
    }//GEN-LAST:event_repetirMouseEntered

    private void repetirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repetirMouseExited
        if (temporizador5 != null) {
        temporizador5.stop();
    }

    // Oculta el componente
    repetirPanel.setVisible(false);
    }//GEN-LAST:event_repetirMouseExited
     
     private Timer temporizador6;
     private final int TIEMPO_ESPERA6 = 1000; // 1 segundo
     
    private void pausarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pausarMouseEntered
        if (temporizador6 == null) {
        temporizador6 = new Timer(TIEMPO_ESPERA6, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hace visible el componente cuando el temporizador expira
                pausarPanel.setVisible(true);
                // Detiene el temporizador después de hacer visible el componente
                temporizador6.stop();
            }
        });
    }

    // Reinicia el temporizador cada vez que el mouse entra al componente
    temporizador6.restart();
    }//GEN-LAST:event_pausarMouseEntered

    private void pausarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pausarMouseExited
        if (temporizador6 != null) {
        temporizador6.stop();
    }

    // Oculta el componente
    pausarPanel.setVisible(false);
    }//GEN-LAST:event_pausarMouseExited

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        // Crea un JFileChooser
    JFileChooser fileChooser = new JFileChooser();
    
    // Permite la selección múltiple
    fileChooser.setMultiSelectionEnabled(true);
    
    // Filtra para mostrar solo archivos .mp3
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos MP3", "mp3");
    fileChooser.setFileFilter(filter);
    
    // Muestra el diálogo de selección de archivos
    int result = fileChooser.showOpenDialog(this);
    
    // Si el usuario selecciona archivos
    if (result == JFileChooser.APPROVE_OPTION) {
        // Obtiene los archivos seleccionados
        java.io.File[] files = fileChooser.getSelectedFiles();
        
        // Obtiene el modelo de la lista
        DefaultListModel<String> model = (DefaultListModel<String>) listaDeCanciones.getModel();
        
        // Agrega los nombres de los archivos a la lista
        for (java.io.File file : files) {
            String fileName = file.getName();
            model.addElement(fileName);
        }
        }
    
    }//GEN-LAST:event_AgregarMouseClicked
    
     private Timer temporizador7;
     private final int TIEMPO_ESPERA7 = 1000; // 1 segundo
     
    private void AgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseEntered
        if (temporizador7 == null) {
        temporizador7 = new Timer(TIEMPO_ESPERA7, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hace visible el componente cuando el temporizador expira
                agregarPanel.setVisible(true);
                // Detiene el temporizador después de hacer visible el componente
                temporizador7.stop();
            }
        });
    }

    // Reinicia el temporizador cada vez que el mouse entra al componente
    temporizador7.restart();
    }//GEN-LAST:event_AgregarMouseEntered

    private void AgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseExited
        if (temporizador7 != null) {
        temporizador7.stop();
    }

    // Oculta el componente
    agregarPanel.setVisible(false);
    }//GEN-LAST:event_AgregarMouseExited

    private void cancionAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancionAnteriorMouseClicked
          reproducir.setVisible(false);
    pausar.setVisible(true);

    int selectedIndex = listaDeCanciones.getSelectedIndex();
    int previousIndex = (selectedIndex - 1 + listaDeCanciones.getModel().getSize()) % listaDeCanciones.getModel().getSize();

    reproducirCancion(obtenerRutaCancion(previousIndex));
    listaDeCanciones.setSelectedIndex(previousIndex);
    }//GEN-LAST:event_cancionAnteriorMouseClicked

    private void siguienteCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteCancionMouseClicked
         reproducir.setVisible(false);
    pausar.setVisible(true);

    int selectedIndex = listaDeCanciones.getSelectedIndex();
    int nextIndex = (selectedIndex + 1) % listaDeCanciones.getModel().getSize();

    reproducirCancion(obtenerRutaCancion(nextIndex));
    listaDeCanciones.setSelectedIndex(nextIndex);
    }//GEN-LAST:event_siguienteCancionMouseClicked

    private void repetirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repetirMouseClicked
        reproducir.setVisible(false);
    pausar.setVisible(true);

    int selectedIndex = listaDeCanciones.getSelectedIndex();
    if (selectedIndex != -1) {
        String filePath = obtenerRutaCancion(selectedIndex);
        reproducirCancion(filePath);
    }
    }//GEN-LAST:event_repetirMouseClicked

     
    private void noSilencioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noSilencioMouseClicked
        noSilencio.setVisible(false);  
        silencio.setVisible(true);       
    }//GEN-LAST:event_noSilencioMouseClicked

    private void silencioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silencioMouseClicked
        silencio.setVisible(false);
        noSilencio.setVisible(true);
    }//GEN-LAST:event_silencioMouseClicked

    private void cancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancionesMouseClicked
        listaPanel.setVisible(true);
         listaPanel2.setVisible(false);
         listaPanel3.setVisible(false);  
    }//GEN-LAST:event_cancionesMouseClicked

    private void playlistsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistsMouseClicked
        listaPanel.setVisible(false);
         listaPanel2.setVisible(true);
         listaPanel3.setVisible(false);
    }//GEN-LAST:event_playlistsMouseClicked

    private void favoritosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritosMouseClicked
        listaPanel.setVisible(false);
         listaPanel2.setVisible(false);
         listaPanel3.setVisible(true);
    }//GEN-LAST:event_favoritosMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
         JFrame reproductorForm = (JFrame) SwingUtilities.getWindowAncestor(this);

    if (reproductorForm != null) {
        reproductorForm.setExtendedState(JFrame.ICONIFIED);
    }
}

private JFrame findJFrameAncestor() {
    

        return null;
    

    }//GEN-LAST:event_minimizarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // Crear una instancia de loginForm
    loginForm loginForm = new loginForm();
    
    // Hacer visible el nuevo JFrame
    loginForm.setVisible(true);
    
    // Cerrar el JFrame actual si es necesario
    // this.dispose();  // Descomenta esto si quieres cerrar el JFrame actual al abrir loginForm

    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reproductorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reproductorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reproductorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reproductorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reproductorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JPanel agregarPanel;
    private swing.panel background;
    private javax.swing.JLabel canAntLabel;
    private javax.swing.JPanel cancionAntPanel;
    private javax.swing.JLabel cancionAnterior;
    private javax.swing.JLabel canciones;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel favoritoLabel;
    private javax.swing.JLabel favoritoNo;
    private javax.swing.JPanel favoritoPanel;
    private javax.swing.JLabel favoritoSi;
    private javax.swing.JLabel favoritos;
    private javax.swing.JLabel gradiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaDeCanciones;
    private javax.swing.JList<String> listaDeFavoritos;
    private javax.swing.JList<String> listaDePlaylist;
    private javax.swing.JPanel listaPanel;
    private javax.swing.JPanel listaPanel2;
    private javax.swing.JPanel listaPanel3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JLabel mensajeLabel2;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel noSilencio;
    private swing.panelPlay panelPlay1;
    private swing.panelSuperior panelSuperior1;
    private javax.swing.JLabel pausar;
    private javax.swing.JLabel pausarLabel;
    private javax.swing.JPanel pausarPanel;
    private javax.swing.JLabel playlists;
    private javax.swing.JLabel repetir;
    private javax.swing.JLabel repetirLabel;
    private javax.swing.JPanel repetirPanel;
    private javax.swing.JLabel reproducir;
    private javax.swing.JLabel reproducirLabel;
    private javax.swing.JPanel reproducirPanel;
    private javax.swing.JLabel sigCancionLabel;
    private javax.swing.JPanel sigcancionPanel;
    private javax.swing.JLabel siguienteCancion;
    private javax.swing.JLabel silencio;
    private javax.swing.JSlider volumenSlider;
    // End of variables declaration//GEN-END:variables
}
