/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author fer10
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Ayuda = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        Ventas = new javax.swing.JMenu();
        ventas = new javax.swing.JMenuItem();
        Mantenimiento = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        Producto = new javax.swing.JMenuItem();
        Vendedor = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        Reportesv = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.jpg"))); // NOI18N
        Menu.setText("MENU");

        Ayuda.setText("Ayuda");
        Menu.add(Ayuda);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Menu.add(Salir);

        jMenuBar1.add(Menu);

        Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        Ventas.setText("VENTAS");

        ventas.setText("Generar Venta");
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });
        Ventas.add(ventas);

        jMenuBar1.add(Ventas);

        Mantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento.png"))); // NOI18N
        Mantenimiento.setText("MANTENIMIENTO");

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        Mantenimiento.add(Cliente);

        Producto.setText("Producto");
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });
        Mantenimiento.add(Producto);

        Vendedor.setText("Vendedor");
        Vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendedorActionPerformed(evt);
            }
        });
        Mantenimiento.add(Vendedor);

        jMenuBar1.add(Mantenimiento);

        Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        Reportes.setText("REPORTES");

        Reportesv.setText("Reporte Ventas");
        Reportesv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesvActionPerformed(evt);
            }
        });
        Reportes.add(Reportesv);

        jMenuBar1.add(Reportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(VentanaPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // menu salir
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        // ventana ventas
        Ventas vf=new Ventas();
        CentrarVentana(vf); 
    }//GEN-LAST:event_ventasActionPerformed

    private void VendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendedorActionPerformed
        // ventana vendedor
        Vendedor vf= new Vendedor();
        CentrarVentana(vf);
        
    }//GEN-LAST:event_VendedorActionPerformed

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        // ventana producto
        Producto pf=new Producto();
        CentrarVentana(pf);
        
    }//GEN-LAST:event_ProductoActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // ventana cliente
        Cliente cf=new Cliente();
        CentrarVentana(cf);
    }//GEN-LAST:event_ClienteActionPerformed

    private void ReportesvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportesvActionPerformed
      void CentrarVentana(JInternalFrame frame){
          VentanaPrincipal.add(frame);
          Dimension dimension=VentanaPrincipal.getSize();
          Dimension Dframe=frame.getSize();
         frame.setLocation((dimension.width -Dframe.height)/2,(dimension.height -Dframe.width)/2);
         frame.show();
          
          
          
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ayuda;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenu Mantenimiento;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem Producto;
    private javax.swing.JMenu Reportes;
    private javax.swing.JMenuItem Reportesv;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem Vendedor;
    private javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu Ventas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem ventas;
    // End of variables declaration//GEN-END:variables
}
