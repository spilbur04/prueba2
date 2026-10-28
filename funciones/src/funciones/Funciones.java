/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int Suma = sumar(10, 5);
        int Resta = restar(10, 5);
        int Multiplicacion = multiplicar(10, 5);
        double Division = dividir(10, 5);

        System.out.println("La suma es: " +Suma);
        System.out.println("La resta es: " +Resta);
        System.out.println("La multiplicación es: " +Multiplicacion);
        System.out.println("La división es: " +Division);

    }

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }
}
                     

    
  
    
