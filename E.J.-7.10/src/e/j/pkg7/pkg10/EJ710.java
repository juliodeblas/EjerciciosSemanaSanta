/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.j.pkg7.pkg10;

/**
 *
 * @author debla
 */
public class EJ710 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[20];
        int aux;

        System.out.println("Array desordenado: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
            System.out.println(num[i]);
        }

        for (int i = 0; i < num.length; i++) {
            int j = i;
            while ((num[j++] % 2 != 0) && (j < 20));
            if (j < 20) {
                for (int k = j - 1; k > i; k--) {
                    aux = num[k];
                    num[k] = num[k - 1];
                    num[k - 1] = aux;
                }
            }
        }

        System.out.println("Array con los pares al principio:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

}
