package ej1;

import java.util.Scanner;

public class NumMayor {

    public static void main(String[] args) {
        NumMayor nm = new NumMayor();
        nm.pedirNumeros();
        nm.mostrarMayor();
    }

    int[] numeros = new int[10];
    Scanner sc = new Scanner(System.in);

    public void pedirNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }
    }

    public void mostrarMayor() {
        int mayor = numeros[0];
        int pos = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                pos = i;
            }
        }
        System.out.println("El número mayor es " + mayor + " y está en la posición " + pos + 1);
    }
}
