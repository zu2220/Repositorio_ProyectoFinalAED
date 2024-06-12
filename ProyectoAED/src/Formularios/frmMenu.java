
package Formularios;


import ListasEnlazadas.ListaAula;
import ListasEnlazadas.ListaCurso;
import ListasEnlazadas.ListaDocente;
import ListasEnlazadas.ListaUsuario;


import javax.swing.table.DefaultTableModel;

public class frmMenu extends javax.swing.JFrame {

    DefaultTableModel dtm2=new DefaultTableModel();
    frmRegistroUsuario RU;
    frmInicioSesion IS;
    
    //LISTAS ENLAZADAS------------------------------------------------
    ListaUsuario LU=new ListaUsuario();
    ListaCurso LC=new ListaCurso();
    ListaAula LA=new ListaAula();
    ListaDocente LD=new ListaDocente();
    
    
    

    
    
    
    //-------------------------------------------------------------------
    public frmMenu() {
        initComponents();
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
        btnRegistrarUsuarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BotonesImagenesJava/btnregistrarse.png"))); // NOI18N
        btnRegistrarUsuarios.setText("Registrarse");
        btnRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 169, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("¿Qué desea hacer?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 210, 70));

        btnInciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BotonesImagenesJava/btnregistrarse.png"))); // NOI18N
        btnInciarSesion.setText("Iniciar sesión");
        btnInciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnInciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 115, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuariosActionPerformed
        // TODO add your handling code here:
        RU=new frmRegistroUsuario(this,LU);
        dispose();
        RU.setVisible(true);
        //RU.AU.getAllUsuarios();
        
        //copiarTabla(RU.AU.getAllUsuarios());
    }//GEN-LAST:event_btnRegistrarUsuariosActionPerformed

    private void btnInciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInciarSesionActionPerformed
        // TODO add your handling code here:
        IS=new frmInicioSesion(LU,this);
        dispose();
        IS.setVisible(true);
        
    }//GEN-LAST:event_btnInciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInciarSesion;
    private javax.swing.JButton btnRegistrarUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
/*
    private void copiarTabla(Usuario[] allUsuarios) {
        AUS=new Usuario[allUsuarios.length];
        AUS=allUsuarios;
    }*/
}
