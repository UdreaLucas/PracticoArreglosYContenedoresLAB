package ej2;

public class NumMayorPrimo {

    public static void main(String[] args) {
        NumMayorPrimo nm = new NumMayorPrimo();
        nm.pedirNumerosPrimos();
        nm.mostrarMayor();
    }

    int[] numeros = new int[10];
    java.util.Scanner sc = new java.util.Scanner(System.in);

    public void pedirNumerosPrimos() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número primo: ");
            int num = sc.nextInt();
            if (esPrimo(num)) {
                numeros[i] = num;
            } else {
                System.out.println("El número introducido no es primo.");
                i--;
            }
        }
    }

    public boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
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
        System.out.println("El mayor número primo es " + mayor + " y está en la posición " + pos + 1);
    }
}
