/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioantojitos;

/**
 *
 * @author Saúl Enrique Melchor Ramirez
 * @version 0.1
 */
public class Confirmaciones {
  private int bandera = 0;
  Menu menu = new Menu();
  
  public int confirmacionAgregar() {
    System.out.println("\nDesea agregar este nuevo ingrediente? ");
    String sn = menu.leerConfirmacion();
    if (sn.equals("s")) {
      bandera = 1;
    }
    else{
      bandera = 0;
    }
    return bandera;
  }
  
  public int confirmacionModificar() {
    System.out.println("\nDesea modificar este ingrediente? ");
    String sn = menu.leerConfirmacion();
    if (sn.equals("s")) {
      bandera = 1;
    }
    else{
      bandera = 0;
    }
    return bandera;
  }
  
  public int confirmacionBorrar() {
    System.out.println("\nDesea borrar este ingrediente? ");
    String sn = menu.leerConfirmacion();
    if (sn.equals("s")) {
      bandera = 1;
    }
    else{
      bandera = 0;
    }
    return bandera;
  }
  
  public int confirmacionAgregarCantidadYPrecio() {
    System.out.println("\nDesea agregar precio y cantidad a este ingrediente? ");
    String sn = menu.leerConfirmacion();
    if (sn.equals("s")) {
      bandera = 1;
    }
    else{
      bandera = 0;
    }
    return bandera;
  }
}
