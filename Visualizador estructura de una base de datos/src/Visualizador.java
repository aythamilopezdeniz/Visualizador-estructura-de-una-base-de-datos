import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Visualizador extends javax.swing.JFrame {

    private DefaultListModel tablas = new DefaultListModel();
    private DefaultListModel campos = new DefaultListModel();
    private ConnectionJDBC conexion;
    private ArrayList tablasSQL;

    public Visualizador() {
        initComponents();
        cerrarSesion();
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectionMode = new javax.swing.ButtonGroup();
        Conexión = new javax.swing.JPanel();
        usuarioLabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        contraseñaLabel = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        conectarButton = new javax.swing.JButton();
        desconectarButton = new javax.swing.JButton();
        ModoDeSelección = new javax.swing.JPanel();
        simple = new javax.swing.JToggleButton();
        intervalo = new javax.swing.JToggleButton();
        intervaloMultiple = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        BaseDeDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTablas = new javax.swing.JList<>(tablas);
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCampos = new javax.swing.JList<>(campos);
        integrantesGrupo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizador estructura de una base de datos");

        Conexión.setBorder(javax.swing.BorderFactory.createTitledBorder("Iniciar Sesión"));
        Conexión.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Conexión.setName(""); // NOI18N

        usuarioLabel.setText("Usuario: ");

        contraseñaLabel.setText("Contraseña:");

        conectarButton.setText("Conectar");
        conectarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarButtonActionPerformed(evt);
            }
        });

        desconectarButton.setText("Desconectar");
        desconectarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desconectarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConexiónLayout = new javax.swing.GroupLayout(Conexión);
        Conexión.setLayout(ConexiónLayout);
        ConexiónLayout.setHorizontalGroup(
            ConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConexiónLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuarioLabel)
                .addGap(4, 4, 4)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaLabel)
                .addGap(2, 2, 2)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(conectarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(desconectarButton)
                .addContainerGap())
        );
        ConexiónLayout.setVerticalGroup(
            ConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConexiónLayout.createSequentialGroup()
                .addGroup(ConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñaLabel)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conectarButton)
                    .addComponent(desconectarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ModoDeSelección.setBorder(javax.swing.BorderFactory.createTitledBorder("Modo de Selección\n"));

        selectionMode.add(simple);
        simple.setText("Simple");
        simple.setPreferredSize(new java.awt.Dimension(119, 25));

        selectionMode.add(intervalo);
        intervalo.setText("Intervalo");
        intervalo.setPreferredSize(new java.awt.Dimension(119, 25));

        selectionMode.add(intervaloMultiple);
        intervaloMultiple.setText("Multiple Intervalos");

        jButton1.setText("Limpiar");
        jButton1.setPreferredSize(new java.awt.Dimension(119, 25));

        javax.swing.GroupLayout ModoDeSelecciónLayout = new javax.swing.GroupLayout(ModoDeSelección);
        ModoDeSelección.setLayout(ModoDeSelecciónLayout);
        ModoDeSelecciónLayout.setHorizontalGroup(
            ModoDeSelecciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModoDeSelecciónLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(intervalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(85, 85, 85)
                .addComponent(intervaloMultiple, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ModoDeSelecciónLayout.setVerticalGroup(
            ModoDeSelecciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModoDeSelecciónLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModoDeSelecciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intervaloMultiple)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BaseDeDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de Datos\n"));

        listaTablas.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas"));
        jScrollPane1.setViewportView(listaTablas);

        listaCampos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        jScrollPane2.setViewportView(listaCampos);

        javax.swing.GroupLayout BaseDeDatosLayout = new javax.swing.GroupLayout(BaseDeDatos);
        BaseDeDatos.setLayout(BaseDeDatosLayout);
        BaseDeDatosLayout.setHorizontalGroup(
            BaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseDeDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        BaseDeDatosLayout.setVerticalGroup(
            BaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BaseDeDatosLayout.createSequentialGroup()
                .addGroup(BaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        integrantesGrupo.setText("Realizado por Aythami López Déniz y David Suárez Suárez");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BaseDeDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Conexión, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModoDeSelección, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(integrantesGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Conexión, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ModoDeSelección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BaseDeDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(integrantesGrupo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conectarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarButtonActionPerformed
        //if(validarSesion())
            establecerConexion();
    }//GEN-LAST:event_conectarButtonActionPerformed

    private boolean validarSesion() {
        if (nombre.getText().isEmpty() && contraseña.getText().isEmpty())
            return false;
        else if (nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo de usuario no es correcto.",
                    "Campo usuario", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if (contraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo de password no es correcto.",
                    "Campo password", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void establecerConexion() {
        try {
            conexion = new ConnectionJDBC(nombre.getText(), contraseña.getText());
            conexion.connection();
            iniciarSesion();
            mostrarTablas(tablas, conexion.getTablas());
            mostrarTablas(campos, conexion.getCampos());
        } catch (SQLException ex) {
            errorConexionBaseDatos();
        } catch (ClassNotFoundException ex) {
            errorDriver();
        }
    }
    
    private void iniciarSesion() {
        nombre.setEditable(false);
        contraseña.setEditable(false);
        conectarButton.setEnabled(false);
        desconectarButton.setEnabled(true);
    }
    
    private void mostrarTablas(DefaultListModel model, ArrayList tablas) throws SQLException {
        for (Object tabla : tablas) {
            model.addElement(tabla);
        }
    }
    
    private void errorConexionBaseDatos() {
        JOptionPane.showMessageDialog(rootPane, "Error en la conexión de la base de datos.",
                "Error de acceso a la base de datos", JOptionPane.ERROR_MESSAGE);
    }
    
    private void errorDriver() {
        JOptionPane.showMessageDialog(rootPane, "Error del driver de la base de datos.",
                "Error de conexión", JOptionPane.ERROR_MESSAGE);
    }

    private void desconectarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desconectarButtonActionPerformed
        try {
            conexion.close();
            cerrarSesion();
        } catch (SQLException ex) {
            errorConexionBaseDatos();
        }
    }//GEN-LAST:event_desconectarButtonActionPerformed
    
    private void cerrarSesion() {
        nombre.setEditable(true);
        contraseña.setEditable(true);
        conectarButton.setEnabled(true);
        desconectarButton.setEnabled(false);
    }
    
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
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BaseDeDatos;
    private javax.swing.JPanel Conexión;
    private javax.swing.JPanel ModoDeSelección;
    private javax.swing.JButton conectarButton;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel contraseñaLabel;
    private javax.swing.JButton desconectarButton;
    private javax.swing.JLabel integrantesGrupo;
    private javax.swing.JToggleButton intervalo;
    private javax.swing.JToggleButton intervaloMultiple;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaCampos;
    private javax.swing.JList<String> listaTablas;
    private javax.swing.JTextField nombre;
    private javax.swing.ButtonGroup selectionMode;
    private javax.swing.JToggleButton simple;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}