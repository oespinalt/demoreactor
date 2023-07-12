
package BD_SQL;





import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.exception.KettleXMLException;
import org.pentaho.di.core.util.EnvUtil;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;




public class TR {
   
   public void tex () throws KettleXMLException, KettleException
    {
        
      
            KettleEnvironment.init();
            EnvUtil.environmentInit();
            
    
          ///   C:/JAR/PLANITALLA_IMPORT_PAGOS_SEGUROS.xlsx
//       TransMeta metaData = new TransMeta("CSL_CUADRE_VENTA.ktr");
       //TransMeta metaData = new TransMeta("C:\\JAR\\CSL_CUADRE_VENTA.ktr");
	   TransMeta metaData = new TransMeta("./CSL_CUADRE_VENTA.ktr");
       
         
          
          Trans trans = new Trans( metaData );
       /*
       
                trans.setVariable("NIS", text[0]);
                trans.setVariable("NIC", text[1]);
                trans.setVariable("NOMBRE", text[2]);
                trans.setVariable("FECHA", text[3]);
                trans.setVariable("COMMENT", text[4]);
                trans.setVariable("IP", text[5]);
                trans.setVariable("GROUP", text[6]);
                trans.setVariable("DEVICEID", text[7]);
                trans.setVariable("DEVICESN", text[8]);
                trans.setVariable("TIPO_INSTALACION", text[9]);

*/
         
        
            trans.execute( null );
            trans.waitUntilFinished();
               
            
            
      
            



            if ( trans.getErrors() > 0 ) {
                System.out.print( "Error Executing transformation" );
            }
       
    }

    

      
}

