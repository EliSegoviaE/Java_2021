package LEVEL_1;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese otro numero: ");
        int b = scanner.nextInt();
        scanner.close();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Resto: " + (a % b));

    }

}