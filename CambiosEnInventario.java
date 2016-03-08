/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioantojitos;
import java.util.Date;

/**
 *
 * @author Saul Enrique Melchor Ramirez
 * @version 1.0
 * mendeley desktop
 */
public class CambiosEnInventario {
    private Date fechaDeCambio = new Date();
    private String nombreDeIngredienteModificado;
    private String nombreDelCambio;
    private double cantidadDeAumentoODecremento;

  /**Obtener la fecha del cambio
   *
   * @return La fecha de cambio
   */
  public Date getFechaDeCambio() {
        return fechaDeCambio;
    }

  /**Aginar la fecha de cambio
   *
   * @param fechaDeCambio Se asigna para la construccion del objeto
   */
  public void setFechaDeCambio(Date fechaDeCambio) {
        this.fechaDeCambio = fechaDeCambio;
    }

  /**Obtener el nombre del ingrediente
   *
   * @return El nombre del ingrediente
   */
  public String getNombreDeIngredienteModificado() {
        return nombreDeIngredienteModificado;
    }

  /**Asignacion del nombre del ingrediente modificado
   *
   * @param nombreDeIngredienteModificado Se asigna para la construccion de objeto
   */
  public void setNombreDeIngredienteModificado(String nombreDeIngredienteModificado) {
        this.nombreDeIngredienteModificado = nombreDeIngredienteModificado;
    }

  /**Obtener el nombre del cambio
   *
   * @return El nombre del cambio que se hizo
   */
  public String getNombreDelCambio() {
        return nombreDelCambio;
    }

  /**Asignacion del nombre del cambio
   *
   * @param nombreDelCambio Se asigna para la costruccion del objeto
   */
  public void setNombreDelCambio(String nombreDelCambio) {
        this.nombreDelCambio = nombreDelCambio;
    }

  /**Obtener la cantidad de aumento o decremento
   *
   * @return Cantidad de aumento o decremento de la cantidad del ingrediente
   */
  public double getCantidadDeAumentoODecremento() {
        return cantidadDeAumentoODecremento;
    }

  /**Asignar la catidad del aumento o decremento
   *
   * @param cantidadDeAumentoODecremento Se asigna para la construccion del objeto
   */
  public void setCantidadDeAumentoODecremento(double cantidadDeAumentoODecremento) {
        this.cantidadDeAumentoODecremento = cantidadDeAumentoODecremento;
    }
    
    @Override
  public String toString() {
    return "\nFecha: " + fechaDeCambio + " \nNombre de ingrediente modificado: " + nombreDeIngredienteModificado + "\nNombre del cambio: "
              + nombreDelCambio + "\nCantidad " + cantidadDeAumentoODecremento + "\n";
  }
}
