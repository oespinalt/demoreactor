package BD_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Sql_CSA extends SqliteConex {

    
     public void azul(DefaultTableModel modelo) throws SQLException {

        cn = getDBConnection();

        String sql = " SELECT \n" +
                        "fecha_de_cierre,\n" +
                        "hora_de_cierre,\n" +
                        "terminal_id,\n" +
                        "número_de_lote,\n" +
                        "cant_de_transacciones,\n" +
                        "monto_total_lote,\n" +
                        "pagadas_por_tercero,\n" +
                        "pagadas_por_azul,\n" +
                        "descuento_azul,\n" +
                        "retención_de_itbis_azul,\n" +
                        "neto_por_lote_azul,\n" +
                        "fecha_carga_registro,\n" +
                        "estado_registro\n" +
                        "FROM azul; ;";
        PreparedStatement pstm = cn.prepareStatement(sql);

        ResultSet rs = pstm.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int contcol = rsmd.getColumnCount();

        while (rs.next()) {
            Object[] fila = new Object[contcol];
            for (int i = 0; i < contcol; i++) {
                fila[i] = rs.getObject(i + 1);

            }
            modelo.addRow(fila);

        }
        if (pstm != null) {
            pstm.close();
            cn.close();
        }

    }
     
      public void MENSUAL(DefaultTableModel modelo) throws SQLException {

        cn = getDBConnection();

        String sql = " SELECT nombre_entidad_1 as \"NOMBRE 1\" ,monto_mensual_entidad_1 as \"MONTO 1\" ,nombre_entidad_2 as \"NOMBRE 2\" ,monto_mensual_entidad_2  as \"MONTO 2\"\n" +
",diferencia_mensual as \"DIFERENCIA_MENSUAL\" ,cuadre_mensual as \"CUADRE\" FROM parametros \n" +
"WHERE \n" +
"periodo_tiempo = 'MENSUAL' AND nombre_entidad_1 <> nombre_entidad_2 ";
        PreparedStatement pstm = cn.prepareStatement(sql);

        ResultSet rs = pstm.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int contcol = rsmd.getColumnCount();

        while (rs.next()) {
            Object[] fila = new Object[contcol];
            for (int i = 0; i < contcol; i++) {
                fila[i] = rs.getObject(i + 1);

            }
            modelo.addRow(fila);

        }
        if (pstm != null) {
            pstm.close();
            cn.close();
        }

    }
     
    public void datos(DefaultTableModel modelo) throws SQLException {

        cn = getDBConnection();

        String sql = " SELECT nombre_entidad_1 ,monto_mensual_entidad_1 ,periodo_tiempo \n" +
"FROM parametros WHERE periodo_tiempo = 'MENSUAL' AND nombre_entidad_1 = nombre_entidad_2 ;";
        PreparedStatement pstm = cn.prepareStatement(sql);

        ResultSet rs = pstm.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int contcol = rsmd.getColumnCount();

        while (rs.next()) {
            Object[] fila = new Object[contcol];
            for (int i = 0; i < contcol; i++) {
                fila[i] = rs.getObject(i + 1);

            }
            modelo.addRow(fila);

        }
        if (pstm != null) {
            pstm.close();
            cn.close();
        }

    }

    public void DIARIO(DefaultTableModel modelo, String uno, String dos) throws SQLException {
        cn = getDBConnection();
        String sql = " SELECT nombre_entidad_1,fecha_entidad_1,nombre_dia_entidad_1,monto_entidad_1,nombre_entidad_2,fecha_entidad_2,nombre_dia_entidad_2,\n"
                + "monto_entidad_2,cuadre_diario FROM parametros WHERE periodo_tiempo = 'DIARIO' and\n"
                + "(	nombre_entidad_1 = ? -- PASAR EL NOMBRE DEL CAMPO: nombre_entidad_1\n"
                + "	or nombre_entidad_2 =? -- PASAR EL NOMBRE DEL CAMPO: nombre_entidad_2\n"
                + ")\n"
                + ";";
        PreparedStatement pstm = cn.prepareStatement(sql);

        cn.setAutoCommit(false);
        pstm.setString(1, uno);
        pstm.setString(2, dos);
        ResultSet rs = pstm.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int contcol = rsmd.getColumnCount();

        while (rs.next()) {
            Object[] fila = new Object[contcol];
            for (int i = 0; i < contcol; i++) {
                fila[i] = rs.getObject(i + 1);

            }
            modelo.addRow(fila);

        }
        if (pstm != null) {
            pstm.close();
            cn.close();
        }
    }

    public void newdato(String[] estado) throws SQLException {

        cn = getDBConnection();

        String sql = "INSERT INTO azul (fecha_de_cierre, hora_de_cierre, terminal_id, número_de_lote, cant_de_transacciones, monto_total_lote, pagadas_por_tercero, pagadas_por_azul, descuento_azul, retención_de_itbis_azul, neto_por_lote_azul,  estado_registro)\n"
                + "VALUES(?,?,? ,? ,? ,? ,? ,? ,? ,? ,?  , 1)";
        PreparedStatement pstm = cn.prepareStatement(sql);
        cn.setAutoCommit(false);
        pstm.setString(1, estado[0]);
        pstm.setString(2, estado[1]);
        pstm.setString(3, estado[2]);
        pstm.setString(4, estado[3]);
        pstm.setString(5, estado[4]);
        pstm.setString(6, estado[5]);
        pstm.setString(7, estado[6]);
        pstm.setString(8, estado[7]);
        pstm.setString(9, estado[8]);
        pstm.setString(10, estado[9]);
        pstm.setString(11, estado[10]);
//           pstm.setString(12, estado[11]);

        pstm.executeUpdate();
        cn.commit();
        if (pstm != null) {
            pstm.close();
            cn.close();
        }

    }

    public void del() throws SQLException {
        cn = getDBConnection();
        String sql = "DELETE FROM azul ;";
        PreparedStatement pstm = cn.prepareStatement(sql);
        cn.setAutoCommit(false);
        pstm.executeUpdate();
        cn.commit();

        if (pstm != null) {
            pstm.close();
            cn.close();
        }

    }

    public  Connection getDBConnection() {

        Connection cn = null;

        try {
            Class.forName("org.sqlite.JDBC");

        } catch (ClassNotFoundException ex) {

        }
        try {
            //cn = DriverManager.getConnection("jdbc:sqlite:src\\BD_SQL\\db_cuadre_caja.db");
			//cn = DriverManager.getConnection("jdbc:sqlite:C:\\JAR\\db_cuadre_caja.db");
			cn = DriverManager.getConnection("jdbc:sqlite:./db_cuadre_caja.db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        }

        return cn;
    }

}
