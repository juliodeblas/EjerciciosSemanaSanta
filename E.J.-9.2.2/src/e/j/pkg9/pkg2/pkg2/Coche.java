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
public class Coche extends Vehiculo {

    public double kmRecorridos;

    public Coche(int vehiculosCreados, double kmRecorridos) {
        super(vehiculosCreados);
        this.kmRecorridos = kmRecorridos;
        kmTotales += kmRecorridos;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public void andar() {
        System.out.println("El coche anda ");
    }

    public void quedarRueda() {
        int pinchar = (int) (Math.random() * 2);
        if (pinchar == 0) {
            System.out.println("Derrape correcto.");
        } else {
            System.out.println("Derrape fallido.");
        }
    }
}
