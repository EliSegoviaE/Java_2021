package LEVEL_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dias = new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };
        ArrayList<Integer> horastrabajadas = new ArrayList<>();
        ArrayList<Integer> valorporhora = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println(dias[i]);
            System.out.print("Ingrese cantidad de horas trabajadas: ");
            horastrabajadas.add(scanner.nextInt());

            System.out.print("Ingrese el precio por hora trabajada: ");
            valorporhora.add(scanner.nextInt());
        }
        scanner.close();

        ArrayList<Integer> Preciostotales = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Preciostotales.add(horastrabajadas.get(i) * valorporhora.get(i));
        }

        int cant = 0;
        for (int i = 0; i < 5; i++) {
            cant += Preciostotales.get(i);
            System.out.println(dias[i] + ": " + Preciostotales.get(i));
        }

        System.out.print("\nTotal final: $" + cant);
    }
}