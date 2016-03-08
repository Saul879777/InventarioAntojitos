/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioantojitos;

/**Clase principal
 *
 * @author Saúl Enrique Melchor Ramírez
 * @version 1.0
 */
public class InventarioAntojitos {

  /**Main para que el programa comience a correr
   * @param args the command line arguments
   */
  public static void main (String[] args) {
    int opcion = 0;
    HistorialModificaciones historial = new HistorialModificaciones();
    Inventario inventario = new Inventario();
    historial.recuperarHistorial();
    inventario.recuperarInventario();
    Menu menu = new Menu();
    System.out.println("\nBienvenido\n");
    Confirmaciones confirmacion = new Confirmaciones();
    inventario.verificarFaltaDeIngredientes();
    do{
      menu.presentacion();
      menu.menu();
      opcion = menu.leerOpcion();
      switch (opcion) {
        case 1:
          String nombre = menu.leerNombre();
          if (inventario.yaExiste(nombre) == 1) {
            System.out.println("Ese ingrediente ya existe, volviendo al menu principal");
          }
          else {
            double cantidad = menu.leerCantidad();
            String unidadMedida = menu.leerUnidadMedida();
            double precio = menu.leerPrecio();
            double costo = precio * cantidad;
            if (confirmacion.confirmacionAgregar() == 1) {
                CambiosEnInventario cambio = new CambiosEnInventario();
                Ingrediente ingrediente = new Ingrediente (nombre, cantidad, precio, unidadMedida, costo);
                inventario.agregarNuevoIngrediente(ingrediente);
                cambio.setNombreDeIngredienteModificado(nombre);
                cambio.setNombreDelCambio("Ingrediente agregado");
                cambio.setCantidadDeAumentoODecremento(cantidad);
                historial.agregarNuevoCambio(cambio);
            }
            else{
              System.out.println("El ingrediente no se agrego al inventario");
            }
          }
          break;
        case 2:
          String nombreAgregar = menu.leerNombre();
          inventario.agregarCantidad(nombreAgregar, historial);
          break;
        case 3:
          String nombreModificar = menu.leerNombre();
          inventario.modificarIngrediente(nombreModificar, historial);
          break;
        case 4:
          String nombreBorrar = menu.leerNombre();
          inventario.borrarIngrediente(nombreBorrar, historial);
          break;
        case 5:
          menu.presentacion();
          inventario.mostrarInventario();
          System.out.println("Pulse cualquier tecla para continuar");
          menu.leerCadena();
          break;
        case 6:
          menu.presentacionModificaciones();
          historial.mostrarHistorial();
          System.out.println("Pulse cualquier tecla para continuar");
          menu.leerCadena();
          break;
        case 7:
          if (confirmacion.confirmacionGuardarInventario() == 1){
            inventario.guardarInventario();
            historial.guardarHistorial();
          }
          else{
            System.out.println("Los cambios en el inventario no fueron guardado");
          }
          break;
        case 8:
          System.out.println("Que comida quiere elaborar? ");
          menu.menuHacerComida();
          int opc = menu.leerOpcion();
          inventario.hacerComida(opc, historial);
          break;
        case 9:
          System.out.println("\nGracias por usar el sistema.");
          break;
        default:
          System.out.println("\nIngrese una opción válida.");
          break;
      }
    }while(opcion != 9);
    }
    
}
