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
 */
public class CambiosEnInventario {
    private Date fechaDeCambio = new Date();
    private String nombreDeIngredienteModificado;
    private String nombreDelCambio;
    private double cantidadDeAumentoODecremento;

    public Date getFechaDeCambio() {
        return fechaDeCambio;
    }

    public void setFechaDeCambio(Date fechaDeCambio) {
        this.fechaDeCambio = fechaDeCambio;
    }

    public String getNombreDeIngredienteModificado() {
        return nombreDeIngredienteModificado;
    }

    public void setNombreDeIngredienteModificado(String nombreDeIngredienteModificado) {
        this.nombreDeIngredienteModificado = nombreDeIngredienteModificado;
    }

    public String getNombreDelCambio() {
        return nombreDelCambio;
    }

    public void setNombreDelCambio(String nombreDelCambio) {
        this.nombreDelCambio = nombreDelCambio;
    }

    public double getCantidadDeAumentoODecremento() {
        return cantidadDeAumentoODecremento;
    }

    public void setCantidadDeAumentoODecremento(double cantidadDeAumentoODecremento) {
        this.cantidadDeAumentoODecremento = cantidadDeAumentoODecremento;
    }
    
    @Override
    public String toString() {
        return "\nFecha: " + fechaDeCambio + " \nNombre de ingrediente modificado: " + nombreDeIngredienteModificado + "\nNombre del cambio: "
                + nombreDelCambio + "\nCantidad " + cantidadDeAumentoODecremento + "\n";
    }
    
    /*public String conseguirFecha() {
        
    }*/
}
