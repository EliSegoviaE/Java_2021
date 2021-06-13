package LEVEL_1;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char letter;
        scanner.close();

        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);
            if (65 <= letter && letter <= 120) {
                letter -= 32;
            }

            System.out.print(letter);
        }
    }
}