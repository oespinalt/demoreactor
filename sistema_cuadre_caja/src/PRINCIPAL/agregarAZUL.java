/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRINCIPAL;

import BD_SQL.Sql_CSA;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class agregarAZUL extends javax.swing.JFrame {

   Sql_CSA sql =new Sql_CSA() ;

   public agregarAZUL() {
        initComponents();
          buscar();
      jTable1.setDefaultRenderer(Object.class, new ColorearResaltar());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Agregar AZUL");
        setName("agregarAZUL"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha de cierre ", "Hora de cierre", "Terminal Id", "Número de lote4", "Cant. de Transacciones ", "Monto Total Lote", "Pagadas por tercero", "Pagadas por AZUL", "Descuento  AZUL", "Retención de ITBIS AZUL", "Neto por Lote AZUL", "Fecha_carga_registro", "Estado_registro"
            }
        ));
        jTable1.setDragEnabled(true);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-close-window-24.png"))); // NOI18N
        jButton1.setText("Eliminiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-paste-32.png"))); // NOI18N
        jButton2.setText("Pegar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-save-32.png"))); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(7, 7, 7))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    public void buscar(){
        
   
        
        try {  
                   
   
            String titulos[]={ "Fecha de cierre ", "Hora de cierre", "Terminal Id", "Número de lote4", "Cant. de Transacciones ", "Monto Total Lote", "Pagadas por tercero", "Pagadas por AZUL", "Descuento  AZUL", "Retención de ITBIS AZUL", "Neto por Lote AZUL",	 "fecha_carga_registro", ""};
            DefaultTableModel modelo= new DefaultTableModel(null,titulos);
            jTable1.setModel(modelo);
            JTable jTable1 = new JTable(modelo);
            sql.azul( modelo);
            } 
             catch (SQLException ex) {
                        Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
									System.out.println(ex);                       
                }         
    
          
       jTable1.setDefaultRenderer(Object.class, new ColorearResaltar());
        
    }
    
    
    
    void showErrorMessage(String msg)   {
        JOptionPane.showMessageDialog(null, msg,
        msg,
        JOptionPane.ERROR_MESSAGE);
        }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

              int nume=0;
        for(int i=0; i<100; i++){
       if(jTable1.getModel().getValueAt(i,1)==null){
           
       }
       else nume++;
           }
        for (int a=0; a<nume; a++){
           jTable1.setValueAt("", a, 0);
           jTable1.setValueAt("", a, 1);
           jTable1.setValueAt("", a, 2);
           jTable1.setValueAt("", a, 3);
           jTable1.setValueAt("", a, 4);
           jTable1.setValueAt("", a, 5);
           jTable1.setValueAt("", a, 6);
           jTable1.setValueAt("", a, 7);
           jTable1.setValueAt("", a, 8);
           jTable1.setValueAt("", a, 9);
           jTable1.setValueAt("", a, 10);
           jTable1.setValueAt("", a, 11);
           jTable1.setValueAt("", a, 12);
           
           
                     
        }
        
        
        
        Clipboard system;
                system = Toolkit.getDefaultToolkit().getSystemClipboard();

                try{
                String data= (String)system.getData(DataFlavor.stringFlavor);
                if(data==null) {showErrorMessage("No data on clipboard");return;}

                int selectCol=0;//jTable1.getSelectedColumn();
                int selectRow=0;//jTable1.getSelectedRow();
                if(selectCol<0||selectRow<0) {showErrorMessage("Please Select cell");return;}
                //devuelve clipboard contenido

                StringTokenizer st,stTmp;
                st=new StringTokenizer(data,"\n");
                int pasteRows=st.countTokens ();
                st=new StringTokenizer(st.nextToken ().trim (),"\t");
                int pasteCols=st.countTokens ();
                int marginCols=jTable1.getColumnCount()-selectCol;
                int marginRows=jTable1.getRowCount()-selectRow;
                //revisa espacio disponible
                if(marginCols<pasteCols || marginRows<pasteRows)
                {showErrorMessage("La tabla no posee el espacio suficiente para pegar los datos");return;}
                st=new StringTokenizer (data,"\n");
                int rowCount=0,colCount;
                //copia a la tabla
                while(st.hasMoreTokens())
                {
                stTmp=new StringTokenizer (st.nextToken (),"\t");
                colCount=0;
                while(stTmp.hasMoreTokens ())
                {
                jTable1.setValueAt(stTmp.nextToken (),rowCount+selectRow,colCount+selectCol);
                colCount++;
                }

                rowCount++;
                }
                }

                catch(UnsupportedFlavorException uf)
                {
                System.out.println ("uf="+uf.getMessage ());
                }
                catch(IOException io)
                {
                System.out.println ("io="+io.getMessage ());
                }

    

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea Guardar La Informacion?",
                "Salir del sistema", JOptionPane.YES_OPTION) == JOptionPane.YES_NO_OPTION) {

            int nume=0;
        for(int i=0; i<100; i++){
       if(jTable1.getModel().getValueAt(i,1)==null){
           
       }
       else nume++;
           }
        for (int a=0; a<nume; a++){
        
        String dato[]=new String[13];
        dato[0]=(String) jTable1.getValueAt(a,0);
        dato[1]=(String) jTable1.getValueAt(a,1);
        dato[2]=(String) jTable1.getValueAt(a,2);
        dato[3]=(String) jTable1.getValueAt(a,3);
        dato[4]=(String) jTable1.getValueAt(a,4);
        dato[5]=(String) jTable1.getValueAt(a,5);
        dato[6]=(String) jTable1.getValueAt(a,6);
        dato[7]=(String) jTable1.getValueAt(a,7);
        dato[8]=(String) jTable1.getValueAt(a,8);
        dato[9]=(String) jTable1.getValueAt(a,9);
        dato[10]=(String) jTable1.getValueAt(a,10);
        dato[11]=(String) jTable1.getValueAt(a,11);
        dato[12]=(String) jTable1.getValueAt(a,12);
     //   System.out.println ((String)jTable1.getValueAt(a,4));
    
      
                 try {    
        
                     
                   
            sql.newdato(dato);
            
        } 
                 catch (SQLException ex) {
              Logger.getLogger(agregarAZUL.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null,"ERROR" );
          
            
            }


        }
        
        }  
           

 jTable1.setDefaultRenderer(Object.class, new ColorearResaltar());

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if (JOptionPane.showConfirmDialog(rootPane, "¿Desea Borrar La Informacion?",
                "Salir del sistema", JOptionPane.YES_OPTION) == JOptionPane.YES_NO_OPTION) {   

      try {
          sql.del();
           JOptionPane.showMessageDialog(rootPane, "Informacion Eliminada");
      } catch (SQLException ex) {
          Logger.getLogger(agregarAZUL.class.getName()).log(Level.SEVERE, null, ex);
      }

        }    jTable1.setDefaultRenderer(Object.class, new ColorearResaltar());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}