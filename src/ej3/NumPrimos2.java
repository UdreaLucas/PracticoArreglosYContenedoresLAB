package ej3;

public class NumPrimos2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int num = 100;
        int i = 0;
        while (i < 10) {
            if (esPrimo(num)) {
                numeros[i] = num;
                i++;
            }
            num++;
        }
        System.out.println("Los 10 primeros números primos entre 100 y 300 son:");
        for (int j = 0; j < numeros.length; j++) {
            System.out.println(numeros[j]);
        }
    }

    public static boolean esPrimo(int num) {
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

}
