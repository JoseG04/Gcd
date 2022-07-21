/*
    *Elaborar un programa en el lenguaje de programación que más les guste, donde el usuario
     pueda ingresar 2 números enteros positivos y con estos le permita hallar el GCD ( utilizando
     el algoritmo de euclides).
 */
package actividadextra1_1;

import java.util.Scanner;

/**
 * @author Jose D. Gómez
 */
public class Gcd {
    
    public Gcd(){
    }
    
    // Método para encontrar el GCD entre dos números enteros usando el algoritmo de Euclides
    public static int calcGcd(int numA, int numB){
        int numMayor = (numA < 0)? -numA: numA; // Asignar los valores positivos de los valores ingresados
        int numMenor = (numB < 0)? -numB: numB;

        if(numMenor > numMayor){ // Determinar el número mayor
            int aux = numMayor;
            numMayor = numMenor;
            numMenor = aux;
        }

        return (numMayor % numMenor == 0)? numMenor: calcGcd(numMenor, (numMayor%numMenor));
    }
    
    //Método para solicitar números por consola
    public static int solicitarNumero(String mensaje){
        int numero;
        Scanner scr = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese " + mensaje + ": ");
            numero = Integer.parseInt(scr.nextLine());
        } catch (NumberFormatException e) {
            numero = solicitarNumero(mensaje);
        }
        
        return numero;
    }
    
}