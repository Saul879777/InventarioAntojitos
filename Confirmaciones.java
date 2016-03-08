/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioantojitos;

/**
 *
 * @author Saúl Enrique Melchor Ramirez
 * @version 1.0
 */
public class Confirmaciones {
  private int bandera = 0;
  Menu menu = new Menu();
  
  /**Confirma si se quiere agregar un nuevo ingrediente
   *
   * @return Cierto a falso en agregar ingrediente
   */
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
  
  /**Confirma si se quiere modificar el ingrediente seleccionado
   *
   * @return Cierto a falso a modificar ingrediente
   */
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
  
  /**Confirma si se quiere borrar el ingrediente seleccionado
   *
   * @return Cierto a falso en borrar ingrediente
   */
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
  
  /** Confirma si se compro mas cantidad a un ingrediente existente
   *
   * @return Cierto a falso en agregar cantidad a un ingrediente
   */
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
  
  /**Confirmar si se quiere guardar el inventario
   *
   * @return Cierto a falso en guardar inventario
   */
  public int confirmacionGuardarInventario() {
    System.out.println("\nDesea guardar el inventario?");
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
