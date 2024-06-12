/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import ListasEnlazadas.ListaAula;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class frmVerAulasCreadas extends javax.swing.JFrame {

    DefaultTableModel dtm;
    Object[] o=new Object[3];
    frmMenu menu;
    ListaAula LA;
    frmNuevaAula nuevaAula;
    public frmVerAulasCreadas(frmMenu menu, frmNuevaAula nuevaAula) {
        initComponents();
        dtm=(DefaultTableModel)tablaAulasCreadas.getModel();
        this.menu=menu;
        LA=menu.LA;
        this.nuevaAula=nuevaAula;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAulasCreadas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAulasCreadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo aula", "Curso", "Profesor a cargo"
            }
        ));
        jScrollPane1.setViewportView(tablaAulasCreadas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 521, 342));

        jLabel1.setText("Aulas creadas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 100, -1));

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 80, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        mostrarLista();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        dispose();
        nuevaAula.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAulasCreadas;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla() {
        for(int i=tablaAulasCreadas.getRowCount();i>=1;i--){
            dtm.removeRow(i-1);
        }
    }

    private void mostrarLista() {
        for(int i=0;i<LA.getSize();i++){
            String codigoAula=LA.getNodoByIndex(i).getDato().getCodigoAula();
            String curso=LA.getNodoByIndex(i).getDato().getCurso().getNombreCurso();
            String profesor=LA.getNodoByIndex(i).getDato().getDocenteACargo().getNombre();
            
            o[0]=codigoAula;
            o[1]=curso;
            o[2]=profesor;
            dtm.addRow(o);
        }
    }
}
