package Formularios;


import ListasEnlazadas.ListaUsuario;

public class frmInicioEstudiante extends javax.swing.JFrame {

    ListaUsuario LU;
    frmInicioSesion IS;
    frmMenu menu;
    
    public frmInicioEstudiante(ListaUsuario LU, frmMenu menu, frmInicioSesion IS) {
        initComponents();
        this.LU=LU;
        this.IS=IS;
        this.menu=menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMatricularme = new javax.swing.JButton();
        btnVerMH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMatricularme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMatricularme.setText("Matricularme");
        btnMatricularme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularmeActionPerformed(evt);
            }
        });
        jPanel1.add(btnMatricularme, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 180, 50));

        btnVerMH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerMH.setText("Ver mi horario");
        btnVerMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMHActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 180, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido Estudiante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMatricularmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularmeActionPerformed
        
        dispose();
        frmMatriculaEstudiante MC=new frmMatriculaEstudiante(menu,IS);
        MC.setVisible(true);
        
    }//GEN-LAST:event_btnMatricularmeActionPerformed

    private void btnVerMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMHActionPerformed
        dispose();
        frmHorarioEstudiante HE = new frmHorarioEstudiante(IS);
        HE.setVisible(true);
    }//GEN-LAST:event_btnVerMHActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatricularme;
    private javax.swing.JButton btnVerMH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
