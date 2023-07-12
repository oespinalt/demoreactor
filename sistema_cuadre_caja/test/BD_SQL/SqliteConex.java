package BD_SQL;

import BD_SQL.*;
import java.sql.*;
public class SqliteConex {
    
 Connection cn = null;
    
 
 
    public SqliteConex()  {
        try {
            Class.forName("org.sqlite.JDBC");
//            cn = DriverManager.getConnection("jdbc:sqlite:src\\BD_SQL\\db_cuadre_caja.db");
            //cn = DriverManager.getConnection("jdbc:sqlite:C:\\JAR\\db_cuadre_caja.db");
			cn = DriverManager.getConnection("jdbc:sqlite:./db_cuadre_caja.db");
            } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
           
             }  
    }
}
