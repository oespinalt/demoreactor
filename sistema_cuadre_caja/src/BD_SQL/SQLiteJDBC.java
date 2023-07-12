/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD_SQL;

/**
 *
 * @author OEspinalT
 */
import java.sql.*;

public class SQLiteJDBC {
  public static void main(String args[]) {
    Connection c = null;

    try {
      Class.forName("org.sqlite.JDBC");
      //c = DriverManager.getConnection("jdbc:sqlite:src\\BD_SQL\\db_cuadre_caja.db");
      //c = DriverManager.getConnection("jdbc:sqlite:C:\\JAR\\db_cuadre_caja.db");
	  c = DriverManager.getConnection("jdbc:sqlite:./db_cuadre_caja.db");
	  
    } catch (Exception e) {
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }

    System.out.println("Opened database successfully");

    try {
      Statement stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM parametros");
//      ResultSet rs = stmt.executeQuery("SELECT id, nombre_banco FROM parametros");
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("nombre_banco");
        System.out.println("ID = " + id);
        System.out.println("nombre_banco = " + name);
      }
      rs.close();
      stmt.close();
      c.close();
    } catch (Exception e) {
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }

    System.out.println("Operation done successfully");
  }
}
