/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.j.pkg8.pkg1.pkg14;

import java.util.Scanner;

/**
 *
 * @author debla
 */
public class EJ8114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public static boolean esCapicua(String numero) {
        boolean esCapicua = true;
        char[] array_char = numero.toCharArray();
        int[] numeros = new int[array_char.length];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = array_char[i] - 48;
        }

        for (int i = 0; i < (numeros.length / 2); i++) {
            if (numeros[i] != numeros[numeros.length - i - 1]) {
                esCapicua = false;
                break;
            }
        }

        return esCapicua;
    }

    public static boolean esPrimo(int numero) {
        boolean primo = false;

        int contador = 0;
        for (int j = 1; j <= numero; j++) {
            if (numero % j == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            primo = true;
        }

        return primo;
    }

    public static double potencia(int numero, int potencia) {
        
        double num = Math.pow(numero, potencia);

        return num;
    }

    public static int digitos(String numero) {
        return numero.length();
    }

    public static int posicionDeDigito(int numero, int buscar) {
        int posicion = -1;
        String numeroStr = Integer.toString(numero);
        String buscarStr = Integer.toString(buscar);
        for (int i = 0; i < numeroStr.length(); i++) {
            if (numeroStr.substring(i, i + 1).equals(buscarStr)) {
                posicion = i + 1;
            }
        }
        return posicion;
    }

    public static void voltea() {
        int total = 0;
        System.out.print("Introduzca un número: ");
        Scanner sc = new Scanner(System.in);
        String numero = sc.nextLine();
        char[] array_char = numero.toCharArray();
        int[] numeros = new int[array_char.length];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = array_char[numeros.length - i - 1] - 48;
            System.out.print(numeros[i]);
        }
        System.out.println();
    }

    public static int digitoN(int numero, int buscar) {
        String numeroStr = Integer.toString(numero);

        return Integer.parseInt(numeroStr.substring(buscar, buscar + 1));
    }

    public static int quitarPorDetras(int numero, int quitar) {
        String num = Integer.toString(numero);
        num = num.substring(0, num.length() - quitar);

        return Integer.parseInt(num);
    }

    public static int quitarPorDelante(int numero, int quitar) {
        String num = Integer.toString(numero);
        num = num.substring(quitar, num.length());

        return Integer.parseInt(num);
    }

    public static int pegarPorDetras(int numero, int digito) {
        String num = Integer.toString(numero);
        num = num + digito;

        return Integer.parseInt(num);
    }

    public static int pegarPorDelante(int numero, int digito) {
        String num = Integer.toString(numero);
        num = digito + num;

        return Integer.parseInt(num);
    }

    public static int trozoDeNumero(int numero, int inicio, int fin) {
        String num = Integer.toString(numero);
        num = num.substring(inicio - 1, fin);

        return Integer.parseInt(num);
    }

    public static int juntarNumeros(int numero1, int numero2) {

        return Integer.parseInt(Integer.toString(numero1) + Integer.toString(numero2));
    }

}
