/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.net.*;
/**
 *
 * @author OEspinalT
 */
public class gifOptionPanel {
        public static void main(String[] args) throws Exception
    {
//        final ImageIcon icon = new ImageIcon(new URL("http://www.archisevilla.org/wp-content/themes/archisevilla/images/loading.gif"));
//        JOptionPane.showMessageDialog(null, "Blah blah blah", "Titulo", JOptionPane.INFORMATION_MESSAGE, icon);
        
        
//        ImageIcon icon = new ImageIcon(gifOptionPanel.class.getResource("gif_loading_blue.gif").getFile());
        
        
        
//        ImageIcon icon = new ImageIcon(gifOptionPanel.class.getResource("gif_loading_blue_green.gif").getFile());
        ImageIcon icon = new ImageIcon(gifOptionPanel.class.getResource("gif_loading_black.gif").getFile());
        JOptionPane.showOptionDialog(null, "CARGANDO-FAVOR ESPERAR","Calculando", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, icon, new Object[]{}, null);


//        JOptionPane.showMessageDialog(null, "", "About", JOptionPane.DEFAULT_OPTION, icon);
    }
}
