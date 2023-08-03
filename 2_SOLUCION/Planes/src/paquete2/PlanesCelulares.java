/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Usuario
 */
public abstract class PlanesCelulares {
    protected String nombres;
    protected String apellidos;
    protected String pasaporte;
    protected String ciudad;
    protected String barrio;
    protected String marcaCelular;
    protected String modeloCelular;
    protected int numCelular;
    protected String tipoPlan;
    
    protected double pagoMensual;
    
    
    public PlanesCelulares() {   
    }
    
    public PlanesCelulares(String n, String a, String pasa, String c, String ba, String marca, 
            String modelo, int numC) {
        nombres = n;
        apellidos = a;
        pasaporte = pasa;
        ciudad = c;
        barrio = ba;
        marcaCelular = marca;
        modeloCelular = modelo;
        numCelular = numC;
    }  

    public void establecerNombres(String p) {
        nombres = p;
    }
    
    public void establecerApellidos(String p) {
        apellidos = p;
    }
    
    public void establecerPasaporte(String p) {
        pasaporte = p;
    }
    
    public void establecerCiudad(String p) {
        ciudad = p;
    }
    
    public void establecerBarrio(String p) {
        barrio = p;
    }
    
    public void establecerMarcaCelular(String p) {
        marcaCelular = p;
    }
    
    public void establecerModeloCelular(String p) {
        modeloCelular = p;
    }
    
    public void establecerNumCelular(int p) {
        numCelular = p;
    } 
    
    public void establecerTipoPlan(String p) {
        tipoPlan = p;
    } 
  
    public abstract void calcularPagoMensual();
    
    
    public String obtenerNombres() {
        return nombres;
    }
    
    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerPasaporte() {
        return pasaporte;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
    
    public String obtenerBarrio() {
        return barrio;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }  

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public int obtenerNumCelular() {
        return numCelular;
    } 
    
    public String obtenerTipoPlan() {
        return tipoPlan;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }
    //base de datos uwu
    @Override
    public String toString() {
        String cadena = String.format(">> Plan Celular %s <<\n" //arreglo de cadenas
                + "Datos del Propietario:\n"
                + "\tNombres: %s\n"
                + "\tApellidos: %s\n"
                + "\tPasaporte: %s\n"
                + "\tCiudad: %s\n"
                + "\tBarrio: %s\n"
                + "\tMarca Celular: %s\n"
                + "\tModelo Celular: %s\n"
                + "\tNúmero celular: %d\n", 
                obtenerTipoPlan(),
                obtenerNombres(),
                obtenerApellidos(),
                obtenerPasaporte(),
                obtenerCiudad(),
                obtenerBarrio(),
                obtenerMarcaCelular(),
                obtenerModeloCelular(),
                obtenerNumCelular());
        
        return cadena;
    }
}
