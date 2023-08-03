/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Usuario
 */
public class PlanPostPagoMinutosMegasE extends PlanesCelulares {
    private double minutos;
    private double costoMin;
    private double megas;
    private double gigas;
    private double costoMegas;
    private double costoGigas;
    private int descuento;
    
    /*  minutos|costo minutos|megas expresado en gigas|costo por cada gigas|
        porcentaje de descuento (Ejemplo: 10%)
    */
    public PlanPostPagoMinutosMegasE () {
        
    }
    
    public PlanPostPagoMinutosMegasE(String n, String a, String pasa, String c, 
            String ba, String marca, String modelo, int numC, double min, double costoMi, double meg, 
            double costoMeg, int desc){
        super(n, a, pasa, c, ba, marca, modelo, numC);
        minutos = min;
        costoMin = costoMi;
        megas = meg;
        costoMegas = costoMeg;
        descuento = desc;
        tipoPlan = "PlanPostPagoMinutosMegasEconomico";
    }

    public void establecerMinutos(double p) {
        minutos = p;
    }

    public void establecerCostoMin(double p) {
        costoMin = p;
    }

    public void establecerMegas(double p) {
        megas = p;
    }
    
    public void establecerGigas() {
        gigas = megas/1000;
    }

    public void establecerCostoMegas(double p) {
        costoMegas = p;
    }
    
    public void establecerCostoGigas() {
        costoGigas = (megas*costoMegas)/gigas;
    }

    public void establecerDescuento(int p) {
        descuento = p;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMin() {
        return costoMin;
    }

    public double obtenerMegas() {
        return megas;
    }

    public double obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoMegas() {
        return costoMegas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public int obtenerDescuento() {
        return descuento;
    }
    
    @Override
    public void calcularPagoMensual() {
        double ope = 0;
        ope = (minutos * costoMin) + (megas * costoMegas);
        pagoMensual = ope - ((descuento*ope)/100);
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Minutos: %.2f\n"
                + "Costo minutos: $%.4f\n"
                + "Megas: %.2f MB\n"
                + "Gigas: %.2f GB\n"
                + "Costo megas: $%.4f\n"
                + "Costo gigas: $%.4f\n"
                + "Descuento: %d\n"
                + "Pago Mensual Plan: $%.2f\n",
                super.toString(),
                obtenerMinutos(),
                obtenerCostoMin(),
                obtenerMegas(),
                obtenerGigas(),
                obtenerCostoMegas(),
                obtenerCostoGigas(),
                obtenerDescuento(),
                obtenerPagoMensual());

        return cadena;
    }
}
