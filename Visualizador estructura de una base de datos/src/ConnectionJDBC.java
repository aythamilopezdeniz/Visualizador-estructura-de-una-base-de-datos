import com.mysql.jdbc.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionJDBC {

    public ConnectionJDBC() {
    }

    public void connection() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://SERVIDOR/BASE_DE_DATOS?useSSL=true",
                "USUARIO", "CLAVE");
        DatabaseMetaData md = connection.getMetaData();
        String[] types = {"TABLE"};
        ResultSet rs = md.getTables(null, null, "%", types);
        while (rs.next()){
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