/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Funcion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el primer numero:");
        int num1 = teclado.nextInt();

        System.out.println("Digite el segundo numero:");
        int num2 = teclado.nextInt();

        calcular(num1, num2);
    }
   public static void calcular(int num1, int num2) {
        num1 = num1 + 2;
        num2 = num2 * 3;

        System.out.println("Primer resultado: " + num1);
        System.out.println("Segundo resultado: " + num2);
    }

    }
    

