/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package module.database;

/**
 *
 * @author prac-sistemas
 */

import java.sql.*;
import javax.swing.JOptionPane;
 /**
 *Clase encargada de la conexion a la base de datos
 * @author Felipe Cardona
 * @author Alexander Orlas
 * @author Angelo Rodriguez
 *  

 */
public class Coneccion{

    public Connection Conectar() throws SQLException {

         
        String conUrl = "jdbc:sqlserver://atipax\\cohan_atipax:136;DatabaseName=STRONE; user=prac-sis; password=cohan2015;";

        
            // ...
	    Connection cn = DriverManager.getConnection(conUrl);
            // ... 
   	  return cn;
    }
    public void mostrar(){
        System.out.println("#");
    }

    public Coneccion getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}

// Conxiondb sqlite = new Conxiondb ();
//java.sql.Connection cn= sqlite.Conectar();
