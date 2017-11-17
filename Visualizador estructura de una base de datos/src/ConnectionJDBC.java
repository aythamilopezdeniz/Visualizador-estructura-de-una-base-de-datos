import com.mysql.jdbc.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionJDBC {

    private final String usuario;
    private final String clave;

    public ConnectionJDBC(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public void connection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        /*Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://mozart.dis.ulpgc.es/PracticaDIU?useSSL=true",
                "USUARIO", "CLAVE");*/
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/restaurante", 
                this.usuario, this.clave);
        DatabaseMetaData md = connection.getMetaData();
        String[] types = {"TABLE"};
        ResultSet rs = md.getTables(null, null, "%", types);
        while (rs.next()) {
            String nombreTabla = rs.getString("TABLE_NAME");
            System.out.println("Tabla: " + nombreTabla);
            ResultSet rs2 = md.getColumns(null, null, nombreTabla, null);
            while (rs2.next()) {
                String nombreCampo = null;
                nombreCampo = rs2.getString("COLUMN_NAME");
                System.out.println("   Campo: " + nombreCampo);
            }
        }
        connection.close();
    }
}