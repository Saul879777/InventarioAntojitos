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
 * @author x360
 */
public class HistorialModificaciones {
  private ArrayList <CambiosEnInventario> Historial = new ArrayList();
    
  public void agregarNuevoCambio (CambiosEnInventario nuevoCambio) {
    Historial.add(nuevoCambio);
  }
  
  public void mostrarHistorial() {
    for(CambiosEnInventario temporal : Historial) {
      System.out.print(temporal);
    }
  }
  
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
