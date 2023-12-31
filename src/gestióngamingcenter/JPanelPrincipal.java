/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gestióngamingcenter;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Manuel
 */
public class JPanelPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form JPanelPrincipal
     */
    public JPanelPrincipal() {
        initComponents();
        setColors();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        jButtonAltaDeEquipo = new javax.swing.JButton();
        jButtonNuevaFactura = new javax.swing.JButton();
        jButtonNuevoAlquiler = new javax.swing.JButton();
        jButtonAltaCliente = new javax.swing.JButton();
        jPanelListas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEnRevisión = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAlquileresRealizados = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListAlquilados = new javax.swing.JList<>();
        jButtonVerDatos = new javax.swing.JButton();

        jButtonAltaDeEquipo.setText("ALTA DE EQUIPO");

        jButtonNuevaFactura.setText("NUEVA FACTURA");

        jButtonNuevoAlquiler.setText("NUEVO ALQUILER");

        jButtonAltaCliente.setText("ALTA DE CLIENTE");
        jButtonAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAltaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNuevaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotonesLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButtonNuevoAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                    .addGroup(jPanelBotonesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAltaDeEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAltaDeEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNuevoAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jListEnRevisión.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jListEnRevisión.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListEnRevisión);

        jListAlquileresRealizados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jListAlquileresRealizados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListAlquileresRealizados);

        jListAlquilados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jListAlquilados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListAlquilados);

        jButtonVerDatos.setText("VER DATOS");

        javax.swing.GroupLayout jPanelListasLayout = new javax.swing.GroupLayout(jPanelListas);
        jPanelListas.setLayout(jPanelListasLayout);
        jPanelListasLayout.setHorizontalGroup(
            jPanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanelListasLayout.setVerticalGroup(
            jPanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVerDatos)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelListas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelListas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAltaClienteActionPerformed

    //<editor-fold defaultstate="collapsed" desc="métodos">
    //ESTILOS
    private void setColors(){
        this.setBackground(new Color(179, 255, 217));
        jPanelListas.setBackground(new Color(179, 255, 217));
        jPanelBotones.setBackground(new Color(179, 255, 217));
        
        for (Component c : jPanelBotones.getComponents()) {
            if(c instanceof JButton){
                c.setBackground(new Color(188, 255, 255));
                c.setFont(new Font("Dialog", Font.BOLD, 12));
            }
        }
        jButtonVerDatos.setBackground(new Color(188, 255, 255));
    }
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAltaCliente;
    public javax.swing.JButton jButtonAltaDeEquipo;
    public javax.swing.JButton jButtonNuevaFactura;
    public javax.swing.JButton jButtonNuevoAlquiler;
    private javax.swing.JButton jButtonVerDatos;
    private javax.swing.JList<String> jListAlquilados;
    private javax.swing.JList<String> jListAlquileresRealizados;
    private javax.swing.JList<String> jListEnRevisión;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelListas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
