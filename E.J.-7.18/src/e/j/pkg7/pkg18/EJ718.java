/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.j.pkg7.pkg18;

import java.util.Scanner;

/**
 *
 * @author debla
 */
public class EJ718 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero, exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero mayor que 0: ");
        numero = sc.nextInt();

        exp = 0;
        binario = 0;
        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero / 2;
        }
        System.out.printf(numero + " en binario es: " + binario);

    }

}
