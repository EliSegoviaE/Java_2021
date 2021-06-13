package LEVEL_1;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero a multiplicar: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese la cantidad de veces: ");
        int b = scanner.nextInt();
        scanner.close();

        int res = 0;
        for (int i = 0; i < b; i++) {
            res += a;
        }

        System.out.println("El resultado es: " + res);
    }
}