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
public class Bicicleta extends Vehiculo {

    public double kmRecorridos;

    public Bicicleta(int vehiculosCreados, double kmRecorridos) {
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
        System.out.println("La bicicleta anda");
    }

    public void caballito() {
        int caida = (int) (Math.random() * 2);
        if (caida == 0) {
            System.out.println("No hay caída.");
        } else {
            System.out.println("Si hay caída.");
        }
        System.out.println("");
    }
}
