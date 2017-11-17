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
        /*
        https://www.youtube.com/watch?v=TjvEw6Wnuag
        https://www.youtube.com/watch?v=N8OVnRpBFzE
        https://www.youtube.com/watch?v=aBL2VwiPkPg
        https://alvinalexander.com/java/edu/pj/jdbc/jdbc0003
        https://www.youtube.com/watch?v=zJBI4pGylFE
        https://www.youtube.com/watch?v=nbAYB6HyTQI
        https://www.youtube.com/watch?v=H0aMW9cGoC8
        http://fernando-gaitan.com.ar/conectar-java-con-mysql-en-netbeans/
        https://stackoverflow.com/questions/22384710/java-sql-sqlexception-no-suitable-driver-found-for-jdbcmysql-localhost3306
        */
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