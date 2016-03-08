/*     
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioantojitos;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Saul Enrique Melchor Ramirez
 * @version 1.0
 */
public class HistorialModificaciones {
  private ArrayList <CambiosEnInventario> Historial = new ArrayList();
    
  /**Agregar un cabmio a la lista
   *
   * @param nuevoCambio Para agregar el cambio a la lista
   */
  public void agregarNuevoCambio (CambiosEnInventario nuevoCambio) {
    Historial.add(nuevoCambio);
  }
  
  /**Muestra el historial de cambios
   *
   */
  public void mostrarHistorial() {
    for(CambiosEnInventario temporal : Historial) {
      System.out.print(temporal);
    }
  }
  
  /**Recuperar el historial de cambios
   *
   */
  public void recuperarHistorial() {
    try{
      FileInputStream entrada = new FileInputStream("Historial.dat");
      ObjectInputStream flujoEntrada = new ObjectInputStream(entrada);
      Historial = (ArrayList) flujoEntrada.readObject();
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
  
  /**Guardar el historial para que se pueda recuperar
   *
   */
  public void guardarHistorial() {
    try{
      FileOutputStream salida = new FileOutputStream("Historial.dat");
      ObjectOutputStream flujoSalida = new ObjectOutputStream(salida);
      flujoSalida.writeObject(Historial);
      salida.close();
      flujoSalida.close();
      }catch(IOException ioe) {
        //ioe.printStackTrace
        System.out.println("\nEl inventario ha sido guardado");
      }
  } 
}
