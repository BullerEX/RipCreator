/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package module.controller;

/**
 *
 * @author prac-sistemas
 */
public class Ripsc {
    public String quit(String Facturas) {
  // Para el reemplazo usamos un string vacío 
  return Facturas.replaceAll("\n", ""); 
}
    
}
