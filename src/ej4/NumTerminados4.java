package ej4;

import java.util.Scanner;

public class NumTerminados4 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número:");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Los números terminados en 4 son:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 10 == 4) {
                System.out.println(numeros[i] + " en la posición " + i + 1);
            }
        }
    }
}
