package LEVEL_1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String name = scanner.nextLine();
        scanner.close();

        System.out.println("Hola " + name);
    }
}