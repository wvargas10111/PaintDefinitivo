/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import codigo.formas.Circulo;
import codigo.formas.Clean;
import codigo.formas.Cuadrado;
import codigo.formas.Estrella;
import codigo.formas.Forma;
import codigo.formas.Lineas;
import codigo.formas.Pentagono;
import codigo.formas.TampondeColor;
import codigo.formas.Trazo;
import codigo.formas.Triangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author wellingtonvargasgonzalez
 */
public class VentanaPaint extends javax.swing.JFrame {

    BufferedImage buffer, buffer2 = null; //Este buffer acelera la memoria para que podamos dibujar

    Graphics2D bufferGraphics, bufferGraphics2, jPanelGraphics = null; //libreria de java que permite figuras geometricas y lineas
    
   

    
    Forma miForma = null; //new Forma(0, 0, 1, Color.white, false);//para que la forma no de error.
    Trazo miTrazo = null;
    Lineas dibujaLineas = null;
    Clean cleaner= null;
    TampondeColor tampondeColor = null;
    int trazoX;
    int trazoY;
    
    
    public VentanaPaint() { //constructor
        initComponents();
        inicializaBuffers(); //llamo al metodo para ejecutar, pero aun no he enlazado memoria en blanco con el componente (jPanel)
        
    }

    private void inicializaBuffers() {
        //Creo una imagen del mismo alto y ancho que el jPanel1
        buffer = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight()); // (BufferedImage) es un casteo
        buffer2 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());

        //creo una imagen modificable
        bufferGraphics = buffer.createGraphics();
        bufferGraphics2 = buffer2.createGraphics();

        //inicializar buffer para que se pinte de blanco entero
        bufferGraphics.setColor(Color.white);
        bufferGraphics.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight()); // los ceros señalan la esq.super.izq (0,0)

        bufferGraphics2.setColor(Color.white);
        bufferGraphics2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight()); //Con esto esta creado el rectangulo
        jPanelGraphics = (Graphics2D) jPanel1.getGraphics(); //enlazo jpanel1 con jpanelgraphics 
    }

    @Override
    public void paint(Graphics g) { //g de graficos, paint es un metodo dentro de  JFrame, paint se encarga de dibujar 
        super.paint(g); // llamo a la clasa a la que extiendo, al metodo que se llama paint de jframe

        //pinto el buffer sobre el jpanel
        jPanelGraphics.drawImage(buffer, 0, 0, null);// buffer es una imagen sobre (0,0), y se coloca null

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        panelColores1 = new codigo.PanelColores();
        herramientas1 = new codigo.Herramientas();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton1)
                .addGap(249, 249, 249)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        jButton3.setText("colores");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Limpiar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelColores1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelColores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        bufferGraphics.drawImage(buffer2, 0, 0, null);

        switch (herramientas1.formaElegida) {

            case 17://LAPIZ GOMA
               
// bufferGraphics2.setColor(panelColores1.colorSeleccionado); //Estoy dibujando sobre la memoria, y después tengo que volcarlo sobre la pantalla
 // bufferGraphics2.fillOval(evt.getX(), evt.getY(), 6, 6);
                
                miTrazo.dibujate(bufferGraphics2, evt.getX(), evt.getY(),herramientas1.thickness);

                break;       

            case 1: //Circulo
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),herramientas1.thickness);
                break;
                
             case 0://LINEAS
                dibujaLineas.dibujate(bufferGraphics, evt.getX(), evt.getY(), herramientas1.thickness);
                break;

            case 3://Triangulo 
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),herramientas1.thickness);
                break;

            case 4://Cuadrado
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),herramientas1.thickness);
                break;

            case 5://Pentagono
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),herramientas1.thickness);
                break;

            case 256://Estrella
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),herramientas1.thickness);
                break;

        }
        repaint(0, 0, 1, 1); //refresca pantalla 
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        switch (herramientas1.formaElegida) {
            
            case 17://LAPIZ GOMA
                
                if (herramientas1.eraser) {
                    miTrazo = new Trazo(evt.getX(), evt.getY(), panelColores1.colorSeleccionadoEraser);
                } else {
                    miTrazo = new Trazo(evt.getX(), evt.getY(), panelColores1.colorSeleccionado);
                }

                
                miTrazo.dibujate(bufferGraphics, evt.getX(), evt.getY(), herramientas1.thickness);
                break;
                
          

            case 1:
                miForma = new Circulo(evt.getX(), evt.getY(), 100, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(),evt.getY(),herramientas1.thickness);
                break;
                
            case 0://LINEAS
                dibujaLineas = new Lineas(evt.getX(), evt.getY(), panelColores1.colorSeleccionado);
                dibujaLineas.dibujate(bufferGraphics, evt.getX(), evt.getY(), herramientas1.thickness);
                break;
            
            case 3:
                miForma = new Triangulo(evt.getX(), evt.getY(), 3, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),herramientas1.thickness);
                break;
            case 4:
                miForma = new Cuadrado(evt.getX(), evt.getY(), 4, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),herramientas1.thickness);
                break;
            case 5:
                miForma = new Pentagono(evt.getX(), evt.getY(), 5, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),herramientas1.thickness);
                break;
                
             case 14:
                tampondeColor = new TampondeColor(evt.getX(), evt.getY(), buffer2);
                panelColores1.colorSeleccionado = tampondeColor.absorbeColor(evt.getX(), evt.getY(), buffer2,  panelColores1.colorSeleccionado);
                panelColores1.jLabel21.setBackground( panelColores1.colorSeleccionado);
              
                break;
            case 256:
                miForma = new Estrella(evt.getX(), evt.getY(), 256, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),herramientas1.thickness);
                break;

        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
       
            
                  
            if ((herramientas1.formaElegida > 0 && herramientas1.formaElegida <= 5) ||
                 herramientas1.formaElegida == 256) {
            miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY(),herramientas1.thickness);//Para que no dé error cuando no pintemos formas
        
        
        } 
            else if (herramientas1.formaElegida == 0) {
            dibujaLineas.dibujate(bufferGraphics2, evt.getX(), evt.getY(),herramientas1.thickness);
        }  
           
        
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.setSize(660, 660);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int seleccion = jFileChooser1.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            //si entra aquí es porque el usuario ha pulsado en "guardar"
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.')+1, nombre.length());
            if(extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")){
                try{
                    ImageIO.write(buffer, "png", fichero);
                } 
                catch (IOException e){
                }
            }
            else {
                //mensaje de extensión no válida
            }
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("arhivos de imagen jpg", "jpg"));
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("arhivos de imagen png", "png"));
        int seleccion = jFileChooser1.showOpenDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.')+1, nombre.length());

            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {
                    
                    bufferGraphics.drawImage(ImageIO.read(fichero), 0, 0, null);
                    bufferGraphics2.drawImage(ImageIO.read(fichero), 0, 0, null);
                    repaint(0,0,1,1);
                } catch (IOException ex) {
                }
            }
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        cleaner = new Clean();
        cleaner.dibujate(bufferGraphics2, jPanel1);
        bufferGraphics.drawImage(buffer2, 0, 0, null);
        repaint(0, 0, 1, 1);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /*
    
    
    Cleaner clean = null;
     
    
    
    
    Limpiar miLimpiar = null;
    
    miLimpiar = new Limpiar();
        
    miLimpiar.dibujate(bufferGraphics2, jPanel1);
        bufferGraphics.drawImage(buffer2, 0, 0, null);
        repaint(0, 0, 1, 1);
    
    
    */
    
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
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private codigo.Herramientas herramientas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private codigo.PanelColores panelColores1;
    // End of variables declaration//GEN-END:variables
}
