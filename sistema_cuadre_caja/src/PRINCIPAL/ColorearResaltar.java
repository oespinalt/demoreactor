/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRINCIPAL;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author OEspinalT
 */
public class ColorearResaltar extends DefaultTableCellRenderer{
private Component componente;
 Color c = new Color(219,229,241);
 Color selectFila = new Color(51,153,255);
// Color c = new Color(219,229,241);
 
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        componente= super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.

//    DARLE COLOR AL TEXTO - COLOR BLANCO
//    componente.setForeground(Color.BLACK);
//    tablacolores.setSelectionForeground(new java.awt.Color(255, 51, 51));

    if(i%2==0){
        componente.setBackground(c);
    }else{
        componente.setBackground(Color.WHITE);
    }
    
//    RESALTAR FILA SELECCIONADA
    if(bln){
        componente.setBackground(selectFila);
    }
    
    
    
    return componente;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
