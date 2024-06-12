package Formularios;

import Clases.Administrador;
import Clases.Docente;
import Clases.Estudiante;
import Clases.Usuario;
import ListasEnlazadas.ListaDocente;
import ListasEnlazadas.ListaEstudiante;
import ListasEnlazadas.ListaUsuario;
import ListasEnlazadas.NodoEstudiante;
import ListasEnlazadas.NodoUsuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmRegistroUsuario extends javax.swing.JFrame {

    
    DefaultTableModel dtm;
    frmMenu menu;
    ListaUsuario LU;
    ListaDocente LD;
    Object o[]=new Object[7];
    
    public frmRegistroUsuario(frmMenu menu,ListaUsuario LU) {
        initComponents();
        this.LU=LU;
        this.menu=menu;
        LD=menu.LD;
        
        dtm=(DefaultTableModel)tablaRegistros.getModel();
        txtNOrden.setVisible(false);
        jLOrden.setVisible(false);
        txtAddAfter.setEnabled(false);
        txtDeleteAfter.setEnabled(false);
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
        txtContrasena = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLOrden = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbxTipoUsuario = new javax.swing.JComboBox<>();
        txtNOrden = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDeleteAfter = new javax.swing.JTextField();
        cbxTipoEli = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtAddAfter = new javax.swing.JTextField();
        cbxTipoIns = new javax.swing.JComboBox<>();
        btnOrdenar = new javax.swing.JButton();
        cbxOrdenar = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel2.setText("Apellido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel3.setText("Correo electrónico:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 80, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 80, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 88, -1));
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 88, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 80, 25));

        jLabel5.setText("DNI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 80, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLOrden.setText("N° Orden:");
        jPanel1.add(jLOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 80, -1));

        jLabel7.setText("Tipo de usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        cbxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Docente", "Estudiante" }));
        cbxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));
        jPanel1.add(txtNOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 70, -1));

        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Tipo de usuario", "Numero de orden", "DNI", "Nombre", "Apellido", "Email", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(tablaRegistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 760, 300));

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 80, -1));

        jLabel6.setText("Eliminar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));
        jPanel1.add(txtDeleteAfter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 100, -1));

        cbxTipoEli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Al inicio", "Al medio", "Al final" }));
        cbxTipoEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoEliActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel8.setText("Registrar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));
        jPanel1.add(txtAddAfter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 100, -1));

        cbxTipoIns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Al inicio", "Al medio", "Al final" }));
        cbxTipoIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoInsActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 350, 80, -1));

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        cbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Burbuja", "Shell", "Insercion", "Merge" }));
        jPanel1.add(cbxOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 90, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, -1, -1));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        //------------------------------
        int CDatos=dtm.getRowCount();
        NodoUsuario elemento=LU.getInicio();
        for(int i=CDatos;i<LU.getSize();i++){
            String NumOrden=null;
            String tipoU=elemento.getDato().getTipoUsuario();
            String nombre=elemento.getDato().getNombre();
            String apellido=elemento.getDato().getApellido();
            String DNI=elemento.getDato().getDNI();
            String Email=elemento.getDato().getEmail();
            String Contrasena=elemento.getDato().getContrasena();

            if(elemento.getDato().getTipoUsuario().equalsIgnoreCase("Estudiante")){
                Estudiante est1=(Estudiante)elemento.getDato();
                NumOrden=est1.getNumOrden();
            }
            

            o[0]=tipoU;
            o[1]=NumOrden;
            o[2]=DNI;
            o[3]=nombre;
            o[4]=apellido;
            o[5]=Email;
            o[6]=Contrasena;
            dtm.addRow(o);
            
            elemento=elemento.getSig();
        }
    }//GEN-LAST:event_btnListarActionPerformed

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
        //-------------------------------------
        for(int i=0;i<LU.getSize();i++){
            if(LU.getNodoByIndex(i).getDato().getTipoUsuario().equalsIgnoreCase("Docente")){
                Docente docente=(Docente)LU.getNodoByIndex(i).getDato();
                LD.insertarAlFinal(docente);
                
            }
        }
        //-------------------------------------
        dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtApellido.setText("");
        txtDNI.setText("");
        txtEmail.setText("");
        txtContrasena.setText("");
        txtNOrden.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String TiUs=cbxTipoUsuario.getSelectedItem().toString();

        String nombreU=txtNombre.getText();
        String apellidoU=txtApellido.getText();
        String dniU=txtDNI.getText();
        String emailU=txtEmail.getText();
        String contraU=txtContrasena.getText();
        
        String Tins=cbxTipoIns.getSelectedItem().toString();

        switch(TiUs){
            case "Administrador" -> {
                //jLOrden.setVisible(false);
                //txtNOrden.setVisible(false);
                Administrador us=new Administrador(TiUs,nombreU,apellidoU,dniU,emailU,contraU);

                if(Tins.equalsIgnoreCase("Al inicio")){
                    LU.insertarAlInicio(us);
                } else{
                    if(Tins.equalsIgnoreCase("Al medio")){
                        int ref=Integer.parseInt(txtAddAfter.getText());
                        LU.insertarDespuesDe(us, ref);
                    } else{
                        if(Tins.equalsIgnoreCase("Al final")){
                            LU.insertarAlFinal(us);
                        }
                    }
                }      
                    
            }
            case "Docente" -> {
                //jLOrden.setVisible(false);
                //txtNOrden.setVisible(false);
                Docente us=new Docente(TiUs,nombreU,apellidoU,dniU,emailU,contraU);
                
                if(Tins.equalsIgnoreCase("Al inicio")){
                    LU.insertarAlInicio(us);
                } else{
                    if(Tins.equalsIgnoreCase("Al medio")){
                        int ref=Integer.parseInt(txtAddAfter.getText());
                        LU.insertarDespuesDe(us, ref);
                    } else{
                        if(Tins.equalsIgnoreCase("Al final")){
                            LU.insertarAlFinal(us);
                        }
                    }
                }
            }
            case "Estudiante" -> {
                jLOrden.setVisible(true);
                txtNOrden.setVisible(true);
                String numOrden=txtNOrden.getText();
                Estudiante us=new Estudiante(numOrden,TiUs,nombreU,apellidoU,dniU,emailU,contraU);
                
                if(Tins.equalsIgnoreCase("Al inicio")){
                    LU.insertarAlInicio(us);
                } else{
                    if(Tins.equalsIgnoreCase("Al medio")){
                        int ref=Integer.parseInt(txtAddAfter.getText());
                        LU.insertarDespuesDe(us, ref);
                    } else{
                        if(Tins.equalsIgnoreCase("Al final")){
                            LU.insertarAlFinal(us);
                        }
                    }
                }
            }

        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbxTipoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoInsActionPerformed
        // TODO add your handling code here:
        if(cbxTipoIns.getSelectedItem().toString().equalsIgnoreCase("Al medio"))
            txtAddAfter.setEnabled(true);
    }//GEN-LAST:event_cbxTipoInsActionPerformed

    private void cbxTipoEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoEliActionPerformed
        // TODO add your handling code here:
        if(cbxTipoEli.getSelectedItem().toString().equalsIgnoreCase("Al medio"))
            txtDeleteAfter.setEnabled(true);
    }//GEN-LAST:event_cbxTipoEliActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
        String tipoEli=cbxTipoEli.getSelectedItem().toString();
        switch(tipoEli){
            case "Al inicio":
                LU.EliminarIni();
                break;
            case "Al medio":
                int referencia=Integer.parseInt(txtDeleteAfter.getText());
                LU.EliminarAlMedio(referencia);
                break;
            case "Al final":
                LU.EliminarFin();
                break;
        
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        //Ordenar usando el algoritmo burbuja
        String ordenar=cbxOrdenar.getSelectedItem().toString();
        switch(ordenar){
            case "Burbuja" -> {
                //----------------AGREGAR USUARIOS TIPO ESTUDIANTES A LA NUEVA LISTA ESTUDIANTES "LE"-------------------------------------
                ListaEstudiante LE=new ListaEstudiante();
                for(int i=0;i<LU.getSize();i++){
                    if(LU.getNodoByIndex(i).getDato().getTipoUsuario().equalsIgnoreCase("Estudiante")){
                        Estudiante aux= (Estudiante)LU.getNodoByIndex(i).getDato();
                        LE.insertarAlFinal(aux);
                    }
                }
                //--------------------ORDENAR A LOS ESTUDIANTES DE "LE" POR NUMERO DE ORDEN------------------------------------
                
                for(int i=0; i<LE.getSize()-1;i++){
                    NodoEstudiante aux=LE.getInicio();
                    for(int j=0;j<LE.getSize()-1;j++){
                        if(Integer.parseInt(aux.getDato().getNumOrden())>Integer.parseInt(aux.getSig().getDato().getNumOrden())){
                            Estudiante est=aux.getDato();
                            aux.setDato(aux.getSig().getDato());
                            aux.getSig().setDato(est);
                            
                        }
                        aux=aux.getSig();
                    }
                }
                
                
                //-------------------LIMPIAR LA TABLA---------------------------------------------------
                limpiarTabla();
                //--------------------------------------------------------------------------------------
                int CDatos=dtm.getRowCount();
                NodoEstudiante nEst=LE.getInicio();
                for(int i=CDatos;i<LE.getSize();i++){
                    String TipoU= nEst.getDato().getTipoUsuario();
                    String numOrden=nEst.getDato().getNumOrden();
                    String nombre=nEst.getDato().getNombre();
                    String apellido=nEst.getDato().getApellido();
                    String DNI=nEst.getDato().getDNI();
                    String Email=nEst.getDato().getEmail();
                    String Contrasena=nEst.getDato().getContrasena();
                 
                    o[0]=TipoU;
                    o[1]=numOrden;
                    o[2]=nombre;
                    o[3]=apellido;
                    o[4]=DNI;
                    o[5]=Email;
                    o[6]=Contrasena;
                  
                    dtm.addRow(o);
                    nEst=nEst.getSig();
                    //----------------------------------------------------------------------
                }
            }
            case "Shell" -> {
                int m;
                
                if(LU.getSize()%2==1){
                    m=(int)LU.getSize()/2;
                    for(int i=0; i<=m;i++){
                        NodoUsuario aux=LU.getNodoByIndex(i);
                        NodoUsuario aux2=LU.getNodoByIndex(i+m);
                        if(aux.getDato().getNombre().compareTo(aux2.getDato().getNombre())>0){
                            Usuario aux3=aux.getDato();
                            aux.setDato(aux2.getDato());
                            aux2.setDato(aux3);
                            
                        }
                    }
                }
                else{
                    m=LU.getSize()/2;
                }
               
                
                
            }
            case "Insercion" ->{
            
                for(int i=0;i<LU.getSize();i++){
                    Usuario us=LU.getNodoByIndex(i).getDato();
                    int j=i-1;
                    
                    while(j>=0 && LU.getNodoByIndex(j).getDato().getNombre().compareTo(us.getNombre())>0){
                        LU.getNodoByIndex(j+1).setDato(LU.getNodoByIndex(j).getDato());
                        j--;
                    }
                    
                    LU.getNodoByIndex(j+1).setDato(us);
                    
                    
                    /*if(LU.getNodoByIndex(i).getDato().getNombre().compareTo(LU.getNodoByIndex(i+1).getDato().getNombre())==-1){
                        Usuario aux=LU.getNodoByIndex(i).getDato();
                        LU.getNodoByIndex(i).setDato(LU.getNodoByIndex(i+1).getDato());
                        LU.getNodoByIndex(i+1).setDato(aux);
                    }*/
                
                }
                limpiarTabla();
                mostrarLista();
            }
            case "Merge" ->{
            mergeSort(LU, 0, LU.getSize() - 1);
            limpiarTabla();
            mostrarLista();

            
            }
            
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        int dni=Integer.parseInt(txtBuscar.getText());
        int indice=busquedaBinaria(dni);  //revisar2
        if(indice!=-1){
            limpiarTabla();
            o[0]=LU.getNodoByIndex(indice).getDato().getTipoUsuario();
            o[1]=null;
            if(LU.getNodoByIndex(indice).getDato().getTipoUsuario().equalsIgnoreCase("Estudiante")){
                Estudiante estudiante1=(Estudiante)LU.getNodoByIndex(indice).getDato();
                o[1]=estudiante1.getNumOrden();
            }
            o[2]=LU.getNodoByIndex(indice).getDato().getDNI();
            o[3]=LU.getNodoByIndex(indice).getDato().getNombre();
            o[4]=LU.getNodoByIndex(indice).getDato().getApellido();
            o[5]=LU.getNodoByIndex(indice).getDato().getEmail();
            o[6]=LU.getNodoByIndex(indice).getDato().getContrasena();
            
            dtm.addRow(o);
        }else{
                    JOptionPane.showMessageDialog(null, "La búsqueda no figura en la tabla");
                }
        
        
       /* int posicion=Integer.parseInt(txtBuscar.getText());
        NodoUsuario aux=null;
        for(int i=0;i<LU.getSize();i++){
            if(LU.getNodoByIndex(i).getPosicion()==posicion){
                aux=LU.getNodoByIndex(i);
                break;
            }
        }
        if(aux!=null){
            for(int i=dtm.getRowCount()-1;i>=0;i--){
            dtm.removeRow(i);
            }
            o[0]=aux.getDato().getTipoUsuario();
            o[1]=null;
            if(o[0].toString().equalsIgnoreCase("Estudiante")){
                Estudiante est=(Estudiante)aux.getDato();
                o[1]=est.getNumOrden();
            }
            o[2]=aux.getDato().getDNI();
            o[3]=aux.getDato().getNombre();
            o[4]=aux.getDato().getApellido();
            o[5]=aux.getDato().getEmail();
            o[6]=aux.getDato().getContrasena();
            dtm.addRow(o);
        }else{
            JOptionPane.showMessageDialog(this, "No se encontro un nodo con esa posicion");
        }
       
        */
        /*METODO BUSCAR DE MARCELO-----------------------------------------------------
        
        // Obtén el valor del campo de búsqueda
        String valorBuscado = txtBuscar.getText();

        // Crea una variable para almacenar el nodo encontrado
        NodoUsuario nodoEncontrado = null;

        // Recorre la lista enlazada de nodos de usuarios
        for (int i = 0; i < LU.getSize(); i++) {
            // Almacena la información del nodo actual en un arreglo (o)
            o[0] = LU.getNodoByIndex(i).getDato().getTipoUsuario();
            o[1] = null;
            if (o[0].toString().equalsIgnoreCase("Estudiante")) {
                Estudiante est = (Estudiante) LU.getNodoByIndex(i).getDato();
                o[1] = est.getNumOrden();
            }
            o[2] = LU.getNodoByIndex(i).getDato().getDNI();
            o[3] = LU.getNodoByIndex(i).getDato().getNombre();
            o[4] = LU.getNodoByIndex(i).getDato().getApellido();
            o[5] = LU.getNodoByIndex(i).getDato().getEmail();
            o[6] = LU.getNodoByIndex(i).getDato().getContrasena();

            // Compara cada elemento del arreglo (o) con el valor de búsqueda
            for (Object elemento : o) {
                if (elemento!= null && elemento.toString().equals(valorBuscado)) {
                    // Si se encuentra un elemento con el valor buscado, almacena su información en un arreglo (o)
                    nodoEncontrado = LU.getNodoByIndex(i);
                    break;
                }
            }

            // Si se encuentra un nodo con el valor buscado, actualiza la tabla
            if (nodoEncontrado!= null) {
                // Borra todas las filas de la tabla
                for (int j = dtm.getRowCount() - 1; j >= 0; j--) {
                    dtm.removeRow(j);
                }

                // Almacena la información del nodo encontrado en un arreglo (o)
                o[0] = nodoEncontrado.getDato().getTipoUsuario();
                o[1] = null;
                if (o[0].toString().equalsIgnoreCase("Estudiante")) {
                    Estudiante est = (Estudiante) nodoEncontrado.getDato();
                    o[1] = est.getNumOrden();
                }
                o[2] = nodoEncontrado.getDato().getDNI();
                o[3] = nodoEncontrado.getDato().getNombre();
                o[4] = nodoEncontrado.getDato().getApellido();
                o[5] = nodoEncontrado.getDato().getEmail();
                o[6] = nodoEncontrado.getDato().getContrasena();

                // Agrega la fila con la información del nodo encontrado a la tabla
                dtm.addRow(o);
                break;
            }
        }

        // Si no se encuentra ningún nodo con el valor buscado, muestra un mensaje de error
        if (nodoEncontrado == null) {
            JOptionPane.showMessageDialog(this, "No se encontró un nodo con ese valor");
        }
        
        
        
        
        ------------------------------------------------------------*/
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxOrdenar;
    private javax.swing.JComboBox<String> cbxTipoEli;
    private javax.swing.JComboBox<String> cbxTipoIns;
    private javax.swing.JComboBox<String> cbxTipoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLOrden;
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
    private javax.swing.JTable tablaRegistros;
    private javax.swing.JTextField txtAddAfter;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDeleteAfter;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNOrden;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla() {
        for(int i=dtm.getRowCount();i>=1;i--){
            dtm.removeRow(i-1);
        }
    }

    private void mostrarLista() {
        for(int i=0;i<LU.getSize();i++){
                    String TipoU= LU.getNodoByIndex(i).getDato().getTipoUsuario();
                    o[0]=TipoU;
                    o[1]=null;
                    if(LU.getNodoByIndex(i).getDato().getTipoUsuario().equalsIgnoreCase("Estudiante")){
                        Estudiante est=(Estudiante)LU.getNodoByIndex(i).getDato();
                        o[1]=est.getNumOrden();
                        
                    }
                    String nombre=LU.getNodoByIndex(i).getDato().getNombre();
                    String apellido=LU.getNodoByIndex(i).getDato().getApellido();
                    String DNI=LU.getNodoByIndex(i).getDato().getDNI();
                    String Email=LU.getNodoByIndex(i).getDato().getEmail();
                    String Contrasena=LU.getNodoByIndex(i).getDato().getContrasena();
                 
                
                    o[2]=nombre;
                    o[3]=apellido;
                    o[4]=DNI;
                    o[5]=Email;
                    o[6]=Contrasena;
                  
                    dtm.addRow(o);
        }
    }

    private int busquedaBinaria(int dni) {
        
        
        int fin=LU.getSize()-1;
        int inicio=0;
    
    while(0<=fin){
        int medio=inicio +(fin-inicio)/2;
    
    if(Integer.parseInt(LU.getNodoByIndex(medio).getDato().getDNI()) == dni){ //revisar
        return medio;
    }
    
    // Si el valor es mayor, ignorar la mitad izquierda
        if (Integer.parseInt(LU.getNodoByIndex(medio).getDato().getDNI())< dni) {
            inicio = medio + 1;
        } else {
            // Si el valor es menor, ignorar la mitad derecha
            fin = medio - 1;
        }
        
    }
        return -1;
    }
    public static void mergeSort(ListaUsuario lista, int izq, int der) {
        if (izq < der) {
        int medio = (izq + der) / 2;
        mergeSort(lista, izq, medio);
        mergeSort(lista, medio + 1, der);
        merge(lista, izq, medio, der);
        }
    }

    public static void merge(ListaUsuario lista, int izq, int medio, int der) {
    ListaUsuario listaIzq = new ListaUsuario();
    ListaUsuario listaDer = new ListaUsuario();

    for (int i = izq; i <= medio; i++) {
        listaIzq.insertarAlFinal(lista.getNodoByIndex(i).getDato());
    }
    for (int i = medio + 1; i <= der; i++) {
        listaDer.insertarAlFinal(lista.getNodoByIndex(i).getDato());
    }

    int i = 0, j = 0;
    int k = izq;

    while (i < listaIzq.getSize() && j < listaDer.getSize()) {
        if (listaIzq.getNodoByIndex(i).getDato().getNombre().compareTo(listaDer.getNodoByIndex(j).getDato().getNombre()) <= 0) {
            lista.getNodoByIndex(k).setDato(listaIzq.getNodoByIndex(i).getDato());
            i++;
        } else {
            lista.getNodoByIndex(k).setDato(listaDer.getNodoByIndex(j).getDato());
            j++;
        }
        k++;
    }

    while (i < listaIzq.getSize()) {
        lista.getNodoByIndex(k).setDato(listaIzq.getNodoByIndex(i).getDato());
        i++;
        k++;
    }

    while (j < listaDer.getSize()) {
        lista.getNodoByIndex(k).setDato(listaDer.getNodoByIndex(j).getDato());
        j++;
        k++;
    }
}
    
}


