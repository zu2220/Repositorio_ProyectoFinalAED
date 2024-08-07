package Formularios;

import ClasesProyectoFinalAED.Estudiante;
import ClasesProyectoFinalAED.Seccion;
import ListasEnlazadas.ListaSeccion;
import ListasEnlazadas.ListaCurso;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmMatriculaEstudiante extends javax.swing.JFrame {

    
    frmMenu menu;
    String valorCelda;
    ListaCurso LC;
    ListaSeccion LA;
    Estudiante est;
    DefaultTableModel dtm,dtm2;
    Object o[]=new Object[2];
    Object o2[]=new Object[5];
  
    public frmMatriculaEstudiante(frmMenu menu, frmInicioSesion IS) {
        initComponents();
        this.menu=menu;
        LC=menu.LC;
        LA=menu.LA;
        dtm=(DefaultTableModel)tablaCursosDisponibles.getModel();
        dtm2=(DefaultTableModel)tablaSecciones.getModel();
       // this.MIS=MIS;
        est=(Estudiante)IS.us;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnSeleccionarCurso = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCursosDisponibles = new javax.swing.JTable();
        btnSeleccionarSeccion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVerCursosDisponibles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSecciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSeleccionarCurso.setBackground(new java.awt.Color(255, 102, 102));
        btnSeleccionarCurso.setText("Seleccionar Curso");
        btnSeleccionarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarCursoActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        tablaCursosDisponibles.setBackground(new java.awt.Color(255, 255, 153));
        tablaCursosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cursos", "Estado"
            }
        ));
        tablaCursosDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCursosDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCursosDisponibles);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 305, 158));

        btnSeleccionarSeccion.setBackground(new java.awt.Color(255, 102, 102));
        btnSeleccionarSeccion.setText("Seleccionar Sección");
        btnSeleccionarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarSeccionActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("Seleccionar sus cursos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Ver horario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 133, -1));

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 178, -1));

        btnVerCursosDisponibles.setBackground(new java.awt.Color(255, 102, 102));
        btnVerCursosDisponibles.setText("Ver cursos disponibles");
        btnVerCursosDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCursosDisponiblesActionPerformed(evt);
            }
        });
        jPanel2.add(btnVerCursosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        tablaSecciones.setBackground(new java.awt.Color(255, 255, 102));
        tablaSecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Curso", "Codigo", "Profesor a cargo", "Dias", "Horas"
            }
        ));
        jScrollPane1.setViewportView(tablaSecciones);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, 209));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setText("Seleccionar sus secciones");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tablaCursosDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCursosDisponiblesMouseClicked
        // TODO add your handling code here:
        boolean aux=tablaCursosDisponibles.isCellSelected(tablaCursosDisponibles.getSelectedRow(),tablaCursosDisponibles.getSelectedColumn());
        if(aux==true){
            valorCelda=tablaCursosDisponibles.getValueAt(tablaCursosDisponibles.getSelectedRow(), tablaCursosDisponibles.getSelectedColumn()).toString();
        }
        mostrarSeccionesSegunCriterio(valorCelda);
        
    }//GEN-LAST:event_tablaCursosDisponiblesMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVerCursosDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursosDisponiblesActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        mostrarListaEnlazada();
    }//GEN-LAST:event_btnVerCursosDisponiblesActionPerformed

    private void btnSeleccionarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCursoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnSeleccionarCursoActionPerformed

    private void btnSeleccionarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarSeccionActionPerformed
        // TODO add your handling code here:
        int x=tablaSecciones.getSelectedRow();
        
        if(tablaSecciones.isRowSelected(x)){
            String codigo=dtm.getValueAt(x, 2).toString();
            Seccion auxSeccion=LA.buscarSeccion(codigo);
            if(auxSeccion==null){
                JOptionPane.showMessageDialog(this, "Error. No se pudo inscribir en la seccion");
            }else{
                est.insertarSecciones(auxSeccion);
                
            }
        }
    }//GEN-LAST:event_btnSeleccionarSeccionActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionarCurso;
    private javax.swing.JButton btnSeleccionarSeccion;
    private javax.swing.JButton btnVerCursosDisponibles;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCursosDisponibles;
    private javax.swing.JTable tablaSecciones;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla() {
        for(int i=dtm.getRowCount();i>=1;i--){
            dtm.removeRow(i-1);
        }
    }

    private void mostrarListaEnlazada() {
        for(int i=0;i<LC.getSize();i++){
            o[0]=LC.getNodoByIndex(i).getDato().getNombreCurso();
            o[1]="No matriculado";
            dtm.addRow(o);
        }
    }

    private void mostrarSeccionesSegunCriterio(String valorCelda) {
        limpiarTablaSecciones();
        for(int i=0;i<LA.getSize();i++){
            if(LA.getNodoByIndex(i).getDato().getCurso().getNombreCurso().equalsIgnoreCase(valorCelda)){
                o2[0]=LA.getNodoByIndex(i).getDato().getCurso().getNombreCurso();
                o2[1]=LA.getNodoByIndex(i).getDato().getCodigoSeccion();
                o2[2]=LA.getNodoByIndex(i).getDato().getDocenteACargo().getNombre();
                o2[3]=null;
                o2[4]=null;
                dtm2.addRow(o2);
            }
        }
    }

    private void limpiarTablaSecciones() {
        for(int i=dtm2.getRowCount();i>=1;i--){
            dtm.removeRow(i-1);
        }
    }
   } 


