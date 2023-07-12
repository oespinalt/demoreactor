package PRINCIPAL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import PRINCIPAL.*;
import PRINCIPAL.*;
import BD_SQL.Sql_CSA;
import BD_SQL.TR;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import org.pentaho.di.core.exception.KettleException;





/**
 *
 * @author OEspinalT
 */
public class principal extends javax.swing.JFrame {
@Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/LogoBDH-Blanco100x100.png"));
        return retValue;

    }
Sql_CSA sql =new Sql_CSA() ;
    public principal() {
        initComponents();
        this.setLocationRelativeTo(jMenu1);//Inicia la ventana en el centro de la pantalla
     //   this.setExtendedState(MAXIMIZED_BOTH);//Inicia la ventana maximisada
         jTable1.setDefaultRenderer(Object.class, new ColorearResaltar());
          jTable2.setDefaultRenderer(Object.class, new ColorearResaltar());
           buscar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OHSYS-Cuadre De Caja");
        setIconImage(getIconImage());

        jTabbedPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Entidad 1", "Monto 1", "Entidad 2", "Monto 2", "Diferencia", "Estado del cuadre", "Periodo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Cuadre periodo mensual");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cuadre periodo diario");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE_ENTIDAD", "FECHA_ENTIDAD", "NOMBRE_DIA_ENTIDAD", "MONTO_ENTIDAD", "NOMBRE_ENTIDAD", "FECHA_ENTIDAD", "NOMBRE_DIA_ENTIDAD", "MONTO_ENTIDAD", "CUADRE_DIARIO"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-play-32.png"))); // NOI18N
        jButton2.setText("CIBAO SPAD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-add-file-32.png"))); // NOI18N
        jButton3.setText("Agrega AZUL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-play-32_1.png"))); // NOI18N
        jButton5.setText("DEPICENTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addComponent(jButton5)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton5)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-info-16.png"))); // NOI18N
        jLabel3.setToolTipText("<html>\n<p><strong>Cuadre Mensual</strong></p>\n<hr>\n<p>Es el cuadre mensual que se calcula&nbsp;</p>\n<p>de la suma de todas los movimientos diarios</p>\n<p>de dinero entre un banco, tarjetas o la administraci&oacute;n .</p>\n</html>");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-info-16.png"))); // NOI18N
        jLabel4.setToolTipText("<html>\n<p><strong>Cuadre Diario</strong></p>\n<hr>\n<p>Es el cuadre diarios que se calcula&nbsp;</p>\n<p>de la suma de todas los movimientos diarios</p>\n<p>de dinero entre un banco, tarjetas o la administraci&oacute;n .</p>\n</html>");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Entidad", "Monto", "Periodo", "Negocio"
            }
        ));
        jTable3.setToolTipText("<html>\n<p><strong>Total de cada banco</strong></p>\n<hr>\n<p>Se muestran los montos mensuales.</p>\n<p>sumando todos los movimientos</p>\n<p>diarios del banco en cuesti&oacute;n.</p>\n</html>");
        jScrollPane5.setViewportView(jTable3);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Sumatoria TOTAL Archivos Bancos");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-info-16.png"))); // NOI18N
        jLabel6.setToolTipText("<html>\n<p><strong>Suma mensual</strong></p>\n<hr>\n<p>La suma de todos los movimientos</p>\n<p>en los diferentes bancos.</p>\n<p>La tabla es solo para validar datos.</p>\n</html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))
                                .addGap(435, 435, 435)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane5)
                            .addComponent(jSeparator3))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Cuadre", jPanel4);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1-Crear una carpeta \"2analisis\" dentro la de carpeta del programa.\n2-Dentro de la carpeta del paso 1, colocar los archivos con los siguientes nombres:\n\t>AccountMovementsDetail: Para el banco Santa Cruz.\n\t>VISANET_ESTADO_CUENTA: Para las tarjetas de creditos.\n\t>CuentaMovimientos: Para el banco BanReservas.\n\t>ExportarData: Para el banco Asociación Cibao De Ahorro y Prestamos.\n\t>pdcsvexport: Para el banco Popular.\n\t>reporte_de_ventas: Para las ventas realizadas a los clientes.\n\t>Estado Cuenta: Para la ventas realizadas en AZUL.\n3-En el sistema hacer click  en el boton de nombre: Agrega AZUL.\n\t>Luego descarga el archivo de la plataforma de Azul y copia los datos que son relevante para el sistema.\n5-Hacer click, en el botón ejecutar y espera que termine el proceso.");
        jTextArea1.setBorder(null);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane5.addTab("Info!", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        jTabbedPane5.getAccessibleContext().setAccessibleName("Comunicación");

        jScrollPane4.setViewportView(jPanel1);

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-about-24.png"))); // NOI18N
        jMenuItem1.setText("Acerca");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        getAccessibleContext().setAccessibleName("OHSYS");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        agregarAZUL form = new agregarAZUL();
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila=0;
        if (evt.getClickCount()==1){
            fila = jTable1.rowAtPoint(evt.getPoint());

            String titulos[]={"NOMBRE_ENTIDAD",
                "FECHA_ENTIDAD",
                "NOMBRE_DIA_ENTIDAD",
                "MONTO_ENTIDAD",
                "NOMBRE_ENTIDAD",
                "FECHA_ENTIDAD",
                "NOMBRE_DIA_ENTIDAD",
                "MONTO_ENTIDAD",
                "CUADRE_DIARIO",

            };

            DefaultTableModel modelo2= new DefaultTableModel(null,titulos);

            jTable2.setModel(modelo2);

            JTable jTable2 = new JTable(modelo2);

            try {
                sql.DIARIO( modelo2,((jTable1.getValueAt(fila, 0).toString())),((jTable1.getValueAt(fila, 2).toString())));
            } catch (SQLException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
                     
            final JOptionPane msg = new JOptionPane("Favor Esperar:\n\nLa Indicacion del que el Proceso Termino");

//        final JDialog dlg = msg.createDialog(" ");
        final JDialog dlg = msg.createDialog("Calculando");

        dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

        dlg.addComponentListener(new ComponentAdapter() {

            @Override

            public void componentShown(ComponentEvent e) {
                try {
                    super.componentShown(e);

                final Timer t = new Timer(5000,new ActionListener() {

                    @Override

                    public void actionPerformed(ActionEvent e) {

                        dlg.setVisible(false);

                    }

                });

                t.start();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                

            }//

        });

        dlg.setVisible(true);

        System.out.println("Outside code.");

    
     
        
        TR YES = new TR();
           try {
                YES.tex();
//                JOptionPane.showMessageDialog(null, "Listo Favor a Verificar");
                JOptionPane.showMessageDialog(null, "Listo!, Favor a verificar");
               
                
            } catch (KettleException ex) {
                System.out.println(ex);
                 JOptionPane.showMessageDialog(null, "***ERROR***","ERROR", JOptionPane.WARNING_MESSAGE);
                          }
                          buscar();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        /*
        gifLoading   form = new gifLoading ();
            this.dispose();
            form.toFront();
            form.setVisible(true);
        */
     

    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    public void buscar(){
        
   
         String titulos[]={"NOMBRE_ENTIDAD_1", "MONTO_ENTIDAD_1", "NOMBRE_ENTIDAD_2", "MONTO_ENTIDAD_2", "DIFERENCIA_MENSUAL", "CUADRE_MENSUAL" };
        try {  
                   
 
           
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            jTable1.setModel(modelo);
          /* jTable table = new jTable(model);

            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jTable1.getModel());
            jTable1.setRowSorter(sorter);

            for (int i = 0; i < titulos.length; i++) {
                sorter.setSortable(i, true); // Habilita la clasificación en todas las columnas
            }

            JScrollPane scrollPane = new JScrollPane(jTable1);

            JTable jTable1 = new JTable(modelo);*/
            sql.MENSUAL(modelo);

            
            String titulos2[]={"NOMBRE_ENTIDAD_1", "MONTO_MENSUAL_ENTIDAD_1", "PERIODO_TIEMPO", };
            DefaultTableModel modelo2= new DefaultTableModel(null,titulos2);
            jTable3.setModel(modelo2);
            JTable jTable3 = new JTable(modelo2);
            sql.datos( modelo2);
            
             	 	

            
            
            } 
             catch (SQLException ex) {
                        Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
									System.out.println(ex);                       
                }         
    
          
       jTable1.setDefaultRenderer(Object.class, new ColorearResaltar());
      // jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
      
      
          jTable2.setDefaultRenderer(Object.class, new ColorearResaltar());
             jTable3.setDefaultRenderer(Object.class, new ColorearResaltar());
    }

    
    
    
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
