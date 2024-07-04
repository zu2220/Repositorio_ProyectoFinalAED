
package Arbol;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class frmArbolEstudiante2 extends javax.swing.JFrame{

    ArbolEstudiante AB ;
    DefaultTableModel dtmTablaDatos;
    Object o[]= new Object[4];
    
    public frmArbolEstudiante2()
    {

        initComponents();
        AB=new ArbolEstudiante ();

        dtmTablaDatos = (DefaultTableModel) tablaDatos.getModel();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btnInsertar = new javax.swing.JButton();
        btnInorden = new javax.swing.JButton();
        btnPostOrden = new javax.swing.JButton();
        btnPreOrden = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnBorrado = new javax.swing.JButton();
        btnEliminarIzquierda = new javax.swing.JButton();
        btnEliminarDerecha = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("DNI");

        jLabel4.setText("Edad");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Edad"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        btnInsertar.setText("Insercion");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnInorden.setText("Inorden");
        btnInorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInordenActionPerformed(evt);
            }
        });

        btnPostOrden.setText("PostOrden");
        btnPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOrdenActionPerformed(evt);
            }
        });

        btnPreOrden.setText("PreOrden");
        btnPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrdenActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBorrado.setText("Eliminar");
        btnBorrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorradoActionPerformed(evt);
            }
        });

        btnEliminarIzquierda.setText("Eliminar Izquierda");
        btnEliminarIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIzquierdaActionPerformed(evt);
            }
        });

        btnEliminarDerecha.setText("Eliminar Derecha");
        btnEliminarDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDerechaActionPerformed(evt);
            }
        });

        jLabel5.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(txtDNI))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido)
                                    .addComponent(txtNombre))))
                        .addGap(168, 168, 168))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPreOrden, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInsertar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInorden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPostOrden))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrado))))
                    .addComponent(btnEliminarIzquierda)
                    .addComponent(btnEliminarDerecha))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnInorden)
                    .addComponent(btnPostOrden)
                    .addComponent(btnInsertar)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreOrden)
                    .addComponent(btnBuscar)
                    .addComponent(btnBorrado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarIzquierda))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnEliminarDerecha)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
     
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
   // Obtener los valores de los JTextField
    String nombre = txtNombre.getText();
    String apellido = txtApellido.getText();
   
    int edad = Integer.parseInt(txtEdad.getText());
    int DNI = Integer.parseInt(txtDNI.getText());
    EstudianteAB estudiante= new EstudianteAB(nombre, apellido, DNI, edad);
    AB.insertar(estudiante);

      o[0]= estudiante.getNombre();
      o[1]= estudiante.getApellido();
      o[2]= estudiante.getDNI();
      o[3]= estudiante.getEdad();
      dtmTablaDatos.addRow(o);
      
      
    

        // Limpiar los campos de texto
        txtNombre.setText("");
        txtDNI.setText("");
        txtApellido.setText("");
        txtEdad.setText("");

        AB.insertar(estudiante);


    }//GEN-LAST:event_btnInsertarActionPerformed


    private void btnInordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInordenActionPerformed
        // TODO add your handling code here:
        // Creamos un árbol binario vacío
        limpiarTabla();
        AB.recorrerInorden(AB.getRaiz(), dtmTablaDatos);
    }//GEN-LAST:event_btnInordenActionPerformed

    private void btnPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostOrdenActionPerformed
        limpiarTabla();
        AB.Postorden(AB.getRaiz(), dtmTablaDatos);
    }//GEN-LAST:event_btnPostOrdenActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:


        int dni = Integer.parseInt(txtBuscar.getText());
        NodoArbolEstudianteAB NodoEncontrado = AB.buscar2(dni);
        if (NodoEncontrado == null)
        {
            JOptionPane.showMessageDialog(this, "No se encontro al estudiante.");
        } else
        {
            limpiarTabla();
            o[0] = NodoEncontrado.getDato().getNombre();
            o[1] = NodoEncontrado.getDato().getApellido();
            o[2] = NodoEncontrado.getDato().getDNI();
            o[3] = NodoEncontrado.getDato().getEdad();
            dtmTablaDatos.addRow(o);
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorradoActionPerformed
        // TODO add your handling code here:
        //No hay un metodo eliminar que elimine todos los elementos del arbol
        //Emplear uno de los 2, ya sea por izquierda o derecha.
        //El borrado va a borrar un nodo especifico, no TODOS LOS ELEMENTOS DEL ARBOL
        //Para eliminar, cumplir las ciertas reglas de la izquierda, y tu codigo diferencie que es una hoja o nodo con ramas.
        //Que no se afecte al eliminar al nodo en especifico
        //1ERO RECORRER Pasar de la izquierda pasar.
        //Si tiene nodo y no tiene mas ramas, lo de izquierda pasa al Nodo que deseas eliminado
        //Si es que tiene mas ramas, entonces paso a su rama derecha y reemplazo a su nodo que se encuentra a la rama derecha
        //al cual deseo eliminar, de su rama derecha y izquierda.
        //despues de al nodo eliminar ---> Va a pasar a la rama derecha del nodo que se encuentra a la rama izquierda del nodo Eliminar por el nodo que se encuentra a la derecha
        // del que se encuentra al nodo eliminar.


    }//GEN-LAST:event_btnBorradoActionPerformed

    private void btnPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrdenActionPerformed
        // TODO add your handling code here:

        limpiarTabla();
        AB.recorrerPreorden(AB.getRaiz(), dtmTablaDatos);


    }//GEN-LAST:event_btnPreOrdenActionPerformed

    private void btnEliminarIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIzquierdaActionPerformed
        // TODO add your handling code here:
        int datoaeliminar;
    }//GEN-LAST:event_btnEliminarIzquierdaActionPerformed

    private void btnEliminarDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDerechaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnEliminarDerechaActionPerformed

  
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmArbolEstudiante2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmArbolEstudiante2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmArbolEstudiante2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmArbolEstudiante2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmArbolEstudiante2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrado;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarDerecha;
    private javax.swing.JButton btnEliminarIzquierda;
    private javax.swing.JButton btnInorden;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnPostOrden;
    private javax.swing.JButton btnPreOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

     public void limpiarTabla()
    {
        while(dtmTablaDatos.getRowCount()>0){
            dtmTablaDatos.removeRow(0);
        }
    }
}
