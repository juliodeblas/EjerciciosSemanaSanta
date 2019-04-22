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

        int numero = sc.nextInt();

        System.out.println(voltea(numero));

    }

    public static boolean esCapicua(int numero) {
        int aux;
        int cifra;
        int inverso = 0;

        aux = numero;

        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if (numero == inverso) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean esPrimo(int numero) {
        int c = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static double potencia(double base, double exponente) {
        double potencia;

        potencia = Math.pow(base, exponente);
        return potencia;
    }

    public static int digitos(int numero) {
        int digitos = 0;

        do {
            numero = numero / 10;
            digitos++;
        } while (numero > 0);

        return digitos;
    }

    public static int voltea(int numero) {
        int aux;
        int cifra;
        int inverso = 0;

        aux = numero;

        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        return inverso;
    }

    public static int digitoN(int numero, int posicion) {
        String numeroS = Integer.toString(numero);

        return Integer.parseInt(numeroS.substring(posicion, posicion + 1));
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

    public static int trozoDeNumero(int inicio, int fin, int numero) {
        String num = Integer.toString(numero);
        num = num.substring(inicio - 1, fin);

        return Integer.parseInt(num);
    }

    public static int juntarNumeros(int n1, int n2) {

        return Integer.parseInt(Integer.toString(n1) + Integer.toString(n2));
    }

}
