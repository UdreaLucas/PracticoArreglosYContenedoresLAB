package ej5;

import java.util.Scanner;

public class RepeticionesNumMayor {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int repeticiones = 0;
        int numMayor = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número:");
            numeros[i] = sc.nextInt();
            if (numeros[i] > numMayor) {
                numMayor = numeros[i];
                repeticiones = 1;
            } else if (numeros[i] == numMayor) {
                repeticiones++;
            }
        }

        System.out.println("El número mayor es " + numMayor + " y se repite " + repeticiones + " veces.");
    }
}
