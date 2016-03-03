/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioantojitos;
import java.io.Serializable;

/**Administrar ingredientes para posteriormente agregarlo al inventario
 *
 * @author Saúl Enrique Melchor Ramírez
 * @version 0.1
 */
public class Ingrediente implements Serializable {
  private String nombre;
  private double cantidad;
  private double precio;
  private String unidadDeMedida;
  private double costo;

  

  /**Costo se obtiene precio * cantidad
   *
   * @return Costo
   */
  public double getCosto() {
    return costo;
  }

  /**Asignacion del costo
   *
   * @param costo Costo que se obtiene de precio * cantidad
   */
  public void setCosto (double costo) {
    this.costo = costo;
  }

  /** Unidad de medida con la que se mide el ingreiente
   *
   * @return Unidad de medida del ingrediente
   */
  public String getUnidadDeMedida() {
    return unidadDeMedida;
  }

  /**Asignacion de la unidad de medida
   *
   * @param unidadDeMedida Unidad de medida que se usara para medir el producto
   */
  public void setUnidadDeMedida (String unidadDeMedida) {
    this.unidadDeMedida = unidadDeMedida;
  }

  /**Precio del ingrediente por su unidad de medida
   *
   * @return Obtiene el precio por kilogramo
   */
  public double getPrecio() {
    return precio;
  }

  /**Asignación del precio
   *
   * @param precio Precio por kilo del ingrediente
   */
  public void setPrecio (double precio) {
    this.precio = precio;
  }

  /**Nombre del ingrediente
   *
   * @return Obtiene el nombre del ingrediente
   */
  public String getNombre() {
    return nombre;
  }

  /**Asignacion de nombre de ingrediente
   *
   * @param nombre Nombre con el que se registro en nombre
   */
  public void setNombre (String nombre) {
    this.nombre = nombre;
  }

  /**Cantidad del ingrediente
   *
   * @return Obtiene la cantidad que hay del ingrediente
   */
  public double getCantidad() {
    return cantidad;
  }

  /**Asignacion de la cantidad
   *
   * @param cantidad Cantidad existente del ingrediente
   */
  public void setCantidad (double cantidad) {
    this.cantidad = cantidad;
  }

  /**Creacion del objeto ingrediente
   *
   * @param nombre Nombre del ingrediente
   * @param cantidad Cantidad que hay del ingrediente
   * @param precio Precio por kilogramo
   * @param unidadDeMedida Unidad de medida de cantidad
   * @param costo Costo obtenido de precio * cantidad
   */  
  public Ingrediente (String nombre, double cantidad, double precio, String unidadDeMedida, double costo) {
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.precio = precio;
    this.unidadDeMedida = unidadDeMedida;
    this.costo = costo;
  }
  
  /**Aumenta la cantidad de un ingrediente
   *
   * @param nuevaCantidad Cantidad que se agregara a la cantidad existente
   */
  public void agregarCantidad (double nuevaCantidad) {
    cantidad = cantidad + nuevaCantidad;
  }
  
  /**Cambiar el precio de la cantidad ingresada
   *
   * @param nuevoPrecio Nuevo precio por el que se compro
   */
  public void agregarPrecio (double nuevoPrecio) {
    precio = precio + nuevoPrecio;
  }
  
  /**Agregar el precio y cantidad a un ingrediente ya existente
   *
   * @param masPrecio El precio que se agregara
   * @param masCantidad La cantidad que se agregara
   */
  public void agregarGeneral (double masPrecio, double masCantidad) {
    cantidad = cantidad + masCantidad;
    precio = cantidad + masPrecio;
  }
  
  @Override
  public String toString() {
    return "\nNombre: " + nombre + " \nCantidad: " + cantidad + " " + unidadDeMedida + " \nPrecio: " + precio + "\nCosto " + costo + "\n";
  }
  
}
