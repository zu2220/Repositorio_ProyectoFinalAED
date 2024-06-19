
package Formularios;

import Clases.Curso;
import Clases.Docente;
import ListasEnlazadas.ListaCurso;
import ListasEnlazadas.ListaDocente;
import ListasEnlazadas.NodoDocente;

import javax.swing.table.DefaultTableModel;


public class frmNuevoCurso extends javax.swing.JFrame {

    /**
     * Creates new form frmNuevoCurso
     */
    ListaCurso LC;
    frmMenu menu;
    frmInicioAdministrador IAd;
    ListaDocente LD;
    String docenteACargo;
    DefaultTableModel dtm;
    Object[] o=new Object[2];
    
    public frmNuevoCurso(ListaCurso LC,frmMenu menu,frmInicioAdministrador IAd) {
        initComponents();
        dtm=(DefaultTableModel)tablaCursos.getModel();
        this.menu=menu;
        this.IAd=IAd;
        this.LD=menu.LD;
        this.LC=LC;
        agregarElementosAlCbx();
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
        txtCursoNuevo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxDocenteACargo = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        panelMostrarCursos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nuevos cursos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 33));

        jLabel2.setText("Nombre del curso");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        jPanel1.add(txtCursoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 168, 30));

        jLabel3.setText("Docente(s) a cargo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        cbxDocenteACargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDocenteACargoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDocenteACargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 168, -1));

        btnCrear.setText("Crear curso");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        panelMostrarCursos.setBackground(new java.awt.Color(255, 255, 204));

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del curso", "Tiene docente asignado"
            }
        ));
        jScrollPane1.setViewportView(tablaCursos);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");

        jButton4.setText("Eliminar");

        btnOrdenar.setText("Ordenar");

        javax.swing.GroupLayout panelMostrarCursosLayout = new javax.swing.GroupLayout(panelMostrarCursos);
        panelMostrarCursos.setLayout(panelMostrarCursosLayout);
        panelMostrarCursosLayout.setHorizontalGroup(
            panelMostrarCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarCursosLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(panelMostrarCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarCursosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarCursosLayout.createSequentialGroup()
                        .addGroup(panelMostrarCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelMostrarCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(230, 230, 230))))
        );
        panelMostrarCursosLayout.setVerticalGroup(
            panelMostrarCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarCursosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelMostrarCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenar)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(panelMostrarCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(jButton4))
                .addGap(60, 60, 60))
        );

        jPanel1.add(panelMostrarCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 750, 480));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxDocenteACargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDocenteACargoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cbxDocenteACargoActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        docenteACargo=cbxDocenteACargo.getSelectedItem().toString();
        Docente aux=new Docente();
        for(int i=0;i<LD.getSize();i++){
            if(docenteACargo.equalsIgnoreCase(LD.getNodoByIndex(i).getDato().getNombre())){
                aux=LD.getNodoByIndex(i).getDato();
                break;
            }
        }
        
        
       
        Curso cursoNuevo=new Curso();
        cursoNuevo.setNombreCurso(txtCursoNuevo.getText());
        
        cursoNuevo.agregarDocente(aux);
        aux.agregarCurso(cursoNuevo);
        
        
        LC.insertarAlFinal(cursoNuevo);
        
        
        
        
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        mostrarListaCurso();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        dispose();
        IAd.setVisible(true);
        
        
    }//GEN-LAST:event_btnRegresarActionPerformed
    private void agregarElementosAlCbx(){
        for(int i=0;i<LD.getSize();i++){
            
        cbxDocenteACargo.addItem(LD.getNodoByIndex(i).getDato().getNombre());
        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxDocenteACargo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMostrarCursos;
    private javax.swing.JTable tablaCursos;
    private javax.swing.JTextField txtCursoNuevo;
    // End of variables declaration//GEN-END:variables

    private void mostrarListaCurso() {
        for(int i=0;i<LC.getSize();i++){
            o[0]=LC.getNodoByIndex(i).getDato().getNombreCurso();
            o[1]=null;
            if(LC.getNodoByIndex(i).getDato().getDocentesACargo().isListaDocenteEmpty()==true){
                o[1]="Falta asignar docentes";
            } else{
                o[1]="Si";
            }
            dtm.addRow(o);
        }
        
    }

    private void limpiarTabla() {
        for(int i=dtm.getRowCount();i>=1;i--){
            dtm.removeRow(i-1);
        }
    }
}
