/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.j.pkg7.pkg9;

import java.util.Scanner;

/**
 *
 * @author debla
 */
public class EJ79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num[] = new int[8];

        System.out.println("Introduzca 8 números.");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0){
                System.out.println(num[i]+" es par.");
            }
            else{
                System.out.println(num[i]+" es impar");
            }
        }
    }

}
