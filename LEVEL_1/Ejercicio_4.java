package LEVEL_1;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int number = scanner.nextInt();
        int fac = 1;
        scanner.close();

        for (int i = 1; i <= number; i++) {
            fac *= i;
        }

        System.out.println("El factorial es: " + fac);
    }
}