/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioantojitos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Menu
 *
 * @author Saul Enrique Melchor Ramirez
 * @version 0.1
 */
public class Menu {
  Scanner teclado = new Scanner(System.in);
  
  /**Muestra el menu para que usuario lo esocoja 
   * 
   */
  public void menu() {
    System.out.println("\n1. Agregar Ingrediente");
    System.out.println("2. Agregar cantidad a ingrediente");
    System.out.println("3. Modificar ingrediente");
    System.out.println("4. Eliminar Ingrediente");
    System.out.println("5. Mostrar Ingrediente");
    System.out.println("6. Guardar Ingrediente");
    System.out.println("7. Saliir");
  }
  
  public void presentacion() {
    System.out.println("----------------------------------");
    System.out.println("|                                |");
    System.out.println("|            Inventario          |");
    System.out.println("|                                |");
    System.out.println("----------------------------------");
  }
  
  public void limpiarPantalla() {
    for (int i=0; i<10; i++){
      System.out.println("\n");
    }
  }
  
  /**Muestra el menu para modificar un ingrediente
   *
   */
  public void menuModificar() {
    System.out.println("----------------------------------");
    System.out.println("|                                |");
    System.out.println("|          Modificar             |");
    System.out.println("|             un                 |");
    System.out.println("|          ingrediente           |");
    System.out.println("|                                |");
    System.out.println("----------------------------------");
    System.out.println("\n1. Modificar nombre");
    System.out.println("2. Modificar cantidad");
    System.out.println("3. Modificar unidad de medida");
    System.out.println("4. Modificar precio");
    System.out.println("5.Cancelar la modificacion");
  }
  
  /**Lee la opcion escogida del menu
   * 
   * @return Regresa la opción que el usuario escogio 
   */
  public int leerOpcion() {
    System.out.println("\nIngrese la opcion deseada: ");
    return leerEntero();
  }
  
  /**Lee el nombre del ingrediente
   *
   * @return Regresa el nombre del ingrediente
   */
  public String leerNombre() {
    System.out.println("\nIngrese nombre del ingrediente: ");
    return leerCadena();
  }

  /**Lee la cantidad del ingrediente
   *
   * @return Regresa la cantidad que hay del ingrediente
   */
  public double leerCantidad() {
    System.out.println("\nIngrese la cantidad: ");
    return leerDouble();
  }
  
  /**Lee el precio del ingrediente
   *
   * @return Regresa el precio por kilogramo del ingrediente
   */
  public double leerPrecio() {
    System.out.println("\nIngrece precio: ");
    return leerDouble();
  }
  
  /**Confirmacion de que la opcion sea un entero
   *
   * @return Retorna la opcion en caso de que se valida
   */
  public int leerEntero() {
    int entero = 0;
    boolean bandera = false;
    do{
      try{
        entero = teclado.nextInt();
        bandera = true;
      }catch(InputMismatchException imme) {
        System.out.println("Por favor ingresa un entero");
        bandera = false;
        teclado.nextLine();   
      }
    }while(!bandera);
    return entero;
  }
 
  /**Unidad de medida con la que se mide el ingrediente
   *
   * @return Regresa la cadena con unidad de medida
   */
  public String leerUnidadMedida() {
    System.out.println("\nIngrese unidad de medida: (kg, lt, pieza)");
    return leerCadena();
  }
  
  /**Confirmación que sea un double
   *
   * @return Retorna el valor que tiene cantidad en caso de ser valida
   */
  public double leerDouble() {
    double entero = 0;
    boolean bandera = false;
    do{
      try{
        entero = teclado.nextDouble();
        bandera = true;
      }catch(InputMismatchException imme) {
        System.out.println("Por favor ingresa un entero");
        bandera = false;
        teclado.nextLine();   
      }
    }while(!bandera);
    return entero;
  }
  
  /**Verifica que no se ingresen numeros en vez de cadenas
   *
   * @return Regresa la cadena verificada
   */
  public String leerCadena() {
    String cadena = " ";
    boolean bandera = false;
    do{
      cadena = teclado.next();
      bandera = true;
      if(esNumero(cadena)){
        System.out.println("\nPor faver ingrese un nombre sin numeros");
        bandera = false;
        cadena = teclado.nextLine();
      }
    }while(!bandera);
    return cadena;
  }
  
  /**Evalua si la cadena es de enteros
   *
   * @param cadena Cadena a evaluar
   * @return Regresa si la cadena no es un numero
   */
  public boolean esNumero (String cadena) {
    try{
      Long.parseLong(cadena);
    }catch(Exception e) {
      return false;
    }
    return true;
  }
  
  public String leerConfirmacion() {
    System.out.println("s/n");
    int bandera = 0;
    String sn = " ";
    do{
      sn = leerCadena();
      if (sn.equals("n") || sn.equals("s")){
        bandera = 1;
      }
      else{
        System.out.println("\nPor favor ingrese una opcion valida");
      }
    }while (bandera != 1);
    return sn;
  }
}

/*
Agregar los atributos precio y unidad de mediad
Usar exceptions
Modificar el inventario (aumentar cantidad) y sacar un promedio para asignar un precio
Generar diseño de elaborar antojitos
*/