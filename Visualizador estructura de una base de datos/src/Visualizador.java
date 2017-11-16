public class Visualizador extends javax.swing.JFrame {

    public Visualizador() {
        initComponents();
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
        conectarBoton = new javax.swing.JButton();
        ModoDeSelección = new javax.swing.JPanel();
        simple = new javax.swing.JToggleButton();
        intervalo = new javax.swing.JToggleButton();
        intervaloMultiple = new javax.swing.JToggleButton();
        BaseDeDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablas = new javax.swing.JList<>();
        añadirTabla = new javax.swing.JButton();
        eliminarTabla = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campos = new javax.swing.JList<>();
        integrantesGrupo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizador estructura de una base de datos");

        Conexión.setBorder(javax.swing.BorderFactory.createTitledBorder("Iniciar Sesión"));
        Conexión.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Conexión.setName(""); // NOI18N

        usuarioLabel.setText("Usuario: ");

        contraseñaLabel.setText("Contraseña:");

        conectarBoton.setText("Conectar");

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
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(conectarBoton)
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
                    .addComponent(conectarBoton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ModoDeSelección.setBorder(javax.swing.BorderFactory.createTitledBorder("Modo de Selección\n"));

        selectionMode.add(simple);
        simple.setText("Selección Simple");

        selectionMode.add(intervalo);
        intervalo.setText("Selección Intervalo");

        selectionMode.add(intervaloMultiple);
        intervaloMultiple.setText("Selección Multiple Intervalos");

        javax.swing.GroupLayout ModoDeSelecciónLayout = new javax.swing.GroupLayout(ModoDeSelección);
        ModoDeSelección.setLayout(ModoDeSelecciónLayout);
        ModoDeSelecciónLayout.setHorizontalGroup(
            ModoDeSelecciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModoDeSelecciónLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(134, 134, 134)
                .addComponent(intervalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(136, 136, 136)
                .addComponent(intervaloMultiple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ModoDeSelecciónLayout.setVerticalGroup(
            ModoDeSelecciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModoDeSelecciónLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModoDeSelecciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simple)
                    .addComponent(intervalo)
                    .addComponent(intervaloMultiple))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BaseDeDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de Datos\n"));

        tablas.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas"));
        jScrollPane1.setViewportView(tablas);

        añadirTabla.setText("Añadir");
        añadirTabla.setMaximumSize(new java.awt.Dimension(70, 25));
        añadirTabla.setMinimumSize(new java.awt.Dimension(70, 25));
        añadirTabla.setPreferredSize(new java.awt.Dimension(70, 25));

        eliminarTabla.setText("Eliminar");

        campos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        jScrollPane2.setViewportView(campos);

        javax.swing.GroupLayout BaseDeDatosLayout = new javax.swing.GroupLayout(BaseDeDatos);
        BaseDeDatos.setLayout(BaseDeDatosLayout);
        BaseDeDatosLayout.setHorizontalGroup(
            BaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseDeDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BaseDeDatosLayout.createSequentialGroup()
                        .addComponent(añadirTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarTabla)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BaseDeDatosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        BaseDeDatosLayout.setVerticalGroup(
            BaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BaseDeDatosLayout.createSequentialGroup()
                .addGroup(BaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarTabla))
                .addGap(6, 6, 6)
                .addGroup(BaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
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
                .addGap(217, 217, 217))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(integrantesGrupo)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton añadirTabla;
    private javax.swing.JList<String> campos;
    private javax.swing.JButton conectarBoton;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel contraseñaLabel;
    private javax.swing.JButton eliminarTabla;
    private javax.swing.JLabel integrantesGrupo;
    private javax.swing.JToggleButton intervalo;
    private javax.swing.JToggleButton intervaloMultiple;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.ButtonGroup selectionMode;
    private javax.swing.JToggleButton simple;
    private javax.swing.JList<String> tablas;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}