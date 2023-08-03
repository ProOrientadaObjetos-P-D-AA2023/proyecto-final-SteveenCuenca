/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Usuario
 */
public class PlanPostPagoMegas extends PlanesCelulares {
    private double megas;
    private double gigas;
    private double costoMegas;
    private double costoGigas;
    private double costoBase;
    
    /*  PlanPostPagoMegas
        megas expresado en gigas|costo por cada giga|tarifa base
    */
    public PlanPostPagoMegas () {
        
    }
    
    public PlanPostPagoMegas(String n, String a, String pasa, String c, 
            String ba, String marca, String modelo, int numC, double meg, 
            double costoM, double tB){
        super(n, a, pasa, c, ba, marca, modelo, numC);
        megas = meg;
        costoMegas = costoM;
        costoBase = tB;
        tipoPlan = "PlanPostPagoMegas";
    }
    
    /*public PlanPostPagoMegas(String n, String id, String c, String marca,
            String modelo, int numC, double meg, double costoM, double tB){
        super(n, id, c, marca, modelo, numC);
        megas = meg;
        costoMegas = costoM;
        tarifaBase = tB;
        tipoPlan = "PlanPostPagoMegas";
    }*/
    
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

    public void establecerTarifaBase(double p) {
        costoBase = p;
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

    public double obtenerTarifaBase() {
        return costoBase;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (megas * costoMegas) + costoBase;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s"
                + "Megas: %.2f MB\n"
                + "Gigas: %.2f GB\n"
                + "Costo Megas: $%.4f\n"
                + "Costo Gigas: $%.4f\n"
                + "Tarifa Base: $%.2f\n\n"
                + "Pago Mensual Plan: $%.2f\n",
                super.toString(),
                obtenerMegas(),
                obtenerGigas(),
                obtenerCostoMegas(),
                obtenerCostoGigas(),
                obtenerTarifaBase(),
                obtenerPagoMensual());

        return cadena;
    }
}
