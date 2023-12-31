/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Incidencias;

import alquileres.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import negocio.Negocio;


/**
 *
 * @author Manuel
 */
public class JPanelModificaciónIncidencia extends javax.swing.JPanel {

    Negocio negocio = new Negocio();
    
    /**
     * Creates new form JPanelPrincipal
     */
    public JPanelModificaciónIncidencia() {
        initComponents();
        initMyComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabelImagenIncidencia = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelIDDispositivo = new javax.swing.JLabel();
        jLabelIDCliente = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldIDDispositivo = new javax.swing.JTextField();
        jTextFieldIDCliente = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jButtonConfirmarDatos = new javax.swing.JButton();
        jButtonEnviarID = new javax.swing.JButton();
        jButtonVolverPrincipal = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabelImagenIncidencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagenIncidencia.setMaximumSize(new java.awt.Dimension(38, 17));
        jLabelImagenIncidencia.setMinimumSize(new java.awt.Dimension(38, 17));
        jLabelImagenIncidencia.setPreferredSize(new java.awt.Dimension(38, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.ipady = 117;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 19, 0, 0);
        jPanel1.add(jLabelImagenIncidencia, gridBagConstraints);

        jLabelID.setText("ID incidencia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 268, 0, 0);
        jPanel1.add(jLabelID, gridBagConstraints);

        jLabelIDDispositivo.setText("ID Dispositivo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 87;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 342, 0, 0);
        jPanel1.add(jLabelIDDispositivo, gridBagConstraints);

        jLabelIDCliente.setText("ID Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 342, 0, 0);
        jPanel1.add(jLabelIDCliente, gridBagConstraints);

        jLabelFecha.setText("Fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 342, 0, 0);
        jPanel1.add(jLabelFecha, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jTextFieldID, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        jPanel1.add(jTextFieldIDDispositivo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel1.add(jTextFieldIDCliente, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel1.add(jTextFieldFecha, gridBagConstraints);

        jButtonConfirmarDatos.setText("CONFIRMAR DATOS");
        jButtonConfirmarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarDatosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 149;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 342, 120, 0);
        jPanel1.add(jButtonConfirmarDatos, gridBagConstraints);

        jButtonEnviarID.setText("ENVIAR ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 218);
        jPanel1.add(jButtonEnviarID, gridBagConstraints);

        jButtonVolverPrincipal.setText("AL MENÚ PRINCIPAL");
        jButtonVolverPrincipal.setBorder(null);
        jButtonVolverPrincipal.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonVolverPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButtonVolverPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonConfirmarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConfirmarDatosActionPerformed

//<editor-fold defaultstate="collapsed" desc="metodos">
    
    private void initMyComponents(){
        jLabelImagenIncidencia.setSize(new Dimension(125, 125));
        negocio.setImageLabel(jLabelImagenIncidencia, "src/images/java_incidencia.png");
        setColors();
    }
    private void setColors(){
        this.setBackground(new Color(179, 255, 217));
        jPanel1.setBackground(new Color(179, 255, 217));
    }
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarDatos;
    private javax.swing.JButton jButtonEnviarID;
    public javax.swing.JButton jButtonVolverPrincipal;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIDCliente;
    private javax.swing.JLabel jLabelIDDispositivo;
    private javax.swing.JLabel jLabelImagenIncidencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldIDCliente;
    private javax.swing.JTextField jTextFieldIDDispositivo;
    // End of variables declaration//GEN-END:variables
}
