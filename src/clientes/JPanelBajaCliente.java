/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package clientes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import negocio.Negocio;


/**
 *
 * @author Manuel
 */
public class JPanelBajaCliente extends javax.swing.JPanel {

    Negocio negocio = new Negocio();
    
    /**
     * Creates new form JPanelPrincipal
     */
    public JPanelBajaCliente() {
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
        jLabelImagenCliente = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jButtonConfirmarDatos = new javax.swing.JButton();
        jButtonVolverPrincipal = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabelImagenCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagenCliente.setMaximumSize(new java.awt.Dimension(38, 17));
        jLabelImagenCliente.setMinimumSize(new java.awt.Dimension(38, 17));
        jLabelImagenCliente.setPreferredSize(new java.awt.Dimension(38, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.ipady = 117;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 405, 0, 0);
        jPanel1.add(jLabelImagenCliente, gridBagConstraints);

        jLabelDNI.setText("DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 342, 0, 0);
        jPanel1.add(jLabelDNI, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 306);
        jPanel1.add(jTextFieldDNI, gridBagConstraints);

        jButtonConfirmarDatos.setText("CONFIRMAR DATOS");
        jButtonConfirmarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarDatosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 149;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 342, 170, 0);
        jPanel1.add(jButtonConfirmarDatos, gridBagConstraints);

        jButtonVolverPrincipal.setText("AL MENÚ PRINCIPAL");
        jButtonVolverPrincipal.setBorder(null);
        jButtonVolverPrincipal.setBorderPainted(false);
        jButtonVolverPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverPrincipalActionPerformed(evt);
            }
        });

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
        mostrarInfo();
    }//GEN-LAST:event_jButtonConfirmarDatosActionPerformed

    private void jButtonVolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVolverPrincipalActionPerformed

    //<editor-fold defaultstate="collapsed" desc="métodos">
    private void initMyComponents(){
        jLabelImagenCliente.setSize(new Dimension(125, 125));
        negocio.setImageLabel(jLabelImagenCliente, "src/images/java_usuario.png");
        setColors();
    }
    
    private void mostrarInfo(){
        if(!negocio.isDNI(jTextFieldDNI.getText())){
            JOptionPane.showMessageDialog(null, "El DNI introducido no es correcto");
        }else{
            negocio.eliminarCliente(jTextFieldDNI.getText());
        }
    }
    
    private void setColors(){
        this.setBackground(new Color(179, 255, 217));
        jPanel1.setBackground(new Color(179, 255, 217));
    }
//</editor-fold>
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarDatos;
    public javax.swing.JButton jButtonVolverPrincipal;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelImagenCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDNI;
    // End of variables declaration//GEN-END:variables
}
