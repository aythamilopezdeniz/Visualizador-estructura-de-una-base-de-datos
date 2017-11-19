import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnectionJDBC {

    private Connection connection;
    private final String usuario;
    private final String clave;
    private ArrayList<String> tablas;
    private ArrayList<String> campos;

    public ConnectionJDBC(String usuario, String clave) {
        this.tablas = new ArrayList();
        this.campos = new ArrayList();
        this.connection = null;
        this.usuario = "root";
        this.clave = "";
    }
    
    public void connection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        /*Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://mozart.dis.ulpgc.es/PracticaDIU?useSSL=true",
                "USUARIO", "CLAVE");*/
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/restaurante", 
                this.usuario, this.clave);
    }
    
    public ArrayList getTablas() throws SQLException {
        ResultSet rs = connection.getMetaData().getTables(null, null, "%", new String[]{"TABLE"});
        tablas = new ArrayList();
        while(rs.next()){
            tablas.add(rs.getString("TABLE_NAME"));
        }
        return tablas;
    }
    
    public ArrayList getCampos() throws SQLException {
        campos = new ArrayList();
        for (String tabla : this.tablas) {
            ResultSet rs = connection.getMetaData().getColumns(null, null, tabla, null);
            while(rs.next()) {
                campos.add(Character.toUpperCase(tabla.charAt(0))+tabla.substring(1)+"."+rs.getString("COLUMN_NAME"));
            }
                campos.add("\n");
        }
        return campos;
    }
    
    /*public void mostrarTabla(Connection connection) {
        try {
            DatabaseMetaData md = connection.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = md.getTables(null, null, "%", types);
            while (rs.next()) {
                String nombreTabla = rs.getString("TABLE_NAME");
                System.out.println("Tabla: " + nombreTabla);
                ResultSet rs2 = md.getColumns(null, null, nombreTabla, null);
                while (rs2.next()) {
                    String nombreCampo = rs2.getString("COLUMN_NAME");
                    System.out.println("   Campo: " + nombreCampo);
                }
            }
        } catch (SQLException ex) {
        }
    }
    */
    public void close() throws SQLException {
        connection.close();
    }
}