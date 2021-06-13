package LEVEL_1;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        int b = scanner.nextInt();
        scanner.close();

        int res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }

        System.out.println("El resultado es: " + res);
    }
}