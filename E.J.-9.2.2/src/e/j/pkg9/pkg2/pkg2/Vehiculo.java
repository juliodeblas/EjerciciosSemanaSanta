/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.j.pkg9.pkg2.pkg2;

/**
 *
 * @author debla
 */
public class Vehiculo {

    private int vehiculosCreados;

    protected static double kmTotales;

    public Vehiculo(int vehiculosCreados) {
        this.vehiculosCreados = vehiculosCreados;
        this.kmTotales = kmTotales;
    }

    public int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public void setVehiculosCreados(int vehiculosCreados) {
        this.vehiculosCreados = vehiculosCreados;
    }

    public static double getKmTotales() {
        return kmTotales;
    }

    public static void setKmTotales(double kmTotales) {
        Vehiculo.kmTotales = kmTotales;
    }
}
