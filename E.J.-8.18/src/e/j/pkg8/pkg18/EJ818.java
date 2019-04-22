/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.j.pkg8.pkg18;

import java.util.Scanner;

/**
 *
 * @author debla
 */
public class EJ818 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int decimal, modulo, aux;
        String binario = "";

        System.out.println("Introduzca un número decimal");
        decimal = sc.nextInt();

        aux = decimal;
        while (decimal > 0) {
            modulo = (decimal % 2);
            binario = modulo + binario;
            decimal = decimal / 2;
        }
        System.out.println("El número " + aux + " decimal es " + binario + " en binario.");
    }

}
