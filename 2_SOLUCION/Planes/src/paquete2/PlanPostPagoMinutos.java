/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Usuario
 */
public class PlanPostPagoMinutos extends PlanesCelulares{
    private double minutoNa;
    private double costoMinNa;
    private double minutosIn;
    private double costoMinIn;
    
    /*  PlanPostPagoMinutos:
        minutos nacionales|costo minuto nacional|minutos internacionales|
        costo minuto internacional
    */
    public PlanPostPagoMinutos () {
        
    }
    
    public PlanPostPagoMinutos(String n, String a, String pasa, String c, 
            String ba, String marca, String modelo, int numC, double mN, double costoMN, double mI, 
            double costoMI){
        super(n, a, pasa, c, ba, marca, modelo, numC);
        minutoNa = mN;
        costoMinNa = costoMN;
        minutosIn = mI;
        costoMinIn = costoMI;
        tipoPlan = "PlanPostPagoMinutos";
    }

    public void establecerMinutoNa(double p) {
        minutoNa = p;
    }

    public void establecerCostoMinNa(double p) {
        costoMinNa = p;
    }

    public void establecerMinutosIn(double p) {
        minutosIn = p;
    }

    public void establecerCostoMinIn(double p) {
        costoMinIn = p;
    }

    public double obtenerMinutoNa() {
        return minutoNa;
    }

    public double obtenerCostoMinNa() {
        return costoMinNa;
    }

    public double obtenerMinutosIn() {
        return minutosIn;
    }

    public double obtenerCostoMinIn() {
        return costoMinIn;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutoNa * costoMinNa) + (minutosIn * costoMinIn);
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Minuto Nacional: %.2f\n"
                + "Costo minuto Nacional: $%.4f\n"
                + "Minuto Internacional: %.2f\n"
                + "Costo minuto Internacional: $%.4f\n"
                + "Pago Mensual Plan: $%.2f\n",
                super.toString(),
                obtenerMinutoNa(),
                obtenerCostoMinNa(),
                obtenerMinutosIn(),
                obtenerCostoMinIn(),
                obtenerPagoMensual());

        return cadena;
    }
}
