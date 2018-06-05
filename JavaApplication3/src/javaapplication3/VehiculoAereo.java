/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


    


public class VehiculoAereo extends Vehiculos{
    
    String tipoAereos;
    int acelerar;
    int despegar;
    int aterrizar;        

    public VehiculoAereo(Propulsion propulsion) {
        super(propulsion);
    }

    public String getTipoAereos() {
        return tipoAereos;
    }

    public void setTipoAereos(String tipoAereos) {
        this.tipoAereos = tipoAereos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }
    
    
    
    
  
    
}
