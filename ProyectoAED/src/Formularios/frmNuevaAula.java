/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Seccion;
import Clases.Curso;
import Clases.Docente;
import ListasEnlazadas.ListaAula;
import ListasEnlazadas.ListaCurso;
import ListasEnlazadas.NodoCurso;
import ListasEnlazadas.NodoDocente;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class frmNuevaAula extends javax.swing.JFrame {

    frmMenu menu;
    ListaCurso LC;
    ListaAula LA;
    frmInicioAdministrador IAdm;
    
    public frmNuevaAula(frmMenu menu,frmInicioAdministrador IAdm) {
        initComponents();
        this.menu=menu;
        LC=menu.LC;
        LA=menu.LA;
        this.IAdm=IAdm;
        
        llenarCbxCurso();
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxCurso = new javax.swing.JComboBox<>();
        txtCodigoAula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxDocente = new javax.swing.JComboBox<>();
        btnCrearAula = new javax.swing.JButton();
        btnVerAulasCreadas = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nuevas Aulas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel2.setText("Código");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel3.setText("Curso");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        cbxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCursoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 150, -1));

        txtCodigoAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAulaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 130, -1));

        jLabel4.setText("Docente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jPanel1.add(cbxDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 150, -1));

        btnCrearAula.setText("Crear aula");
        btnCrearAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 100, -1));

        btnVerAulasCreadas.setText("Ver aulas creadas");
        btnVerAulasCreadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAulasCreadasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerAulasCreadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel5.setText("Dias");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCursoActionPerformed
        // TODO add your handling code here:
      limpiarCbxDocente();
      llenarCbxDocente();
    }//GEN-LAST:event_cbxCursoActionPerformed

    private void btnCrearAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAulaActionPerformed
        // TODO add your handling code here:
        String codigoAula=txtCodigoAula.getText();
        String nombreCurso=cbxCurso.getSelectedItem().toString();
        String docenteACargo=cbxDocente.getSelectedItem().toString();
        
        NodoCurso auxNodoCurso=LC.getInicio();
        
        if(auxNodoCurso.buscarCurso(nombreCurso).getNombreCurso().equalsIgnoreCase(nombreCurso)){
            Curso auxCurso=auxNodoCurso.buscarCurso(nombreCurso);
            NodoDocente auxNodoDocente=auxCurso.getDocentesACargo().getInicio();
            if(auxNodoDocente.buscarDocente(docenteACargo).getNombre().equalsIgnoreCase(docenteACargo)){
                Docente auxDocente=auxNodoDocente.buscarDocente(docenteACargo);
                Seccion nuevaAula=new Seccion(codigoAula,auxCurso,auxDocente);
                LA.insertarAlFinal(nuevaAula);
            }
        }

        Docente auxDocente=buscarDocente(docenteACargo);
        
        
        
        
        
        
        
        
        /*
        Seccion aulaNueva=new Seccion(codigoAula,nombreCurso,docenteACargo);
        LA.insertarAlFinal(aulaNueva);*/
        
    }//GEN-LAST:event_btnCrearAulaActionPerformed

    private void btnVerAulasCreadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAulasCreadasActionPerformed
        // TODO add your handling code here:
        frmVerAulasCreadas verAC=new frmVerAulasCreadas(menu,this);
        dispose();
        verAC.setVisible(true);
        
    }//GEN-LAST:event_btnVerAulasCreadasActionPerformed

    private void txtCodigoAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoAulaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        dispose(); 
        IAdm.setVisible(true);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearAula;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerAulasCreadas;
    private javax.swing.JComboBox<String> cbxCurso;
    private javax.swing.JComboBox<String> cbxDocente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigoAula;
    // End of variables declaration//GEN-END:variables

    private void llenarCbxCurso() {
        for(int i=0;i<LC.getSize();i++){
            
        cbxCurso.addItem(LC.getNodoByIndex(i).getDato().getNombreCurso());
        }
    }

    private void llenarCbxDocente() {
        String cursoCapturado=cbxCurso.getSelectedItem().toString();
        //Curso auxCurso=new Curso();
        for(int i=0;i<LC.getSize();i++){
            if(cursoCapturado.equalsIgnoreCase(LC.getNodoByIndex(i).getDato().getNombreCurso())){
                for(int j=0;j<LC.getNodoByIndex(i).getDato().getDocentesACargo().getSize();j++){
                    cbxDocente.addItem(LC.getNodoByIndex(i).getDato().getDocentesACargo().getNodoByIndex(j).getDato().getNombre());
                }
            }
        }
    }

    private void limpiarCbxDocente() {
        /*for(int i=cbxDocente.getItemCount();i>=1;i++){
            cbxDocente.removeItemAt(i-1);
        }*/
        cbxDocente.removeAllItems();
    }
    
    private Curso buscarCurso(String curso){
        
        
        
     
    return null;
    }

    private Docente buscarDocente(String docenteACargo) {
       
        return null;
    }
}
