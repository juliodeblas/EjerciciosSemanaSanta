/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.j.pkg7.pkg15;

import java.util.Scanner;

/**
 *
 * @author debla
 */
public class EJ715 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mesa[] = new int[10];
        int ocupacion[] = new int[10];
        int opcion;

        for (int i = 0; i < ocupacion.length; i++) {
            ocupacion[i] = (int) (Math.random() * 5);
        }

        do {
            System.out.print("Mesa nº: \t");
            for (int i = 0; i < mesa.length; i++) {
                System.out.print(i + 1 + "  ");
            }

            System.out.println("");

            System.out.print("Ocupación:\t");
            for (int i = 0; i < ocupacion.length; i++) {
                System.out.print(ocupacion[i] + "  ");
            }

            System.out.println("");
            System.out.println("¿Cuántos son? (Introduce -1 para salir del programa)");
            opcion = sc.nextInt();

            if (opcion <= 4 && opcion > 0) {
                for (int i = 0; i < ocupacion.length; i++) {
                    if (ocupacion[i] == 0) {
                        ocupacion[i] = opcion;
                        break;
                    } else if (ocupacion[i] + opcion <= 4) {
                        ocupacion[i] = ocupacion[i] + opcion;
                        break;
                    }
                }
            } else if (opcion > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + opcion + ", haga grupos de 4 personas como máximo e intente de nuevo.");
            }
        } while (opcion != -1);
    }

}
