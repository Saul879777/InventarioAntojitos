/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioantojitos;

/**Clase principal
 *
 * @author Saúl Enrique Melchor Ramírez
 * @version 0.1
 */
public class InventarioAntojitos {

  /**Main para que el programa comience a correr
   * @param args the command line arguments
   */
  public static void main (String[] args) {
    int opcion = 0;
    Inventario inventario = new Inventario();
    inventario.recuperarInventario();
    Menu menu = new Menu();
    System.out.println("\nBienvenido\n");
    do{
      menu.menu();
      opcion = menu.leerOpcion();
      switch(opcion) {
        case 1:
          String nombre = menu.leerNombre();
          if (inventario.yaExiste(nombre) == 1){
            System.out.println("Ese ingrediente ya existe, ingresa otro ingrediente");
          }
          else {
            double cantidad = menu.leerCantidad();
            String unidadMedida = menu.leerUnidadMedida();
            double precio = menu.leerPrecio();
            double costo = precio * cantidad;
            Ingrediente ingrediente = new Ingrediente (nombre, cantidad, precio, unidadMedida, costo);
            inventario.agregarNuevoIngrediente(ingrediente);
          }
          break;
        case 2:
          String nombreAgregar = menu.leerNombre();
          inventario.agregarCantidad(nombreAgregar);
          break;
        case 3:
          String nombreModificar = menu.leerNombre();
          inventario.modificarIngrediente(nombreModificar);
          break;
        case 4:
          String nombreBorrar = menu.leerNombre();
          inventario.borrarIngrediente(nombreBorrar);
          break;
        case 5:
          inventario.mostrarInventario();
          break;
        case 6:
          inventario.guardarInventario();
          break;
        case 7:
          System.out.println("\nGracias por usar el sistema.");
          break;
        default:
          System.out.println("\nIngrese una opción válida.");
          break;
      }
    }while(opcion != 7);
    }
    
}
