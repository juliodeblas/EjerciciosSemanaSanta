/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.j.pkg9.pkg2.pkg2;

import java.util.Scanner;

/**
 *
 * @author debla
 */
public class EJ922 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Coche coche = new Coche(12, 520);
        Bicicleta bici = new Bicicleta(34, 56000.23);
        boolean fin = false;
        while (fin != true) {

            System.out.println("VEHICULOS\n=========");
            System.out.println("1.Andar con bici\n2.Hacer caballito con la bici\n3.Andar con el coche\n4.Quemar rueda con el coche\n5.Ver km de la bici\n6.Ver km del coche \n7.ver km totales\n8.Salir");
            int eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    bici.andar();
                    break;
                case 2:
                    bici.caballito();
                    break;
                case 3:
                    coche.andar();
                    break;
                case 4:
                    coche.quedarRueda();
                    break;
                case 5:
                    System.out.println(bici.getKmRecorridos());
                    break;
                case 6:
                    System.out.println(coche.getKmRecorridos());
                    break;
                case 7:
                    System.out.println(Vehiculo.getKmTotales());
                    break;
                case 8:
                    fin = true;
                    break;
            }

            System.out.print("\n");

        }
    }

}
