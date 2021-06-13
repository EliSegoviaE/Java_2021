package LEVEL_2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio_3 {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            cards.add("Carta " + (i + 1));
        }

        System.out.println("Orden normal");
        for (String card : cards) {
            System.out.println(card);
        }

        Collections.reverse(cards);
        System.out.println("Orden inverso");
        for (String card : cards) {
            System.out.println(card);
        }

        Collections.shuffle(cards);
        System.out.println("Orden aleatorio");
        for (String card : cards) {
            System.out.println(card);
        }
    }
}