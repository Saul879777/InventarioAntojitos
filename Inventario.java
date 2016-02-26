/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioantojitos;
import java.io.*;
import java.util.ArrayList;

/**Aministracion del inventario
 *
 * @author Saúl Enrique Melchor Ramírez
 * @version 0.1
 */
public class Inventario {
  private ArrayList <Ingrediente> Inventario = new ArrayList();
  
  /**Agregar un nuevo ingrediente al inventario
   *
   * @param nuevoIngrediente El nuevo ingrediente que se registro
   */
  public void agregarNuevoIngrediente (Ingrediente nuevoIngrediente) {
    Inventario.add(nuevoIngrediente);
  }
  
  /**Muestra los ingredientes registrados en el inventario
   *
   */
  public void mostrarInventario() {
    for(Ingrediente temporal : Inventario) {
      System.out.print(temporal);
    }
  }
  
  /**Borra un ingrediente
   *
   * @param nombreIngrediente Busca el nombre del ingrediente para borrarlo
   */
  public void borrarIngrediente (String nombreIngrediente) {
    for(int i=0; i < Inventario.size(); i++){
      Ingrediente temporal = Inventario.get(i);
      if(temporal.getNombre().equals(nombreIngrediente)) {
      Inventario.remove(i);
      System.out.println("Ingrediente "+ nombreIngrediente + " eliminado");
      }
    }
  }
  
  /**Recupera el inventario (en caso de que exista)
   *
   */
  public void recuperarInventario() {
    try{
      FileInputStream entrada = new FileInputStream("Ingredientes.dat");
      ObjectInputStream flujoEntrada = new ObjectInputStream(entrada);
      Inventario = (ArrayList) flujoEntrada.readObject();
      flujoEntrada.close();
      entrada.close();
      }catch(IOException ioe) {
        //ioe.printStackTrace();
        System.out.println("\nNo existe un inventario");
      }catch(ClassNotFoundException c) {
        //c.printStackTrace();
        System.out.println("\nEl archivo esta vacio");
      }
  }
  
  /**Guarda el inventario para poder ser recuperado posteriormente
   *
   */
  public void guardarInventario() {
    try{
      FileOutputStream salida = new FileOutputStream("Ingredientes.dat");
      ObjectOutputStream flujoSalida = new ObjectOutputStream(salida);
      flujoSalida.writeObject(Inventario);
      salida.close();
      flujoSalida.close();
      }catch(IOException ioe) {
        //ioe.printStackTrace
        System.out.println("\nEl inventario ha sido guardado");
      }
  }
  
  /**Agregar cantidad a un ingrediente existente
   *
   * @param nombreIngrediente Nombre del ingrediente en el que se agregara
   */
  public void agregarCantidad (String nombreIngrediente) {
    int i;
    Menu menu = new Menu();
    for(i=0; i < Inventario.size(); i++){
    Ingrediente temporal = Inventario.get(i);
      if(temporal.getNombre().equals(nombreIngrediente)) {
        double cantidad = menu.leerCantidad();
        double costo=0;
        double precio = menu.leerPrecio();
        cantidad=cantidad + temporal.getCantidad();
        costo = ((costo/cantidad) + (temporal.getPrecio()/temporal.getCantidad()))/2;
        costo = costo * cantidad;
        temporal.setCosto(costo);
        temporal.agregarGeneral(precio, cantidad);
        System.out.println("Ingrediente "+ nombreIngrediente + " modificado");
        break;
      }
    }
    if(i == Inventario.size()) {
      System.out.println("No se encontró el ingrediente: " + nombreIngrediente);
    }
  }

  public void modificarIngrediente (String nombreIngrediente){
    int i;
    int opc;
    Menu menu = new Menu();
    for (i=0; i<Inventario.size(); i++) {
      Ingrediente temporal = Inventario.get(i);
      if (temporal.getNombre().equals(nombreIngrediente)) {
        menu.menuModificar();
        opc = menu.leerOpcion();
        switch (opc){
          case 1:
            String nuevoNombre = menu.leerNombre();
            temporal.setNombre(nuevoNombre);
            break;
          case 2:
            double nuevaCantidad = menu.leerCantidad();
            temporal.setCantidad(nuevaCantidad);
            break;
          case 3:
            String nuevaUnidadDeMedida = menu.leerUnidadMedida();
            temporal.setUnidadDeMedida(nuevaUnidadDeMedida);
            break;
          case 4:
            double nuevoPrecio = menu.leerPrecio();
            temporal.setPrecio(nuevoPrecio);
            break;
          case 5:
            System.out.println("\nNo se hicieron cambios en el ingrediente");
            break;
          default:
            System.out.println("\nError de opcion invalido");
            break;
        }
      }
      else{
        System.out.println("\nEl ingrediente no se encuentra registrado");
      }
    }
  }

  /**Verifica que el nombre del ingrediente no exista
  *
  * @param nombreIngrediente El nombre del ingrediente que se buscara si existe
  *@return existe Regresa si existe o no
  */
  public int yaExiste (String nombreIngrediente) {
    int existe = 0;
    Menu menu = new Menu();
    for(int i=0; i < Inventario.size(); i++){
    Ingrediente temporal = Inventario.get(i);
      if(temporal.getNombre().equals(nombreIngrediente)) {
        existe = 1;
      }
    }
    return existe;
  }
}
