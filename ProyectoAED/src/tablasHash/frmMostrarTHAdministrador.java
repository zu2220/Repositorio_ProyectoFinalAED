
package tablasHash;

<<<<<<< HEAD
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmMostrarTHAdministrador extends javax.swing.JFrame {

    DefaultTableModel dtm;
    TablaHashAdministrador th;
    Object o[]=new Object[4];
    public frmMostrarTHAdministrador() {
        initComponents();
        dtm=(DefaultTableModel)tablaDatos.getModel();
        
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtDNI.setEnabled(false);
        btnInsertar.setEnabled(false);
=======
import Clases.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class frmMostrarTHAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form frmMostrarTHAdministrador
     */
    TablaHashUsuario THU;
    DefaultTableModel dtm;
    Object o[]= new Object[7];
    
    public frmMostrarTHAdministrador() {
        initComponents();
        int size= Integer.parseInt(JOptionPane.showInputDialog("Ingresar un tamaño para la tabla "));
        THU= new TablaHashUsuario(size);
        dtm= (DefaultTableModel)tablaUsuario.getModel();
>>>>>>> 4a13d97b76a232f1db25e02a6f88105535336b5a
        
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
        txtApellido = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
<<<<<<< HEAD
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        txtSize = new javax.swing.JTextField();
        btnSize = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
=======
        cbxTipoUsuario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtEliminar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
<<<<<<< HEAD
>>>>>>> 4a13d97b76a232f1db25e02a6f88105535336b5a
=======
        btnOrdenar = new javax.swing.JButton();
>>>>>>> 41e2344e80a4b01918de550a2feb44392605c724

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("DNI");

        txtApellido.setBackground(new java.awt.Color(255, 255, 102));

        txtDNI.setBackground(new java.awt.Color(255, 255, 102));

        txtNombre.setBackground(new java.awt.Color(255, 255, 102));

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre", "Apellido", "DNI"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        btnSize.setText("Set Size");
        btnSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSizeActionPerformed(evt);
            }
        });
=======
        cbxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Docente", "Estudiante" }));

        jLabel4.setText("Tipo Usuario");

        jLabel5.setText("E-mail");

        txtmail.setBackground(new java.awt.Color(255, 255, 102));

        jLabel6.setText("Contraseña");

        txtPassword.setBackground(new java.awt.Color(255, 255, 102));

        tablaUsuario.setBackground(new java.awt.Color(102, 255, 255));
        tablaUsuario.setForeground(new java.awt.Color(255, 255, 102));
        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "clave", "Nombre", "Apellido", "DNI", "TipoUsuario", "Email", "Con traseña"
            }
        ));
        tablaUsuario.setGridColor(new java.awt.Color(255, 102, 102));
        tablaUsuario.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tablaUsuario.setSelectionForeground(new java.awt.Color(255, 255, 102));
        jScrollPane1.setViewportView(tablaUsuario);
>>>>>>> 4a13d97b76a232f1db25e02a6f88105535336b5a

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
<<<<<<< HEAD
=======

        jLabel7.setText("Buscar");

        jLabel8.setText("Eliminar");

        txtBuscar.setBackground(new java.awt.Color(255, 255, 102));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        txtEliminar.setBackground(new java.awt.Color(255, 255, 102));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
<<<<<<< HEAD
>>>>>>> 4a13d97b76a232f1db25e02a6f88105535336b5a
=======
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
>>>>>>> 41e2344e80a4b01918de550a2feb44392605c724

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
<<<<<<< HEAD
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnInsertar)
                                .addGap(115, 115, 115)
                                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnSize))
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListar)
                .addGap(360, 360, 360))
=======
=======
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 41e2344e80a4b01918de550a2feb44392605c724
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertar)
                        .addGap(175, 175, 175))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
                            .addComponent(cbxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListar)
                        .addGap(44, 44, 44)
                        .addComponent(btnOrdenar)))
                .addGap(47, 47, 47))
<<<<<<< HEAD
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 4a13d97b76a232f1db25e02a6f88105535336b5a
=======
>>>>>>> 41e2344e80a4b01918de550a2feb44392605c724
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertar)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSize))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnListar)
                .addContainerGap(157, Short.MAX_VALUE))
=======
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(btnInsertar))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListar)
                            .addComponent(btnOrdenar))))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addContainerGap(99, Short.MAX_VALUE))
>>>>>>> 4a13d97b76a232f1db25e02a6f88105535336b5a
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        AdministradorTH admin=new AdministradorTH(txtNombre.getText(),txtApellido.getText(),Integer.parseInt(txtDNI.getText()));
        th.insertar(admin);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeActionPerformed
        // TODO add your handling code here:
        
        //1ro vamos a verificar que el tamaño que se le desea asignar a la tabla es un numero primo
        //Para ello, utilizaremos una funcion que compruebe si lo ingresado es un num primo
        
        boolean flag=es_num_prim(Integer.parseInt(txtSize.getText()));
        
        if(flag){
            th=new TablaHashAdministrador(Integer.parseInt(txtSize.getText()));
            txtNombre.setEnabled(true);
            txtApellido.setEnabled(true);
            txtDNI.setEnabled(true);
            btnInsertar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(this,"El tamaño de la tabla debe ser un numero primo. Se procede a asignar un tamaño a la tabla");
            int nprimo=num_primo_prox(Integer.parseInt(txtSize.getText()));
            th=new TablaHashAdministrador(nprimo);
            
        }
        
       
    }//GEN-LAST:event_btnSizeActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        AdministradorTH[] x=th.getTHAdministrador();
        for(int i=0; i<th.getTHAdministrador().length;i++){
            dtm.addRow(x);
        }
    }//GEN-LAST:event_btnListarActionPerformed

=======
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        String nombre= txtNombre.getText();
        String apellido= txtApellido.getText();
        String DNI= txtDNI.getText();
        String correo= txtmail.getText();
        String password= txtPassword.getText();
        
        String tipoU= cbxTipoUsuario.getSelectedItem().toString();
        Usuario auxU= new Usuario( tipoU, nombre, apellido, DNI, correo, password);
        THU.Insertar(auxU);
        
        
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        LimpiarTabla();
        ListarDatos();
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        int indice= Integer.parseInt(txtBuscar.getText());
        Usuario aux= THU.getUsuarioByIndex(indice);
        if(aux== null){
        JOptionPane.showMessageDialog(this, "No se encontró al usuario ");
        } else{
             LimpiarTabla();
        mostrarUsuario(aux);
        }
       
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int indice= Integer.parseInt(txtEliminar.getText());
        THU.SetNodoByIndex(indice, null);
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

        public void ListarDatos(){
            
            Usuario []aux = THU.getTHUsuario();
            for(int i= 0; i< THU.getSize(); i++){
                if(aux[i]!= null){
                
                  o[0]= aux[i].getId();
                o[1]= aux[i].getTipoUsuario();
                o[2]= aux[i].getNombre();
                o[3]= aux[i].getApellido();
                o[4]= aux[i].getDNI();
                o[5]= aux[i].getEmail();
                o[6]= aux[i].getContrasena();
                dtm.addRow(o);
                    
                }
              
                
            }
            
        }
        public void LimpiarTabla(){
              for(int i=dtm.getRowCount();i>=1;i--){
            dtm.removeRow(i-1);
        }
        }
>>>>>>> 4a13d97b76a232f1db25e02a6f88105535336b5a
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
            java.util.logging.Logger.getLogger(frmMostrarTHAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMostrarTHAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMostrarTHAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMostrarTHAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMostrarTHAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnListar;
<<<<<<< HEAD
<<<<<<< HEAD
    private javax.swing.JButton btnSize;
=======
=======
    private javax.swing.JButton btnOrdenar;
>>>>>>> 41e2344e80a4b01918de550a2feb44392605c724
    private javax.swing.JComboBox<String> cbxTipoUsuario;
>>>>>>> 4a13d97b76a232f1db25e02a6f88105535336b5a
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
<<<<<<< HEAD
<<<<<<< HEAD
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSize;
=======
    private javax.swing.JTextField jTextField2;
=======
>>>>>>> 41e2344e80a4b01918de550a2feb44392605c724
    private javax.swing.JTable tablaUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtmail;
>>>>>>> 4a13d97b76a232f1db25e02a6f88105535336b5a
    // End of variables declaration//GEN-END:variables

<<<<<<< HEAD
    public boolean es_num_prim(int num) {
        //comprobamos si el numero es primo
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si es divisible por 'i', no es primo
            }
        }
        
        return true;
        
    }

    private int num_primo_prox(int aux) {
        int num = aux + 1;
        
        // Continuar buscando hasta encontrar un número primo
        while (es_num_prim(num)==false) {
            num++;
        }
        
        return num;
=======
    private void mostrarUsuario(Usuario aux) {
       
                  o[0]= aux.getId();
                o[1]= aux.getTipoUsuario();
                o[2]= aux.getNombre();
                o[3]= aux.getApellido();
                o[4]= aux.getDNI();
                o[5]= aux.getEmail();
                o[6]= aux.getContrasena();
                dtm.addRow(o);
>>>>>>> 41e2344e80a4b01918de550a2feb44392605c724
    }
}
