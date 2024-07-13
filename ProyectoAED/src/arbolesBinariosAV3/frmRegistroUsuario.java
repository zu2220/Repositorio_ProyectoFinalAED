package arbolesBinariosAV3;
import Formularios.*;
import Clases.Estudiante;
import Clases.Usuario;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmRegistroUsuario extends javax.swing.JFrame {

    ArbolBinario AB;
    DefaultTableModel dtm;
    frmMenu menu;
    Object o[]=new Object[8];
    
    public frmRegistroUsuario(frmMenu menu) {
        initComponents();
        AB=new ArbolBinario();
        this.menu=menu;
        dtm=(DefaultTableModel)tablaRegistros.getModel();
        txtNOrden.setVisible(false);
        jLOrden.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLOrden = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbxTipoUsuario = new javax.swing.JComboBox<>();
        txtNOrden = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        txtEliminar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnPreOrden = new javax.swing.JButton();
        btnInOrden = new javax.swing.JButton();
        btnPostOrden = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setText("Apellido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setText("password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 80, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 80, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 88, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 100, -1));

        jLabel5.setText("DNI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 80, -1));

        jLOrden.setText("N° Orden:");
        jPanel1.add(jLOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 440, 80, -1));

        jLabel7.setText("Tipo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        cbxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Administrador", "Docente", "Estudiante" }));
        cbxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));
        jPanel1.add(txtNOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 70, -1));

        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", " Tipo de usuario", "# orden", "DNI", "Nombre", "Apellido", "Email", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(tablaRegistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 760, 300));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, -1));
        jPanel1.add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 30));

        jLabel9.setText("Id");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 80, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        btnPreOrden.setText("PreOrden");
        btnPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnPreOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        btnInOrden.setText("InOrden");
        btnInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnInOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        btnPostOrden.setText("PostOrden");
        btnPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnPostOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoUsuarioActionPerformed
        // TODO add your handling code here:
        if(cbxTipoUsuario.getSelectedItem().toString().equalsIgnoreCase("Estudiante")){
            jLOrden.setVisible(true);
            txtNOrden.setVisible(true);
        }
        else{
            jLOrden.setVisible(false);
            txtNOrden.setVisible(false);
        }
    }//GEN-LAST:event_cbxTipoUsuarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
       int id=Integer.parseInt(txtID.getText());
       String numOrden=txtNOrden.getText();
       String tipoU=cbxTipoUsuario.getSelectedItem().toString();
       String dni=txtDNI.getText();
       String nombre=txtNombre.getText();
       String apellido=txtApellido.getText();
       String email=txtEmail.getText();
       String password=txtPassword.getText();
       Usuario aux=new Usuario(id,tipoU,nombre,apellido,dni,email,password);

            o[0]=aux.getId();
            o[1]=aux.getTipoUsuario();
            o[2]=null;
            
            o[3]=aux.getDNI();
            o[4]=aux.getNombre();
            o[5]=aux.getApellido();
            o[6]=aux.getEmail();
            o[7]=aux.getContrasena();
       if(tipoU.equalsIgnoreCase("Estudiante")){
           Estudiante auxE=new Estudiante(numOrden,id,tipoU,nombre,apellido,dni,email,password);
           AB.insertar(auxE);
           o[2]=auxE.getNumOrden();
       }
       AB.insertar(aux);
       dtm.addRow(o);
       
       //limpiar
       txtID.setText("");
       txtNOrden.setText("");
       cbxTipoUsuario.setSelectedIndex(0);
       txtDNI.setText("");
       txtNombre.setText("");
       txtApellido.setText("");
       txtEmail.setText("");
       txtPassword.setText("");
       
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txtBuscar.getText());
        Nodo nodo=AB.buscar(id);
        if(nodo==null)
            JOptionPane.showMessageDialog(this, "No se encontró el dato buscado");
        else{
            limpiarTabla();
            o[0]=nodo.getDato().getId();
            o[1]=nodo.getDato().getTipoUsuario();
            o[2]=null;
            if(nodo.getDato().getTipoUsuario().equalsIgnoreCase("Estudiante")){
                Estudiante auxE=(Estudiante)nodo.getDato();
                o[2]=auxE.getNumOrden();
            }
            o[3]=nodo.getDato().getDNI();
            o[4]=nodo.getDato().getNombre();
            o[5]=nodo.getDato().getApellido();
            o[6]=nodo.getDato().getEmail();
            o[7]=nodo.getDato().getContrasena();
            dtm.addRow(o);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txtEliminar.getText());
        AB.eliminar(id);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrdenActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        AB.preOrden(AB.getRaiz(), dtm);
    }//GEN-LAST:event_btnPreOrdenActionPerformed

    private void btnInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrdenActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        AB.inOrden(AB.getRaiz(), dtm);
    }//GEN-LAST:event_btnInOrdenActionPerformed

    private void btnPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostOrdenActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        AB.postOrden(AB.getRaiz(), dtm);
    }//GEN-LAST:event_btnPostOrdenActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInOrden;
    private javax.swing.JButton btnPostOrden;
    private javax.swing.JButton btnPreOrden;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxTipoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegistros;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNOrden;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla() {
        for(int i=dtm.getRowCount();i>=1;i--){
            dtm.removeRow(i-1);
        }
    }

    
}


