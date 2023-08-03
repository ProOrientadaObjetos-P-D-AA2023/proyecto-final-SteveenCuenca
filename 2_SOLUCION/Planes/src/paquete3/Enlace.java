/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author D E L L
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete2.*;

public class Enlace {

    private Connection conn;
    private ArrayList<PlanesCelulares> lista = new ArrayList<>();

    public void establecerConexion() {

        try {
            String url = "jdbc:sqlite:bd/planes.bd";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Linea 30: "+e.getMessage());
        }
    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = String.format("INSERT INTO planPostPagoMinutos "
                    + "(tipo, nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
                    + "modeloCel, numCel, minutosNaci, costoMinNaci, "
                    + "minutosInter, costoMinInter, pago) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s',"
                    + " %s, %s, %s, %s, %s, %s)",
                    plan.obtenerTipoPlan(),
                    plan.obtenerNombres(),
                    plan.obtenerApellidos(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudad(),
                    plan.obtenerBarrio(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumCelular(),
                    plan.obtenerMinutoNa(),
                    plan.obtenerCostoMinNa(),
                    plan.obtenerMinutosIn(),
                    plan.obtenerCostoMinIn(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            // System.out.println(data);            
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: linea 69");
            System.out.println(e.getMessage());
        }
    }

    public void insertarPlanPostPagoMegas(PlanPostPagoMegas plan) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = String.format("INSERT INTO planPostPagoMegas "
                    + "(tipo, nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
                    + "modeloCel, numCel, megas, costoM, tarifaBase, pago) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s',"
                    + " %s, %s, %s, %s, %s)",
                    plan.obtenerTipoPlan(),
                    plan.obtenerNombres(),
                    plan.obtenerApellidos(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudad(),
                    plan.obtenerBarrio(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumCelular(),
                    plan.obtenerMegas(),
                    plan.obtenerCostoMegas(),
                    plan.obtenerTarifaBase(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            // System.out.println(data);            
            // obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: linea 102");
            System.out.println(e.getMessage());
        }
    }

    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = String.format("INSERT INTO planPostPagoMinutosMegas "
                    + "(tipo, nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
                    + "modeloCel, numCel, min, costoMin, megas, costoMegas, pago) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s',"
                    + " %s, %s, %s, %s, %s, %s)",
                    plan.obtenerTipoPlan(),
                    plan.obtenerNombres(),
                    plan.obtenerApellidos(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudad(),
                    plan.obtenerBarrio(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumCelular(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoMin(),
                    plan.obtenerMegas(),
                    plan.obtenerCostoMegas(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            // System.out.println(data);            
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: linea 137");
            System.out.println(e.getMessage());
        }
    }

    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasE plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = String.format("INSERT INTO planPostPagoMinutosMegasEconomico "
                    + "(tipo, nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
                    + "modeloCel, numCel, min, costoMin, megas, costoMegas, "
                    + "descuento, pago) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s',"
                    + " %s, %s, %s, %s, %s, %s, %s)",
                    plan.obtenerTipoPlan(),
                    plan.obtenerNombres(),
                    plan.obtenerApellidos(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudad(),
                    plan.obtenerBarrio(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumCelular(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoMin(),
                    plan.obtenerMegas(),
                    plan.obtenerCostoMegas(),
                    plan.obtenerDescuento(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            // System.out.println(data);            
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: linea 174");
            System.out.println(e.getMessage());
        }
    }

    public void obtenerDataPlanPostPagoMegas() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMegas";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMegas plan = new PlanPostPagoMegas(
                        rs.getString("nombre"), 
                        rs.getString("apellido"), 
                        rs.getString("pasaporte"), 
                        rs.getString("ciudad"), 
                        rs.getString("barrio"), 
                        rs.getString("marcaCel"), 
                        rs.getString("modeloCel"), 
                        rs.getInt("numCel"), 
                        rs.getDouble("megas"), 
                        rs.getDouble("costoM"), 
                        rs.getDouble("tarifaBase"));
                plan.establecerGigas();
                plan.establecerCostoGigas();
                plan.calcularPagoMensual();
                lista.add(plan);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: uwuDATA linea 205");
            System.out.println(e.getMessage());
        }
    }

    public void obtenerDataPlanPostPagoMinutos() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutos";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutos plan = new PlanPostPagoMinutos(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("numCel"),
                        rs.getDouble("minutosNaci"),
                        rs.getDouble("costoMinNaci"),
                        rs.getDouble("minutosInter"),
                        rs.getDouble("costoMinInter"));
                plan.calcularPagoMensual();
                lista.add(plan);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: uwuDATA linea 235");
            System.out.println(e.getMessage());
        }
    }

    public void obtenerDataPlanPostPagoMinutosMegas() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegas";
            ResultSet rs = statement.executeQuery(data);

            while (rs.next()) {
                PlanPostPagoMinutosMegas plan = new PlanPostPagoMinutosMegas(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("numCel"),
                        rs.getDouble("min"),
                        rs.getDouble("costoMin"),
                        rs.getDouble("megas"),
                        rs.getDouble("costoMegas"));
                plan.establecerGigas();
                plan.establecerCostoGigas();
                plan.calcularPagoMensual();
                lista.add(plan);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: uwuDATA linea 268");
            System.out.println(e.getMessage());
        }
    }

    public void obtenerDataPlanPostPagoMinutosMegasEconomico() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegasEconomico";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegasE plan = new PlanPostPagoMinutosMegasE(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("numCel"),
                        rs.getDouble("min"),
                        rs.getDouble("costoMin"),
                        rs.getDouble("megas"),
                        rs.getDouble("costoMegas"),
                        rs.getInt("descuento"));
                plan.establecerGigas();
                plan.establecerCostoGigas();
                plan.calcularPagoMensual();
                lista.add(plan);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: uwuDATA linea 301");
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<PlanesCelulares> obtenerArrayList() {
        return lista;
    }
}
